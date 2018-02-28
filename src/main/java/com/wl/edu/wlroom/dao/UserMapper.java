package com.wl.edu.wlroom.dao;

import java.util.List;

import com.wl.edu.wlroom.model.UserCourse;
import org.springframework.stereotype.Repository;

import com.wl.edu.wlroom.model.User;
@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);


    User selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll();

    List<UserCourse> getUserCourse();
}