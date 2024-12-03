package see;
import cie.*;
class external extends cie.student{
	public int[] smarks = new int[5];
	public external(int usn, String name, int sem,int[] marks){
	super(usn,name,sem);
	smarks = marks;
}
}

package cie;
class student
{
	public int usn;
	public String name;
	public int sem;
	public student(int u,String n,int s){
	usn = u;
	name = n;
	sem = s;
	}
}
class internals
{
	public int[] cmarks = new int[5];
	public internals(int[] marks){
	cmarks = marks;
	} 
}

import cie.internal;
import see.external;

public class final {
    public static void main(String[] args) {
 
        student student1 = new student("123", "Chetan", 3);
        internal internals1 = new internal(new int[]{20, 30, 40, 50, 60});
        external external1 = new external("123", "Chetan", 3, new int[]{50, 60, 70, 80, 90});
        student student2 = new student("456", "Chirag", 3);
        internal internals2 = new internal(new int[]{25, 35, 45, 55, 65});
        external external2 = new external("456", "Chirag", 3, new int[]{55, 65, 75, 85, 95});
        printFinalMarks(student1, internals1, external1);
        printFinalMarks(student2, internals2, external2);
    }
    public static void printFinalMarks(student student, internals internals, external external) {
        System.out.println("Final marks of " + student.name +":");

 
        for (int i = 0; i < 5; i++) {
            int finalMarks = internal.marks[i] + external.marks[i];
            System.out.println(finalMarks);
        }
       
    }
}
