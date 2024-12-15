import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int age[];

        // age= new int[5];
        Scanner input=new Scanner(System.in);
        String age[]=new String[5];
         System.out.println("Enter Age Of student");
        for(int i=0;i<age.length;i  ++)
        {

            age[i]=input.nextLine();
        }
        // for(int i=0;i<age.length;i++)
        // {

        //    System.out.print(age[i]+" ");
        // }
        for (String i : age) {
            System.out.print(i+" ");
        }
        
    }
}
