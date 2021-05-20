package com.gby.mybatisdemo.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gby.mybatisdemo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from tb_user where id = #{id}")
//    User selectById(Integer id);
//
//    @Select("select * from tb_user")
//    List<User> selectAll();
}
