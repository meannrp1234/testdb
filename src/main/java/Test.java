import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:h2:~/testdb")){
            Statement createStatement = connection.createStatement();
            ResultSet executeQuery = createStatement.executeQuery("select scode, sname from student");
            while (executeQuery.next()){
                String scode = executeQuery.getString("scode");
                String sname = executeQuery.getString("sname");
                System.out.println(scode + " - " + sname);
            }
        }
    }
}
