
package practica2vaqueras;

import Front.MenuPrinicipal;
import java.util.ArrayList;


public class Practica2Vaqueras {

   
    public static void main(String[] args) {
       
         ArrayList<Productos> productos = new ArrayList<>();
        ArrayList<Moto> vehiculos = new ArrayList<>();
        vehiculos.add(new Moto("Moto1", true));
        vehiculos.add( new Moto("Moto2", true));
        vehiculos.add(new Moto("Moto3", true));
        
        productos.add(new Productos("Pizza con piña", "50", true));
        productos.add(new Productos("Pizza sin piña", "40", true));
        productos.add(new Productos("Piña con pizza", "45", true));
        productos.add(new Productos("Piña sin pizza", "40", true));
        
    MenuPrinicipal menuPrinicipal = new MenuPrinicipal(productos, vehiculos);
       menuPrinicipal.setVisible(true);
    }
    
}
