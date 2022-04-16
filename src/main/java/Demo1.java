import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection con = Helper.createDB();
        Helper.initDB(con);
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT id,name,price from cars where price >=10000 limit 1");
        rs.next();
        int a;
        if(rs.getInt(3) > 100) {
            a = 1;
        } else {
            a = 2;
        }
        System.out.printf("a=%d\n", a);
    }
}
