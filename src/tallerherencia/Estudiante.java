
package tallerherencia;

import java.util.LinkedList;


public class Estudiante extends Persona {
    
    private LinkedList < Docente > docentes;
    private LinkedList < Padre > padres;
    private String nombrePorograma;
    private int semestre; 
    private int codigo; 

    public Estudiante(String nombrePrograma, int semestre, String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        this.nombrePorograma = nombrePorograma;
        this.semestre = semestre;
        this.codigo = codigo; 
        this.docentes = new LinkedList<>();
        this.padres = new LinkedList<>();
    }
    
    
}
