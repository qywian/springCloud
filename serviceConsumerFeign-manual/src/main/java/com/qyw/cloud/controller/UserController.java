/**
 * @Title: [UserController.java]
 * @Package: [com.qyw.cloud.controller]
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 07:21 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 07:21 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.controller;

import com.qyw.cloud.entity.User;
import com.qyw.cloud.feign.UserFeignClient;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: UserController
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 07:21 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 07:21 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Import(FeignClientsConfiguration.class)
@RestController
public class UserController {

    private UserFeignClient userUserFeignClient;

    private UserFeignClient adminUserFeignClient;

    @Autowired
    public UserController(Decoder decoder, Encoder encoder, Client client, Contract contract){
        this.userUserFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user","password1"))
                .target(UserFeignClient.class,"http://service-provider-user/");
        this.adminUserFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin","password2"))
                .target(UserFeignClient.class,"http://service-provider-user/");
    }



    @GetMapping("/user-user/{id}")
    public User findByIdUser(@PathVariable Long id){
        return  userUserFeignClient.findById(id);
    }
    @GetMapping("/user-admin/{id}")
    public User findByIdAdmin(@PathVariable Long id){
        return  adminUserFeignClient.findById(id);
    }
}
