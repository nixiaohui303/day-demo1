package com.example.demo1.service.impl;

import com.example.demo1.domain.User;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:
 **/
@Service
public class UserServiceImpl implements  UserService {


        @Autowired
        private UserMapper userMapper;

        @Override
        public int add(User user) {
            userMapper.insert(user);
            int id = user.getId();
            return id;
        }

//	   @Override
//	   public String addName(User user) {
//		userMapper.insert(user);
//		String name = user.getName();
//		return name;
//	  }


}
