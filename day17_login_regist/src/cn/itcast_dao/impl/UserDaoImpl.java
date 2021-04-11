package cn.itcast_dao.impl;

import java.util.ArrayList;

import cn.itcast_dao.UserDao;
import cn.itcast_pojo.User;
/**
 *  这是用户操作的具体实现类（集合版）
 * @author 阳光小伙
 *
 */
public class UserDaoImpl implements UserDao{
	
			private static ArrayList<User> array=new ArrayList<User>();
			//多个对象共用同个成员变量，用静态
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
