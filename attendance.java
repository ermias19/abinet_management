//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package abinet_managment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

class   attendance extends JFrame {
    static String s_code_a_getstring;
    static JTextField s_code_a = new JTextField(3);
    static JTextField first_name_a = new JTextField(10);
    JLabel s_code_ = new JLabel("s_code");
    JLabel first_name = new JLabel("first name");
    JLabel value = new JLabel("attendance value");
    static JTextField p_a = new JTextField("present or absent");
    JTable a_report = new JTable();
    JButton generate_report = new JButton("generate report");
    JLabel Date_s = new JLabel("current date");
    JButton sumbit = new JButton("sumbit");
    SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
    String c_d;
    JTextField date;
    Container attendance_main_contain;
    JPanel attendance_left;
    Container comp;
    JPanel button;

    public attendance() {
        super("attendance_report");
        this.c_d = this.formater.format(new Date());
        this.date = new JTextField(this.c_d);
        this.attendance_main_contain = new Container();
        this.attendance_left = new JPanel();
        this.comp = new Container();
        this.button = new JPanel();
        this.attendance_main_contain.setLayout(new BorderLayout());
        this.attendance_left.setBackground(Color.black);
        this.attendance_left.setLayout(new BorderLayout());
        this.attendance_left.setBorder(new LineBorder(Color.WHITE, 3, true));
        this.s_code_.setText("s_code");
        this.sumbit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                attendance.this.s_code();
            }
        });
        this.comp.setBackground(Color.BLACK);
        this.comp.setLayout(new GridLayout(5, 2, 1, 50));
        this.comp.add(this.s_code_);
        this.comp.add(s_code_a);
        this.comp.add(this.first_name);
        this.comp.add(first_name_a);
        this.comp.add(this.Date_s);
        this.comp.add(this.date);
        this.comp.add(this.value);
        this.comp.add(this.p_a);
        this.comp.add(this.sumbit);
        this.button.setLayout(new BorderLayout());
        this.button.setBackground(Color.black);
        this.button.add(this.generate_report, "South");
        this.generate_report.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                attendance.this.attendance_report();
            }
        });
        this.attendance_left.add(this.comp);
        this.attendance_left.add(this.button, "After");
        this.attendance_main_contain.add(this.attendance_left, "West");
        this.add(this.attendance_main_contain);
        JScrollPane page = new JScrollPane(this.a_report);
        page.setBorder(new LineBorder(Color.black, 5));
        this.a_report.setPreferredScrollableViewportSize(new Dimension(450, 100));
        this.a_report.setFillsViewportHeight(true);
        this.attendance_main_contain.add(page);
        this.add(this.attendance_main_contain);

    }

    public void s_code() {
        s_code_a_getstring = s_code_a.getText();
        String first_name_a_getString = first_name_a.getText();
        String date_getstring = this.date.getText();
        Statement creat = jdbc.connection();
        String p_a_get_txt = this.p_a.getText();

        try {
            String sql = "insert into calander values(" + s_code_a_getstring + ",'" + date_getstring + "','" + p_a_get_txt + "')";
            jdbc.connection();
            creat.executeUpdate(sql);
            JOptionPane.showMessageDialog((Component)null, "the value is submited successfully");
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

    }

    public void attendance_report() {
        try {
            String sql2 = "  select  first_name, last_name, s_code, Date,value from calander left outer join student using (s_code)";
            jdbc.connection();
            ResultSet cala_Result = jdbc.connection().executeQuery(sql2);
            DefaultTableModel attendance_table = new DefaultTableModel();
            attendance_table.addColumn(" first_name ");
            attendance_table.addColumn(" last_name ");
            attendance_table.addColumn("s_code");
            attendance_table.addColumn(" Date");
            attendance_table.addColumn(" value");

            while(cala_Result.next()) {
                attendance_table.addRow(new Object[]{cala_Result.getString(1), cala_Result.getString(2), cala_Result.getString(3), cala_Result.getString(4), cala_Result.getString(5)});
            }

            this.a_report.setModel(attendance_table);
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, "please input the correct s_code");
            System.out.println("re");
        }

    }

    public void mata_telot_report() {
        try {
            String sql2 = "select s_code ,first_name, prifix, telot_date, telot_value  from mata_telot left outer join student using (s_code)";
            jdbc.connection();
            ResultSet mata_Result = jdbc.connection().executeQuery(sql2);
            DefaultTableModel mata_telot_table = new DefaultTableModel();
            mata_telot_table.addColumn("s_code  ");
            mata_telot_table.addColumn("prifix");
            mata_telot_table.addColumn("first_name");
            mata_telot_table.addColumn(" mata_telot_Date");
            mata_telot_table.addColumn(" mata_telot_value");

            while(mata_Result.next()) {
                mata_telot_table.addRow(new Object[]{mata_Result.getString(1), mata_Result.getString(2), mata_Result.getString(3), mata_Result.getString(4), mata_Result.getString(5)});
            }

            this.a_report.setModel(mata_telot_table);
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, " benathh seraaq");
            var4.getSQLState();
        }

    }

    public static void attendance_viwer() {
        attendance a_viewr = new attendance();
        a_viewr.setVisible(true);
        a_viewr.setSize(1000, 400);
        a_viewr.setLocation(150, 200);
        a_viewr.getContentPane().setBackground(Color.BLACK);
    }
}
