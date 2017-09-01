/**
 * @Title: [FeignConfiguration.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 04:32 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 04:32 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: FeignConfiguration
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 04:32 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 04:32 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
