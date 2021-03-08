
package bicicleta;

public class Bici {
    private int tam;
    private String []base;
    private int tope;

    public Bici() {
        tam=15;
        base = new String[tam];
        tope=0;
    }
    
    public Bici(int t) {
        tam = t;
        base = new String[tam]; 
        tope = 0;
    }
    
    public void Menu(){
        System.out.println("Elige una opcion:");
        System.out.println("1. Agregar dato a la pila.");
        System.out.println("2. Retirar dato de la pila.");
        System.out.println("3. Ver estado actual de la pila.");
        System.out.println("4. Salir del programa.\n");
    }
    
    public void push(String mar;int rod; String est; int prec){
        if( tope == base.length-1 ){
            System.out.println("\nPila Llena");
        } else{
            tope++;
            String alfa=new String(mar,rod,est,prec);
            base[tope]= String;
        }
    }
    
    public String pop(){
        if( tope == 0 ){
            System.out.println("\nPila Vacia"); 
            return "0";
        } else {
            //int valor = Integer.parseInt(base[tope]);
            String valor = base[tope];
            tope--;
            return valor;
        }
    }
    
    public void EstadoActual(){
        if( tope == 0 ){
            System.out.println("\nPila Vacia");
        } else{
            int k=tope;
            System.out.println("Estado Actual");
            while( k >0 ){
                System.out.println( base[k]);
                k--;
            }
        }
    }
}
    

