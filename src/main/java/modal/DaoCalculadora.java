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

    public boolean saveOperation(Methods operations){
        try{
            conn = new MySQLConnection().getConnection();
            String query =INSERT_OPERATION;
            pstm = conn.prepareStatement(query);
            pstm.setDouble(1,operations.getFirstNumber());
            pstm.setDouble(2,operations.getSecondNumber());
            pstm.setString(3,operations.getTypeOperation());
            pstm.setString(4,operations.getResponse());
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
