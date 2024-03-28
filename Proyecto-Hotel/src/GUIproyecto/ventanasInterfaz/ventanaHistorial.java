/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIproyecto.ventanasInterfaz;
import proyecto.hotel.*;
/**
 *
 * @author joseg
 */
public class ventanaHistorial extends javax.swing.JFrame {

    /**
     * Creates new form ventanaHistorial
     */
    
    public static Menu1Home vHistorial; //se conecta a la interfaz principal
    public ArbolHabitacion arbolHabitacion = Menu1Home.arbolHabitacion;
    
    public ventanaHistorial(Menu1Home vHistorial) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoBlanco = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        tiraAzul = new javax.swing.JLabel();
        historialLabel = new javax.swing.JLabel();
        Nro = new javax.swing.JTextField();
        habitacionLabel = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salida = new javax.swing.JTextArea();
        fondoHistorial = new javax.swing.JLabel();
        fondodeBlanco = new javax.swing.JLabel();

        fondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/blanco.png"))); // NOI18N
        fondoBlanco.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVolver.setBackground(new java.awt.Color(0, 153, 204));
        botonVolver.setText("Volver a menú");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, -1));

        tiraAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/tiraAzul.png"))); // NOI18N
        tiraAzul.setText("jLabel1");
        tiraAzul.setPreferredSize(new java.awt.Dimension(210, 300));
        getContentPane().add(tiraAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, -1));

        historialLabel.setForeground(new java.awt.Color(0, 0, 0));
        historialLabel.setText("Historial");
        getContentPane().add(historialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        getContentPane().add(Nro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        habitacionLabel.setForeground(new java.awt.Color(0, 0, 0));
        habitacionLabel.setText("Habitación");
        getContentPane().add(habitacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        botonBuscar.setBackground(new java.awt.Color(0, 153, 204));
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, -1));

        Salida.setColumns(20);
        Salida.setRows(5);
        jScrollPane1.setViewportView(Salida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        fondoHistorial.setBackground(new java.awt.Color(255, 255, 255));
        fondoHistorial.setForeground(new java.awt.Color(255, 255, 255));
        fondoHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/historial_1.png"))); // NOI18N
        fondoHistorial.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(fondoHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 240));

        fondodeBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIproyecto/imagenesGUI/blanco.png"))); // NOI18N
        fondodeBlanco.setText("jLabel1");
        fondodeBlanco.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(fondodeBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
         if(!Nro.getText().isBlank()){
            NodoHabitacion Habitacion = arbolHabitacion.buscar(Nro.getText());
            if(Habitacion == null){
                Salida.setText("Este Numero de Habitacion no existe o No ha sido utilizado");
            }else{
                Salida.setText(Habitacion.getLista().imprimir());
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaHistorial(vHistorial).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nro;
    private javax.swing.JTextArea Salida;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel fondoBlanco;
    private javax.swing.JLabel fondoHistorial;
    private javax.swing.JLabel fondodeBlanco;
    private javax.swing.JLabel habitacionLabel;
    private javax.swing.JLabel historialLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tiraAzul;
    // End of variables declaration//GEN-END:variables
}
