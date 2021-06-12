
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anago
 */
public class Ventana extends javax.swing.JFrame {
    Grafo grafo = new Grafo();
    ArrayList<String> letras = new ArrayList<String>();
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        btnCrearVertice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnMatrizAdyacencia = new javax.swing.JButton();
        btnListaAdyacencia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        btnCrearArista = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnEliminarVertice = new javax.swing.JButton();
        btnEliminarArista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VERTICE:");

        btnCrearVertice.setText("CREAR VERTICE");
        btnCrearVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVerticeActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnMatrizAdyacencia.setText("MATRIZ DE ADYACENCIA");
        btnMatrizAdyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizAdyacenciaActionPerformed(evt);
            }
        });

        btnListaAdyacencia.setText("LISTA DE ADYACENCIA");
        btnListaAdyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAdyacenciaActionPerformed(evt);
            }
        });

        jLabel2.setText("ARISTA:");

        btnCrearArista.setText("CREAR ARISTA");
        btnCrearArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAristaActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnEliminarVertice.setText("ELIMINAR VERTICE");
        btnEliminarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVerticeActionPerformed(evt);
            }
        });

        btnEliminarArista.setText("ELIMINAR ARISTA");
        btnEliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMatrizAdyacencia)
                            .addComponent(btnEliminarVertice)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCrearVertice))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarArista)
                                    .addComponent(btnCrearArista, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnListaAdyacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearVertice)
                    .addComponent(btnCrearArista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarVertice)
                    .addComponent(btnEliminarArista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatrizAdyacencia)
                    .addComponent(btnListaAdyacencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVerticeActionPerformed
        char dato = txtDato.getText().toUpperCase().charAt(0);
        
        
        if(grafo.buscarVertice(dato) != null){
            JOptionPane.showMessageDialog(null, "¡ERROR! Ya existe.");
        } else {
            grafo.insertarVertice(dato);
            letras.add(dato + "");
            lblMensaje.setText("Se insertó correctamente");
        }
        txtDato.setText("");
    }//GEN-LAST:event_btnCrearVerticeActionPerformed

    private void btnCrearAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAristaActionPerformed
        char origen = txtOrigen.getText().toUpperCase().charAt(0);
        char destino = txtDestino.getText().toUpperCase().charAt(0);
        
        boolean respuesta = grafo.insertarAristas(origen, destino);
        String mensaje = "¡ERROR! Uno de los vertices no existe.";
        if(respuesta == true){
        mensaje = "Se insertó la arista de " + origen + " a " + destino;
        }
        lblMensaje.setText(mensaje);
        txtOrigen.setText("");
        txtDestino.setText("");
    }//GEN-LAST:event_btnCrearAristaActionPerformed

    private void btnEliminarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVerticeActionPerformed
        char dato = txtDato.getText().toUpperCase().charAt(0);
        
        boolean respuesta = grafo.eliminarVertice(dato);
        
        String mensaje = "¡ERROR! No se pudo eliminar.";
        if(respuesta == true){
        mensaje = "Se eliminó correctamente: " + dato;
        }
        lblMensaje.setText(mensaje);
        txtDato.setText("");
    }//GEN-LAST:event_btnEliminarVerticeActionPerformed

    private void btnEliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAristaActionPerformed
        char origen = txtOrigen.getText().toUpperCase().charAt(0);
        char destino = txtDestino.getText().toUpperCase().charAt(0);
        
        boolean respuesta = grafo.eliminarAristas(origen, destino);
        String mensaje = "¡ERROR! No se pudo eliminar.";
        if(respuesta == true){
        mensaje = "Se eliminó arista de: " + origen + " a " + destino;
        }
        lblMensaje.setText(mensaje);
        txtOrigen.setText("");
        txtDestino.setText("");
    }//GEN-LAST:event_btnEliminarAristaActionPerformed

    private void btnMatrizAdyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizAdyacenciaActionPerformed
        String matriz[][] = new String[letras.size()][letras.size()];
        for(int i = 0; i < letras.size(); i++){
            matriz[i] = letras.toArray(new String[0]);
        }
        grafo.irPrimero();
        int contador = 0;
        while(grafo.vertice != null && grafo.vertice.arista != null){
            grafo.vertice.irPrimero();
            while(grafo.vertice.arista != null){
                for (int i = 0; i < matriz.length; i++) {
                    if(matriz[contador][i].charAt(0) == grafo.vertice.arista.direccion.dato){
                        matriz[contador][i] = "1";
                        break;
                    }
                }
                if(grafo.vertice.arista.arriba == null){
                    break;
                }
                grafo.vertice.arista = grafo.vertice.arista.arriba;
            }
            contador++;
            if(grafo.vertice.sig == null){
                break;
            }
            grafo.vertice = grafo.vertice.sig;
        }
        String cad = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(!matriz[i][j].equals("1")){
                    matriz[i][j] = "0";
                }
                cad += matriz[i][j] + " ";
            }
            cad += "\n";
        }
        txtArea.setText(cad);
    }//GEN-LAST:event_btnMatrizAdyacenciaActionPerformed

    private void btnListaAdyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAdyacenciaActionPerformed
        grafo.irPrimero();
        int contador = 0;
        String cad = "";
        while(grafo.vertice != null && grafo.vertice.arista != null){
            grafo.vertice.irPrimero();
            cad += letras.get(contador) + " = [";
            while(grafo.vertice.arista != null){
                cad += grafo.vertice.arista.direccion.dato + " , ";
                if(grafo.vertice.arista.arriba == null){
                    break;
                }
                grafo.vertice.arista = grafo.vertice.arista.arriba;
            }
            cad = cad.substring(0, cad.length()-3);
            cad += "]\n";
            contador++;
            if(grafo.vertice.sig == null){
                break;
            }
            grafo.vertice = grafo.vertice.sig;
        }
        txtArea.setText(cad);
    }//GEN-LAST:event_btnListaAdyacenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearArista;
    private javax.swing.JButton btnCrearVertice;
    private javax.swing.JButton btnEliminarArista;
    private javax.swing.JButton btnEliminarVertice;
    private javax.swing.JButton btnListaAdyacencia;
    private javax.swing.JButton btnMatrizAdyacencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
