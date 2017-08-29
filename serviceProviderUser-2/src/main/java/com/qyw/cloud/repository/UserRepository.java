/**
 * @Title: [UserRepository.java]
 * @Package: [com.qyw.cloud.repository]
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:25 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:25 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.repository;

import com.qyw.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserRepository
 * @author: [YanweiQin]
 * @CreateDate: [8/29/2017 02:25 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [8/29/2017 02:25 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
