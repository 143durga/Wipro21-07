package wipro.ai.mockitdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ReadEmployee {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/wiprojdbc"; 
        String username = "root"; 
        String password = "Durga@2002"; 

        try {
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\t\tDepartment");
            System.out.println("-----------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("employee_name");
                String dept = rs.getString("department");
                System.out.println(id + "\t" + name + "\t\t" + dept);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("❌ Error while reading: " + e.getMessage());
        }
    }
}
