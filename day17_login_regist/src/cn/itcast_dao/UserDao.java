package cn.itcast_dao;

import cn.itcast_pojo.User;

public interface UserDao {
	/**
	 *  �����û��ĵ�½����
	 * @param username
	 * @param password
	 * @return
	 */
		public abstract boolean isLogin(String username,String password);
		/**
		 *  ע�Ṧ��
		 * @return
		 */
		public abstract void regist(User user);
}
