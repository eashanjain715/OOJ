import java.util.Scanner;
class Account{
protected String name;
protected int accno;
protected double bal;
Account(String name,int accno,double bal){
this.name = name;
this.accno = accno;
this.bal = bal;
}
public void deposit(double amt){
bal += amt;
System.out.println("Deposited " + amt);
}
public void display(){
System.out.println("Balance = " + bal);
}
}

class savacc extends Account{
private static final double roi = 6;
savacc(String name,int accno,double bal){
super(name,accno,bal);
}
public void compndep(){
double interest = bal * roi;
deposit(interest);
}
}

class curracc extends Account{
private final double minbal = 5000;
private final double penalty = 100;
curracc(String name,int accno,double bal){
super(name,accno,bal);
}
public void withdraw(double amt){
if(amt > bal){
System.out.println("Insufficient balance");
}
else{
bal -= amt;
checkminbal();
}
}
private void checkminbal(){
if(bal < minbal){
System.out.println("Penalty imposed");
bal -= penalty;
}
}
}
public class Bank{
public static void main(String[] args){
int choice1,choice2,choice3,cr;
double amt,dep;
Scanner cin = new Scanner(System.in);

savacc s = new savacc("abc",43132,6000);
curracc c = new curracc("def",98666,7500);


System.out.println("Enter account to alter\n1.Savings\n2.Current");
int acctype = cin.nextInt();
if(acctype == 1){
	System.out.println("Enter choice for savings account\n1.Display balance\n2.Compute and deposit interest\n3.Exit");
	choice2 = cin.nextInt();
	switch(choice2){
		case 1:{
		s.display();		
		}
		case 2:{
		s.compndep();
		}
		case 3:{
		break;
		}
		}
}
else{
	System.out.println("Enter choice for current account\n1.Display balance\n2.Withdraw\n3.Deposit\n4.Exit");
	choice3 = cin.nextInt();
	switch(choice3){
		case 1:{
		c.display();		
		}
		case 2:{
		System.out.println("Enter amount to withdraw");
		amt = cin.nextInt();
		c.withdraw(amt);
		}
		case 3:{
		System.out.println("Enter amount to deposit");
		dep = cin.nextInt();
		c.deposit(dep);
		}
		case 4:{
		break;
		}
		}
}

	
}
}
