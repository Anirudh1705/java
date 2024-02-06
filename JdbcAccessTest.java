import java.sql.*;
public class JdbcAccessTest
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","raja");
            String sql = "INSERT INTO raja (id,name, place, phone) VALUES (?,?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "128");
            preparedStatement.setString(2, "Jim Rohn");
            preparedStatement.setString(3, "rohnj@herbalife.com");
            preparedStatement.setString(4, "0919989998");
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                System.out.println("A row has been inserted successfully.");
            }
            sql = "SELECT * FROM raja";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            }

        } catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println(ex);
        }
    }
}