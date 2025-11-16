import java.sql.*;
public class JBDCbetterWay {
    public static void main(String [] args) throws Exception {

        String url ="jdbc:postgresql://localhost:5432/demoForSpring";
        String user ="postgres";
        String pass ="Mountain@15";
        String query ="select * from student";

        Connection connection = DriverManager.getConnection(url, user, pass);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet ree = preparedStatement.executeQuery();

        while(ree.next()){
            System.out.println("Student Id: " + ree.getInt(1));
            System.out.println("Name: " + ree.getString(2));
            System.out.println(ree.getInt(3) + " years old");
            System.out.println();
        }
    }
}
