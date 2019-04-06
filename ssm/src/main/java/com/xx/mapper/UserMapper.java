package com.xx.mapper;

import com.xx.pojo.User;

public interface UserMapper {
	User selectUser(String name,String pwd);
}
