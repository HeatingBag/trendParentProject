package cn.how2j.trend;


import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 1. @SpringBootApplication 注解表示它是个启动类
 * 2. @EnableEurekaServer 表示它是个注册中心服务器
 * 3. 默认端口号是 8761
 * 4. 进行端口号判断，如果这个端口已经被占用了，就给出提示信息。
 * 5. 使用 SpringApplicationBuilder 进行启动
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        //8761 这个端口是默认的，就不要修改了，后面的子项目，都会访问这个端口。
        int port = 8761;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port=" + port).run(args);
    }
}
