package abinet_managment;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class search_stud_list extends JFrame {
    static JLabel label_1= new JLabel("");static JLabel label_6= new JLabel();static JLabel label_12= new JLabel();
    static JLabel label_2= new JLabel();static JLabel label_7= new JLabel();static JLabel label_13= new JLabel();
    static JLabel label_3= new JLabel();static JLabel label_8= new JLabel();static JLabel label_14= new JLabel();
    static JLabel label_4= new JLabel();static JLabel label_9= new JLabel();static JLabel label_15= new JLabel();
    static JLabel label_5= new JLabel();static JLabel label_11= new JLabel();static JLabel label_16= new JLabel();
    static JLabel label_18= new JLabel();static JLabel label_10= new JLabel();static JLabel label_17= new JLabel();
    JButton button= new JButton("generator");

    public  search_stud_list(){
        Container main_container= new Container();
        main_container.setLayout(new BorderLayout(1,1));
        JPanel photo_label= new JPanel();

        label_18= new JLabel();
        String pic_dir = "C:\\Users\\ermiii\\IdeaProjects\\abinet_managment\\src\\stud_photo\\" + 1 + ".jpg";

        ImageIcon photo_1= new ImageIcon(pic_dir);
        System.out.println(pic_dir);
        Image final_photo=photo_1.getImage().getScaledInstance(150,80,Image.SCALE_SMOOTH);
        label_18.setIcon( new ImageIcon(final_photo));
        photo_label.add(label_18);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                search_stud_list();
//            }
//        });
        photo_label.add(button);
        main_container.add(photo_label,BorderLayout.NORTH);
        add(main_container);





        JPanel lable_container= new JPanel();
        lable_container.setLayout(new FlowLayout());
        lable_container.setBorder(new LineBorder(Color.BLACK,12,true));
        lable_container.add(label_1);lable_container.add(label_9);lable_container.add(label_17);
        lable_container.add(label_2);lable_container.add(label_10);
        lable_container.add(label_3);lable_container.add(label_11);
        lable_container.add(label_4);lable_container.add(label_12);
        lable_container.add(label_5);lable_container.add(label_13);
        lable_container.add(label_6);lable_container.add(label_14);
        lable_container.add(label_7);lable_container.add(label_15);
        lable_container.add(label_8);lable_container.add(label_16);
        label_1.setText("ermkmcdklmfkias");


        main_container.add(lable_container,BorderLayout.CENTER);
        add(main_container);


    }
    public static void search_stud_list_maker(){
        stud_position();
        search_stud_list  main = new search_stud_list();
        main.setSize(2080, 740);
        main.getDefaultCloseOperation();
        main.setVisible(true);
        search_stud_list();

    }

    /**
     *
     */
    public static void search_stud_list() {
        try {

            jdbc.connection();
            String sql = "select* from student where s_code="+ 1 + "";
            ResultSet rs_1 = jdbc.connection().executeQuery(sql);

            while(rs_1.next()){

                label_2.setText(rs_1.getString(1));

                label_16.setText(rs_1.getString(2));

                label_3.setText(rs_1.getString(3));

                label_4.setText(rs_1.getString(4));

                label_5.setText(rs_1.getString(5));
                label_6.setText(rs_1.getString(6));
                label_7.setText(rs_1.getString(7));



            }






        } catch (SQLException var4) {
            var4.getSQLState();
        }

    }
    public static void stud_position() {
        try {

            jdbc.connection();
            String sql = "select* from stud_postition where s_code="+ 1 + "        ";
            ResultSet rs_1 = jdbc.connection().executeQuery(sql);

            while(rs_1.next()){

                label_8.setText(rs_1.getString(2));

                label_9.setText(rs_1.getString(3));

                label_10.setText(rs_1.getString(4));

                label_11.setText(rs_1.getString(5));





            }






        } catch (SQLException var4) {
            var4.getSQLState();
        }

    }
    public static void main(String[] arg){

        search_stud_list_maker();
    }






}
