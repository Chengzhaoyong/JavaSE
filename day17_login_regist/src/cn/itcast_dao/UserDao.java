package cn.itcast_dao;

import cn.itcast_pojo.User;

public interface UserDao {
	/**
	 *  这是用户的登陆动能
	 * @param username
	 * @param password
	 * @return
	 */
		public abstract boolean isLogin(String username,String password);
		/**
		 *  注册功能
		 * @return
		 */
		public abstract void regist(User user);
}
