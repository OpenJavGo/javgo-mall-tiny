package cn.javgo.mall.tiny.mybatis.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.spring.web.plugins.WebFluxRequestHandlerProvider;
//import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider;
import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Swagger2API文档的配置
 */
@SpringBootConfiguration
public class Swagger2Config {
    /*@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.javgo.mall.tiny.mybatis.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Mall 商城脚手架接口文档")
                .description("mall-tiny-mybatis")
                .contact(new Contact("javgo", "javgo.cn", "javgocn@gmail.com"))
                .version("1.0")
                .build();
    }

    @Bean
    public static BeanPostProcessor springfoxHandlerProviderBeanPostProcessor(){
        return new BeanPostProcessor() {
            // 在所有 Bean 初始化之前，执行该方法
            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                // 如果该 Bean 是 WebMvcRequestHandlerProvider 或 WebFluxRequestHandlerProvider 类型
                if (bean instanceof WebMvcRequestHandlerProvider || bean instanceof WebFluxRequestHandlerProvider) {
                    // 获取 bean 中的 HandlerMappings 并进行自定义
                    customizeSpringfoxHandlerMappings(getHandlerMappings(bean));
                }
                return bean;
            }

            // 用于自定义 Springfox 的 HandlerMappings
            private <T extends RequestMappingInfoHandlerMapping> void customizeSpringfoxHandlerMappings(List<T> mappings){
                // 复制一份 mappings,过滤出所有 mapping 为 null 的元素
                List<T> copy = mappings.stream()
                        .filter(mapping -> mapping.getHandlerMethods().size() > 0)
                        .collect(Collectors.toList());

                // 清空 mappings
                mappings.clear();
                // 添加 copy
                mappings.addAll(copy);
            }

            // 用于获取 bean 中的 HandlerMappings
            @SuppressWarnings("unchecked")
            private List<RequestMappingInfoHandlerMapping> getHandlerMappings(Object bean){
                try{
                    // 通过反射获取 bean 中的 handlerMappings 属性
                    Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
                    // 设置可访问(因为该属性是 private 的)
                    assert field != null;
                    field.setAccessible(true);
                    // 将获取到的属性值转为 List<RequestMappingInfoHandlerMapping> 类型
                    return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }*/
}
