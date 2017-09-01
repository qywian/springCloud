/**
 * @Title: [HystrixDashboardApplication.java]
 * @Package: [com.qyw.cloud]
 * @author: [YanweiQin]
 * @CreateDate: [8/31/2017 11:15 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/31/2017 11:15 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: HystrixDashboardApplication
 * @author: [YanweiQin]
 * @CreateDate: [8/31/2017 11:15 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/31/2017 11:15 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@EnableHystrixDashboard
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }

}


