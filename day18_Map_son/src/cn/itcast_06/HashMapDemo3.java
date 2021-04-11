package cn.itcast_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *   ���ǲ��ͣ�
 *     gz   ����У��
 *             jc  ������
 *                                               С��    23
 *                                               С��   20
 *             jy  ��ҵ��
 *                                               С��   21
 *                                               С��   22
 *                                               
 *      bj   ����У��
 *             jc  ������
 *                                               С��    32
 *                                               С��   21
 *             jy  ��ҵ��
 *                                               С��   34
 *                                               С��   21       
 *    
 *     sh   �Ϻ�У��
 *             jc  ������
 *                                               С��    33
 *                                               С��   22
 *             jy  ��ҵ��
 *                                               С��   34
 *                                               С��   11                          
 *                                               
 *                                            
 *   
 */
public class HashMapDemo3 {
		public static void main(String[] args) {
			HashMap<String,HashMap<String,ArrayList<Student>>>  czbkMap=new HashMap<String,HashMap<String,ArrayList<Student>>>();
			
			HashMap<String,ArrayList<Student>> hm1=new HashMap<String,ArrayList<Student>>();
			ArrayList<Student> array1=new ArrayList<Student>();
			
			Student s1=new Student("С��",23);
			Student s2=new Student("С��",20);
			array1.add(s1);
			array1.add(s2);
			hm1.put("������",array1);
			
			ArrayList<Student> array2=new ArrayList<Student>();
			Student s3=new Student("С��",13);
			Student s4=new Student("С��",30);
			array2.add(s3);
			array2.add(s4);
			hm1.put("��ҵ��",array2);
			czbkMap.put("����У��", hm1);
			
			
			HashMap<String,ArrayList<Student>> hm2=new HashMap<String,ArrayList<Student>>();
			ArrayList<Student> array3=new ArrayList<Student>();
			
			Student s5=new Student("С��",23);
			Student s6=new Student("С��",30);
			array3.add(s5);
			array3.add(s6);
			hm2.put("������",array3);
			
			ArrayList<Student> array4=new ArrayList<Student>();
			Student s7=new Student("С��",24);
			Student s8=new Student("С��",26);
			array4.add(s6);
			array4.add(s7);
			hm2.put("��ҵ��",array4);
			czbkMap.put("����У��", hm2);
			
			
			
			HashMap<String,ArrayList<Student>> hm3=new HashMap<String,ArrayList<Student>>();
			ArrayList<Student> array5=new ArrayList<Student>();
			
			Student s9=new Student("С��",28);
			Student s10=new Student("С��",29);
			array5.add(s9);
			array5.add(s10);
			hm3.put("������",array5);
			
			ArrayList<Student> array6=new ArrayList<Student>();
			Student s11=new Student("С��",43);
			Student s12=new Student("С��",60);
			array6.add(s11);
			array6.add(s12);
			hm3.put("��ҵ��",array6);
			czbkMap.put("�Ϻ�У��", hm3);
			
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
