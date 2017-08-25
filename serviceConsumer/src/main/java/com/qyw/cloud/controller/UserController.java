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
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        String url="http://localhost:8080/"+id;
        return  restTemplate.getForObject(url,User.class);
    }
}
