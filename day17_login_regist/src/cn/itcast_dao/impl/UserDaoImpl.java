package cn.itcast_dao.impl;

import java.util.ArrayList;

import cn.itcast_dao.UserDao;
import cn.itcast_pojo.User;
/**
 *  �����û������ľ���ʵ���ࣨ���ϰ棩
 * @author ����С��
 *
 */
public class UserDaoImpl implements UserDao{
	
			private static ArrayList<User> array=new ArrayList<User>();
			//���������ͬ����Ա�������þ�̬
			public boolean isLogin(String username,String password){
				boolean flag=false;
				for(User u:array) {
					if(u.getUsername().equals(username)&&u.getPassword().equals(password)) {
						flag=true;
						
					}
				
				}
				return flag;
			}

			@Override
			public void regist(User user) {
			   array.add(user);
				
			}
}
