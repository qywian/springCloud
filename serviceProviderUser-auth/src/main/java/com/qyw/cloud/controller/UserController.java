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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

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

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        System.out.println("========================");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = user.getAuthorities();
            for (GrantedAuthority grantedAuthority : collection) {
                LOG.info("当前用户是{},角色是{}", user.getUsername(), grantedAuthority.getAuthority());
            }
        }else{
            LOG.warn("用户角色不对");
            return null;
        }
        return userRepository.findOne(id);
    }
}
