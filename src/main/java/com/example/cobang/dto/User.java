package com.example.cobang.dto;

import lombok.Data;
import org.springframework.core.annotation.AliasFor;

@Data
public class User {
    private Integer userId;
    private String userKakaoToken;
    private String userName;
    private String userCellphone;
    private String userBirth;

    public User() {
    }

    public User(String userName, String userCellphone, String userBirth) {
        this.userName = userName;
        this.userCellphone = userCellphone;
        this.userBirth = userBirth;
    }
}
