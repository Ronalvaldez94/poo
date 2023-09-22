
package tallerherencia;

import java.util.LinkedList;


public class Docente extends Persona{
    
    private LinkedList < Estudiante > estudiantes;
    private LinkedList < Materia > materias; 

    public Docente(String nombre, String apellido, String documento) {
    super(nombre, apellido, documento);
    this.materias = new LinkedList<>();
    }
 
}
