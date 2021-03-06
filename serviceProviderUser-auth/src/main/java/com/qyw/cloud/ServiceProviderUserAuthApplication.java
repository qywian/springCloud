/**
 * @Title: [ServiceProviderUserApplication.java]
 * @Package: [com.qyw.cloud]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:22 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:22 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @ClassName: ServiceProviderUserApplication
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:22 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:22 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableWebSecurity
public class ServiceProviderUserAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderUserAuthApplication.class, args);
    }
}
