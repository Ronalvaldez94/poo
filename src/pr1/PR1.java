
package pr1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class PR1 {

  
    public static void main(String[] args) {
        ArrayList<Vehiculo>listavehiculo = new ArrayList();
        Vehiculo automovil = new Automovil(4, "Renol", "SparckGt",2005,"Santiago", "AJH89E");
        Vehiculo automovi2 = new Automovil(4, "Toyota", "XTL",2002,"Ronal", "ZHT19E");
        Vehiculo motocicleta1 = new Motocicleta(150, "Hero", "Trhiller",2005,"Maria", "HTL90R");
        Vehiculo motocicleta2 = new Motocicleta(200, "Honda", "Pulsar Ns",2005,"Tatiana", "THU92I");
        
        //Llenar arreglo con 10 datos diferentes 
        Vehiculo automovi_1 = new Automovil(4, "Renol", "SparckGt",2005,"Deivid", "CXQ90Q");
        Vehiculo automovi_2 = new Automovil(4, "Toyota", "XTL",2002,"Dann", "KRM19E");
        Vehiculo automovi_3 = new Automovil(4, "Renol", "SparckGt",2005,"camilo", "LOI89P");
        Vehiculo automovi_4 = new Automovil(4, "Toyota", "XTL",2002,"Mendez", "RST76U");
        Vehiculo automovi_5 = new Automovil(4, "Renol", "SparckGt",2005,"Julio", "MRU87Y");
        Vehiculo motocicleta_1 = new Motocicleta(150, "Hero", "Trhiller",2005,"David", "GHT35U");
        Vehiculo motocicleta_2 = new Motocicleta(200, "Honda", "Pulsar Ns",2005,"Dilan", "RST76P");
        Vehiculo motocicleta_3 = new Motocicleta(150, "Hero", "Trhiller",2005,"Omar", "HMI98Y");
        Vehiculo motocicleta_4 = new Motocicleta(200, "Honda", "Pulsar Ns",2005,"Miralba", "KLM97R");
        Vehiculo motocicleta_5 = new Motocicleta(150, "Hero", "Trhiller",2005,"Juan", "HSO22O");
        listavehiculo.add(automovi_1);
        listavehiculo.add(automovi_2);
        listavehiculo.add(automovi_3);
        listavehiculo.add(automovi_4);
        listavehiculo.add(automovi_5);
        listavehiculo.add(motocicleta_1);
        listavehiculo.add(motocicleta_2);
        listavehiculo.add(motocicleta_3);
        listavehiculo.add(motocicleta_4);
        listavehiculo.add(motocicleta_5);
        
        //Comprobamos si hay placas duplicadas creando una nueva lista para pasar por vehiculos 
        ArrayList<Vehiculo>vehiculosNoDuplicados = new ArrayList();
        //Utilizamos un set Placas para guardarla y compararla con las demas 
        Set<String> Placas = new HashSet<>();
        for (Vehiculo vehiculo : listavehiculo) {
            if(!Placas.contains(vehiculo.getPlaca())){
                vehiculosNoDuplicados.add(vehiculo);
                Placas.add(vehiculo.getPlaca());
            }
        } 
        
        //Modificar Propietario 
        automovi_1.setPropietario("Julian");
        
        //Imprimir lista de Vehiculos
        System.out.println("Vehiculos");
        for (Vehiculo vehiculo : listavehiculo) {
            //Acabo tiempo 
        }
    }  
}

