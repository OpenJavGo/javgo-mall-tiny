package cn.javgo.mall.tiny.mybatis.service;

import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrand;
import com.github.pagehelper.PageInfo;

/**
 * 品牌管理 Service
 */
public interface PmsBrandService {
    /**
     * 分页查询品牌
     * @param pageNum 当前页码
     * @param pageSize 每页数量
     * @return 品牌分页信息
     */
    PageInfo<PmsBrand> page(Integer pageNum, Integer pageSize);
}
