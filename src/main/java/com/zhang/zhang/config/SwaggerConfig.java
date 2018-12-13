package com.zhang.zhang.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

private final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);
	
	@Bean
	public Docket createRestApi() {
		
		log.info("正在启动swagger......");
		StopWatch watch = new StopWatch();
		watch.start();
		
		Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.zhang.zhang.api.controller"))
				.paths(PathSelectors.any()).build();
		watch.stop();
		log.info("swagger已启动，用时{}ms", watch.getTotalTimeMillis());
		return docket;
	}
 
	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("测试接口文档").description("XX有限公司")
				.termsOfServiceUrl("http://www.baidu.com").version("1.0.1").build();
	}

}
