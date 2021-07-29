package org.assien.library.modules.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.assien.library.modules.user.entity.User;

/**
 * @author ：WUJILIANG
 * @date ：2021/7/29 16:14
 * @description：用户
 * @modified By：
 * @version: 1.0
 */
public interface UserService extends IService<User> {

    /**
     * fetch data by rule id
     * @description: 根据id获取用户
     * @param id
     * @return: org.assien.library.modules.user.entity.User
     * @author: WuJiLiang
     * @time: 2021/7/29 16:33
     */
    User getUserById(Integer id);

}
