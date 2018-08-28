/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author cristianoca
 */
public class FXMLDocumentController{
    
    private static final NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
    private static final NumberFormat percent = 
            NumberFormat.getPercentInstance();
    
    private BigDecimal tipPercentage = new BigDecimal(0.15);
    @FXML
    private Label porcentLabel;
    @FXML
    private TextField amountTextField;
    @FXML
    private TextField tipTextField;
    @FXML
    private TextField totalTextField;
    @FXML
    private Button calculateButton;
    @FXML
    private Slider percentSlider;
        
    @FXML
    private void calculateButtonPressed( ActionEvent event ){
        try{
            BigDecimal amount = new BigDecimal(amountTextField.getText());
            BigDecimal tip = amount.multiply( tipPercentage );
            BigDecimal total = amount.add( tip );
            
            tipTextField.setText( currency.format(tip) );
            totalTextField.setText( currency.format(total));
        }
        catch(NumberFormatException ex){
            amountTextField.setText( "Enter amount" );
            amountTextField.selectAll();
            amountTextField.requestFocus();
        }   
    }
    
    public void initialize() {
        currency.setRoundingMode( RoundingMode.HALF_UP );        
        percentSlider.valueProperty().addListener( ( ov, oldValue, newValue ) -> {
             tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
             porcentLabel.setText( percent.format(tipPercentage) );                     
        });
    }
}
