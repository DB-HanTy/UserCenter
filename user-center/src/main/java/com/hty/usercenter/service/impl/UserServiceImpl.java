package com.hty.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hty.usercenter.model.domain.User;
import com.hty.usercenter.service.UserService;
import com.hty.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 33038
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-11-19 11:00:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




