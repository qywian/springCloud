/**
 * @Title: [User.java]
 * @Package: [com.qyw.cloud.entity]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:24 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:24 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @ClassName: User
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:24 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:24 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigDecimal balance;
}
