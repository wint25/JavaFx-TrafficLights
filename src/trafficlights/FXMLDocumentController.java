/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlights;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author winte
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Circle red, yellow, green;
    
    @FXML
   private RadioButton r1, r2, r3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        r1.setOnAction(e->{
            red.setFill(Paint.valueOf("Red"));
            green.setFill(Paint.valueOf("Black"));
            yellow.setFill(Paint.valueOf("Black"));
        });
        r2.setOnAction(e->{
            yellow.setFill(Paint.valueOf("Yellow"));
            red.setFill(Paint.valueOf("Black"));
            green.setFill(Paint.valueOf("Black"));
        });
        r3.setOnAction(e->{
            green.setFill(Paint.valueOf("Green"));
            red.setFill(Paint.valueOf("Black"));
            yellow.setFill(Paint.valueOf("Black"));
        });
    }    
    
}
