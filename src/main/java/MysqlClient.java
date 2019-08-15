/**
 * Class for test mysql client.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Logger;

public class MysqlClient {
    final static Logger logger = Logger.getLogger("MysqlClient");

    public static void main(String args[]) {
        try {
            System.out.println("Trying to get the connection");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://host:3306/dbUserstoreProd", "username",
                            "password");
            //  here sonoo is database name, root is username and password

            String filePath = "/tmp/temp.txt";
            InputStream inputStream = new FileInputStream(new File(filePath));

            String sql = "UPDATE UM_TENANT SET UM_USER_CONFIG=? where UM_DOMAIN_NAME=\"vidurangaorg\";";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setBlob(1, inputStream);
            int x = statement.executeUpdate();
            logger.info("Got the connection and starting to execute the query ");

//            Statement stmt = con.createStatement();
//         //   ResultSet rs = stmt.executeQuery("select * from UM_TENANT where UM_DOMAIN_NAME=\"prashanorg\";");
//            int x = stmt.executeUpdate("UPDATE UM_TENANT SET UM_DOMAIN_NAME=? where UM_DOMAIN_NAME=\"prashanorg\";");
            System.out.println(x);
//            while (rs.next()) {
//                System.out.println("Data exists");
//
//                File file = new File("/tmp/output.txt");
//                FileOutputStream output = new FileOutputStream(file);
//
//                System.out.println("Writing to file " + file.getAbsolutePath());
//                InputStream input = rs.getBinaryStream("UM_USER_CONFIG");
//                byte[] buffer = new byte[1024];
//                while (input.read(buffer) > 0) {
//                    output.write(buffer);
//                }
//
//            }
            con.close();
        } catch (Exception e) {
            logger.warning("Error: " + e);
        }
    }
}
