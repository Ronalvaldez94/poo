
package pr1;

public class Vehiculo{
    String marca; 
    String modelo; 
    int año; 
    String propietario; 
    String placa; 

    public Vehiculo(String marca, String modelo, int año, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
        this.placa = placa; 
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void mostrarInformacion(){
        System.out.println("La marca del vehiculo es: " +marca);
        System.out.println("El modelo del vehiculo es: " +modelo);
        System.out.println("El año de fabricacion vehiculo es: " +año);
        System.out.println("El propietario del vehiculo es: " +propietario);
    }
}


