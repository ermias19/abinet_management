//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package abinet_managment;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import static abinet_managment.search_plate.search_stud_list;
import static abinet_managment.search_plate.*;
import static abinet_managment.second_level_edit.*;


public class admin_main_page extends JFrame {
    static JTable out_page = new JTable();
    static JTextField change_name;
    static JPasswordField change_passwd;
    static JFrame change_passwd_name;
    static JButton change_button;
    static JLabel photo_ = new JLabel();
    static int s_code_finder;

    public admin_main_page() {
        super("admin_main_page");
        Container first_cointainer = new Container();
        first_cointainer.setLayout(new BorderLayout(10, 6));
        JPanel top_panel = new JPanel();
        JTextField search_stud_id= new JTextField(10);

        JButton serch_button= new JButton();
        serch_button.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//Search-Button.png"));

        JLabel main_pic = new JLabel();
        main_pic.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//main_pic_up.png"));
        top_panel.setBackground(Color.black);
        top_panel.setBorder(new LineBorder(Color.BLACK, 5));
        top_panel.setLayout(new FlowLayout());
        top_panel.add(photo_, "West");
        top_panel.add(search_stud_id);
        top_panel.add(serch_button);
        top_panel.add(main_pic, "East");
        first_cointainer.add(top_panel, "North");
        this.add(first_cointainer);
        JPanel left_panel = new JPanel();
        left_panel.setLayout(new GridLayout(5, 5, 7, 3));
        left_panel.setBorder(new LineBorder(Color.BLACK, 5));
        left_panel.setBackground(Color.black);
        JButton jButton_1 = new JButton("wetani-list");
        jButton_1.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                stud_list();
            }
        });
        JButton jButton_2 = new JButton("mehak-list");
        jButton_2.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                admin_main_page.mehaklawyan();
            }
        });
        JButton jButton_3 = new JButton("wetat-list");
        jButton_3.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                admin_main_page.wetat_kfl();
            }
        });
        JButton jButton_4 = new JButton("asku_wetani");
        jButton_4.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
//                jdbc.edu_status();
            }
        });
        JButton jButton_5 = new JButton("asku_mehaklawyan");
        jButton_5.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                admin_main_page.christna_status();
            }
        });
        JButton jButton_6 = new JButton("asku_wetat");
        jButton_6.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                admin_main_page.stud_address();
            }
        });
        JButton jButton_7 = new JButton("SW hayl");
        jButton_7.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jdbc.D_N();
            }
        });
        JButton jButton_8 = new JButton("hetanat kfl");
        jButton_8.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                mata_telot_attendance.mata_telot();
            }
        });
        JButton jButton_9 = new JButton("tmhert kfl");
        jButton_9.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ken_astemari_viweri();
            }
        });
        JButton jButton_10 = new JButton("nebret kfl");
        jButton_10.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mata_astemari_viweri();
            }
        });
        JButton jButton_11 = new JButton("zgjt kfl");

        jButton_11.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                edit_list.add_stud_viwer();
            }
        });
        JButton jButton_12 = new JButton("hetmet");
        jButton_12.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                admin_main_page.yeneta_list();
            }
        });
        JButton jButton_13 = new JButton("");
        jButton_13.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                attendance.attendance_viwer();
            }
        });
        JButton jButton_14 = new JButton("meto mayak");
        jButton_14.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jdbc.meto_mayak();
            }
        });
        JButton jButton_15 = new JButton("DEMOZ list");
        jButton_15.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        JButton jButton_16 = new JButton("2nd level edit");
        jButton_16.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                second_level_edit.second_level_edit_viewer();
            }
        });
        JButton jButton_17 = new JButton(" ye_bego_temari ");
        jButton_17.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yebego_temari();
            }
        });
        JButton jButton_18 = new JButton("  passwd keyr");
        jButton_18.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvenddt) {
                admin_main_page.change_n_passwd();
            }
        });
        JButton jButton_19 = new JButton(" temari chmir");
        jButton_19.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                add_student.add_stud_viwer();
            }
        });
        JButton jButton_20 = new JButton("temari bzat");
        jButton_20.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"));
        jButton_20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog((Component)null, "**ye temari bezat**=");
            }
        });
        serch_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s_code_finder= Integer.parseInt(search_stud_id.getText());

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new search_plate().setVisible(true);
                        stud_search_photo();
                        search_stud_list();
                        stud_position();
                        edu_position();
                        kristna_status();

                    }
                });

            }
        });
        left_panel.add(jButton_1);
        left_panel.add(jButton_2);
        left_panel.add(jButton_3);
        left_panel.add(jButton_4);
        left_panel.add(jButton_5);
        left_panel.add(jButton_6);
        left_panel.add(jButton_7);
        left_panel.add(jButton_8);
        left_panel.add(jButton_9);
        left_panel.add(jButton_10);
        left_panel.add(jButton_11);
        left_panel.add(jButton_12);
        left_panel.add(jButton_13);
        left_panel.add(jButton_14);
        left_panel.add(jButton_15);
        left_panel.add(jButton_16);
        left_panel.add(jButton_17);
        left_panel.add(jButton_18);
        left_panel.add(jButton_19);
        left_panel.add(jButton_20);
        JScrollPane page = new JScrollPane(out_page);
        page.setBorder(new LineBorder(Color.BLACK, 5));
        out_page.setPreferredScrollableViewportSize(new Dimension(450, 100));
        out_page.setFillsViewportHeight(true);
        first_cointainer.add(page);
        first_cointainer.add(left_panel, "West");
        this.add(first_cointainer);
    }

    public static void yeneta_list() {
        DefaultTableModel yeneta = new DefaultTableModel();
        yeneta.addColumn("yeneta_code");
        yeneta.addColumn("prifix");
        yeneta.addColumn("first_name");
        yeneta.addColumn("last_name");
        yeneta.addColumn("miyastemrut");

        try {
            String sql = "select* from yeneta_list";
            ResultSet yeneta_lst = jdbc.connection().executeQuery(sql);
            jdbc.connection();

            while(yeneta_lst.next()) {
                yeneta.addRow(new Object[]{yeneta_lst.getString(1), yeneta_lst.getString(2), yeneta_lst.getString(3), yeneta_lst.getString(4), yeneta_lst.getString(5)});
            }

            out_page.setModel(yeneta);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void change_n_passwd() {
        change_passwd_name = new JFrame();
        change_passwd_name.setLayout(new FlowLayout());
        change_name = new JTextField("name", 10);
        change_passwd = new JPasswordField("password", 10);
        change_button = new JButton("chnage");
        change_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String c_namee = admin_main_page.change_name.getText();
                String c_passwdd = String.valueOf(admin_main_page.change_passwd.getPassword());
                jdbc.change_n_p(c_namee, c_passwdd);
                System.out.println(c_passwdd);
                JOptionPane.showMessageDialog((Component)null, "your user name and  password changed succsefully!");
            }
        });
        change_passwd_name.setSize(200, 200);
        change_passwd_name.add(change_name);
        change_passwd_name.add(change_passwd);
        change_passwd_name.add(change_button);
        change_passwd_name.setVisible(true);
        change_passwd_name.setLocation(600, 200);
        change_passwd_name.getContentPane().setBackground(Color.black);
    }

    public static DefaultTableModel wetani_table_provider() {
        DefaultTableModel table_1 = new DefaultTableModel();
        table_1.addColumn("wetani_id");
        table_1.addColumn("wetani_picture");
        table_1.addColumn("first_name");
        table_1.addColumn("last_name");
        table_1.addColumn("age");
        table_1.addColumn("sex");



        return table_1;
    }

    public static void stud_list() {

        DefaultTableModel stud_lst = wetani_table_provider();
        int stud_counter = 0;
        int s_code_pic=0;


        try {
            jdbc.connection();
            String sql = "select* from wetani ";
            ResultSet rs_1 = jdbc.connection().executeQuery(sql);



            while(rs_1.next()) {
                JLabel stud_image= new JLabel();
                ++stud_counter;
                s_code_pic+=1;
                //home//ermias//IdeaProjects//abinet_managment//src//ermi_2.jpg"
                String pic_dir = "/home/ermias/IdeaProjects/abinet_managment/src/stud_photo/" +s_code_pic  + ".jpg";
                ImageIcon photo_1= new ImageIcon(pic_dir);

                Image final_photo=photo_1.getImage().getScaledInstance(150,80,Image.SCALE_SMOOTH);
                stud_image.setIcon( new ImageIcon(final_photo));

                stud_lst.addRow(new Object[]{rs_1.getString(1),stud_image, rs_1.getString(2), rs_1.getString(3), rs_1.getString(4), rs_1.getString(5)});

                System.out.println(pic_dir);
                out_page.setModel(stud_lst);
                out_page.getColumn("wetani_picture").setCellRenderer(new CellRenderer());

            }



        } catch (SQLException var4) {
            var4.getSQLState();
        }



    }
    static class CellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                                                       Object value,
                                                       boolean isSelected,
                                                       boolean hasFocus,
                                                       int row,
                                                       int column) {

            TableColumn tb = out_page.getColumn("wetani_picture");
            tb.setMaxWidth(130);
            tb.setMinWidth(130);

            out_page.setRowHeight(80);

            return (Component) value;
        }

    }

    public static void mehaklawyan() {
        DefaultTableModel ken_t = wetani_table_provider();

        try {
            jdbc.connection();
            String sql = "select* from mehak ";
            ResultSet ken_tm = jdbc.connection().executeQuery(sql);

            while(ken_tm.next()) {
                ken_t.addRow(new Object[]{ken_tm.getString(1),"for stud_list", ken_tm.getString(2), ken_tm.getString(3), ken_tm.getString(4), ken_tm.getString(5)});
                out_page.setModel(ken_t);
            }
        } catch (Exception var3) {
            var3.getStackTrace();
        }

    }

    public static void wetat_kfl() {
        DefaultTableModel mata_st = wetani_table_provider();

        try {
            jdbc.connection();
            String sql = "select* from wetat ";
            ResultSet rs_mata = jdbc.connection().executeQuery(sql);
            new JRadioButton();

            while(rs_mata.next()) {
                mata_st.addRow(new Object[]{rs_mata.getString(1), rs_mata.getString(2), rs_mata.getString(3), rs_mata.getString(4), rs_mata.getString(5)});
            }

            out_page.setModel(mata_st);
        } catch (Exception var4) {
            var4.getStackTrace();
        }

    }

    public static void christna_status() {
        DefaultTableModel christna_table = new DefaultTableModel();

        try {
            String sql = "select student.s_code,student.first_name,student.last_name, krisnta_status.kristna_abat, krisnta_status.kristna_sm from student join krisnta_status on student.s_code= krisnta_status.s_code";
            jdbc.connection();
            ResultSet christna = jdbc.connection().executeQuery(sql);
            christna_table.addColumn("s_code");
            christna_table.addColumn("first name");
            christna_table.addColumn("last name");
            christna_table.addColumn("  ");
            christna_table.addColumn("christna sm");

            while(christna.next()) {
                christna_table.addRow(new Object[]{christna.getString(1), christna.getString(2), christna.getString(3), christna.getString(4), christna.getString(5)});
            }

            out_page.setModel(christna_table);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void stud_address() {
        DefaultTableModel stud_address = new DefaultTableModel();
        stud_address.addColumn("s_code");
        stud_address.addColumn("first_name");
        stud_address.addColumn("last_name");
        stud_address.addColumn("address");
        stud_address.addColumn("wereda");
        stud_address.addColumn("kebeke");
        stud_address.addColumn("home_no");

        try {
            String sql = "select student.s_code ,student.first_name,student.last_name, stud_postition.address,stud_postition.wereda,stud_postition.kebele, stud_postition.home_no from student join stud_postition on student.s_code= stud_postition.s_code";
            jdbc.connection();
            ResultSet stud_position = jdbc.connection().executeQuery(sql);

            while(stud_position.next()) {

                stud_address.addRow(new Object[]{stud_position.getString(1), stud_position.getString(2), stud_position.getString(3), stud_position.getString(4), stud_position.getString(5), stud_position.getString(6), stud_position.getString(7)});
            }

            out_page.setModel(stud_address);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }
    public static int student_counter() {
        int s_counter=0;

        try {
            jdbc.connection();
            String sql = "select* from edu_postition ";
            ResultSet ken_tm = jdbc.connection().executeQuery(sql);

            while(ken_tm.next()) {
                s_counter+=1;


            }
        } catch (Exception var3) {
            var3.getStackTrace();
        }
        return s_counter;

    }





    public static void admin_main_page_() {
        admin_main_page main = new admin_main_page();
        main.setSize(2080, 740);
        main.getDefaultCloseOperation();
        main.setVisible(true);
        Runtime rt=Runtime.getRuntime();
        try{
            rt.exec("abinet_managment_tool.exe");
        }
        catch (Exception e){
            System.out.println("error has occured");

        }
    }

    public static void main(String[] args) {
        admin_main_page_();
    }
}
