import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficients a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double d = b*b - 4 *a *c;

        switch ((int)d) {
            case 1:
                double root1 = (-b + Math.sqrt(d)) / (2 * a);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Two distinct real roots: " + root1 + " and " + root2);
                break;
            case 0:
                double root = -b / (2 * a);
                System.out.println("One real root: " + root);
                break;
            case -1:
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-d) / (2 * a);
                System.out.println("Two complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
                break;

            default:
               System.out.println("Invalid Input");
        }

    }
}
