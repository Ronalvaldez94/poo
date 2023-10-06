
package pr1;


public class Motocicleta extends Vehiculo {
   private double cilindraje;  

    public Motocicleta(double cilindraje, String marca, String modelo, int año, String propietario, String Placa) {
        super(marca, modelo, año, propietario, Placa);
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
   
 
   @Override
   public void mostrarInformacion(){
        System.out.println("El Cilindraje de la motocicleta es: " +cilindraje);
        System.out.println("La marca de la motocicleta es: " +marca);
        System.out.println("El modelo de la motocicleta es: " +modelo);
        System.out.println("El año de fabricacion de la motocicleta es: " +año); 
        System.out.println("El propietario de la motocicleta es: " +propietario);
        System.out.println("La placa de la motocicleta es: " +placa);

   }
    
}
