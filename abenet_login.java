//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package abinet_managment;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class abenet_login extends JFrame {
    private JButton jbutton1;
    private JTextField name;
    private JLabel picture;
    private JPasswordField passwd;
    private JLabel Nname;
    private JLabel Ppasswd;
    private JLabel title1;
    private JLabel title2;

    public abenet_login() {
        super("SW-Hayl");
        JPanel first = new JPanel();
        first.setLayout((LayoutManager)null);
        first.setBorder(new LineBorder(Color.LIGHT_GRAY, 5));
        this.picture = new JLabel();
        this.picture.setIcon(new ImageIcon("//home//ermias//IdeaProjects//abinet_managment//src//abnet_13.jpg"));
        this.picture.setBounds(50, -40, 550, 200);
        first.add(this.picture);
        this.title2 = new JLabel("SW-hyl log main ");
        this.title2.setBounds(140, 95, 500, 50);
        first.add(this.title2);
        this.Nname = new JLabel(" name");
        this.Nname.setBounds(50, 130, 100, 50);
        first.add(this.Nname);
        this.name = new JTextField(12);
        this.name.setBounds(170, 145, 150, 20);
        first.add(this.name);
        this.Ppasswd = new JLabel(" password");
        this.Ppasswd.setBounds(50, 190, 150, 20);
        first.add(this.Ppasswd);
        this.passwd = new JPasswordField(10);
        this.passwd.setBounds(170, 190, 130, 20);
        first.add(this.passwd);
        this.jbutton1 = new JButton("login");
        this.jbutton1.setBounds(150, 250, 70, 20);
        this.jbutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String get_name = abenet_login.this.name.getText();
                String get_passwd = String.valueOf(abenet_login.this.passwd.getPassword());
                if (get_name.equals(jdbc.admin_name()) && get_passwd.equals(jdbc.admin_password())) {
                    abenet_login.this.setVisible(false);
                    admin_main_page.admin_main_page_();
                } else {
                    JOptionPane.showMessageDialog((Component)null, "please enter the correct user name and password");
                }

            }
        });
        first.add(this.jbutton1);
        first.setBackground(Color.black);
        this.add(first);




        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    public static void admin_login_page(){
        abenet_login main = new abenet_login();
        main.setSize(400, 400);
        main.getDefaultCloseOperation();
        main.setLocation(450, 100);
        main.setVisible(true);

    }

    public static void main(String[] args) {
        admin_login_page();
        Runtime rt = Runtime.getRuntime();

    }
}
