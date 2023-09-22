
package tallerherencia;

import java.util.LinkedList;


public class Universidad {
    
    private String nombre, direccion;  
    public LinkedList<Materia> materias; 
    public LinkedList<Estudiante> estudiantes;
    public LinkedList<Docente> docentes;
    
    

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Universidad(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
