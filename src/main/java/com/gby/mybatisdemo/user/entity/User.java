package com.gby.mybatisdemo.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {
    private Integer id;
    private String username;
    private String email;
}
