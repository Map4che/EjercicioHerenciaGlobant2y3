package Entities;

public abstract class Electrodomesticos {
    protected double precio=1000;
    protected String color;
    protected Character consumoEnergetico;
    protected double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, Character consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {  
            this.color=color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
            this.consumoEnergetico=consumoEnergetico;
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
     public char comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico=='A'||consumoEnergetico=='a'||consumoEnergetico=='B'||consumoEnergetico=='b'||consumoEnergetico=='C'||consumoEnergetico=='c'||consumoEnergetico=='D'||consumoEnergetico=='d'||consumoEnergetico=='E'||consumoEnergetico=='e'||consumoEnergetico=='F'||consumoEnergetico=='f'){
            consumoEnergetico=consumoEnergetico;
        }else{
            consumoEnergetico='F';
        }
        return consumoEnergetico;
    }
    
    public String coomprobarColor(String color){
        if(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")){
            color=color;
        }else{
            color="blanco";
        }
        return color;
    }
    /*
      public void crearElectrodomestico(String color, char consumoE, double peso){

            consumoE=comprobarConsumoEnergetico(consumoE);
            color=coomprobarColor(color);
            setColor(color);
            setConsumoEnergetico(consumoE);
            setPeso(peso);
        }*/
      
      public abstract void crearElectrodomestico();
        
        public double precioFinal(){
            int valor1 = 0;
            int valor2 =0;
            
            switch(consumoEnergetico){
                case 'A':
                case 'a':    
                    valor1 = 1000;
                    break;
                case 'B':
                case 'b': 
                    valor1 = 800;
                    break;
                case 'C':
                case 'c':
                    valor1 = 600;
                    break;
                case 'D':
                case 'd':
                    valor1 = 500;
                    break;
                case 'E':
                case 'e':
                    valor1 = 300;
                    break;
                case 'F':
                case 'f':
                    valor1 = 100;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
            
            if(peso>=1 && peso<20){
                valor2=100;
            }else if(peso<50){
                valor2=500;
            }else if(peso<80){
                valor2=800;
            }else{
                valor2=1000;
            }
            
            int total=valor1+valor2;
            
            return total;
            
        }

        public void verElectrodomestico(){
            System.out.println("Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}');
        }
        
       

    
}
