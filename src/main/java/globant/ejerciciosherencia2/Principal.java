package globant.ejerciciosherencia2;

import Entities.Electrodomesticos;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        
        
        ///Ejercicio 2
        /* 
        
        Lavadora lav= new Lavadora();
        Televisor tele= new Televisor();
        
        System.out.println("Crear lavadora");
        lav.crearElectrodomestico();
        lav.precioFinal();
        
        lav.verElectrodomestico();
        
        System.out.println("Crear televisor");
        
        tele.crearElectrodomestico();
        tele.precioFinal();
        tele.verElectrodomestico();
        */
        
        
        ///Ejercicio 3
        
        ArrayList<Electrodomesticos>electrodomesticos=new ArrayList();
        double totalTelevisores=0;
        double totalLavadoras=0;
        double total=0;
        
        Lavadora lav1= new Lavadora(30, 1000, "Gris", 'A', 200);
        Lavadora lav2= new Lavadora(20, 1000, "Negro", 'A', 150);
        Lavadora lav3= new Lavadora(15, 1000, "Blanco", 'C', 150);
        
        Televisor tele1= new Televisor(75, true, 1000, "Negro", 'F', 15);
        Televisor tele2= new Televisor(45, false, 1000, "Negro", 'D', 10);
        Televisor tele3= new Televisor(50, true, 1000, "Gris", 'B', 20);
        
        electrodomesticos.add(lav1);
        electrodomesticos.add(lav2);
        electrodomesticos.add(lav3);
        
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);
        electrodomesticos.add(tele3);
 
        for(Electrodomesticos electrodomestico : electrodomesticos){
            electrodomestico.precioFinal();
            System.out.println(electrodomestico);
            
            
            if(electrodomestico instanceof Televisor){
                totalTelevisores += electrodomestico.getPrecio();
            }else{
                totalLavadoras += electrodomestico.getPrecio();
            }
        }
        
        total= totalLavadoras + totalTelevisores;
        
        System.out.println("Total Lavadoras: "+totalLavadoras);
        System.out.println("Total Televisores: "+totalTelevisores);
        
        System.out.println("Total de todo: "+total);
        
    }
    
}
