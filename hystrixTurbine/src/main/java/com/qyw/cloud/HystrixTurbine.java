/**
 * @Title: [HystrixTurbine.java]
 * @Package: [com.qyw.cloud]
 * @author: [YanweiQin]
 * @CreateDate: [8/31/2017 11:25 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/31/2017 11:25 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @ClassName: HystrixTurbine
 * @author: [YanweiQin]
 * @CreateDate: [8/31/2017 11:25 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/31/2017 11:25 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@EnableTurbine
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class HystrixTurbine {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbine.class, args);
    }
}
