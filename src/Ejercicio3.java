import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double x,integro, decima, centesima, milesima;
        Scanner sc=new Scanner(System.in);
        x= sc.nextDouble();
        integro=Math.floor(x+0.5);
        decima=Math.floor(x*10+0.5)/10;
        centesima=Math.floor(x*100+0.5)/100;
        milesima=Math.floor(x*1000+0.5)/1000;
        System.out.println("El valor original es: " + x);
        System.out.println("Redondeado es: " + integro);
        System.out.println("Redondeado a las decimas es: " + decima);
        System.out.println("Redondeado a las centesimas es: " + centesima);
        System.out.println("Redondeado a las milesimas es: " + milesima);
    }
}
