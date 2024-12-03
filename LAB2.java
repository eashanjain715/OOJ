import java.util.Scanner;
public class Student{
    String name;
    String usn;
    int n;
    int[] marks;
    int[] credits;
    Student(){
        this.name = "";
        this.usn = "";
    }
    void accept(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name and usn");
        name = input.nextLine();
        usn = input.nextLine();
        System.out.println("Enter no of subjects");
        n = input.nextInt();
	 marks = new int[n];
	 credits = new int[n];
        System.out.println("Enter marks and credits");
        for(int i  = 0 ; i<n ;i++){
            System.out.println("Enter subject " + (i+1));
            marks[i] = input.nextInt();
            credits[i] = input.nextInt();
        }
    }
    double SGPA(){
        double mark = 0,credit = 0;
        for(int i=0;i<n;i++){
            mark = mark + (marks[i]*credits[i]);
            credit = credit + credits[i];
        }
        return mark/(credit * 10);
    }
    void Display(){
        double sgpa = SGPA();
        System.out.println("Name = "+ name);
        System.out.println("usn = "+ usn);
        System.out.println("SGPA = "+ SGPA());  
    }
public static void main(String args[]){
Student stud1 = new Student();
stud1.accept();
stud1.Display();
Student stud2 = new Student();
stud2.accept();
stud2.Display();
}
}
