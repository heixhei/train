package com.baiyuechu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MemberApplication {

    private static Logger LOG = LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(MemberApplication.class, args);

        SpringApplication app = new SpringApplication(MemberApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("项目启动成功");
//        LOG.info("");
        LOG.info("测试地址：\t127.0.0.1:{}{}/hello",env.getProperty("server.port"),env.getProperty("server.servlet.context-path"));

    }

}
