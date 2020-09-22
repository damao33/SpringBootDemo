package com.example.service;

import com.example.generate.Userlist;
import com.example.generate.UserlistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserlistDao userlistDao;
    public int deleteByPrimaryKey(Integer id){
        return userlistDao.deleteByPrimaryKey(id);
    }

    public int insert(Userlist record){
        return userlistDao.insert(record);
    }

    public int insertSelective(Userlist record){
        return userlistDao.insertSelective(record);
    }

    public Userlist selectByPrimaryKey(Integer id){
        return userlistDao.selectByPrimaryKey(id);
    }

    public List<Userlist> selectAll(){
        return userlistDao.selectAll();
    }

    public int updateByPrimaryKeySelective(Userlist record){
        return userlistDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Userlist record){
        return userlistDao.updateByPrimaryKey(record);
    }
}
