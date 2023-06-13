package cn.javgo.mall.tiny.mybatis.mapper.mbg;

import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrand;
import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PmsBrandMapper {
    @SelectProvider(type=PmsBrandSqlProvider.class, method="countByExample")
    long countByExample(PmsBrandExample example);

    @DeleteProvider(type=PmsBrandSqlProvider.class, method="deleteByExample")
    int deleteByExample(PmsBrandExample example);

    @Delete({
        "delete from pms_brand",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into pms_brand (name, first_letter, ",
        "sort, factory_status, ",
        "show_status, product_count, ",
        "product_comment_count, logo, ",
        "big_pic, brand_story)",
        "values (#{name,jdbcType=VARCHAR}, #{firstLetter,jdbcType=VARCHAR}, ",
        "#{sort,jdbcType=INTEGER}, #{factoryStatus,jdbcType=INTEGER}, ",
        "#{showStatus,jdbcType=INTEGER}, #{productCount,jdbcType=INTEGER}, ",
        "#{productCommentCount,jdbcType=INTEGER}, #{logo,jdbcType=VARCHAR}, ",
        "#{bigPic,jdbcType=VARCHAR}, #{brandStory,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(PmsBrand row);

    @InsertProvider(type=PmsBrandSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(PmsBrand row);

    @SelectProvider(type=PmsBrandSqlProvider.class, method="selectByExampleWithBLOBs")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="first_letter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="factory_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="show_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="product_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="product_comment_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="logo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="big_pic", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_story", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    @SelectProvider(type=PmsBrandSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="first_letter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="factory_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="show_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="product_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="product_comment_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="logo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="big_pic", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PmsBrand> selectByExample(PmsBrandExample example);

    @Select({
        "select",
        "id, name, first_letter, sort, factory_status, show_status, product_count, product_comment_count, ",
        "logo, big_pic, brand_story",
        "from pms_brand",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="first_letter", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="factory_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="show_status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="product_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="product_comment_count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="logo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="big_pic", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="brand_story", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    PmsBrand selectByPrimaryKey(Long id);

    @UpdateProvider(type=PmsBrandSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    @UpdateProvider(type=PmsBrandSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    @UpdateProvider(type=PmsBrandSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    @UpdateProvider(type=PmsBrandSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PmsBrand row);

    @Update({
        "update pms_brand",
        "set name = #{name,jdbcType=VARCHAR},",
          "first_letter = #{firstLetter,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "factory_status = #{factoryStatus,jdbcType=INTEGER},",
          "show_status = #{showStatus,jdbcType=INTEGER},",
          "product_count = #{productCount,jdbcType=INTEGER},",
          "product_comment_count = #{productCommentCount,jdbcType=INTEGER},",
          "logo = #{logo,jdbcType=VARCHAR},",
          "big_pic = #{bigPic,jdbcType=VARCHAR},",
          "brand_story = #{brandStory,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(PmsBrand row);

    @Update({
        "update pms_brand",
        "set name = #{name,jdbcType=VARCHAR},",
          "first_letter = #{firstLetter,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "factory_status = #{factoryStatus,jdbcType=INTEGER},",
          "show_status = #{showStatus,jdbcType=INTEGER},",
          "product_count = #{productCount,jdbcType=INTEGER},",
          "product_comment_count = #{productCommentCount,jdbcType=INTEGER},",
          "logo = #{logo,jdbcType=VARCHAR},",
          "big_pic = #{bigPic,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PmsBrand row);
}