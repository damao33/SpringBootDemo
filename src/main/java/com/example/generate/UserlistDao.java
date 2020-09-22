package com.example.generate;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserlistDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Userlist record);

    int insertSelective(Userlist record);

    Userlist selectByPrimaryKey(Integer id);

    List<Userlist> selectAll();

    int updateByPrimaryKeySelective(Userlist record);

    int updateByPrimaryKey(Userlist record);
}