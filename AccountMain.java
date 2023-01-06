import java.util.*;
 class Account {
	private int balance=10000;
	public int getBalance() {	
	return balance;
		}
	public void withDraw(int amount) {
	balance=balance-amount;
	}
	 	}

class AccountHolder implements Runnable {
	private Account account;
	Scanner sc = new Scanner(System.in) ;
	public AccountHolder(Account account){
			this.account=account;
			
		}
		@SuppressWarnings("resource")
		@Override
		
		public synchronized void run() {
			for (;;) {
			
			System.out.println("Do you want to withdraw Money?\n If yes(press 1)\n If No(press 2)");
			int x=sc.nextInt();
			if(x==1) {
				MakeWithDraw();
				if(account.getBalance()<1) 
					System.out.println("Amount has been over withdrawn");
				}
			else if(x==2) {
				end();
			}
			else {
				System.out.println("you entered a wrong input\nwant to go to main menu? Press 0\nTo exit enter 5 ");
				int y=sc.nextInt();
				if(y==0) {
					run();
				}
				else {
					end();
				}
			}
			}
			
				
			}
		
			private void end() {
			System.out.println("Thank you");
			System.exit(0);
			
			
			
		}
			public synchronized void MakeWithDraw() {
				System.out.println("Enter the Amount");
				 
				int	 amount=sc.nextInt();
				if(account.getBalance()>=amount) {
					System.out.println("AMOUNT requested Rupees "+ amount +" by "+ Thread.currentThread().getName() +" is Successful ");
					account.withDraw(amount);
					System.out.println("Current Balance="+account.getBalance());
					System.out.println();
					try {
						Thread.sleep(1000);
						
					}
					catch(Exception e) {
						System.out.println("Thread got intrrupted"+e);
					}
				}
					else {
						System.out.println("Insufficient Fund\n\nNot enough amount in account for "+ Thread.currentThread().getName() +" to withdraw\n\nAvailable balance = "+account.getBalance());
						try {
							Thread.sleep(2000);
							
						}
						catch(Exception e) {
							System.out.println("Thread got intrrupted"+e);
						}
						end();
					}
				
			}
	}


 public class AccountMain{

	public static void main(String[] args) {
	Account account=new Account();
	AccountHolder accountholder=new AccountHolder(account);
	Thread t1=new Thread(accountholder,"user1");
	Thread t2=new Thread(accountholder,"user2");
	t2.start();
	t1.start();
	
	}

}


