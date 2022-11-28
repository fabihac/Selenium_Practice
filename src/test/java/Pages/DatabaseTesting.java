package Pages;
import java.sql.*;

public class DatabaseTesting {
    public static void main(String [] args) throws SQLException {

        try {
            //create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://n.trucklagbe.com:3306/trucklagbe_db", "tl-g-developer", "G33p33a55_dataChai");
            Statement sm = con.createStatement();
            //String s ="SELECT * FROM trucklagbe_db.whitelisted_user where whitelisted_user_id =68;";
            ResultSet resultSet =
                    sm.executeQuery("SELECT * FROM trucklagbe_db.whitelisted_user where whitelisted_user_id =68;");
            //con.close();

            //System.out.println("Executed");
            System.out.println("Executed" + resultSet.getString("whitelisted_user_id"));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
////maintaining and managing different page concept pom

