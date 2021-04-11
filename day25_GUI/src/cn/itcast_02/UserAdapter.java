package cn.itcast_02;
/*
 *  先用个抽象类实现接口，然后弄个抽象类的子类继承抽象类，需要哪个方法，就重写哪个方法
 */
public abstract class UserAdapter implements Userbao{
		public void add() {}
		public void delete() {}
		public void update() {}
		public void find() {}
		
}
