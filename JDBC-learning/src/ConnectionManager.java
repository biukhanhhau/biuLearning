import java.sql.*;
public class ConnectionManager{

    String url = "jdbc:postgresql://localhost:5432/demoForSpring";
    String user = "postgres";
    String pass = "Mountain@15";
    String query = "insert into products values(? , ? , ?, ?)";


    public void addProduct(int id, String name, String des, int price) {
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement st = con.prepareStatement(query)){
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, des);
            st.setInt(4, price);
            st.executeUpdate();
            System.out.println("Thêm súc vật " + name + " thành công!!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
