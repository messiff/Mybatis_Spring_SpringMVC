package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import pojo.UserPojo;

public interface UserMapper {
	@Select("select * from user")
	List<UserPojo> findAll();
}
