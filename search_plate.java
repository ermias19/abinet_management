/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ermiii
 */
package abinet_managment;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import static abinet_managment.admin_main_page.s_code_finder;

public class search_plate extends javax.swing.JFrame {

    /**
     * Creates new form search_plate
     */
    public search_plate() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();






        jLabel18.setText("s_code=");

        jLabel19.setText("prifix=");

        jLabel20.setText("first_name=");

        jLabel21.setText("last name=");

        jLabel22.setText("age=");

        jLabel23.setText("sex=");

        jLabel24.setText("cell phone=");

        jLabel25.setText("address=");

        jLabel26.setText("wereda=");

        jLabel27.setText("kebele=");

        jLabel28.setText("home_no=");

        jLabel29.setText("tesera_huneta=");

        jLabel30.setText("yetemhert_dereja=");

        jLabel31.setText("yalubet_huneta=");

        jLabel32.setText("christna abat=");

        jLabel33.setText("christna sm=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel23))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel16))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel33)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel17))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel25)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel29)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel12))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel33))
                                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>


    public static void search_stud_list( ){
        try {

        jdbc.connection();
        String sql = "select* from student where s_code= "+s_code_finder +"";
            System.out.println(s_code_finder);
        ResultSet rs_1 = jdbc.connection().executeQuery(sql);
        while(rs_1.next()){


        jLabel2.setText(rs_1.getString(1));

        jLabel16.setText(rs_1.getString(2));

        jLabel3.setText(rs_1.getString(3));

        jLabel4.setText(rs_1.getString(4));

        jLabel5.setText(rs_1.getString(5));
        jLabel6.setText(rs_1.getString(6));
        jLabel7.setText(rs_1.getString(7));

        }






        } catch (SQLException var4) {
        var4.getSQLState();
        }


        }
        public static void stud_search_photo(){
            String pic_dir = "C:\\Users\\ermiii\\IdeaProjects\\abinet_managment\\src\\stud_photo\\" + s_code_finder + ".jpg";
            ImageIcon photo_1= new ImageIcon(pic_dir);

            Image final_photo=photo_1.getImage().getScaledInstance(150,80,Image.SCALE_SMOOTH);
            jLabel1.setIcon( new ImageIcon(final_photo));


        }
    public static void stud_position() {
        try {

            jdbc.connection();
            String sql = "select* from stud_postition where s_code= "+  s_code_finder+"";
            ResultSet rs_1 = jdbc.connection().executeQuery(sql);
            while(rs_1.next()){

                jLabel8.setText(rs_1.getString(2));

                jLabel9.setText(rs_1.getString(3));

                jLabel10.setText(rs_1.getString(4));

                jLabel11.setText(rs_1.getString(5));

            }
        } catch (SQLException var4) {
            var4.getSQLState();
        }

    }
    public static void edu_position() {
        try {

            jdbc.connection();
            String sql = "select* from  edu_postition where s_code= "+s_code_finder +"";
            ResultSet rs_1 = jdbc.connection().executeQuery(sql);
            while(rs_1.next()){

                jLabel12.setText(rs_1.getString(2));

                jLabel13.setText(rs_1.getString(3));

                jLabel14.setText(rs_1.getString(4));



            }
        } catch (SQLException var4) {
            var4.getSQLState();
        }

    }
    public static void kristna_status() {
        try {

            jdbc.connection();
            String sql = "select* from  krisnta_status where s_code= "+s_code_finder +"";
            ResultSet rs_1 = jdbc.connection().executeQuery(sql);
            while(rs_1.next()){

                jLabel15.setText(rs_1.getString(2));

                jLabel17.setText(rs_1.getString(3));





            }
        } catch (SQLException var4) {
            var4.getSQLState();
        }

    }
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
            java.util.logging.Logger.getLogger(search_plate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_plate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_plate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_plate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

    }

    // Variables declaration - do not modify
    static javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel10;
    static javax.swing.JLabel jLabel11;
    static javax.swing.JLabel jLabel12;
    static javax.swing.JLabel jLabel13;
    static javax.swing.JLabel jLabel14;
    static javax.swing.JLabel jLabel15;
    static javax.swing.JLabel jLabel16;
    static javax.swing.JLabel jLabel17;
    static javax.swing.JLabel jLabel18;
    static javax.swing.JLabel jLabel19;
    static javax.swing.JLabel jLabel2;
    static javax.swing.JLabel jLabel20;
    static javax.swing.JLabel jLabel21;
    static javax.swing.JLabel jLabel22;
    static javax.swing.JLabel jLabel23;
    static javax.swing.JLabel jLabel24;
    static javax.swing.JLabel jLabel25;
    static javax.swing.JLabel jLabel26;
    static javax.swing.JLabel jLabel27;
    static javax.swing.JLabel jLabel28;
    static javax.swing.JLabel jLabel29;
    static javax.swing.JLabel jLabel3;
    static javax.swing.JLabel jLabel30;
    static javax.swing.JLabel jLabel31;
    static javax.swing.JLabel jLabel32;
    static javax.swing.JLabel jLabel33;
    static javax.swing.JLabel jLabel4;
    static javax.swing.JLabel jLabel5;
    static javax.swing.JLabel jLabel6;
    static javax.swing.JLabel jLabel7;
    static javax.swing.JLabel jLabel8;
    static javax.swing.JLabel jLabel9;
    // End of variables declaration
}