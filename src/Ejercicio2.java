import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double x, y;
        Scanner sc=new Scanner(System.in);
        y=sc.nextDouble();
        x=Math.floor(y+0.5);
        System.out.println("El valor de y es: " + y);
        System.out.println("El valor de x es: " + x);
    }
}
