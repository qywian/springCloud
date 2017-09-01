/**
 * @Title: [ServiceConsumer.java]
 * @Package: [com.qyw.cloud]
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 07:24 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 07:24 PM]
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
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @ClassName: ServiceConsumer
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 07:24 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 07:24 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class ServiceConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerFeignApplication.class, args);
    }
}
