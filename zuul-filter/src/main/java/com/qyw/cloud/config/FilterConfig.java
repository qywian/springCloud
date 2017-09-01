/**
 * @Title: [FilterConfig.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [9/1/2017 11:15 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [9/1/2017 11:15 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FilterConfig
 * @author: [YanweiQin]
 * @CreateDate: [9/1/2017 11:15 AM]   
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [9/1/2017 11:15 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Configuration
public class FilterConfig {

    @Bean
    public ConsumerZuulFilter consumerZuulFilter(){
        return new ConsumerZuulFilter();
    }
}
