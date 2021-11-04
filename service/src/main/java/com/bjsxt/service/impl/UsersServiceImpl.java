package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.pojo.UsersExample;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//用户管理业务层
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    //用户添加业务
    @Override
    @Transactional
    public void addUsers(Users users) {
        this.usersMapper.insert(users);
    }

    //查询所以用户
    @Override
    public List<Users> findUsers() {
        UsersExample usersExample = new UsersExample();
        List<Users> list = this.usersMapper.selectByExample(usersExample);
        return list;
    }

    //根据id查询指定用户
    @Override
    public Users findUserById(int id) {
        Users users = this.usersMapper.selectByPrimaryKey(id);
        return users;
    }

    //更新用户
    @Override
    @Transactional
    public void modifyUsers(Users users) {
        this.usersMapper.updateByPrimaryKey(users);
    }

    //删除用户
    @Override
    @Transactional
    public void dropUsers(int id) {
        this.usersMapper.deleteByPrimaryKey(id);
    }


}
