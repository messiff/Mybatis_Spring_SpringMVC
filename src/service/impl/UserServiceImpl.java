package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UserMapper;
import pojo.UserPojo;
import service.UserService;
@Service("userservice")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	@Override
	public List<UserPojo> findAll() {
//		调用mapper中的findall
		return mapper.findAll();
	}

}
