package test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mapper.UserMapper;
import service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserTest {
	@Autowired
	UserService userService;
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		

	}
	@Test
	public void test2() {
		System.out.println(userService);
	}
	/*
	 * mybatis����
	 */
	@Test
	public void test1() throws IOException {
//		1����ȡmybatis�ļ�
		Reader reader = Resources.getResourceAsReader("mybatis.xml");
//		2������reader
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(reader);
//		3������sqlsession  true ��Ϊ�˿�������
		SqlSession session=ssf.openSession(true);
//		4������usermapper
		UserMapper mapper=session.getMapper(UserMapper.class);
		System.out.println(mapper.findAll());
//		�ر�ssion
		session.close();
	}
}
