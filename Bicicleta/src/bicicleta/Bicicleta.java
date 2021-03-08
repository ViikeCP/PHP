
package bicicleta;

import javax.swing.JOptionPane;

public class Bicicleta {
    public static void main(String[] args) {
       Bici w= new Bici(30);
        boolean ban=true;
        int op=0;
        String marca;int rodada; String estilo; int precio;
        
        
        while(ban == true){
            try{
               w.Menu();
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una opción"));
                
                switch(op){
                    case 1:
                        try{
                            marca=JOptionPane.showInputDialog("ESCRIBA LA MARCA DE LA BICICLETA:");
                            rodada=Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA LA RODADA DE LA BICICLETA: "));
                            estilo=JOptionPane.showInputDialog("ESCRIBA EL ESTILO DE LA BICICLETA:");
                            precio=Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA EL PRECIO DE LA BIBICLETA:"));
                            1.push(marca,rodada,estilo,precio);}
                        catch(Exception e){
                                System.out.println("ERROR");
                                }
                    break;
                    case 2:
                        System.out.println("Dato extraido: " + l.pop());
                    break;
                    case 3:
                        l.EstadoActual();
                    break;
                    case 4:
                        ban = false;
                    break;
                    default:
                        System.out.println("Opcion invalida");
                    break;
                }
            }catch(Exception e){
                System.out.println("Error: "+e);
            }
        }
    }
}
        
       
       
    
  
