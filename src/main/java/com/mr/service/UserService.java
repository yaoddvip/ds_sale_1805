package com.mr.service;

import com.mr.model.TMallUserAccount;

/**
 * Created by yaodd on 2018/11/5.
 */
public interface UserService {
    TMallUserAccount findUserByNamePswd(String userName, String password);


}
