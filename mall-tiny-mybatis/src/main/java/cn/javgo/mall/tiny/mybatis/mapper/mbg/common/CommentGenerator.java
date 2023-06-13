package cn.javgo.mall.tiny.mybatis.mapper.mbg.common;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;
import java.util.Properties;

/**
 * 自定义注释生成器
 */
public class CommentGenerator extends DefaultCommentGenerator {
    // 是否添加数据库表的注释
    private boolean addRemarkComments = false;
    // Example 类名后缀
    private static final String EXAMPLE_SUFFIX = "Example";
    // Mapper 类名后缀
    private static final String MAPPER_SUFFIX = "Mapper";
    // ApiModelProperty 注解类的全限定名（Swagger）
    private static final String API_MODEL_PROPERTY_FULL_CLASS_NAME = "io.swagger.annotations.ApiModelProperty";

    /**
     * 设置用户配置的参数
     * @param properties 用户配置的参数
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        // 调用父类方法保证父类方法可以正常使用
        super.addConfigurationProperties(properties);
        // 从 properties 中获取 addRemarkComments 参数值来判断是否添加数据库表的注释
        this.addRemarkComments = Boolean.parseBoolean(properties.getProperty("addRemarkComments"));
    }

    /**
     * 给字段添加注释
     * @param field 字段
     * @param introspectedTable 数据库表
     * @param introspectedColumn 数据库表字段
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        // 获取数据库表字段的注释
        String remarks = introspectedColumn.getRemarks();
        // 根据参数和备注信息判断是否添加备注信息
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            // 如果存在特殊字符，需要转义
            if (remarks.contains("\"")) {
                remarks = remarks.replace("\"", "'");
            }
            // 给 model 的字段添加 Swagger 注解
            field.addJavaDocLine("//@ApiModelProperty(value = \"" + remarks + "\")");
        }
    }

    /**
     * 给 Java 文件添加注释
     * @param compilationUnit Java 文件
     */
    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        // 调用父类方法保证父类方法可以正常使用
        super.addJavaFileComment(compilationUnit);
        // 获取 Java 文件的全限定名
        String fullyQualifiedName = compilationUnit.getType().getFullyQualifiedName();
        // 如果不是 Mapper 类或者 Example 类，就添加 Swagger 注解类的导入(因为只有 model 类需要添加 Swagger 注解)
        if (!fullyQualifiedName.contains(MAPPER_SUFFIX) && !fullyQualifiedName.contains(EXAMPLE_SUFFIX)) {
            // 添加 Swagger 注解类的导入
            compilationUnit.addImportedType(new FullyQualifiedJavaType(API_MODEL_PROPERTY_FULL_CLASS_NAME));
        }
    }
}
