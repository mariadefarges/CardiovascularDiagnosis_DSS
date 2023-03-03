/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;
import ifaces.*;
import java.sql.*;
import pojos.*;
/**
 *
 * @author carme
 */
public class JDBCDiseaseManager implements DiseaseManager{
    
    private final JDBCManager manager;

    public JDBCDiseaseManager(JDBCManager m) {
        this.manager = m;
    }
    
    @Override
    public void addDisease(Disease d) throws SQLException {
        String sql = "INSERT INTO disease (myocardialInfarction, heartFailure, pArterialDisease, heartBurn,hypertension, stroke,arrythmia) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement prep = manager.getConnection().prepareStatement(sql);
        prep.setDouble(1, d.getMyocardialInfarction());
        prep.setDouble(2, d.getHeartFailure());
        prep.setDouble(3, d.getpArterialDisease());
        prep.setDouble(4, d.getHeartBurn());
        prep.setDouble(5, d.getHypertension());
        prep.setDouble(6, d.getStroke());
        prep.setDouble(7, d.getArrythmia());
        prep.executeUpdate();
        prep.close();
    }


    @Override
    public Disease searchDiseaseById(int diseaseId) throws SQLException {
        Disease d = null;
        String sql = "SELECT * FROM disease WHERE diseaseId= ?";
        PreparedStatement prep = manager.getConnection().prepareStatement(sql);
        prep.setInt(1, diseaseId);
        ResultSet rs = prep.executeQuery();
        while (rs.next()) {
            Double myocardialInfarction = rs.getDouble("myocardialInfarction");
            Double heartFailure = rs.getDouble("heartFailure");
            Double pArterialDisease = rs.getDouble("pArterialDisease");
            Double heartBurn = rs.getDouble("heartBurn");
            Double hypertension = rs.getDouble("hypertension");
            Double stroke = rs.getDouble("stroke");
            Double arrythmia = rs.getDouble("arrythmia");
            
             d = new Disease(myocardialInfarction, heartFailure, pArterialDisease, heartBurn, hypertension,stroke, arrythmia);
        }
        prep.close();
        rs.close();
        return d;
    }
}
