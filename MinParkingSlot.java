// Java program to demonstrate 
// the case if superclass need 
// not to be serializable 
// while serializing subclass 

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.io.Serializable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
class A 
{ 
	int i; 
	static int minPakingslot(int[][] parkingStartandendTimes){
		SortedMap<Integer, Integer> st=new TreeMap();
		for(int i=0;i<parkingStartandendTimes.length;i++){
			st.put(parkingStartandendTimes[i][0], parkingStartandendTimes[i][1]);
		}
	   int arr[]=new int[parkingStartandendTimes.length];
	   boolean flag=false;
	   int count=0;
	   int k=0;
	   for(Map.Entry<Integer,Integer> ms:st.entrySet()){
		   if(flag==false){
			   flag=true;
			  count++;
			  arr[k++]=(Integer)ms.getValue();
		   }
		  else
		  {
			  int key=(Integer)ms.getKey();
			  int val=(Integer)ms.getValue();
			  boolean ft=true;
			  for(int t=0;t<k;t++){
                  if(key>arr[t]){
					arr[t]=val;
					ft=false;
					break;
				  }
			  }
			  if(ft==true){
				  arr[k++]=val;
				  count++;
			  }
		  }
	   }
		return count;
  }
	public static void main(String[] args) 	
	{ 
	
	  int parkingStartEndTime[][]={{0,20},{5,20},{25,40},{35,45},{6,7},{40,60}};
	  System.out.println(minPakingslot(parkingStartEndTime));  
    } 
    
} 
