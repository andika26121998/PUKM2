/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pukm.model.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pukm.connection.SqlConnection;
import pukm.model.Bendahara;
import pukm.model.Seketaris;
import pukm.model.interfaces.InterfacesBendahara;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class QueryBendahara implements InterfacesBendahara {
    
    Connection conn= SqlConnection.getConnection();

    @Override
    public boolean insert(Bendahara bendahara) {
           String sql="insert into bendahara values(?,?,?,?,?)";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, bendahara.getId_bendahara());
            statement.setInt(2, bendahara.getId_ukm());
            statement.setString(3, bendahara.getNama_bendahara());
            statement.setString(4, bendahara.getUsername());
            statement.setString(5, bendahara.getPassword());
            
            int row = statement.executeUpdate();
            
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }

    @Override
    public boolean update(Bendahara bendahara) {
        String sql="update bendahara set id_ukm =?,nama_bendahara=?,username=?, "
                + "password=? where id_bendahara=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, bendahara.getId_ukm());
            statement.setString(2, bendahara.getNama_bendahara());
            statement.setString(3, bendahara.getUsername());
            statement.setString(4, bendahara.getPassword());
            statement.setInt(5, bendahara.getId_bendahara());
            
            int row= statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        
        }catch(SQLException e){
            Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE, null,e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from bendahara where id_bendahara=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, id);
            int row=statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE, null,e);
        }
        
       return false;
    }

    @Override
    public List<Bendahara> getAllData() {
        List<Bendahara> listBendahara=new ArrayList<Bendahara>();
       String sql="select * from bendahara";
       try{
           PreparedStatement statement=conn.prepareStatement(sql);
           
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               Bendahara b =new Bendahara(
                       rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5));
               listBendahara.add(b);
           }
           statement.close();
           
       }catch(SQLException e){
           Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE,null,e);
       }
       return listBendahara;
    }

    @Override
    public Bendahara getDataBendaharabyId(int id) {
        Bendahara bendahara = null;
        String sql="select * from bendahara where id_bendahara=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs=statement.executeQuery();
            
            while(rs.next()){
                bendahara= new Bendahara(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4), 
                        rs.getString(5));
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return bendahara;
    }

    @Override
    public List<Bendahara> getAllDataByName(String nama_bendahara) {
        List<Bendahara> listBendahara=new ArrayList<>();
       String sql="select * from bendahara where nama_bendahara like '%"+nama_bendahara+"%'";
       try{
           PreparedStatement statement= conn.prepareStatement(sql);
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               Bendahara b= new Bendahara(rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3), 
                       rs.getString(4), 
                       rs.getString(5));
               listBendahara.add(b);
           }
       statement.close();
       }catch(SQLException e){
           Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE,null,e);
       }
       return listBendahara;
    }
    
    public boolean cekLogin(String username,String password){
        String sql="select id_ukm,username,password from bendahara where username=?"
                + " and password=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs=statement.executeQuery();
            while(rs.next()){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Bendahara.class.getName()).log(Level.SEVERE, null,e);
        }
        return false;
    }
    
    public Bendahara getDataBendaharabyUser(String user) {
        Bendahara bendahara = null;
        String sql="select * from bendahara where username=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setString(1, user);
            ResultSet rs=statement.executeQuery();
            
            while(rs.next()){
                bendahara= new Bendahara(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4), 
                        rs.getString(5));
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return bendahara;
    }
}
