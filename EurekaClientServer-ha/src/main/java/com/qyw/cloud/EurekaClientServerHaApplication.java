/**
 * @Title: [EurekaClientServerApplication.java]
 * @Package: [com.qyw.cloud]
 * @author: [YanweiQin]
 * @CreateDate: [8/25/2017 11:25 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/25/2017 11:25 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: EurekaClientServerApplication
 * @author: [YanweiQin]
 * @CreateDate: [8/25/2017 11:25 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/25/2017 11:25 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class EurekaClientServerHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientServerHaApplication.class, args);
    }
}
