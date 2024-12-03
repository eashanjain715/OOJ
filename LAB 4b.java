abstract class Animal{
abstract void eat();
abstract void sleep();
}

public class Tiger extends Animal
{
public void eat(){
System.out.println("Tiger is sleeping");
}
public void sleep(){
System.out.println("Tiger is sleeping");
}
}
public class Deer extends Animal
{
public void eat(){
System.out.println("Deer is sleeping");
}
public void sleep(){
System.out.println("Deer is sleeping");
}
}

public class Lion extends Animal
{
public void eat(){
System.out.println("Lion is sleeping");
}
public void sleep(){
System.out.println("Lion is sleeping");
}
}
public static void main(String args[])
{
Animal T = new Tiger();
Animal L = new Lion();
Animal D = new Deer();
T.eat();
T.sleep();
L.eat();
L.sleep();
D.eat();
D.sleep();
}

}
