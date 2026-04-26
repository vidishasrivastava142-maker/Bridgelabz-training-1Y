import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            // Example: Insert
            String insert = "INSERT INTO employee VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setDouble(3, 35000);
            ps.executeUpdate();

            // Example: Read
            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM employee WHERE salary > 30000");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getDouble(3));
            }

            // Example: Update
            String update = "UPDATE employee SET salary = salary * 1.1 WHERE id = ?";
            PreparedStatement ps2 = con.prepareStatement(update);
            ps2.setInt(1, 1);
            ps2.executeUpdate();

            // Example: Delete
            String delete = "DELETE FROM employee WHERE salary < 15000";
            con.createStatement().executeUpdate(delete);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}