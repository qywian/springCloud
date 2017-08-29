/**
 * @Title: [ServiceConsumerRibbonApplication.java]
 * @Package: [com.qyw.cloud]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:52 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:52 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud;

import com.qyw.cloud.rule.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.lang.reflect.Type;

/**
 * @ClassName: ServiceConsumerRibbonApplication
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:52 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:52 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RibbonConfiguration.class)})
public class ServiceConsumerRibbonCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerRibbonCustomApplication.class, args);
    }
}
