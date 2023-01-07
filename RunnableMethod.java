import java.util.Scanner;

class Alpha implements Runnable{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("sub"))
				sub();
			else if(Thread.currentThread().getName().equals("Addition"))
				Addition();
			else Thread.currentThread().getName().equals("mul");
			mul();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
public void sub() {
	
	System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	c=a-b;
	System.out.println(c);
	
}
public void Addition() {
	System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	c=a+b;
	System.out.println(c);
	
	
}
void mul() {
	System.out.println("Enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	c=a*b;
	System.out.println(c);
}
}
public class RunnableMethod {

	public static void main(String[] args) {
		Alpha r=new Alpha();
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		
		t1.setName("sub");
		t2.setName("Additon");
		t2.setName("mul");
		t1.start();
		t2.start();
		t3.start();
	
		
	}

}
