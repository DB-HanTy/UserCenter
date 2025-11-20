package com.hty.usercenter.service;

import com.hty.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author hty
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-11-19 11:00:34
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
