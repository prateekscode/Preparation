package com.lib.book.shop.dao;

import com.lib.book.shop.to.UserTO;

public interface UserDao {
public UserTO verifyUser(String username,String password);
public UserTO changePassword(UserTO usto,String password);
public String searchPassword(String username, String  email);
public boolean registerUser(UserTO uto);
public boolean alreadyExist(String username);
public boolean updateUserInfo(String userId, String email, long phone);
public UserTO getUserInfoById(String userId);

}
