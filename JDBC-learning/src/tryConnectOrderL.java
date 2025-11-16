import java.sql.*;
public class tryConnectOrderL {
    public static void main(String [] args ) throws Exception {
        String url ="jdbc:postgresql://localhost:5432/demoForSpring";
        String user ="postgres";
        String pass ="Mountain@15";
        String query = "insert into products values(? , ? , ?, ?)";


        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1 , 001);
        preparedStatement.setString(2, "Tien Vo");
        preparedStatement.setString(3, " a lonely boy");
        preparedStatement.setInt(4, 2000);

        int result = preparedStatement.executeUpdate();
        System.out.println(result);
    }
}
