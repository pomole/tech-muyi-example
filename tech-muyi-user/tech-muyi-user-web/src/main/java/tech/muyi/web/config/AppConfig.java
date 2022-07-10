package tech.muyi.web.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description: AppConfig
 * date: 2021/10/12 23:33
 * author: muyi
 * version: 1.0
 */

@SpringBootApplication(scanBasePackages = "tech.muyi.*")
@EnableDubbo(scanBasePackages = "tech.muyi.*")
@MapperScan("tech.muyi.core.dao")
@NacosConfigurationProperties(dataId = "tech-muyi-user",groupId = "tech-muyi-user-dev", autoRefreshed = true,type = ConfigType.YAML)
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class);
    }
}
