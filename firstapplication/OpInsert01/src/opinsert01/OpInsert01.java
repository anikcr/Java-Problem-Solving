/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package opinsert01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Rana
 */
public class OpInsert01 extends Application {
    
    Statement statement;
    int id = 0;
    
    public Text msg = new Text("");
    public Text ut = new Text("Username");
    public Text pt = new Text("Password");
    public Text vu = new Text("");
    public Text vp = new Text("");
    
    public TextField uf = new TextField();
    public TextField pf = new TextField();
    
    
    Button bl = new Button("Registration");
    
    
    @Override
    public void start(Stage primaryStage) {
        DBConnect();
        
        GridPane root = new GridPane();
        
        root.add(msg, 0, 0);
        root.add(ut, 0, 1);
        root.add(uf, 1, 1);
        root.add(pt, 0, 2);
        root.add(pf, 1, 2);
        root.add(bl, 0,3);
        
 
        
        root.add(vu, 0,5);
        root.add(vp, 1,5);
        
        bl.setOnAction(e->insert());
        
        
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
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/fxapp","root","");
            statement = conn.createStatement();
            msg.setText("Database Connected");
        } catch (Exception e) {
            msg.setText("Database Not Connected");
        }
    }
    
    public void insert(){
        try{
            String insertquery = "INSERT INTO `user`(`uname`, `pass`) VALUES ('"+uf.getText()+"', '"+pf.getText()+"')";
            statement.executeUpdate(insertquery);
            msg.setText("Inserted");
        } catch(Exception e){
            msg.setText("Not Inserted");
        }
    }
     
     
    
     
     
   
    
    
}
