package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
        String connectinString = "jdbc:mysql://localhost:80/authorization";
             /**  public  Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectinString = "jdbc:mysql://localhost:80/authorization" + dbHost + ":" +
                dbPort + "/" + dbName;
      //  Class.forName("com.mysql.jdbc.Driver");
       dbConnection = DriverManager.getConnection(connectinString, dbUser,
                dbPass);
        return dbConnection;
*/

    public void registrUser(String nameuser, String surnameuser, String loginuser,
                            String passworduser, String location, String gender){
       //sql запрос
        String insert = "INSERT INTO" + Const.USER_TABLE + "(" +
                Const.USER_NAME + "," + Const.USER_SURNAME + "," +
                Const.USER_LOGIN + "," + Const.USER_PASSWORD + "," +
                Const.USER_LOCATION + "," + Const.USER_GENDER + ")"
                + "VALUES(?,?,?,?,?,?)";

/**
        try {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = getDbConnection().prepareStatement(insert);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            preparedStatement.setString(1, nameuser);
            preparedStatement.setString(2, surnameuser);
            preparedStatement.setString(3, loginuser);
            preparedStatement.setString(4, passworduser);
            preparedStatement.setString(5, location);
            preparedStatement.setString(6, gender);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
    }
}
