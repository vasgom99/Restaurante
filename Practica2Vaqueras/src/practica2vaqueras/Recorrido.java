
package practica2vaqueras;

import Front.Entregas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Recorrido extends Thread {
    JLabel motos;
    int distancia;
    boolean regreso;
    
    final int destino = Entregas.Meta.getLocation().x;

    public Recorrido(JLabel motos, int distancia) {
        this.motos = motos;
        this.distancia = distancia;
        this.regreso = false;
    }
    
    public void run(){
        while (true) {            
            try {
                sleep(10*distancia);
                
                int motox= motos.getLocation().x;
                
                if (!regreso) {
                    if (motox<destino-100) {
                        motos.setLocation(motox+10, motos.getLocation().y);
                    } else{
                        regreso = true;
                    }
                }else{
                
                    if(motox>100){
                    motos.setLocation(motox-10, motos.getLocation().y);
                    }else{
                        break;
                        }
                }                   
                                
            } catch (Exception e) {
                System.out.println(e);
            }           
        }
    }   
}
