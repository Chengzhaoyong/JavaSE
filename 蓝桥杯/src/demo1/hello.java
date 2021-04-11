package demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hello {
    public static Integer pow(int a,int b){
        Integer sum=1;
        if(b==0){
            return 1;
        }
        for(int i=0;i<b;i++){
            sum*=a;
        }
        return sum;
    }
    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
     Set<Integer> list=new HashSet<Integer>();
Integer i=0,j=0;
Integer sum=0;
while(pow(x,i)<bound){
     sum=pow(x,i)+pow(y,j);
  if(sum>bound){
      i++;
      j=0;
  }else{
      j++;  
      list.add(sum);
  }
  
}
return new ArrayList<>(list);
    }
public static void main(String[] args) {
	List<Integer> list=powerfulIntegers(2,3,10);
	System.out.print(list);
}
}
