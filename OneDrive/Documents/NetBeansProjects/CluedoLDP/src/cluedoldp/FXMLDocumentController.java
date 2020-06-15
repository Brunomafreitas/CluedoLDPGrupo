/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedoldp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
/**
 *
 * @author senho
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    Group root = new Group();
    Scene s = new Scene(root, 300, 300, Color.BLACK);
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           
    }    
    private void desenha(){
    }
}
