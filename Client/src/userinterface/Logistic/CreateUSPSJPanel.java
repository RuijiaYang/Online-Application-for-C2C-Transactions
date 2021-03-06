/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Logistic;

import Util.Util;
import business.logistic.UspsPackages;
import business.order.Order;
import business.product.Product;
import business.system.EcoSystem;
import business.useraccount.UserAccount;
import business.usermessage.Message;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.seller.ViewSellOrderDetailsJPanel;
import business.logistic.Package;
import userinterface.main.RegisterJFrame;

/**
 *
 * @author HP
 */
public class CreateUSPSJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Order soldOrder;
    UserAccount userAccount;
    EcoSystem system;
    Util Util = new Util();

    /**
     * Creates new form CreateUSPS
     */
    public CreateUSPSJPanel(JPanel userProcessContainer, Order soldOrder, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.soldOrder = soldOrder;
        this.system = system;

        //生成订单号，赋给订单并显示
        int trackTemp = Package.counter;
        txtTrackingNum.setText(String.valueOf(trackTemp));
        //给买家的订单赋值

        txtTo.setText(soldOrder.getRecipientAddress());
        txtTel.setText(soldOrder.getRecipientPhone());
        txtRecipientName.setText(soldOrder.getRecipientName());

        Date nowDate = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String soldDate = sdf2.format(nowDate);
        txtTime.setText(soldDate);
    }

    int rd(int change, int unchange) {
        return (int) ((Math.random() * change) + unchange);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTrackingNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTo = new javax.swing.JTextArea();
        jScrollPanel2 = new javax.swing.JScrollPane();
        txtPickUP = new javax.swing.JTextArea();
        txtTime = new javax.swing.JTextField();
        btnSchedule = new javax.swing.JButton();
        txtRecipientName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("Tracking Number:");

        jLabel3.setText("Where to :");

        jLabel4.setText("Where to pick up:");

        jLabel5.setText("Pick Up Time:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USPS");

        txtTrackingNum.setEditable(false);
        txtTrackingNum.setEnabled(false);

        txtTo.setEditable(false);
        txtTo.setColumns(20);
        txtTo.setRows(5);
        jScrollPane1.setViewportView(txtTo);

        txtPickUP.setColumns(20);
        txtPickUP.setRows(5);
        jScrollPanel2.setViewportView(txtPickUP);

        txtTime.setEditable(false);

        btnSchedule.setText("Schedule A Pickup!");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        txtRecipientName.setEditable(false);
        txtRecipientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecipientNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Recipient:");

        txtTel.setEditable(false);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        jLabel7.setText("Tel:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTrackingNum, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addComponent(txtTime)
                        .addComponent(txtRecipientName)
                        .addComponent(txtTel))
                    .addComponent(jScrollPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSchedule)
                .addGap(262, 262, 262))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTrackingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRecipientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnSchedule)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        if (txtPickUP.getText().equals("") || txtTime.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Complete your form");
            return;
        } 
            Date nowDate = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            String soldDate = sdf2.format(nowDate);
            Package p = system.getUps().addUspsPackage();

            p.setExpress("USPS");
            p.setRecipientName(soldOrder.getRecipientName());
            p.setRecipientAddress(soldOrder.getRecipientAddress());
            p.setSenderName(userAccount.getPerson().getName());
            p.setSenderAddress(txtPickUP.getText());
            p.setStatus("Schedule For Carrier Pickup");

            p.addLocation(soldDate, txtPickUP.getText());
            soldOrder.setTrackingNum(String.valueOf(p.getTrackingNum()));

            soldOrder.getProduct().setSoldDate(soldDate);
            soldOrder.setOrderStatus("Shipped");
            soldOrder.getProduct().setStatus("Sold");
            //        try {
            //            Util.SendSystem(system);
            //        } catch (IOException ex) {
            //            Logger.getLogger(RegisterJFrame.class.getName()).log(Level.SEVERE, null, ex);
            //        } catch (ClassNotFoundException ex) {
            //            Logger.getLogger(RegisterJFrame.class.getName()).log(Level.SEVERE, null, ex);
            //        }
            JOptionPane.showMessageDialog(null, "Shipped! \nAlready noticed customer");

            //Send message
            String content = "Your item is on the way!\nDo not reply this message";
            UserAccount sender = userAccount;
            UserAccount receicer = soldOrder.getBuyer();
            Product product = soldOrder.getProduct();
            Date nowTime = new Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String sentTime = sdf1.format(nowTime);
            String status = "Unread";
            Message responseM = null;

            Message m = soldOrder.getBuyer().getMessageDirectory().createMessage(content, status, sentTime, sender, receicer, product, responseM);
            try {
                Util.SendSystem(system);

                // TODO add your handling code here:
            } catch (IOException ex) {
                Logger.getLogger(CreateUSPSJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                btnSchedule.setEnabled(false);
                Logger.getLogger(CreateUSPSJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(CreateUSPSJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            ViewSellOrderDetailsJPanel viewSellerOrderDetailsJPanel = (ViewSellOrderDetailsJPanel) component;
            viewSellerOrderDetailsJPanel.backExpress();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void txtRecipientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecipientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecipientNameActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSchedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanel2;
    private javax.swing.JTextArea txtPickUP;
    private javax.swing.JTextField txtRecipientName;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextArea txtTo;
    private javax.swing.JTextField txtTrackingNum;
    // End of variables declaration//GEN-END:variables
}
