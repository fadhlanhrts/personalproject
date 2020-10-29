
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {
    public static void main(String[] args){

        Connection connection=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/universitas","postgres","harits2804");

            if(connection!=null){
                System.out.println("Connection OK");
                String sql = "SELECT * FROM dosen";
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                System.out.println("nopeg | nama | pangkat | ruang");
                while(result.next()){
                    int nopeg = result.getInt("nopeg");
                    String nama = result.getString("nama");
                    String pangkat = result.getString("pangkat");
                    int ruang = result.getInt("ruang");
                    System.out.printf("%d | %s | %s | %d\n", nopeg, nama, pangkat, ruang);
                }
            }
            else{
                System.out.println("Connection failed");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
