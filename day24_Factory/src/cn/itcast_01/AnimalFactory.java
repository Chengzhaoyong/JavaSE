package cn.itcast_01;

public class AnimalFactory {
		private AnimalFactory() {
			
		}
		
		public static Animal creatAnimal(String type) {
			if("Dog".equals(type)) {
				return new Dog();
			}
			else if("Cat".equals(type)) {
				return new Cat();
			}
			else {
				return null;
			}
		}
}
