//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package abinet_managment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import static abinet_managment.admin_main_page.out_page;

public class second_level_edit extends JFrame {

    JLabel yebego_temari = new JLabel("yebego temari");
    JLabel s_code_1_l= new JLabel("s_code");
    JTextField s_code_1 = new JTextField(10);
    JButton yebego_button= new JButton("submit");
    JTextField yebego_text= new JTextField(10);

    JLabel ken_astemari = new JLabel("ken temari");
    JTextField ken_astemari_txt= new JTextField(10);
    JLabel s_code_2_l= new JLabel("s_code");
    JTextField s_code_2 = new JTextField(10);
    JButton ken_button= new JButton("submit");

    JLabel s_code_3_l= new JLabel("s_code");
    JTextField s_code_3 = new JTextField(10);
    JLabel mata_astmari= new JLabel("mata astermari");
    JTextField mata_ast_txt= new JTextField(10);
    JButton mata_button = new JButton("submit_3");




    second_level_edit() {
        Container main_container = new Container();
        main_container.setLayout(new BorderLayout());
        JPanel left_continer = new JPanel();
        left_continer.setBorder(new LineBorder(Color.black, 4));
        left_continer.setLayout(new FlowLayout());


        left_continer.add(s_code_1_l);
        left_continer.add( s_code_1);
        left_continer.add(yebego_temari);
        left_continer.add(yebego_text);
        left_continer.add(yebego_button);
        yebego_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yebego_mysql_adder();
            }
        });


        main_container.add(left_continer, "North");
        add(main_container);
        JPanel right_continer = new JPanel();
        right_continer.setBorder(new LineBorder(Color.black, 4));
        right_continer.setLayout(new FlowLayout());

        right_continer.add(s_code_2_l);
        right_continer.add(s_code_2);
        right_continer.add(ken_astemari);
         right_continer.add(ken_astemari_txt);
         right_continer.add(ken_button);
         ken_button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 ken_astemari_mysql_adder();

             }
         });


        main_container.add(right_continer);
        add(main_container);
        JPanel middle = new JPanel();
        middle.setBorder(new LineBorder(Color.black, 4));
        middle.setLayout(new FlowLayout());
        middle.add(s_code_3_l);
        middle.add(s_code_3);
        middle.add(mata_astmari);
        middle.add(mata_ast_txt);
        middle.add(mata_button);
        mata_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mata_astemari_mysql_adder();


            }
        });


        main_container.add(middle, "East" );
        this.add(main_container);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    public void mata_astemari_mysql_adder(){
        int  s_codee = Integer.parseInt(s_code_3.getText());
        String mata_ast_value=(mata_ast_txt.getText());
        String zero="0";
        jdbc.connection();
        Statement mata_astemari = jdbc.connection();
        try {
            if(mata_ast_value.equals("1")){
                String sql = "insert into ken_mata_ast values(" + s_codee + ",'" +zero + "','" +  mata_ast_value+ "')";
                mata_astemari.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"added successfully");}
            else{
                JOptionPane.showMessageDialog(null,"please enter correct  number");}

            } catch (SQLException ex) {
            ex.printStackTrace();
        }
        JScrollPane scroll= new JScrollPane(out_page);



    }
    public static DefaultTableModel mata_ast_table_provider() {
      DefaultTableModel  mata_ast = new DefaultTableModel();
        mata_ast.addColumn("s_code");
        mata_ast.addColumn("prifix");
        mata_ast.addColumn("first name");
        mata_ast.addColumn("last name");


        return mata_ast;

    }
    public static void mata_astemari_viweri() {
        DefaultTableModel mata_ast =mata_ast_table_provider();

        try {
            jdbc.connection();
            String sql = "select student.s_code , student.prifix,student.first_name, student.last_name, ken_mata_ast.mata_astemari from student join  ken_mata_ast on student.s_code=ken_mata_ast.scode where ken__astemari='1'; ";
            ResultSet ken_tm = jdbc.connection().executeQuery(sql);
            out_page.setModel(mata_ast);

            while(ken_tm.next()){
                mata_ast.addRow(new Object[]{ken_tm.getString(1), ken_tm.getString(2), ken_tm.getString(3), ken_tm.getString(4)});


            }
        } catch (Exception var3) {
            var3.getStackTrace();

        }
        out_page.setModel(mata_ast);
    }
    public void ken_astemari_mysql_adder(){
        int  s_codee = Integer.parseInt(s_code_2.getText());
        String ken_ast_value=(ken_astemari_txt.getText());
        String zero="0";
        jdbc.connection();
        Statement mata_astemari = jdbc.connection();
        try {
            if(ken_ast_value.equals("1")){
                String sql = "insert into ken_mata_ast values(" + s_codee + ",'" +  ken_ast_value + "','" +zero+ "')";
                mata_astemari.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"added successfully");}
            else{
                JOptionPane.showMessageDialog(null,"please enter correct  number");}

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        JScrollPane scroll= new JScrollPane(out_page);




    }
    public static DefaultTableModel ken_ast_table_provider() {
        DefaultTableModel  mata_ast = new DefaultTableModel();
        mata_ast.addColumn("s_code");
        mata_ast.addColumn("prifix");
        mata_ast.addColumn("first name");
        mata_ast.addColumn("last name");


        return mata_ast;

    }
    public static void ken_astemari_viweri() {
        DefaultTableModel mata_ast =mata_ast_table_provider();

        try {
            jdbc.connection();
            String sql = "select student.s_code , student.prifix,student.first_name, student.last_name, ken_mata_ast.mata_astemari from student join  ken_mata_ast on student.s_code=ken_mata_ast.scode where ken_astemari='1'; ";
            ResultSet ken_tm = jdbc.connection().executeQuery(sql);
            out_page.setModel(mata_ast);

            while(ken_tm.next()){
                mata_ast.addRow(new Object[]{ken_tm.getString(1), ken_tm.getString(2), ken_tm.getString(3), ken_tm.getString(4)});


            }
        } catch (Exception var3) {
            var3.getStackTrace();

        }
        out_page.setModel(mata_ast);
    }
    public static DefaultTableModel yebego_temari_table_provider(){
        DefaultTableModel yebego_temari_table= new DefaultTableModel();
        yebego_temari_table.addColumn("s_code");
        yebego_temari_table.addColumn("first name");
        yebego_temari_table.addColumn("last name");
        return yebego_temari_table;

    }
    public static void yebego_temari(){
        DefaultTableModel yebego_temari_table= yebego_temari_table_provider();
        try {
            jdbc.connection();
            String sql = "select student.s_code ,student.first_name, student.last_name,yebego_temari.yebego_temari from student join yebego_temari on student.s_code=yebego_temari.scode; ";
            ResultSet yebego = jdbc.connection().executeQuery(sql);

            while(yebego.next()){
                yebego_temari_table.addRow(new Object[]{yebego.getString(1), yebego.getString(2), yebego.getString(3)});


            }
        } catch (Exception var3) {
            var3.getStackTrace();

        }
        out_page.setModel(yebego_temari_table);

    }
    public void yebego_mysql_adder(){
        int  s_codee = Integer.parseInt(s_code_1.getText());
        String yebego_temari_value=(yebego_text.getText());

        jdbc.connection();
        Statement yebego_temarii = jdbc.connection();
        try {
            if(yebego_temari_value.equals("1")){
                String sql = "insert into yebego_temari values(" + s_codee + ",'" +  yebego_temari_value +  "')";
                yebego_temarii.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"added successfully");}
            else{
                JOptionPane.showMessageDialog(null,"please enter correct  number");}

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        JScrollPane scroll= new JScrollPane(out_page);




    }

    public static void main(String[] args) {
        second_level_edit_viewer();
    }





    public static void second_level_edit_viewer() {
        second_level_edit viwer = new second_level_edit();
        viwer.setVisible(true);
        viwer.setSize(1000, 400);
        viwer.setLocation(150, 200);
    }



}
