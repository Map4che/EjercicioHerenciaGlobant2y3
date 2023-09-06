package Entities;

import java.util.Scanner;

public class Televisor extends Electrodomesticos{
    private int resolucionPulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucionPulgadas, boolean sintonizadorTDT) {
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucionPulgadas, boolean sintonizadorTDT, double precio, String color, Character consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(int resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    @Override
    public void crearElectrodomestico() {
        boolean continuar=false;
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
        
            
            System.out.println("De cuantas pulgadas es el televisro?");
            this.resolucionPulgadas=leer.nextInt();
            leer.nextLine();
            
            
            while(!continuar){
                System.out.println("El televisor cuenta con TDT? Marque S o N");
                String opc=leer.nextLine();
                switch(opc){
                    case "S":
                    case "s":
                        this.sintonizadorTDT=true;
                        continuar=true;
                        break;
                    case "N":
                    case "n":
                        this.sintonizadorTDT=false;
                        continuar=true;
                        break;
                    default:
                        System.out.println("El valor que pusiste no coincide, intenta nuevamente");
                }
            }
            
    }

    @Override
    public double precioFinal() {
       double total = super.precioFinal();
       
       if(resolucionPulgadas>=40){
           total += precio+(precio*0.3);
       }
       
       if(sintonizadorTDT){
           total+=500;
       }
       
       this.precio+=total;
       
       return precio;
    }

  

    @Override
    public String toString() {
        return "Electrodomesticos{Televisor:" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", pulgadas "+resolucionPulgadas+", sintonizador TDT "+sintonizadorTDT +'}';
    }
    
    
}
