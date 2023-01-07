
import java.util.Scanner;

public class StringClonning {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name(:c)");
		Cricketer c=new Cricketer(sc.next());
		Cricketer c1=(Cricketer) c.clone();	
        System.out.println("String passed from C to C1");
		System.out.println("c1="+c1.name+c.name);
	}

}
class Cricketer implements Cloneable{
	Object obj;
	String name;
	Cricketer(String name){
		this.name=name;
	}
	public Object clone() {
		try {
	obj=super.clone();
	
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return obj;
	}
}
