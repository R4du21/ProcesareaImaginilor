package procesareaimaginilor;

import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Image;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        showImageL(pos);
        button_convert.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Private fields ">
    private int pos = 0;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" Private methods ">
    private String[] getImages()
    {
        var file = new File(getClass().getResource("/procesareaimaginilor/images").getFile());
        var imagesList = file.list();
        return imagesList;
    }
    
    private void showImageL (int pos)
    {
        var imagesList = getImages();
        var imageName = imagesList[pos];
        var icon = new ImageIcon(getClass().getResource("/procesareaimaginilor/images/" + imageName));
        var image = icon.getImage().getScaledInstance(jLabel_left.getWidth(), jLabel_left.getHeight(), Image.SCALE_SMOOTH);
        jLabel_left.setIcon(new ImageIcon(image));
    }
    
    private void showImageR (int pos)
    {
        var imagesList = getImages();
        var imageName = imagesList[pos];
        var icon = new ImageIcon(getClass().getResource("/procesareaimaginilor/images/" + imageName));
        var image = icon.getImage().getScaledInstance(jLabel_left.getWidth(), jLabel_left.getHeight(), Image.SCALE_SMOOTH);
        jLabel_right.setIcon(new ImageIcon(image));
    }
    
    private int sliderValue()
    {
        return slider.getValue();
    }
    
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_left = new javax.swing.JLabel();
        jLabel_right = new javax.swing.JLabel();
        button_inapoi = new javax.swing.JButton();
        slider = new javax.swing.JSlider();
        button_inainte = new javax.swing.JButton();
        button_convert = new javax.swing.JButton();
        currentSliderVal = new javax.swing.JLabel();
        setSliderVal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        button_inapoi.setText("Inapoi");
        button_inapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_inapoiActionPerformed(evt);
            }
        });

        slider.setOrientation(javax.swing.JSlider.VERTICAL);
        slider.setValue(0);

        button_inainte.setText("Inainte");
        button_inainte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_inainteActionPerformed(evt);
            }
        });

        button_convert.setText("CONVERT");
        button_convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_convertActionPerformed(evt);
            }
        });

        setSliderVal.setText("SET");
        setSliderVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSliderValActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_left, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(currentSliderVal)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(setSliderVal)
                                .addGap(43, 43, 43)))
                        .addComponent(jLabel_right, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(button_inapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(button_inainte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(button_convert)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_right, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_left, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentSliderVal)
                        .addGap(18, 18, 18)
                        .addComponent(setSliderVal)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_inapoi)
                    .addComponent(button_inainte)
                    .addComponent(button_convert))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_inapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_inapoiActionPerformed
        pos = pos - 1;
        if(pos < 0)
        {
            pos = 0;
        }
        showImageL(pos);
    }//GEN-LAST:event_button_inapoiActionPerformed

    private void button_inainteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_inainteActionPerformed
        pos = pos + 1;
        if(pos >= getImages().length)
        {
            pos = getImages().length - 1;
        }
        showImageL(pos);
    }//GEN-LAST:event_button_inainteActionPerformed

    private void button_convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_convertActionPerformed
        try {
            Thread.sleep(500);
            showImageR(pos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }//GEN-LAST:event_button_convertActionPerformed

    private void setSliderValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSliderValActionPerformed
        currentSliderVal.setText(String.format("%s", sliderValue()));
        button_convert.setEnabled(true);
    }//GEN-LAST:event_setSliderValActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_convert;
    private javax.swing.JButton button_inainte;
    private javax.swing.JButton button_inapoi;
    private javax.swing.JLabel currentSliderVal;
    private javax.swing.JLabel jLabel_left;
    private javax.swing.JLabel jLabel_right;
    private javax.swing.JButton setSliderVal;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
