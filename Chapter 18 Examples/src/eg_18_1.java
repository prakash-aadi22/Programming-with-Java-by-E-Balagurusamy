import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class eg_18_1 {
    static final String JDBC_driver = "com.mysql.jdbc.Driver";
    static final String db_url = "jdbc:mysql://localhost/EMP";
    static final String user = "username";
    static final String password = "password";

    public static void main(String[] argv) {
        Connection conn;
        Statement stmt;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Generating Connection....");
            conn = DriverManager.getConnection(db_url, user, password);
            System.out.println("Creating Statement....");
            stmt = conn.createStatement();
            String sql_stmt;
            sql_stmt = "SELECT E_ID, E_Name from EMP";
            ResultSet res = stmt.executeQuery(sql_stmt);
            while (res.next()) {
                String e_id = res.getString("E_ID");
                String e_name = res.getString("E_Name");
                System.out.print("Emp-ID: " + e_id);
                System.out.print(", Emp-Name: " + e_name);
            }
            res.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
//        finally {
//            res.close();
//            stmt.close();
//            conn.close();
//        }
        System.out.println("\nProgram ends here ....");
    }
}
