package org.assien.library.modules.user.entity;

import lombok.Data;

/**
 * @author ：WUJILIANG
 * @date ：2021/7/29 16:03
 * @description：用户
 * @version: 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String email;
}
