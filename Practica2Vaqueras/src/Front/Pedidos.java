
package Front;

import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import practica2vaqueras.Moto;
import practica2vaqueras.Productos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTable;
import Front.Entregas;

public class Pedidos extends javax.swing.JFrame {
 Fondo fondo = new Fondo();
 //DefaultTableModel dtm = new DefaultTableModel();
 
 private ArrayList<Productos> productos = new ArrayList<>();
 private ArrayList<Moto> vehiculos = new ArrayList<>(); 
 private ArrayList<Productos> pedidos = new ArrayList<>();
 private String archivoDatos = "datos.txt";
 public static int distancia;

 
    public Pedidos(ArrayList<Productos> productos, ArrayList<Moto> vehiculos) {
         this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        /**String[]titulo=new String[]{"Producto", "Precio"};
         dtm.setColumnIdentifiers(titulo);
         ProductosMuestra.setModel(dtm);*/
         this.productos = productos;
         this.vehiculos = vehiculos;
         cargarDatos();
         refrescarTabla();
         cargarProductos();
         
    }
 public boolean verificacion() {
        boolean verificacion = false;
        if (Producto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso el nombre del producto");
            Producto.requestFocus();
            
        } else if (Precio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Usted no ingreso el precio del producto");
            Precio.requestFocus();
            
        } else {
            verificacion = true;
        }
        return verificacion;
    }
  public void agregar(){
  if (verificacion()) {
            productos.add(new Productos(Producto.getText(), Precio.getText(), true));
        }
        Producto.setText("");
        Precio.setText("");
  }
  /**void eliminar(){
      int fila = ProductosMuestra.getSelectedRow();
  dtm.removeRow(fila);
  }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Contenido = new Fondo();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductosMuestra = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductosPedido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        MandarPedido = new javax.swing.JButton();
        ConfirmarCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        EliminarProducto = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        Largo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        accion = new javax.swing.JButton();
        desaccion = new javax.swing.JButton();
        VerMotos = new javax.swing.JButton();
        MotosV = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        ProductosMuestra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "producto", "precio"
            }
        ));
        jScrollPane1.setViewportView(ProductosMuestra);

        jLabel1.setText("Productos");

        ProductosPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "producto", "precio"
            }
        ));
        jScrollPane2.setViewportView(ProductosPedido);

        jLabel2.setText("Pedido");

        MandarPedido.setText("agregar pedido");
        MandarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MandarPedidoActionPerformed(evt);
            }
        });

        ConfirmarCompra.setText("Confirmar compra");
        ConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarCompraActionPerformed(evt);
            }
        });

        jLabel3.setText("Distancia");

        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });

        jLabel4.setText("Producto");

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        EliminarProducto.setText("Eliminar Producto");
        EliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar Producto");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Total.setText("Total:");

        Largo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LargoActionPerformed(evt);
            }
        });

        jLabel6.setText("Vehiculo");

        accion.setText("Serializar");
        accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionActionPerformed(evt);
            }
        });

        desaccion.setText("Deserializar");
        desaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desaccionActionPerformed(evt);
            }
        });

        VerMotos.setText("Ver Vehiculos");
        VerMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMotosActionPerformed(evt);
            }
        });

        MotosV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moto1", "Moto2", "Moto3" }));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Agregar))))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContenidoLayout.createSequentialGroup()
                                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(MandarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(accion, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ContenidoLayout.createSequentialGroup()
                                    .addComponent(ConfirmarCompra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                        .addComponent(Total)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MotosV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Largo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(VerMotos)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar)
                .addGap(40, 40, 40))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotosV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VerMotos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmarCompra)
                            .addComponent(EliminarProducto)))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MandarPedido)
                            .addComponent(Eliminar))))
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accion)
                            .addComponent(desaccion))
                        .addGap(33, 109, Short.MAX_VALUE))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Regresar)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        MenuPrinicipal menu = new MenuPrinicipal(productos, vehiculos);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void MandarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MandarPedidoActionPerformed
        // TODO add your handling code here:
        
        seleccionTabla();
    }//GEN-LAST:event_MandarPedidoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        agregar();
        //Producto.setText("");
        //Precio.setText("");
        refrescarTabla();
    }//GEN-LAST:event_AgregarActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed

    
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        //eliminar();
       int selectedRow = ProductosMuestra.getSelectedRow();
    if (selectedRow != -1) {    
        DefaultTableModel modeloPedidos = (DefaultTableModel) ProductosMuestra.getModel();   
        modeloPedidos.removeRow(selectedRow);
        String motocicleta = (String) MotosV.getSelectedItem();     
        
     if (pedidos != null) {
            // Eliminar el pedido correspondiente a la fila seleccionada
            pedidos.remove(selectedRow);
        }
    }
    }//GEN-LAST:event_EliminarActionPerformed

    private void LargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LargoActionPerformed

    private void accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionActionPerformed
        // TODO add your handling code here:
        serializarDatos();
    }//GEN-LAST:event_accionActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    private void desaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desaccionActionPerformed
        // TODO add your handling code here:
        deserializarDatos();
    }//GEN-LAST:event_desaccionActionPerformed

    private void VerMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMotosActionPerformed
        // TODO add your handling code here:
        Entregas entregas = new Entregas(productos, vehiculos);
        entregas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VerMotosActionPerformed

    private void ConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarCompraActionPerformed
        // TODO add your handling code here:
        if (MotosV.getSelectedItem().toString() == "Moto1") { 
            Entregas.Distancia1= Integer.parseInt(Largo.getText());
        }
        if (MotosV.getSelectedItem().toString() == "Moto2") { 
            Entregas.Distancia2= Integer.parseInt(Largo.getText());
        }
        if (MotosV.getSelectedItem().toString() == "Moto3") { 
            Entregas.Distancia3= Integer.parseInt(Largo.getText());
        }
        
    }//GEN-LAST:event_ConfirmarCompraActionPerformed
public void refrescarTablaPedidos(){
        DefaultTableModel productosInfo = new DefaultTableModel();
        productosInfo.addColumn("Nombre");
        productosInfo.addColumn("Precio");
        
        for (int i = 0; i < productos.size(); i++) {
            Object[] fila = new Object[2];
            fila[0] = productos.get(i).getNombre();
            fila[1] = "Q" + productos.get(i).getPrecio();
            productosInfo.addRow(fila);
        }
        ProductosPedido.setModel(productosInfo);      
    }
    private void EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoActionPerformed
        // TODO add your handling code here:
         int selectedRow = ProductosPedido.getSelectedRow();
    if (selectedRow != -1) {    
        DefaultTableModel modeloPedidos = (DefaultTableModel) ProductosPedido.getModel();   
        modeloPedidos.removeRow(selectedRow);
        String motocicleta = (String) MotosV.getSelectedItem();     
        
     if (pedidos != null) {
            // Eliminar el pedido correspondiente a la fila seleccionada
            pedidos.remove(selectedRow);
        }
        sumaPedido();
    }
    }//GEN-LAST:event_EliminarProductoActionPerformed
    
    public void refrescarTabla(){
        DefaultTableModel productosInfo = new DefaultTableModel();
        productosInfo.addColumn("Nombre");
        productosInfo.addColumn("Precio");
        
        for (int i = 0; i < productos.size(); i++) {
            Object[] fila = new Object[2];
            fila[0] = productos.get(i).getNombre();
            fila[1] = "Q" + productos.get(i).getPrecio();
            productosInfo.addRow(fila);
        }
        ProductosMuestra.setModel(productosInfo);      
    }
  public void seleccionTabla(){
  int seleccion = ProductosMuestra.getSelectedRow();
  
  Productos seleccionado =  productos.get(seleccion);
  if (productos.contains(seleccionado)) {
            pedidos.add(new Productos(seleccionado.getNombre(), seleccionado.getPrecio(), true));
        }
        cargarProductoPedido();
  }
   
public void cargarProductoPedido() {
        DefaultTableModel tablaPedido = new DefaultTableModel();
        tablaPedido.addColumn("Nombre");
        tablaPedido.addColumn("Precio");
        for (int i = 0; i < pedidos.size(); i++) {
            Object[] fila = new Object[2];
            fila[0] = pedidos.get(i).getNombre();
            fila[1] = pedidos.get(i).getPrecio();
            tablaPedido.addRow(fila);
        }
        ProductosPedido.setModel(tablaPedido);
        sumaPedido();
    }
 public void sumaPedido() {
        double suma = 0.00;
        for (int i = 0; i < ProductosPedido.getRowCount(); i++) {
            double precio = Double.parseDouble(ProductosPedido.getValueAt(i, 1).toString());
            suma += precio;
        }
        Total.setText("Total: " + suma);
    }
public void cargarProductos() {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Producto");
        tabla.addColumn("Precio");
        for (int i = 0; i < productos.size(); i++) {
            Object[] fila = new Object[2];
            fila[0] = productos.get(i).getNombre();
            fila[1] = productos.get(i).getPrecio();
            tabla.addRow(fila);
        }
        ProductosMuestra.setModel(tabla);
        

       /** for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).isDisponible()) {
                motosLibres.addItem(vehiculos.get(i).getNombre());
            }
        }*/
    }
    private void serializarDatos() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivoDatos);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(productos);  
            out.close();
            fileOut.close();
            JOptionPane.showMessageDialog(this, "serializacion correcta");
        } catch (Exception e) {
            e.printStackTrace();
        }}
    
    private void cargarDatos() {
        try {
            FileInputStream fileIn = new FileInputStream(archivoDatos);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            productos = (ArrayList<Productos>) in.readObject(); 
            in.close();
            fileIn.close();
            System.out.println("Datos cargados correctamente.");
        } catch (Exception e) {
            productos = new ArrayList<>(); 
            e.printStackTrace();
        }
    }
   
private void deserializarDatos() {
        try {
            FileInputStream desguardado = new FileInputStream(archivoDatos);
            ObjectInputStream in = new ObjectInputStream(desguardado);
            productos = (ArrayList<Productos>) in.readObject();  
            in.close();
            desguardado.close();
        
            JOptionPane.showMessageDialog(this, "deserializacion correcta");
          
        } catch (Exception e) {
            e.printStackTrace();
        }}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton ConfirmarCompra;
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarProducto;
    private javax.swing.JTextField Largo;
    private javax.swing.JButton MandarPedido;
    private javax.swing.JComboBox<String> MotosV;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Producto;
    private javax.swing.JTable ProductosMuestra;
    private javax.swing.JTable ProductosPedido;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Total;
    private javax.swing.JButton VerMotos;
    private javax.swing.JButton accion;
    private javax.swing.JButton desaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    class Fondo extends JPanel{
    private Image imagen;
    
        public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
