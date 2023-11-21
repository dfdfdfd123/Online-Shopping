package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000") // 허용할 Origin(프론트엔드 서버 주소)
            .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메소드
            .allowCredentials(true); // 인증 정보 허용
           
    }
}
