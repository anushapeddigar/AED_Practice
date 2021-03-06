/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vikram
 */
public class UpdateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateFlightJPanel
     */
    TravelAgency travelAgency;
    Flight flight;
    JPanel cardSequenceJPanel;
    Airliner airliner;

    UpdateFlightJPanel(JPanel cardSequenceJPanel, Flight flight,TravelAgency travelAgency,Airliner airliner) {
        initComponents();
        this.flight = flight;
        this.travelAgency = travelAgency;
        this.airliner = airliner;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populateFlightDetails();
        txtAirlinerName.setText(airliner.getAirlinerName());
        txtAirlinerName.setEnabled(false);
        txtFlightSerialNo.setEnabled(false);
        txtFlightDeparture.setEnabled(false);
        txtFlightArrival.setEnabled(false);
        txtFlightDepartureDate.setEnabled(false);
        txtPerSeatRate.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true); 
        
    }
    
    private void populateFlightDetails(){
        
        txtFlightSerialNo.setText(flight.getFlightId());
        txtFlightDeparture.setText(flight.getDepartureLocation());
        txtFlightArrival.setText(flight.getArrivalLocation());
        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        String departDate = date.format(flight.getDepartureDate());
        txtFlightDepartureDate.setText(String.valueOf(departDate));
        txtPerSeatRate.setText(String.valueOf(flight.getPerSeatRate()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        txtAirlinerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timeComboBox = new javax.swing.JComboBox<>();
        txtFlightSerialNo = new javax.swing.JTextField();
        txtFlightDepartureDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFlightArrival = new javax.swing.JTextField();
        txtFlightDeparture = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPerSeatRate = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 144, 37));

        txtAirlinerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerNameActionPerformed(evt);
            }
        });
        add(txtAirlinerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 114, 155, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Departure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 198, 104, 27));

        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning Flight", "Day Flight", "Evening Flight", " " }));
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });
        add(timeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 275, 153, 29));
        add(txtFlightSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 155, 155, 27));

        txtFlightDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightDepartureDateActionPerformed(evt);
            }
        });
        add(txtFlightDepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 315, 155, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Airliner");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 112, 72, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Departure Date");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 315, -1, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View/Update Flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 800, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Time of Day");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 273, 99, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Arrival");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 238, 140, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Serial Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 154, 96, 24));
        add(txtFlightArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 155, 27));
        add(txtFlightDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 200, 155, 27));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 116, 37));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 144, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Per Seat Rate");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 130, 27));

        txtPerSeatRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPerSeatRateKeyTyped(evt);
            }
        });
        add(txtPerSeatRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 155, 27));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //txtAirlinerName.setText(airliner.getAirlinerName());
        Date availableDate = null;

        String serialNo = txtFlightSerialNo.getText();
        String departure = txtFlightDeparture.getText();
        String arrival = txtFlightArrival.getText();
        String flightTime = timeComboBox.getSelectedItem().toString();
        int perSeatRate = Integer.parseInt(txtPerSeatRate.getText());
        try {
            availableDate = new SimpleDateFormat("dd/mm/yyyy").parse(txtFlightDepartureDate.getText());
        }
        catch (ParseException ex) {
            Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter the date in proper format");
            return;
        }
        if (serialNo.equals("") || departure.equals("") || arrival.equals("") || flightTime.equals("Select") || availableDate.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        else{
            flight.setAirlinerName(airliner.getAirlinerName());
            flight.setFlightId(serialNo);
            flight.setDepartureLocation(departure);
            flight.setArrivalLocation(arrival);
            flight.setTimeOfDay(flightTime);
            flight.setDepartureDate(availableDate);
            flight.setPerSeatRate(perSeatRate);
        }
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Flight updated successfully");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAirlinerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerNameActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeComboBoxActionPerformed

    private void txtFlightDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightDepartureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightDepartureDateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:.
        txtFlightSerialNo.setEnabled(true);
        txtFlightDeparture.setEnabled(true);
        txtFlightArrival.setEnabled(true);
        txtFlightDepartureDate.setEnabled(true);
        txtPerSeatRate.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPerSeatRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerSeatRateKeyTyped
        // TODO add your handling code here:
        char rate= evt.getKeyChar();
        if (!(Character.isDigit(rate) || (rate==KeyEvent.VK_BACK_SPACE) || (rate==KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPerSeatRateKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtFlightArrival;
    private javax.swing.JTextField txtFlightDeparture;
    private javax.swing.JTextField txtFlightDepartureDate;
    private javax.swing.JTextField txtFlightSerialNo;
    private javax.swing.JTextField txtPerSeatRate;
    // End of variables declaration//GEN-END:variables
}
