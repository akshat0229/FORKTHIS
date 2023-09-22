import java.util.Scanner;

public class shapes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to aakar area calculator");
        System.out.println("Please type the shape code ranging from \n Square(S) \n Rectangle(R) \n Triangle(T) \n Circle(C)");
        String o = input.nextLine();
        if (o.equalsIgnoreCase("S")) {
            System.out.println("Please enter the side of square a ");
            double a = input.nextDouble();
            double sqa = a*a;
            System.out.println("The area of given square is"+" "+ sqa+" sq units");
            
        } else {if (o.compareTo("R")==0) {
            System.out.println("Please enter length l of reactangle ");
            double l = input.nextDouble();
            System.out.println("now, please enter the breadth b of rectangle ");
            double b = input.nextDouble();
            double ra = l*b;
            System.out.println("The area of given rectangle is "+" "+ra+"sq units");
            
        } else {if (o.compareToIgnoreCase("T")==0) {
            System.out.println("Please enter height/altitude h of the triangle  ");
            double h = input.nextDouble();
            System.out.println("now, please enter the base length bl of triangle  ");
            double bl = input.nextDouble();
            double ta = 0.5*bl*h;
            System.out.println("The area of the given triangle is "+" "+ ta+"sq units");
            
        } else {if (o.equals("C")) {
            System.out.println("Please enter the radius r of the circle c  ");
            double r = input.nextDouble();
            double ca = 3.14*r*r;
            System.out.println("The area of the given circle is "+" "+ca+"sq units");
            
        } else {
            System.out.println("INVALID ENTRY!! PLEASE READ TUTORIAL AGAIN!");
            
        }
            
        }
            
        }
            
        }

    
    }
}