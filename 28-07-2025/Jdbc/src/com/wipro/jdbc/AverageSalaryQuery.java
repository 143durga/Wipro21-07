package com.wipro.jdbc;

import java.sql.*;

public class AverageSalaryQuery {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/wiprojdbc"; 
        String username = "root";
        String password = "Durga@2002";

        String query = "SELECT AVG(salary) AS avg_salary FROM employee1 WHERE age > 30 AND salary > 50000";

        try (
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        ) {
            if (rs.next()) {
                double avgSalary = rs.getDouble("avg_salary");
                System.out.println("✅ Average Salary: " + avgSalary);
            } else {
                System.out.println("No employees found matching the criteria.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error while fetching average salary: " + e.getMessage());
        }
    }
}
