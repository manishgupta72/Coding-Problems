import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        int marks[] = new int[3];
        marks[0] = 33;
        marks[1] = 43;
        marks[2] = 53;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array:");
        int ind = sc.nextInt();
        System.out.println("Enter value to divide:");
        int val = sc.nextInt();

        try {
            System.out.println("the value , that you divide is :" + marks[ind]);
            System.out.println("the value after divide/arr is :" + marks[ind] / val);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occured");
            System.out.println(e);
        }
    }

}
