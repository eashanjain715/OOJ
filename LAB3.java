import java.util.Scanner;
class Book{
private String name;
private String author;
private int price;
private int num;
public Book(String name,String author,int price,int num){
this.name = name;
this.author = author;
this.price = price;
this.num = num;
}
public void setname(String name){
this.name = name;
}
public void setauthor(String author){
this.author = author;
}
public void setprice(int price){
this.price = price;
}
public void setnum(int num){
this.num = num;
}
public String getname(){
return this.name;
}
public String getauthor(){
return this.author;
}
public int getprice(){
return this.price;
}
public int getnum(){
return this.num;
}
public String toString(){
return this.name + " Book wriiten by " + this.author + " has " + this.num + " pages and costs "  + this.price + " rupees ";
}
public static void main(String args[]){
int n,price,num;
String author,name;
Scanner input = new Scanner(System.in);
System.out.println("How many books ?");
n = input.nextInt();
input.nextLine();
Book[] book = new Book[n];
System.out.println("Enter details");
for(int i = 0; i< n ;i++){
System.out.println("Enter name of book " + (i+1));

name = input.nextLine();
System.out.println("Enter author of book " + (i+1));
author = input.nextLine();
System.out.println("Enter price and number of pages in book " + (i+1));
price = input.nextInt();
num = input.nextInt();
book[i] = new Book(name,author,price,num);
input.nextLine();
}
System.out.println("Details of books :");
for (int i =0 ; i< n ;i ++){
System.out.println(book[i].toString());
}
}
}
