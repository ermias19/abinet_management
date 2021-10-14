//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package abinet_managment;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

class mata_telot_attendance extends attendance {
    JButton d_n_viwer = new JButton("d/n");
    JButton mata_telot_report = new JButton("generate report");
    static JTextField one_two=p_a;

    public mata_telot_attendance() {
        this.first_name.setText("prifix");
        this.d_n_viwer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                attendance.s_code_a_getstring = attendance.s_code_a.getText();
                mata_telot_attendance.mata_telot_d_n_viwer();
            }
        });
        one_two.setText("1  2 ");
        this.button.add(this.mata_telot_report, "South");
        this.button.add(this.d_n_viwer, "North");
        this.Date_s.setText("Date");
        this.value.setText("type");
        this.mata_telot_report.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                mata_telot_attendance.this.mata_telot_report();
            }
        });
        this.sumbit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                mata_telot_attendance.this.mata_telot_add();
            }
        });
    }

    public static void mata_telot_d_n_viwer() {
        try {
            String sql = "select prifix from student where s_code=" + s_code_a_getstring;
            jdbc.connection();
            ResultSet d_n_mata_telot = jdbc.connection().executeQuery(sql);

            while(d_n_mata_telot.next()) {
                first_name_a.setText(d_n_mata_telot.getString(1));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public void mata_telot_add() {
        String date_getstring = this.date.getText();
        Statement creat = jdbc.connection();
        String value_get_txt = this.p_a.getText();

        try {
            String sql = "insert into mata_telot values(" + s_code_a_getstring + ",'" + date_getstring + "','" + value_get_txt + "')";
            jdbc.connection();
            creat.executeUpdate(sql);
            JOptionPane.showMessageDialog((Component)null, "the value is submited successfully");
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

    }

    public static void mata_telot() {
        mata_telot_attendance _viewr = new mata_telot_attendance();
        _viewr.setVisible(true);
        _viewr.setSize(1000, 400);
        _viewr.setLocation(150, 200);
        _viewr.getContentPane().setBackground(Color.BLACK);
    }
}
