
package tallerherencia;

import java.util.Scanner;


public class Administrativo extends Persona{
   
    Universidad uni = new Universidad();
    private String cargo;

    public Administrativo(String cargo, String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        this.cargo = cargo;
    }
    
    
    public void registrarEstudiante(String nombrePrograma, int semestre, String nombre, String apellido, String documento){
        Estudiante estudiante = new Estudiante(nombrePrograma, semestre, nombre, apellido, documento);
        uni.estudiantes.add(estudiante);
    }
}
