import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class hashmap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
Map<String,ArrayList<String>> m=new HashMap<String,ArrayList<String>>();
ArrayList al;
for(;;) {
	System.out.println("Enter IMEI number: ");
	String imei=sc.next();
	System.out.println("Enter Location Travelled: ");
	String Loc=sc.next();
	Iterator itr=m.entrySet().iterator();
	
	if(itr.hasNext()) {
		if(m.containsKey(imei)) {
			al=m.get(imei);
			al.add(Loc);
			m.put(Loc, al);
		}
		else {
			al=new ArrayList<String>();
			al.add(Loc);
			m.put(imei,al);
			
		}
	}
	else {
		al=new ArrayList<String>();
		al.add(Loc);
		m.put(imei,al);
		
	}
	System.out.println("press 1 to continue / press 0 to quit");
	int x=sc.nextInt();
	if(x==0) {
		for(Map.Entry<String,ArrayList<String>> e:m.entrySet()) {
			System.out.println("IMEI number= " + e.getKey());
			al=e.getValue();
			for(Object obj:al) {
				System.out.println(obj);
			}
			System.out.println();
		}
		break;
	}
		}

	
	
	}

}
