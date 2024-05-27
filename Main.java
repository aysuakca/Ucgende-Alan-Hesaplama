import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double cevre;
        double u;
        double alan;

        Scanner inp= new Scanner(System.in);

        System.out.print("1. Kenari giriniz :  ");
        a= inp.nextInt();

        System.out.print("2. Kenari giriniz :  ");
        b= inp.nextInt();

        System.out.print("3. Kenari giriniz :  ");
        c= inp.nextInt();

cevre= (a+b+c);
u= (a+b+c)/2;

 alan= Math.sqrt(u*(u-a)* (u-b)*(u-c));

        System.out.print("Ucgenin alani :  " +alan );

    }
}