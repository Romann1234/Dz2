

package p1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for (int i=0;i<10;i--) {
        Scanner in = new Scanner(System.in);
        System.out.println("chislo 1:");
        int num = in.nextInt();
        System.out.println("chislo 2:");
        int num2 = in.nextInt();
        System.out.println("viberite operaciu: 1.+ 2.- 3./ 4.* ");
        int num3 = in.nextInt();
        if (num3 == 1) {
            System.out.printf("+: %d \n", num + num2);
        } else if (num3 == 2) {
            System.out.printf("-: %d \n", num - num2);
        } else if (num3 == 3) {
            System.out.printf("/: %d \n", num / num2);
        } else if (num3 == 4) {
            System.out.printf("*: %d \n", num * num2 );
        } else
            System.out.println("Not Found \n");

        }




    }
}