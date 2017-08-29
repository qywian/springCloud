/**
 * @Title: [UserController.java]
 * @Package: [com.qyw.cloud.controller]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:26 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:26 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.controller;

import com.qyw.cloud.entity.User;
import com.qyw.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:26 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:26 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("----------------------");
        return userRepository.findOne(id);
    }
}
