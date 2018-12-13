package com.zhang.zhang.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

@Configuration
@MapperScan("com.zhang.zhang.dao")
public class MybatisPlusConfig {

	/**
	 * mybatis-plus SQL执行效率插件【生产环境可以关闭】
	 */
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}
 
	/**
	 * 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
	@Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
