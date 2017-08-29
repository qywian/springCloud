/**
 * @Title: [RibbonConfiguration.java]
 * @Package: [com.qyw.cloud.rule]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 04:27 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 04:27 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: RibbonConfiguration
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 04:27 PM]   
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 04:27 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        //随机负载均衡
        return new RandomRule();
    }
}
