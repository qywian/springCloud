/**
 * @Title: [User.java]
 * @Package: [com.qyw.cloud.entity]
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 07:18 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 07:18 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: User
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 07:18 PM]   
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 07:18 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Data
public class User {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
