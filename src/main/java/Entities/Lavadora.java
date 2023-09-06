package Entities;

import java.util.Scanner;


public class Lavadora extends Electrodomesticos{
   
   
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, Character consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    

   

   @Override
   public void crearElectrodomestico(){
        Scanner leer = new Scanner (System.in);
              System.out.println("Cúal es el color");
                color = leer.nextLine();
                System.out.println("Cúal es el consumo? introduzca una letra desde A hasta F");
                consumoEnergetico = leer.next().charAt(0);
                consumoEnergetico = Character.toUpperCase(consumoEnergetico);
                System.out.println("Cúal es el peso del electrodomestico?");
                peso = leer.nextDouble();
                leer.nextLine();
                
               // crearElectrodomestico();
            consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
            color=coomprobarColor(color);
        
          
             System.out.println("Cúal es la carga de la lavadora?");
            int carga = leer.nextInt();
            leer.nextLine();
            this.carga=carga;
            
            
   }
   
   @Override
   public double precioFinal(){
       double total = super.precioFinal();
       
       if(carga>=30){
           total += 500;
       }
       
      this.precio+=total;
       
       return precio;
   }
   
  
    @Override
    public String toString() {
        return "Electrodomesticos{Lavadora:" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", carga "+carga +'}';
    }
    
  
    
}
