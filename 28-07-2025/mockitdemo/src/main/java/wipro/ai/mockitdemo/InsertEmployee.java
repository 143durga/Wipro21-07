package wipro.ai.mockitdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee {
	public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/wiprojdbc";
        String username = "root";
        String password = "Durga@2002"; 

        try {
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);

            String sql = "INSERT INTO employee (employee_name, department) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Durga Bhavani");
            stmt.setString(2, "IT");
            

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ A new employee was inserted successfully!");
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Error while inserting: " + e.getMessage());
        }

	}
}
