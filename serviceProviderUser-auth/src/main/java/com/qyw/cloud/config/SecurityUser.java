/**
 * @Title: [SecurityUser.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 05:01 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 05:01 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName: SecurityUser
 * @author: [YanweiQin]
 * @CreateDate: [8/30/2017 05:01 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/30/2017 05:01 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Data
public class SecurityUser implements UserDetails {

    private Long id;

    private String userName;

    private String password;

    private String role;

    public SecurityUser(String userName, String password, String role) {
        super();
        this.userName = userName;
        this.password = password;
        this.role = role;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(this.role);
        authorityList.add(authority);
        return authorityList;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
