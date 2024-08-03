import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int ch, s, f, d, r;
        double u,j;
        while (run) {
            System.out.println("Welcome to Calculator!");
            System.out.println("Please enter an operation to perform:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power\n6. Square Root\n7. Exit the Calculator");
            System.out.println("Enter choice:");
            ch = sc.nextInt();
            sc.nextLine();
            
            switch (ch) {
                case 1:
                    System.out.println("Enter the numbers you want to add:");
                    f = sc.nextInt();
                    System.out.println("added to");
                    d = sc.nextInt();
                    s = add(f, d);
                    System.out.println("is equals to " + s);
                    break;
                case 2:
                    System.out.println("Enter the numbers you want to subtract:");
                    d = sc.nextInt();
                    System.out.println("subtracted from");
                    f = sc.nextInt();
                    s = subtract(f, d);
                    System.out.println("is equals to " + s);
                    break;
                case 3:
                    System.out.println("Enter the numbers you want to multiply:");
                    f = sc.nextInt();
                    System.out.println("multiplied to");
                    d = sc.nextInt();
                    s = multiply(f, d);
                    System.out.println("is equals to " + s);
                    break;
                case 4:
                    System.out.println("Enter the numbers you want to divide:");
                    f = sc.nextInt();
                    System.out.println("divided by");
                    d = sc.nextInt();
                    if (d == 0) {
                        System.out.println("Error: Division by zero is not allowed. Please enter a non-zero divisor.");
                    } else {
                        s = div(f, d);
                        r = rem(f, d);
                        System.out.println("is equals to " + s);
                        System.out.println("The remainder is: " + r);
                    }
                    break;
                    case 5:
                    System.out.println("Enter the number as the base:");
                    f = sc.nextInt();
                 System.out.println("Enter the number to be its power:");
                    d = sc.nextInt();
                    u= Pow(f, d);
                    System.out.println("Result="+u);
                    break;
                case 6:
                    System.out.println("Enter the number to find the square root of :");
                    j= sc.nextDouble();
                    u= SQRT(j);
                    System.out.println("Result="+u);
                    break;
                  case 7: System.out.println("Thank You for using calculator!");
                  run=false;
                  break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int rem(int a, int b) {
        return a % b;
    }
     public static double Pow(int a, int b) {
        return Math.pow(a,b);
    }
    
     public static double SQRT(double a) {
        return Math.sqrt(a);
    }

    }

