package cn.javgo.mall.tiny.mybatis.controller;

import cn.javgo.mall.tiny.mybatis.common.api.CommonResult;
import cn.javgo.mall.tiny.mybatis.model.mbg.PmsBrand;
import cn.javgo.mall.tiny.mybatis.service.PmsBrandService;
import com.github.pagehelper.PageInfo;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 品牌管理 Controller
 */
//@Api(tags = "品牌管理 API 接口")
@RestController
@RequestMapping("/brand")
@RequiredArgsConstructor
public class PmsBrandController {

    private final PmsBrandService pmsBrandService;

    /**
     * 分页查询品牌
     * @param pageNum 当前页码
     * @param pageSize 每页数量
     * @return 品牌分页信息
     */
    //@ApiOperation("分页查询品牌")
    //@ApiImplicitParams({
            //@ApiImplicitParam(name = "pageNum", value = "当前页码", dataType = "int", defaultValue = "1"),
            //@ApiImplicitParam(name = "pageSize", value = "每页数量", dataType = "int", defaultValue = "10")
    //})
    @GetMapping("/page")
    public CommonResult<PageInfo<PmsBrand>> page(Integer pageNum, Integer pageSize) {
        return CommonResult.success(pmsBrandService.page(pageNum, pageSize));
    }

    //@ApiOperation("测试热部署")
    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
