class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}



class Father {
    int fage;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.fage = age;
        System.out.println("Father's age is: " + fage);
    }
}

class Son extends Father {
    int sage;

    public Son(int fage, int sage) throws WrongAge {
        super(fage); 
        if (sage >= fage) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sage = sage;
        System.out.println("Son's age is: " + sage);
    }
}

public class LAB8 {
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter Father's age: ");
            int fage = scanner.nextInt();
            System.out.print("Enter Son's age: ");
            int sage = scanner.nextInt();
            Son son = new Son(fage, sage);
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
