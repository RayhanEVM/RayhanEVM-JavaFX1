/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Asus Rayhan
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        Label label1 = new Label("First Name:                  ");
        Label label2 = new Label("Last Name:                  ");
        Label label3 = new Label("Email Adress:               ");
        Label label4 = new Label("Contact No:                 ");
        Label label5 = new Label("Password:                    ");
        Label label6 = new Label("Confirm Password:      ");
        btn.setText("Register");
        btn.setStyle("-fx-background-color: #000080");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Registered!");
            }
        });
        Group root = new Group();
        HBox panel1 = new HBox();
        HBox panel2 = new HBox();
        HBox panel3 = new HBox();
        HBox panel4 = new HBox();
        HBox panel5 = new HBox();
        HBox panel6 = new HBox();
        TilePane panel7 = new TilePane();
        
        panel1.getChildren().add(label1);
        panel1.getChildren().add(tf1);
        
        panel2.getChildren().add(label2);
        panel2.getChildren().add(tf2);
        
        panel3.getChildren().add(label3);
        panel3.getChildren().add(tf3);
        
        panel4.getChildren().add(label4);
        panel4.getChildren().add(tf4);
        
        panel5.getChildren().add(label5);
        panel5.getChildren().add(tf5);
        
        panel6.getChildren().add(label6);
        panel6.getChildren().add(tf6);
        
        panel7.getChildren().add(btn);
        
        panel1.setLayoutX(10);
        panel1.setLayoutY(10);
        
        panel2.setLayoutX(10);
        panel2.setLayoutY(50);
        
        panel3.setLayoutX(10);
        panel3.setLayoutY(100);
        
        panel4.setLayoutX(10);
        panel4.setLayoutY(150);
        
        panel5.setLayoutX(10);
        panel5.setLayoutY(200);
        
        panel6.setLayoutX(10);
        panel6.setLayoutY(250);
        
        panel7.setLayoutX(100);
        panel7.setLayoutY(320);
        
        root.getChildren().addAll(panel1,panel2,panel3,panel4,panel5,panel6,panel7);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
