package org.assien.library.modules.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.assien.library.modules.user.entity.User;

/**
 * @author ：WUJILIANG
 * @date ：2021/7/29 16:10
 * @description：用户
 * @version: 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * fetch data by rule id
     * @description:
     * @param id
     * @return: org.assien.library.modules.user.entity.User
     * @author: WuJiLiang
     * @time: 2021/7/29 16:35
     */
    User getUserById(@Param("id") Integer id);
}
