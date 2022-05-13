package HW5_OOP;
import java.sql.*;
public class EX1 {
    public static void main(String[] args) {
        try (

                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", "CSDL2021");
                Statement stmt = conn.createStatement();
                ) {

            String strSelect = "SELECT title, price, qty FROM books";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are:");
            int rowCount = 0;

            while (rset.next()) { // Repeatedly process each row
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
