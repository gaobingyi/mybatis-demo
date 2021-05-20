package com.gby.mybatisdemo.user.mapper;

import com.gby.mybatisdemo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
//    @Select("select * from tb_user where id = #{id}")
    User selectById(Integer id);

    @Select("select * from tb_user")
    List<User> selectAll();
}
