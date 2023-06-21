
package Front;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import practica2vaqueras.Moto;
import practica2vaqueras.Productos;
import practica2vaqueras.HistorialM;

public class Historial extends javax.swing.JFrame {
private ArrayList<Productos> productos = new ArrayList<>();
 private ArrayList<Moto> vehiculos = new ArrayList<>(); 
 private ArrayList<Productos> pedidos = new ArrayList<>();
 
 
    public Historial(ArrayList<Productos> productos, ArrayList<Moto> vehiculos) {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHistorial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vehiculo", "Distancia", "Total", "Fecha pedido", "FechaEntrega"
            }
        ));
        jScrollPane1.setViewportView(TablaHistorial);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**public void cargarHistorial() {
        DefaultTableModel tablaHistorial = new DefaultTableModel();
        tablaHistorial.addColumn("Vehiculo");
        tablaHistorial.addColumn("Distancia");
        tablaHistorial.addColumn("Monto");
        tablaHistorial.addColumn("Fecha de Creacion");
        tablaHistorial.addColumn("Fecha de Entrega");
        
        for (int i = 0; i < pedidos.size(); i++) {
            Object[] fila = new Object[5];
            fila[0] = pedidos.get(i).getVehiculo();
            fila[1] = pedidos.get(i).getDistancia();
            fila[2] = pedidos.get(i).getTotal();
            fila[3] = pedidos.get(i).getFechaPedido();
            fila[4] = pedidos.get(i).getFechaEntrega();
            tablaHistorial.addRow(fila);
        }
        
        TablaHistorial.setModel(tablaHistorial);
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHistorial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
