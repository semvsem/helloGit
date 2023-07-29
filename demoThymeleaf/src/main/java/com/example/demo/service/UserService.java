package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public User search(UserSearchRequest userSearchRequest) {
    	
    	User user = userMapper.search(userSearchRequest);
    	
    	if (user.getName().substring(user.getName().length()-2).equals("太郎")) {
    		user.setName(user.getName()+"(男)");
		} else {
			user.setName(user.getName()+"(女)");
		}
    	
        return user;
    }
}