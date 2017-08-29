/**
 * @Title: [RestTemplateConfig.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:54 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:54 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestTemplateConfig
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:54 PM]   
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:54 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
