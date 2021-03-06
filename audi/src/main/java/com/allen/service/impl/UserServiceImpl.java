package com.allen.service.impl;

import com.allen.dao.IUserDao;
import com.allen.model.User;
import com.allen.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }

    public User queryUser(String username, String password) {
        return userDao.queryUser(username, password);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }
}
