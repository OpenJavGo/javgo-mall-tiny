package cn.javgo.mall.tiny.mybatis.mapper.mbg;

import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrand;
import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrandExample.Criteria;
import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrandExample.Criterion;
import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrandExample;
//import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PmsBrandSqlProvider {
    public String countByExample(PmsBrandExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pms_brand");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PmsBrandExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pms_brand");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PmsBrand row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pms_brand");
        
        if (row.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (row.getFirstLetter() != null) {
            sql.VALUES("first_letter", "#{firstLetter,jdbcType=VARCHAR}");
        }
        
        if (row.getSort() != null) {
            sql.VALUES("sort", "#{sort,jdbcType=INTEGER}");
        }
        
        if (row.getFactoryStatus() != null) {
            sql.VALUES("factory_status", "#{factoryStatus,jdbcType=INTEGER}");
        }
        
        if (row.getShowStatus() != null) {
            sql.VALUES("show_status", "#{showStatus,jdbcType=INTEGER}");
        }
        
        if (row.getProductCount() != null) {
            sql.VALUES("product_count", "#{productCount,jdbcType=INTEGER}");
        }
        
        if (row.getProductCommentCount() != null) {
            sql.VALUES("product_comment_count", "#{productCommentCount,jdbcType=INTEGER}");
        }
        
        if (row.getLogo() != null) {
            sql.VALUES("logo", "#{logo,jdbcType=VARCHAR}");
        }
        
        if (row.getBigPic() != null) {
            sql.VALUES("big_pic", "#{bigPic,jdbcType=VARCHAR}");
        }
        
        if (row.getBrandStory() != null) {
            sql.VALUES("brand_story", "#{brandStory,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(PmsBrandExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("first_letter");
        sql.SELECT("sort");
        sql.SELECT("factory_status");
        sql.SELECT("show_status");
        sql.SELECT("product_count");
        sql.SELECT("product_comment_count");
        sql.SELECT("logo");
        sql.SELECT("big_pic");
        sql.SELECT("brand_story");
        sql.FROM("pms_brand");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(PmsBrandExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("first_letter");
        sql.SELECT("sort");
        sql.SELECT("factory_status");
        sql.SELECT("show_status");
        sql.SELECT("product_count");
        sql.SELECT("product_comment_count");
        sql.SELECT("logo");
        sql.SELECT("big_pic");
        sql.FROM("pms_brand");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PmsBrand row = (PmsBrand) parameter.get("row");
        PmsBrandExample example = (PmsBrandExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pms_brand");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=BIGINT}");
        }
        
        if (row.getName() != null) {
            sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        }
        
        if (row.getFirstLetter() != null) {
            sql.SET("first_letter = #{row.firstLetter,jdbcType=VARCHAR}");
        }
        
        if (row.getSort() != null) {
            sql.SET("sort = #{row.sort,jdbcType=INTEGER}");
        }
        
        if (row.getFactoryStatus() != null) {
            sql.SET("factory_status = #{row.factoryStatus,jdbcType=INTEGER}");
        }
        
        if (row.getShowStatus() != null) {
            sql.SET("show_status = #{row.showStatus,jdbcType=INTEGER}");
        }
        
        if (row.getProductCount() != null) {
            sql.SET("product_count = #{row.productCount,jdbcType=INTEGER}");
        }
        
        if (row.getProductCommentCount() != null) {
            sql.SET("product_comment_count = #{row.productCommentCount,jdbcType=INTEGER}");
        }
        
        if (row.getLogo() != null) {
            sql.SET("logo = #{row.logo,jdbcType=VARCHAR}");
        }
        
        if (row.getBigPic() != null) {
            sql.SET("big_pic = #{row.bigPic,jdbcType=VARCHAR}");
        }
        
        if (row.getBrandStory() != null) {
            sql.SET("brand_story = #{row.brandStory,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pms_brand");
        
        sql.SET("id = #{row.id,jdbcType=BIGINT}");
        sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        sql.SET("first_letter = #{row.firstLetter,jdbcType=VARCHAR}");
        sql.SET("sort = #{row.sort,jdbcType=INTEGER}");
        sql.SET("factory_status = #{row.factoryStatus,jdbcType=INTEGER}");
        sql.SET("show_status = #{row.showStatus,jdbcType=INTEGER}");
        sql.SET("product_count = #{row.productCount,jdbcType=INTEGER}");
        sql.SET("product_comment_count = #{row.productCommentCount,jdbcType=INTEGER}");
        sql.SET("logo = #{row.logo,jdbcType=VARCHAR}");
        sql.SET("big_pic = #{row.bigPic,jdbcType=VARCHAR}");
        sql.SET("brand_story = #{row.brandStory,jdbcType=LONGVARCHAR}");
        
        PmsBrandExample example = (PmsBrandExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pms_brand");
        
        sql.SET("id = #{row.id,jdbcType=BIGINT}");
        sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        sql.SET("first_letter = #{row.firstLetter,jdbcType=VARCHAR}");
        sql.SET("sort = #{row.sort,jdbcType=INTEGER}");
        sql.SET("factory_status = #{row.factoryStatus,jdbcType=INTEGER}");
        sql.SET("show_status = #{row.showStatus,jdbcType=INTEGER}");
        sql.SET("product_count = #{row.productCount,jdbcType=INTEGER}");
        sql.SET("product_comment_count = #{row.productCommentCount,jdbcType=INTEGER}");
        sql.SET("logo = #{row.logo,jdbcType=VARCHAR}");
        sql.SET("big_pic = #{row.bigPic,jdbcType=VARCHAR}");
        
        PmsBrandExample example = (PmsBrandExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PmsBrand row) {
        SQL sql = new SQL();
        sql.UPDATE("pms_brand");
        
        if (row.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (row.getFirstLetter() != null) {
            sql.SET("first_letter = #{firstLetter,jdbcType=VARCHAR}");
        }
        
        if (row.getSort() != null) {
            sql.SET("sort = #{sort,jdbcType=INTEGER}");
        }
        
        if (row.getFactoryStatus() != null) {
            sql.SET("factory_status = #{factoryStatus,jdbcType=INTEGER}");
        }
        
        if (row.getShowStatus() != null) {
            sql.SET("show_status = #{showStatus,jdbcType=INTEGER}");
        }
        
        if (row.getProductCount() != null) {
            sql.SET("product_count = #{productCount,jdbcType=INTEGER}");
        }
        
        if (row.getProductCommentCount() != null) {
            sql.SET("product_comment_count = #{productCommentCount,jdbcType=INTEGER}");
        }
        
        if (row.getLogo() != null) {
            sql.SET("logo = #{logo,jdbcType=VARCHAR}");
        }
        
        if (row.getBigPic() != null) {
            sql.SET("big_pic = #{bigPic,jdbcType=VARCHAR}");
        }
        
        if (row.getBrandStory() != null) {
            sql.SET("brand_story = #{brandStory,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PmsBrandExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}