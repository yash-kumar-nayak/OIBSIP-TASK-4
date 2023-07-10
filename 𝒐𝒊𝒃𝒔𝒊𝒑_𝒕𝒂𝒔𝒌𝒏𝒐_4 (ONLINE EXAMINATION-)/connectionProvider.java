
package examination_management;
import java.sql.*;
public class connectionProvider {
     Connection c;
    Statement s;
    connectionProvider(){
        try {

//            Class.forName("com.sql.cj.jdbc.Driver");
//it will call it internally
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","yash");
            s=c.createStatement();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
