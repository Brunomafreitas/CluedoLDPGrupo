/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author senho
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private ImageView tabuleiro;
    @FXML
    private AnchorPane anchor;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        System.out.println("Boas");
        System.out.println("");
        Image img;
        img = new Image("../cluedo.jpg");
        tabuleiro.setImage(img);
    }
   
    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    


        

       
    
}
