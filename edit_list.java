package abinet_managment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.JFileChooser;
import javax.swing.plaf.multi.MultiPanelUI;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import static abinet_managment.add_student.summit;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class edit_list extends JFrame {
    JLabel s_code = new JLabel("s_code");
    JLabel first_name = new JLabel("firs_name");
    JLabel last_name = new JLabel("last_name");
    JLabel age = new JLabel("age");
    JLabel sex = new JLabel("sex");
    static JLabel cell_phone = new JLabel("cell_phone");
    static JTextField s_code_t = new JTextField(10);
    static JTextField first_name_t = new JTextField(10);
    static JTextField last_name_t = new JTextField(10);
    static JTextField age_t = new JTextField(10);
    static JTextField sex_t = new JTextField(10);
    static JTextField cell_phone_t = new JTextField(10);
    JLabel address = new JLabel("address");
    JLabel wereda = new JLabel("wereda");
    JLabel kebele = new JLabel("kebele");
    JLabel home_no = new JLabel("home_no");
    static JTextField address_t = new JTextField();
    static JTextField wereda_t = new JTextField();
    static JTextField kebele_t = new JTextField();
    static JTextField home_t = new JTextField();
    JLabel kiristna_abat = new JLabel("kiristna_abat");
    JLabel kiristna_sm = new JLabel("kiristna_sm");
    static JTextField kiristna_abat_t = new JTextField();
    static JTextField kiristna_sm_t = new JTextField();
    static JLabel prifix = new JLabel("prefix");
    static JTextField prifix_t = new JTextField();
    JLabel yesera_huneta = new JLabel("yesra_huneta");
    JLabel yetemhert_dereja = new JLabel("yetemhert_dereja");
    JLabel ahun_yalubet = new JLabel("ahun_yalubet");
    static JTextField yesera_huneta_t = new JTextField();
    static JTextField yetemhert_dereja_t = new JTextField();
    static JTextField ahun_yalubet_t_t = new JTextField();
    static JButton summit = new JButton("summbit");
    public static String S_code_for_photo;

    public edit_list() {
        super("edit_list");
        Container main_container = new Container();
        main_container.setBackground(Color.WHITE);
        main_container.setLayout(new BorderLayout());
        JPanel left_conainer = new JPanel();
        left_conainer.setBackground(Color.WHITE);
        left_conainer.setLayout(new GridLayout(6, 4, 2, 80));
        left_conainer.setBorder(new LineBorder(Color.BLACK, 3));
        left_conainer.add(this.s_code);
        left_conainer.add(s_code_t);
        left_conainer.add(this.first_name);
        left_conainer.add(first_name_t);
        left_conainer.add(this.last_name);
        left_conainer.add(last_name_t);
        left_conainer.add(this.age);
        left_conainer.add(age_t);
        left_conainer.add(this.sex);
        left_conainer.add(sex_t);
        left_conainer.add(cell_phone);
        left_conainer.add(cell_phone_t);
        main_container.add(left_conainer, "West");
        this.add(main_container);
        JPanel right_container = new JPanel();
        right_container.setLayout(new GridLayout(5, 2, 1, 100));
        right_container.setBackground(Color.WHITE);
        right_container.setBorder(new LineBorder(Color.BLACK, 3));
        right_container.add(this.yesera_huneta);
        right_container.add(yesera_huneta_t);
        right_container.add(this.yetemhert_dereja);
        right_container.add(yetemhert_dereja_t);
        right_container.add(this.ahun_yalubet);
        right_container.add(ahun_yalubet_t_t);
        right_container.add(prifix);
        right_container.add(prifix_t);
        main_container.add(right_container, "East");
        this.add(main_container);
        Container center_Continer = new Container();
        center_Continer.setLayout(new BorderLayout());
        center_Continer.setBackground(Color.WHITE);
        JPanel center_north_continer = new JPanel();
        center_north_continer.setBackground(Color.WHITE);
        center_north_continer.setLayout(new GridLayout(4, 2, 2, 10));
        center_north_continer.setBorder(new LineBorder(Color.BLACK, 3));
        center_north_continer.add(this.address);
        center_north_continer.add(address_t);
        center_north_continer.add(this.wereda);
        center_north_continer.add(wereda_t);
        center_north_continer.add(this.kebele);
        center_north_continer.add(kebele_t);
        center_north_continer.add(this.home_no);
        center_north_continer.add(home_t);
        center_Continer.add(center_north_continer, "North");
        main_container.add(center_Continer);
        this.add(main_container);
        JPanel center_south_container = new JPanel();
        JButton photo = new JButton("photo");
        photo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {


                    add_student.add_photo();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        summit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {



                stud_potition_mysql_update();
                personal_status_mysql_update();
                career_status_mysql_update();
                chiristna_status_mysql_update();
                JOptionPane.showMessageDialog((Component) null, "sumbited successfully");
            }
        });


        center_south_container.setLayout(new GridLayout(3, 2, 50, 10));
        center_south_container.setBackground(Color.WHITE);
        center_south_container.setBorder(new LineBorder(Color.BLACK, 3));
        center_south_container.add(this.kiristna_abat);
        center_south_container.add(kiristna_abat_t);
        center_south_container.add(this.kiristna_sm);
        center_south_container.add(kiristna_sm_t);
        center_south_container.add(summit);
        center_south_container.add(photo);
        center_Continer.add(center_south_container, "South");
        main_container.add(center_Continer);
        this.add(main_container);
        JPanel center_center_container = new JPanel();
        center_center_container.setBorder(new LineBorder(Color.WHITE, 1));
        center_center_container.setBackground(Color.BLACK);
        JLabel center_image = new JLabel();
        center_image.setIcon(new ImageIcon("C:\\Users\\ermiii\\IdeaProjects\\abinet_managment\\src\\add_student_1.jpg"));
        center_center_container.add(center_image);
        center_Continer.add(center_center_container);
        main_container.add(center_Continer);
        this.add(main_container);
    }

    public static void personal_status_mysql_update() {
         int s_code_= Integer.parseInt(s_code_t.getText());
        String prifix_ = prifix_t.getText();
        String first_name_ = first_name_t.getText();
        String last_name_ = last_name_t.getText();
        int age_ = Integer.parseInt(age_t.getText());
        String sex_ = sex_t.getText();
        int cell_phone_ = Integer.parseInt(cell_phone_t.getText());
        String status = "active";

        try {
            String sql = "update  student set prifix='" + prifix_ + "',first_name='" + first_name_ + "',last_name='" + last_name_ + "',age=" + age_ + ",sex='" + sex_ + "',cell_phone=" + cell_phone_ + ",status='" + status + "' where s_code=" + s_code_;
            jdbc.connection();
            Statement personal = jdbc.connection();
            personal.executeUpdate(sql);
        } catch (Exception var10) {
            var10.getStackTrace();
        }

    }

    public static void career_status_mysql_update() {
        int s_code_ = Integer.parseInt(s_code_t.getText());
        String yesra_huneta_ = yesera_huneta_t.getText();
        String yetmhert_gereja_ = yetemhert_dereja_t.getText();
        String ahun_yalubet = ahun_yalubet_t_t.getText();
        Statement edu_status = jdbc.connection();

        try {
            String sql = "update  edu_postition set yesra_huneta='" + yesra_huneta_ + "', yetmhert_dereja='" + yetmhert_gereja_ + "',ahun_yalubet='" + ahun_yalubet + "' where  s_code=" + s_code_;
            jdbc.connection();
            edu_status.executeUpdate(sql);
        } catch (Exception var6) {
            var6.getStackTrace();
        }

    }

    public static void stud_potition_mysql_update() {
        String address_ = address_t.getText();
        int s_code_ = Integer.parseInt(s_code_t.getText());
        int wereda_ = Integer.parseInt(wereda_t.getText());
        int kebele_ = Integer.parseInt(kebele_t.getText());
        int home_no = Integer.parseInt(home_t.getText());
        Statement position = jdbc.connection();

        try {
            String sql = "update stud_postition set address='" + address_ + "',wereda=" + wereda_ + ",kebele=" + kebele_ + ",home_no=" + home_no + " where s_code=" + s_code_;
            jdbc.connection();
            position.executeUpdate(sql);
        } catch (Exception var7) {
            var7.getStackTrace();
        }

    }

    public static void chiristna_status_mysql_update() {
        int s_code_ = Integer.parseInt(s_code_t.getText());
        String chiristna_abat = kiristna_abat_t.getText();
        String chiristna_sm_ = kiristna_sm_t.getText();
        Statement chiristna = jdbc.connection();

        try {
            String sql = "update  krisnta_status set  kristna_abat='" + chiristna_abat + "', kristna_sm='" + chiristna_sm_ + "' where s_code=" + s_code_;
            jdbc.connection();
            chiristna.executeUpdate(sql);
        } catch (Exception var5) {
            var5.getStackTrace();
        }

    }





    public static void personal_status_mysql_adder() {
        int  s_code_ = Integer.parseInt(s_code_t.getText());
        String prifix_ = prifix_t.getText();
        String first_name_ = first_name_t.getText();
        String last_name_ = last_name_t.getText();
        int age_ = Integer.parseInt(age_t.getText());
        String sex_ = sex_t.getText();
        int cell_phone_ = Integer.parseInt(cell_phone_t.getText());
        String status = "active";

        try {
            String sql = "insert into student values(" + s_code_ + ",'" + prifix_ + "','" + first_name_ + "','" + last_name_ + "'," + age_ + ",'" + sex_ + "'," + cell_phone_ + ",'" + status + "')";
            jdbc.connection();
            Statement personal = jdbc.connection();
            personal.executeUpdate(sql);
        } catch (Exception var10) {
            var10.getStackTrace();
        }

    }

    public static void career_status_mysql_adder() {
        int s_code_ = Integer.parseInt(s_code_t.getText());
        String yesra_huneta_ = yesera_huneta_t.getText();
        String yetmhert_gereja_ = yetemhert_dereja_t.getText();
        String ahun_yalubet_ = ahun_yalubet_t_t.getText();
        System.out.println(s_code_);
        Statement edu_status = jdbc.connection();


        try {
            String sql = "insert into edu_postition values(" + s_code_ + ",'" + yesra_huneta_ + "','" + yetmhert_gereja_ + "','" + ahun_yalubet_ + "')";
            jdbc.connection();
            edu_status.executeUpdate(sql);
        } catch (Exception var6) {
            var6.getStackTrace();
        }

    }

    public static void stud_potition_mysql_adder() {
        String address_ = address_t.getText();
        int s_code_ = Integer.parseInt(s_code_t.getText());
        int wereda_ = Integer.parseInt(wereda_t.getText());
        int kebele_ = Integer.parseInt(kebele_t.getText());
        int home_no = Integer.parseInt(home_t.getText());
        Statement position = jdbc.connection();

        try {
            String sql = "insert into  stud_postition values(" + s_code_ + ",'" + address_ + "'," + wereda_ + "," + kebele_ + "," + home_no + ")";
            jdbc.connection();
            position.executeUpdate(sql);
        } catch (Exception var7) {
            var7.getStackTrace();
        }

    }

    public static void chiristna_status_mysql_adder() {
        String chiristna_abat = kiristna_abat_t.getText();
        int s_code_ = Integer.parseInt(s_code_t.getText());
        String chiristna_sm_ = kiristna_sm_t.getText();
        Statement chiristna = jdbc.connection();

        try {
            String sql = "insert into krisnta_status values(" + s_code_ + ",'" + chiristna_abat + "','" + chiristna_sm_ + "')";
            jdbc.connection();
            chiristna.executeUpdate(sql);
        } catch (Exception var5) {
            var5.getStackTrace();
        }

    }

    public static void add_stud_viwer() {
        edit_list viwer = new edit_list();
        viwer.setVisible(true);
        viwer.setSize(800, 600);
        viwer.setLocation(150, 50);
        viwer.getContentPane().setBackground(Color.BLACK);
    }
    public static void main(String[] args){
        add_stud_viwer();
    }

    /*public static void undo() {
        int s_code_ = Integer.parseInt(s_code_t.getText());
        Statement undo = jdbc.connection();

        try {
            String sql = "delete from student where s_code=" + s_code_ + ",";
            jdbc.connection();
            undo.executeUpdate(sql);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }*/


    public static void add_photo() throws IOException {

        JButton open= new JButton();
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("C:\\Users"));
        fc.setDialogTitle("add photo");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        if(fc.showOpenDialog(open)==JFileChooser.APPROVE_OPTION){
            S_code_for_photo= (s_code_t.getText());
            String str= fc.getSelectedFile().getAbsolutePath();
            System.out.println(str);
            FileInputStream in= new FileInputStream(str);
            String outt="C:\\Users\\ermiii\\IdeaProjects\\abinet_managment\\src\\stud_photo\\";
            FileOutputStream out= new FileOutputStream(outt+ S_code_for_photo+".jpg" );
            BufferedInputStream bin=new BufferedInputStream(in);
            BufferedOutputStream bout= new BufferedOutputStream(out);
            int b = 0;
            while(b!=-1){
                b=bin.read();
                bout.write(b);

            }
            bin.close();
            bout.close();


        }

    }






}













