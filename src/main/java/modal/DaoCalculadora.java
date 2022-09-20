package modal;

import server.Methods;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoCalculadora {
    Connection conn;

    PreparedStatement pstm;
    CallableStatement cstn;
    ResultSet rs;

    private final String INSERT_OPERATION = "INSERT INTO operations(type,first_number,second_number,result)values (?,?,?,?)";

    public boolean saveOperation(String typeOperation, double firstNumber, double secondNumber, String response){
        try{
            conn = new MySQLConnection().getConnection();
            String query =INSERT_OPERATION;
            pstm = conn.prepareStatement(query);
            pstm.setString(1,typeOperation);
            pstm.setDouble(2,firstNumber);
            pstm.setDouble(3,secondNumber);
            pstm.setString(4,response);

            return pstm.executeUpdate()==1;
        }catch (SQLException e){

            Logger.getLogger(DaoCalculadora.class.getName()).log(Level.SEVERE, "Error saveOperation->"+e);
            return false;

        }finally {
            closeConnection();
        }
    }

    public void closeConnection(){
        try{
            if(conn != null){
                conn.close();
            }
            if(pstm != null){
                pstm.close();
            }
            if(cstn != null){
                cstn.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e){

        }
    }


}
