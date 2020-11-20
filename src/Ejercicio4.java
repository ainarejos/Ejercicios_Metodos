public class Ejercicio4 {
    private int a;
    private int b;
    public Ejercicio4(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int IntegerPower() {
        int c = a;
        for (int i = 1; i < b; i++) {
            c = c * a;
        }
        return c;
    }

    public static void main(String[] args) {
        Ejercicio4 a1 = new Ejercicio4(3, 4);
        System.out.println(a1.IntegerPower());
    }
}
