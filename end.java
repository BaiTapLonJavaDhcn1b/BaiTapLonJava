
package caro;


public class end extends javax.swing.JFrame {

    private final String a,b;
    public end(String t,String t1,String t2) {
        initComponents();
        this.a=t1;this.b=t2;
        ketqua.setText(t+" thắng ");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ketqua = new javax.swing.JTextField();
        vanmoi = new javax.swing.JButton();
        choilai = new javax.swing.JButton();
        thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        ketqua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ketqua.setForeground(new java.awt.Color(0, 0, 204));

        vanmoi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        vanmoi.setForeground(new java.awt.Color(0, 0, 204));
        vanmoi.setText("ván mới");
        vanmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanmoiActionPerformed(evt);
            }
        });

        choilai.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        choilai.setForeground(new java.awt.Color(0, 0, 204));
        choilai.setText("chơi lại");
        choilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choilaiActionPerformed(evt);
            }
        });

        thoat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        thoat.setForeground(new java.awt.Color(0, 0, 204));
        thoat.setText("thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vanmoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(ketqua))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(choilai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(thoat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(vanmoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(choilai)
                .addGap(51, 51, 51)
                .addComponent(thoat)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vanmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanmoiActionPerformed
      this.dispose();
      new start().setVisible(true);
    }//GEN-LAST:event_vanmoiActionPerformed

    private void choilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choilaiActionPerformed
        this.dispose();
        new play(a,b).setVisible(true);
    }//GEN-LAST:event_choilaiActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed

        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choilai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ketqua;
    private javax.swing.JButton thoat;
    private javax.swing.JButton vanmoi;
    // End of variables declaration//GEN-END:variables
}
