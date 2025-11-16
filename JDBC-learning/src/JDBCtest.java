import java.sql.*;
public class JDBCtest {
    public static void main(String [] args) throws Exception{

//        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/demoForSpring";
        String user = "postgres";
        String pass = "Mountain@15";
        String query = "select sname from student where sid = 1";

        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement st = connection.createStatement();
        ResultSet rss = st.executeQuery(query);
        rss.next();
        String name = rss.getString("sname");
        System.out.println(name);
        connection.close();

    }
}
