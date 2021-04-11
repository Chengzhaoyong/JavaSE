package cn.itcast_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *   传智播客：
 *     gz   广州校区
 *             jc  基础班
 *                                               小明    23
 *                                               小兰   20
 *             jy  就业班
 *                                               小黄   21
 *                                               小绿   22
 *                                               
 *      bj   北京校区
 *             jc  基础班
 *                                               小蓝    32
 *                                               小青   21
 *             jy  就业班
 *                                               小红   34
 *                                               小子   21       
 *    
 *     sh   上海校区
 *             jc  基础班
 *                                               小梓    33
 *                                               小程   22
 *             jy  就业班
 *                                               小陈   34
 *                                               小来   11                          
 *                                               
 *                                            
 *   
 */
public class HashMapDemo3 {
		public static void main(String[] args) {
			HashMap<String,HashMap<String,ArrayList<Student>>>  czbkMap=new HashMap<String,HashMap<String,ArrayList<Student>>>();
			
			HashMap<String,ArrayList<Student>> hm1=new HashMap<String,ArrayList<Student>>();
			ArrayList<Student> array1=new ArrayList<Student>();
			
			Student s1=new Student("小明",23);
			Student s2=new Student("小蓝",20);
			array1.add(s1);
			array1.add(s2);
			hm1.put("基础班",array1);
			
			ArrayList<Student> array2=new ArrayList<Student>();
			Student s3=new Student("小红",13);
			Student s4=new Student("小率",30);
			array2.add(s3);
			array2.add(s4);
			hm1.put("就业班",array2);
			czbkMap.put("广州校区", hm1);
			
			
			HashMap<String,ArrayList<Student>> hm2=new HashMap<String,ArrayList<Student>>();
			ArrayList<Student> array3=new ArrayList<Student>();
			
			Student s5=new Student("小子",23);
			Student s6=new Student("小梓",30);
			array3.add(s5);
			array3.add(s6);
			hm2.put("基础班",array3);
			
			ArrayList<Student> array4=new ArrayList<Student>();
			Student s7=new Student("小程",24);
			Student s8=new Student("小陈",26);
			array4.add(s6);
			array4.add(s7);
			hm2.put("就业班",array4);
			czbkMap.put("北京校区", hm2);
			
			
			
			HashMap<String,ArrayList<Student>> hm3=new HashMap<String,ArrayList<Student>>();
			ArrayList<Student> array5=new ArrayList<Student>();
			
			Student s9=new Student("小布",28);
			Student s10=new Student("小好",29);
			array5.add(s9);
			array5.add(s10);
			hm3.put("基础班",array5);
			
			ArrayList<Student> array6=new ArrayList<Student>();
			Student s11=new Student("小卡",43);
			Student s12=new Student("小从",60);
			array6.add(s11);
			array6.add(s12);
			hm3.put("就业班",array6);
			czbkMap.put("上海校区", hm3);
			
			Set<String> czbkMapSet=czbkMap.keySet();
			for(String czbkMapKey:czbkMapSet) {
				System.out.println(czbkMapKey);
				HashMap<String,ArrayList<Student>> czbkMapValue=czbkMap.get(czbkMapKey);
				
				Set<String> czbkMapValueSet=czbkMapValue.keySet();
				for(String czbkMapValueKey:czbkMapValueSet) {
					System.out.println("\t"+czbkMapValueKey);
					ArrayList<Student> array=czbkMapValue.get(czbkMapValueKey);
					for(Student s:array) {
						System.out.println("\t\t"+s.getName()+"\t"+s.getAge());
					}
				}
			}
				
			
			
		}
}
