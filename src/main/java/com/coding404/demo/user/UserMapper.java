package com.coding404.demo.user;

import com.coding404.demo.command.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public void join(UserVO vo);
    public UserVO login(String username);
}
