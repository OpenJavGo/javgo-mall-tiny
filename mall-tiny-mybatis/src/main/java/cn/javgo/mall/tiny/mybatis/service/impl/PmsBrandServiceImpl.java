package cn.javgo.mall.tiny.mybatis.service.impl;

import cn.javgo.mall.tiny.mybatis.mapper.mbg.PmsBrandMapper;
import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrand;
import cn.javgo.mall.tiny.mybatis.service.PmsBrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 品牌管理 Service 实现类
 */
@Service
@RequiredArgsConstructor
public class PmsBrandServiceImpl implements PmsBrandService {

    private final PmsBrandMapper pmsBrandMapper;

    @Override
    public PageInfo<PmsBrand> page(Integer pageNum, Integer pageSize) {
        // 开启分页
        PageHelper.startPage(pageNum, pageSize);
        // 查询所有品牌并返回
        return PageInfo.of(pmsBrandMapper.selectByExample(null));
    }
}
