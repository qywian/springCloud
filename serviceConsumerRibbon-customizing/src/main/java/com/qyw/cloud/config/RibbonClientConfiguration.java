/**
 * @Title: [RibbonClientConfiguration.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 05:04 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 05:04 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import com.qyw.cloud.rule.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: RibbonClientConfiguration
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 05:04 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 05:04 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Configuration
@RibbonClient(name = "service-provider-user", configuration = RibbonConfiguration.class)
public class RibbonClientConfiguration {
}
