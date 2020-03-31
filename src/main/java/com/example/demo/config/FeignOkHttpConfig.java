package com.example.demo.config;

import feign.Feign;
import okhttp3.ConnectionPool;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
@ConditionalOnClass(Feign.class)
@AutoConfigureAfter(FeignAutoConfiguration.class)
public class FeignOkHttpConfig {
    @Bean
    public static okhttp3.OkHttpClient okHttpClient() {
        return new okhttp3.OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)   //设置连接超时
                .readTimeout(60, TimeUnit.SECONDS)      //设置读超时
                .writeTimeout(60, TimeUnit.SECONDS)     //设置写超时
                .retryOnConnectionFailure(true)                 //是否自动重连
                .connectionPool(new ConnectionPool(500, 5L, TimeUnit.MINUTES))           //构建OkHttpClient对象 可配置连接池
                .build();
    }
}
