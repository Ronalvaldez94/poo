
package pr1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pr1 {

    public static void main(String[] args) {
        //Crear lista de Array para una lista de vehiculos 
        ArrayList<Vehiculo> listavehiculo = new ArrayList();
        //Punto 1.1 Llenar arreglo con 10 datos diferentes 
        Vehiculo automovi_1 = new Automovil(4, "Renol", "SparckGt", 2005, "Deivid", "JHT000");
        Vehiculo automovi_2 = new Automovil(4, "Toyota", "XTL", 2002, "Dann", "KRM19E");
        Vehiculo automovi_3 = new Automovil(4, "Renol", "SparckGt", 2005, "camilo", "LOI89P");
        Vehiculo automovi_4 = new Automovil(4, "Toyota", "XTL", 2002, "Mendez", "RST76U");
        Vehiculo automovi_5 = new Automovil(4, "Renol", "SparckGt", 2005, "Julio", "MRU87Y");
        Vehiculo motocicleta_1 = new Motocicleta(150, "Hero", "Trhiller", 2005, "David", "GHT35U");
        Vehiculo motocicleta_2 = new Motocicleta(200, "Honda", "Pulsar Ns", 2005, "Dilan", "KLM97R");
        Vehiculo motocicleta_3 = new Motocicleta(150, "Hero", "Trhiller", 2005, "Omar", "HSO22O");
        Vehiculo motocicleta_4 = new Motocicleta(200, "Honda", "Pulsar Ns", 2005, "Miralba", "JIY777");
        Vehiculo motocicleta_5 = new Motocicleta(150, "Hero", "Trhiller", 2005, "Juan", "HSO22O");
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

        //Punto 1.2 Comprobamos si hay placas duplicadas 
        ArrayList<Vehiculo> vehiculosNoDuplicados = new ArrayList<>();
        Set<String> Placas = new HashSet<>();
        for (Vehiculo vehiculo : listavehiculo) {
            if (!Placas.contains(vehiculo.getPlaca())) {
                vehiculosNoDuplicados.add(vehiculo);
                Placas.add(vehiculo.getPlaca());
            } else {
                System.out.println("Placa Duplicada: " + vehiculo.getPlaca());
            }
        }

        //Punto 2.1 Imprimir todos los automoviles 
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Automoviles:");
        System.out.println("-----------------------------------");
        for (Vehiculo automoviles : vehiculosNoDuplicados) {
            if (automoviles.getClass().equals(Automovil.class)) {
                automoviles.mostrarInformacion();
                System.out.println("-----------------------------------");
            }

        }

        //Punto 2.2 Imprimir todas las motocicletas 
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Motocilcletas:");
        System.out.println("-----------------------------------");
        for (Vehiculo motocicletas : vehiculosNoDuplicados) {
            if (motocicletas.getClass().equals(Motocicleta.class)) {
                motocicletas.mostrarInformacion();
                System.out.println("-----------------------------------");
            }
        }

        //3.1 Modificar el nombre de un propietario      
        automovi_1.setPropietario("Julian");
        //3.2 Verificar la modificacion 
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Vehiculos despues de la modificacion:");
        System.out.println("-----------------------------------");

        int i = 1;
        //Imprimir lista de Vehiculos
        for (Vehiculo vehiculo : vehiculosNoDuplicados) {
            System.out.println("Vehiculo: " + i);
            vehiculo.mostrarInformacion();
            System.out.println("-----------------------------------");
            i++;
        }
        //4.0 Buscar un vehiculo por la placa 
        String placaB = "JHT000";
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("Placa que se buscara: " + placaB);
        System.out.println("-----------------------------------");
        for (Vehiculo vehiculo : vehiculosNoDuplicados) {
            if (vehiculo.getPlaca().equals(placaB)) {
                System.out.println("La informacion del vehiculo encontrado es: ");
                vehiculo.mostrarInformacion();
                System.out.println("-----------------------------------");
                break;
            }
        }

    }

}
