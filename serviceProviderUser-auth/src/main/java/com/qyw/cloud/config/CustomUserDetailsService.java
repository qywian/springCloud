/**
 * @Title: [CustomUserDetailsService.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 04:57 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 04:57 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CustomUserDetailsService
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 04:57 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 04:57 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new SecurityUser("user", "password1", "user-role");
        } else if ("admin".equals(username)) {
            return new SecurityUser("admin", "password2", "admin-role");
        } else {
            return null;
        }
    }
}
