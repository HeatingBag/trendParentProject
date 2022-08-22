/**
 * @Title: IpConfiguration
 * @Auther: zhang
 * @Version: 1.0
 * @create: 2022/6/29 16:51
 */
package cn.how2j.trend.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class IpConfiguration implements ApplicationListener<WebServerInitializedEvent> {

    private int serverPort;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {

        this.serverPort = event.getWebServer().getPort();

    }

    public int getPort() {
        return this.serverPort;
    }
}
