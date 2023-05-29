package geometri;
import java.sql.*;

public class Connector {
    String DBurl="jdbc:mysql://localhost/geometri";
    String DBusername="root";
    String DBpassword="";
    Connection con;
    Statement stt;
    
    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(DBurl, DBusername, DBpassword);
        } catch (Exception e) {
            System.out.println("Connection Failed ! "+ e);
        }
    }
    
//    void inputLingkaran(double r, double d, double l, double k){
//        try {
//            String query = "INSERT INTO `lingkaran` VALUES ('"+r+"','"+d+"','"+l+"','"+k+"')";
//            stt=con.createStatement();
//            stt.executeUpdate(query);
//        } catch (Exception e) {
//            System.out.println("Input Failed ! " + e);
//        }
//    }
    
    void inputTabung(double r, double t, double l, double v){
        try {
            String query = "INSERT INTO `tabung` VALUES ('"+r+"','"+t+"','"+l+"','"+v+"')";
            stt=con.createStatement();
            stt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Input Failed ! " + e);
        }
    }
    
    void inputKerucut(double r, double t, double l, double v){
        try {
            String query = "INSERT INTO `kerucut` VALUES ('"+r+"','"+t+"','"+l+"','"+v+"')";
            stt=con.createStatement();
            stt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Input Failed ! " + e);
        }
    }
    
    void inputBola(double r, double l, double v){
        try {
            String query = "INSERT INTO `bola` VALUES ('"+r+"','"+l+"','"+v+"')";
            stt=con.createStatement();
            stt.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Input Failed ! " + e);
        }
    }
}