package pojo;

public class UserPojo {
	@Override
	public String toString() {
		return "数据库列表 [用户名：" + username + ", 密码：" + password + ", id：" + uid + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	private String username;
	private String password;
	private int uid;
	
}
