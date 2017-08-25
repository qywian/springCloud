/**
 * @Title: [UserRepository.java]
 * @Package: [com.qyw.cloud.dao]
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 06:06 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 06:06 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.dao;

import com.qyw.cloud.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserRepository
 * @author: [YanweiQin]
 * @CreateDate: [8/23/2017 06:06 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/23/2017 06:06 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

