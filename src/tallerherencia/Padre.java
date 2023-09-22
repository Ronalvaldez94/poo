
package tallerherencia;

import java.util.LinkedList;


public class Padre extends Persona {
    
    private LinkedList < Estudiante > estudiantes;
    private String parentesco;

    public Padre(String parentesco, String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        this.parentesco = parentesco;
        this.estudiantes = new LinkedList<>();
    }
    
    
}
