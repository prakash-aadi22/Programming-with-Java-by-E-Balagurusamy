import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class eg_18_4 {

    public static void main(String[] argv) {
        final String driver = "oracle.jdbc.driver.OracleDriver";
        final String urlDB = "jdbc:oracle:thin:@localhost:1521:xe";
        final String username = "SYSTEM";
        final String password = "BSC LAB";
        String sql_stmt = "insert into EMP values('1130','VIRAT')";
        String commit = "Commit";
        Connection conn;
        try {
            Class.forName(driver).newInstance();
            Class.forName(driver).getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(urlDB, username, password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql_stmt);
            System.out.println("Data Inserted Successfully");
            stmt.executeUpdate(commit);
            System.out.println("Commit Successfully");
            conn.close();
        } catch (Exception e) {
            System.out.println("Exception Handled... .");
            System.out.println("Error --> " + e);
        }
    }
}
