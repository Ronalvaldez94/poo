package pr1;

public class Automovil extends Vehiculo {

    private int numeroPuertas;

    public Automovil(int numeroPuertas, String marca, String modelo, int año, String propietario, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El numero de puertas del vehiculo es: " + numeroPuertas);
        System.out.println("La marca del vehiculo es: " + marca);
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("El anio de fabricacion del vehiculo es: " + año);
        System.out.println("El propietario del vehiculo es: " + propietario);
        System.out.println("La placa del vehiculo es: " + placa);

    }
}

