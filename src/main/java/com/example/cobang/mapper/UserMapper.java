package com.example.cobang.mapper;

import com.example.cobang.dto.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUsers();
}
