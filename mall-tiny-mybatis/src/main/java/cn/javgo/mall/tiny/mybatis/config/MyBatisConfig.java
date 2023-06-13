package cn.javgo.mall.tiny.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

/**
 * MyBatis 配置类(用于配置扫描mapper接口的位置)
 */
@SpringBootConfiguration
@MapperScan("cn.javgo.mall.tiny.mybatis.mapper")
public class MyBatisConfig {

}
