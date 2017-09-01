/**
 * @Title: [UserFeignClient.java]
 * @Package: [com.qyw.cloud.feign]
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 03:29 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 03:29 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.feign;

import com.qyw.cloud.config.FeignConfiguration;
import com.qyw.cloud.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: UserFeignClient
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 03:29 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 03:29 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@FeignClient(name = "service-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
