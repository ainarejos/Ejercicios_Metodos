class Parking {
    private double tarifa=2.00;
    private int horas;

    public  Parking(int horas){
        this.horas=horas;
    }

    public double Calculadora(){
        if (horas > 19&&horas<=24){
            this.tarifa=10.00;
        } else if(horas>3&&horas<=19){
            this.tarifa=((horas - 3) * 0.50) + 2.00;
        }
        else if(horas>24){
            System.out.println("Se ha sobrepasado las horas maximas, la grua se ha llevado el coche llama al 112");
            this.tarifa=0;
        }
        return tarifa;
    }
    }

    public class Ejercicio1{
        public static void main(String[] args) {
            Parking a1=new Parking(3);
            System.out.println(a1.Calculadora());
        }
    }
