/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddVallueInTable1;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indra
 */
public class AddDetailsTable1 extends javax.swing.JFrame {

    /**
     * Creates new form AddDetails
     */
    public AddDetailsTable1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        faculty = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        hobby = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        first = new javax.swing.JRadioButton();
        second = new javax.swing.JRadioButton();
        third = new javax.swing.JRadioButton();
        singing = new javax.swing.JCheckBox();
        dancing = new javax.swing.JCheckBox();
        reading = new javax.swing.JCheckBox();
        sports = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        rowNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        deleteFromButtom = new javax.swing.JButton();
        deleteFromTop = new javax.swing.JButton();
        touchDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 207, 210));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Add Details");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Address");

        jLabel5.setText("Faculty");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        hobby.setText("Hobby");

        level.setText("Level");

        buttonGroup1.add(first);
        first.setText("1st");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        buttonGroup1.add(second);
        second.setText("2nd");

        buttonGroup1.add(third);
        third.setText("3rd");

        singing.setText("Singing");

        dancing.setText("Dancing");

        reading.setText("Reading");

        sports.setText("Sports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap())
                            .addComponent(fName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(exit)
                        .addGap(70, 70, 70)
                        .addComponent(clear)
                        .addGap(51, 51, 51)
                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(hobby)
                            .addComponent(level))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address)
                            .addComponent(faculty)
                            .addComponent(lName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(first)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(second)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(third))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(singing)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dancing))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(reading)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sports)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hobby)
                    .addComponent(singing)
                    .addComponent(dancing))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(level)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reading)
                            .addComponent(sports))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(first)
                            .addComponent(second)
                            .addComponent(third))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(clear)
                    .addComponent(exit))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(196, 198, 201));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Student Details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Address", "Faculty", "Hobbies", "Level (Year)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        delete.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        rowNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rowNumberActionPerformed(evt);
            }
        });

        jLabel7.setText("Index number:");

        deleteFromButtom.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        deleteFromButtom.setText("Delete From Buttom");
        deleteFromButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromButtomActionPerformed(evt);
            }
        });

        deleteFromTop.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        deleteFromTop.setText("Delete From Top");
        deleteFromTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromTopActionPerformed(evt);
            }
        });

        touchDelete.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        touchDelete.setText("Click Row and Delete");
        touchDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                touchDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 282, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteFromTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(deleteFromButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(touchDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete))
                    .addComponent(jScrollPane1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete)
                    .addComponent(jLabel7)
                    .addComponent(touchDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteFromButtom)
                    .addComponent(deleteFromTop))
                .addGap(42, 42, 42))
        );

        file.setText("File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);

        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        file.add(jMenuItem1);

        jMenuBar1.add(file);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String hobby="";
        
        if(singing.isSelected()){
            if(hobby.contains(singing.getText())){
            hobby = singing.getText()+","+hobby;
            }
        }
        else if(dancing.isSelected()){
             if(hobby.contains(dancing.getText())){
            hobby = dancing.getText()+","+hobby;
             }
        }
        else if(reading.isSelected()){
             if(hobby.contains(reading.getText())){
            hobby = reading.getText()+","+hobby;
             }
        }
        else if(sports.isSelected()){
             if(hobby.contains(sports.getText())){
            hobby = sports.getText()+","+hobby;
             }
        }
        
        
        String fNamee=fName.getText();
        String lNamee=lName.getText();
        String addresss=address.getText();
        String facultyy=faculty.getText();
       
        if((fNamee.isEmpty()) || (lNamee.isEmpty()) ||(addresss.isEmpty()) || (facultyy.isEmpty()) ){
            JOptionPane.showMessageDialog(jPanel1,"Fillup all field and hit the ADD button"); 
        }
        
        else{
            int rowCount = jTable1.getRowCount();
            boolean match = false;
            
            for(int i=0; i<=rowCount-1; i++){
                String fName= jTable1.getValueAt(i,0).toString();
                String lName= jTable1.getValueAt(i,1).toString();
                String address= jTable1.getValueAt(i,2).toString();
                String faculty= jTable1.getValueAt(i,3).toString();
                String hobbyy= jTable1.getValueAt(i,4).toString();
                String levell= jTable1.getValueAt(i,5).toString();
                
                if(fName.equals(fNamee) && lName.equals(lNamee) && addresss.equals(address) && facultyy.equals(faculty)){
                    match=true;
                    break;
                }
                
            }
            if(!match){
            
            String[] val={fNamee, lNamee, addresss, facultyy, hobby};
            
            int columnCount = jTable1.getColumnCount();
            int nextRow = 0;
            
                if(rowCount!=0){
                    do {
                            nextRow++;
                    }
                    while(nextRow < rowCount);
                }

                DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
                temp.addRow(new Object[]{});
                for(int i=0; i<columnCount; i++){
                    jTable1.setValueAt(val[i], nextRow, i);
                }

                JOptionPane.showMessageDialog(jPanel1,"Congratulation "+fNamee+" You are enrolled."); 
                fName.setText("");
                lName.setText("");
                address.setText("");
                faculty.setText("");
            }
            else{
                JOptionPane.showMessageDialog(jPanel1,"The given Information is Matched!!");
            }
        }
      
    }//GEN-LAST:event_addActionPerformed

    private void rowNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rowNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rowNumberActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if(rowNumber.getText().isEmpty()){
           JOptionPane.showMessageDialog(jPanel2,"Please Input Index number first.");  
        }
        else{
            try{
                try{
                    int value = Integer.parseInt(rowNumber.getText());
                    model.removeRow(value);
                    rowNumber.setText("");
                    JOptionPane.showMessageDialog(jPanel2,"Succssfully deleted value from "+value+" Index"); 
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Plese input valid integer Index number only. "+ ex);
                } 
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Plese input valid Index number. "+ ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        fName.setText("");
        lName.setText("");
        address.setText("");
        faculty.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void deleteFromTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromTopActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount()<1){
            JOptionPane.showMessageDialog(jPanel2, "There is no data to Delete");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(0);
            JOptionPane.showMessageDialog(jPanel2, "Successfully deleted row from Top");
        }
    }//GEN-LAST:event_deleteFromTopActionPerformed

    private void deleteFromButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromButtomActionPerformed
        // TODO add your handling code here:
        if(jTable1.getRowCount()<1){
            JOptionPane.showMessageDialog(jPanel2, "There is no data to Delete");
        }
        else{
            int lRow = jTable1.getRowCount()-1;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(lRow);
            JOptionPane.showMessageDialog(jPanel2, "Successfully deleted row from Buttom");
         }
    }//GEN-LAST:event_deleteFromButtomActionPerformed

    private void touchDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touchDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
            int SelectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(SelectedRowIndex);
            JOptionPane.showMessageDialog(jPanel2, "Successfully deleted  Selected row");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You need to select row first"+ ex);
        }
    }//GEN-LAST:event_touchDeleteActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        JFileChooser choosefile=new JFileChooser();
        choosefile.showOpenDialog(jPanel1);
        
    }//GEN-LAST:event_openActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

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
            java.util.logging.Logger.getLogger(AddDetailsTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDetailsTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDetailsTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDetailsTable1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDetailsTable1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JCheckBox dancing;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteFromButtom;
    private javax.swing.JButton deleteFromTop;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField faculty;
    private javax.swing.JMenu file;
    private javax.swing.JRadioButton first;
    private javax.swing.JLabel hobby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lName;
    private javax.swing.JLabel level;
    private javax.swing.JMenuItem open;
    private javax.swing.JCheckBox reading;
    private javax.swing.JTextField rowNumber;
    private javax.swing.JRadioButton second;
    private javax.swing.JCheckBox singing;
    private javax.swing.JCheckBox sports;
    private javax.swing.JRadioButton third;
    private javax.swing.JButton touchDelete;
    // End of variables declaration//GEN-END:variables
}
