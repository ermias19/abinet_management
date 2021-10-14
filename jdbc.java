//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package abinet_managment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class jdbc {
    public static Connection create_con;
    static ResultSet stud_res;
    public static Statement create_stat;
    static ResultSet stud_list;
    private static ResultSet rs;
    private static int signID;
    private static String admin_name;
    private static String admin_passwd;
    public static final String dbUrl = "jdbc:mysql://localhost:3306/abinet_managment";
    public static final String dbUserName = "root";
    public static final String dbPassword = "demed055";

    public jdbc() {
    }

    public static Statement connection() {
        try {
            create_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abinet_managment", "root", "");
            create_stat = create_con.createStatement();

        } catch (SQLException var1) {
            var1.getStackTrace();
        }

        return create_stat;
    }

    public static String admin_name() {
        try {
            connection();
            String sql = "select* from admin_login";

            for(ResultSet Ab_re_1 = connection().executeQuery(sql); Ab_re_1.next(); admin_passwd = Ab_re_1.getString("admin_passwd")) {
                admin_name = Ab_re_1.getString("admin_name");
            }
        } catch (Exception var2) {
            var2.getStackTrace();
        }

        return admin_name;
    }

    public static String admin_password() {
        return admin_passwd;
    }

    public static void change_n_p(String c_name, String c_passwd) {
        try {
            connection();
            String sql = "update admin_login set admin_name='" + c_name + "'";
            String sql2 = "update admin_login set admin_passwd='" + c_passwd + "'";
            create_stat.executeUpdate(sql);
            create_stat.executeUpdate(sql2);
        } catch (Exception var4) {
            var4.getStackTrace();
        }

    }

    public static void edu_status() {
        DefaultTableModel edu = new DefaultTableModel();
        edu.addColumn("s_code");
        edu.addColumn("first name");
        edu.addColumn("last name");
        edu.addColumn("yesra_huneta");
        edu.addColumn("yetmhert_dereja");
        edu.addColumn("yalubet_dereja(tmhert,sera)");

        try {
            String sql = "select student.s_code, student.first_name, student.last_name, edu_postition.yesra_huneta, edu_postition.yetmhert_dereja, edu_postition.ahun_yalubet from student join edu_postition on student.s_code=edu_postition.s_code";
            connection();
            ResultSet rs_esu = connection().executeQuery(sql);

            while(rs_esu.next()) {
                edu.addRow(new Object[]{rs_esu.getString(1), rs_esu.getString(2), rs_esu.getString(3), rs_esu.getString(4), rs_esu.getString(5), rs_esu.getString(6)});
            }

            admin_main_page.out_page.setModel(edu);
        } catch (Exception var3) {
            var3.getStackTrace();
        }

    }

    public static void D_N() {
        DefaultTableModel dn = new DefaultTableModel();
        dn.addColumn("s_code");
        dn.addColumn("prifix");
        dn.addColumn("first_name");
        dn.addColumn("last_name");
        dn.addColumn("cell_phone");

        try {
            String sql = "select* from student where prifix='D/N' or prifix='dn' or prifix='d/n'or prifix='DN'";
            connection();
            ResultSet D_N = connection().executeQuery(sql);

            while(D_N.next()) {
                dn.addRow(new Object[]{D_N.getString(1), D_N.getString(2), D_N.getString(3), D_N.getString(4), D_N.getString(7)});
            }

            admin_main_page.out_page.setModel(dn);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void meto_mayak() {
        DefaultTableModel meto_mayak = new DefaultTableModel();
        meto_mayak.addColumn("s_code");
        meto_mayak.addColumn("prifix");
        meto_mayak.addColumn("first_name");
        meto_mayak.addColumn("last_name");

        try {
            String sql = "select* from student where status='inactive'";
            connection();
            ResultSet Meto_mayak = connection().executeQuery(sql);

            while(Meto_mayak.next()) {
                meto_mayak.addRow(new Object[]{Meto_mayak.getString(1), Meto_mayak.getString(2), Meto_mayak.getString(3), Meto_mayak.getString(4)});
            }

            admin_main_page.out_page.setModel(meto_mayak);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void mata_telot() {
        DefaultTableModel mata_telot_table = new DefaultTableModel();
        mata_telot_table.addColumn("s_code");
        mata_telot_table.addColumn("prifix");
        mata_telot_table.addColumn("first_name");
        mata_telot_table.addColumn("last_name");
        mata_telot_table.addColumn("**Date**");

        try {
            String sql = "select student.s_code, student.prifix, student.first_name, student.last_name, mata_telot.date form student left outer join mata_telot on student.s_code= mata_telot.s_code";
            connection();
            ResultSet mata_telot_report = connection().executeQuery(sql);

            while(mata_telot_report.next()) {
                mata_telot_table.addRow(new Object[]{mata_telot_report.getString(1), mata_telot_report.getString(2), mata_telot_report.getString(3), mata_telot_report.getString(4), mata_telot_report.getString(5)});
            }

            admin_main_page.out_page.setModel(mata_telot_table);
        } catch (Exception var3) {
            var3.getStackTrace();
        }

    }

    public static void main(String[] args) {


    }
}
