/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Anik
 */
public class Final extends Application {
    
    Statement statement;
    int id = 0;
    
    public Text msg = new Text("");
    public Text ut = new Text("pname");
    public Text pt = new Text("price");
     public Text mt = new Text("quantity");
      
    public Text vu = new Text("");
    public Text vp = new Text("");
    public Text vm = new Text("");
    
    public TextField uf = new TextField();
    public TextField pf = new TextField();
     public TextField mf = new TextField();
       public TextField vf = new TextField();
    
    Button bl = new Button("insert");
       Button bu = new Button("Update");
        Button bv = new Button("show list");
        Button bd = new Button("delete");
        Button be = new Button("edit");
    
    @Override
    public void start(Stage primaryStage) {
        DBConnect();
        
        GridPane root = new GridPane();
        
        root.add(msg, 0, 0);
        root.add(ut, 0, 1);
        root.add(uf, 1, 1);
        root.add(pt, 0, 2);
        root.add(pf, 1, 2);
        root.add(mt, 0, 3);
        root.add(mf, 1, 3);
        root.add(bl, 0,4);
        root.add(bu, 1,4);
        root.add(vf, 1,6);
        root.add(bv, 0,6);
        root.add(bd, 2,4);
        root.add(be, 3,4);
        root.add(vu, 0,5);
        root.add(vp, 1,5);
        root.add(vm, 2,5);
        bl.setOnAction(e->insert());
        bv.setOnAction(e->view());
        be.setOnAction(e->edit());
        bu.setOnAction(e->update());
         bd.setOnAction(e->delete());
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXAPP");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public void DBConnect(){
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
            statement = conn.createStatement();
            msg.setText("Database Connected");
        } catch (Exception e) {
            msg.setText("Database Not Connected");
        }
    }
    
    public void insert(){
        try{
            String insertquery = "INSERT INTO `product`(`pname`, `price`, `quantity`) VALUES ('"+uf.getText()+"', '"+pf.getText()+"','"+mf.getText()+"' )";
            statement.executeUpdate(insertquery);
            msg.setText("Inserted");
        } catch(Exception e){
            msg.setText("Not Inserted");
        }
    }
    public void view(){
        try {
            String insertquery = "select * from product where pname = '"+vf.getText()+"'";
            ResultSet result = statement.executeQuery(insertquery);
            if(result.next()){
                vu.setText("pname: " + result.getString(2));
                vp.setText("price: " + result.getString(3));
                vm.setText("quantity " + result.getString(4));
            }
        } catch (SQLException ex) {
            msg.setText("Problem to Show Data");
        }
     }
     public void edit(){
         try {
            String insertquery = "select * from product where pname = '"+vf.getText()+"'";
            ResultSet result = statement.executeQuery(insertquery);
            if(result.next()){
                uf.setText(result.getString(2));
                pf.setText(result.getString(3));
                 mf.setText(result.getString(3));
                id = result.getInt(1);
            }
        } catch (SQLException ex) {
            msg.setText("Problem to Show Data");
        }
        
    }
     public void update(){
        try {
            String insertquery = "UPDATE `product` set `pname`='"+uf.getText()+"',`price`='"+pf.getText()+"',`quantity`='"+mf.getText()+"' WHERE id = '"+id+"'";
            statement.executeUpdate(insertquery);
            msg.setText("Updated");
        } catch (SQLException ex) {
            msg.setText(ex.getMessage());
        }
     }
      public void delete(){
         try {
            String insertquery = "DELETE FROM `product` WHERE pname = '"+vf.getText()+"'";
            statement.executeUpdate(insertquery);
            msg.setText("Deleted");
        } catch (SQLException ex) {
            msg.setText(ex.getMessage());
        }
     }
    
     
     
    
}
