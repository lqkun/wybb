package com.wybb.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @className: com.wybb.admin.config-> Swagger2
 * @description:
 * @author: LQKun
 * @date: 2022-03-27 1:17
 * @version: 1.0
 */
@Configuration
@EnableSwagger2
public class Knife4jConfig {
    /**
     * @param
     * @return
     * @description 配置knife4j核心配置 docket
     * http://localhost:8088/doc.html原路径
     **/
    @Bean
    public Docket createRestApi() {
        // 指定api类型为knife4j
        return new Docket(DocumentationType.OAS_30)
                // 用于定义api文档汇总信息
                .apiInfo(apiInfo())
                .groupName("3.0")
                .select()
                .apis(RequestHandlerSelectors
                        // 指定controller包
                        .basePackage("com.wybb.admin.controller"))
                // 所有controller
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 文档页标题
                .title("无忧标标-商标平台接口api")
                //无忧标标网
                .contact(new Contact("李乾坤",
                        "http://localhost:8080",
                        "653591018@qq.com"))
                // 详细信息
                .description("无忧标标-商标平台提供的api文档")
                // 文档版本号
                .version("1.0.1")
                // 网站地址
                .termsOfServiceUrl("http://localhost:8080")
                .build();
    }

}
