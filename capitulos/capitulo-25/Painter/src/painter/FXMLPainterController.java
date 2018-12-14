/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author cristianoca
 */
public class FXMLPainterController{
    
    private enum PenSize{
        
        SMALL(2),
        MEDIUM(4),
        LARGE(6);
        
        private final int radius;
        
        PenSize( int radius ){
            this.radius = radius;
        }
        
        public int getRadius(){
            return radius;
        }
        
    };
    
    
    @FXML private RadioButton blackRadioButton;
    @FXML private RadioButton redRadioButton;
    @FXML private RadioButton greenRadioButton;
    @FXML private RadioButton blueRadioButton;
    @FXML private RadioButton smallRadioButton;
    @FXML private RadioButton mediumRadioButton;
    @FXML private RadioButton largeRadioButton;
    @FXML private AnchorPane drawingAreaAnchorPane;
    @FXML private ToggleGroup colorToggleGroup;
    @FXML private ToggleGroup sizeToggleGroup;
    
    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.BLACK;
        
    public void initialize() {
        blackRadioButton .setUserData(Color.BLACK);
        redRadioButton   .setUserData(Color.RED);
        greenRadioButton .setUserData(Color.GREEN);
        blueRadioButton  .setUserData(Color.BLUE);
        smallRadioButton .setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton .setUserData(PenSize.LARGE);
        
    }
  
    @FXML
    private void drawingAreaMouseDragged( MouseEvent e ){
        Circle newCircle = new Circle( e.getX(), e.getY(), radius.getRadius(), brushColor );
        drawingAreaAnchorPane.getChildren().add(newCircle);
    }
    
    @FXML
    private void colorRadioButtonSelected( ActionEvent e ){
        brushColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();
    }
    
    @FXML
    private void sizeRadioButtonSelected(ActionEvent e){
        radius = ( PenSize ) sizeToggleGroup.getSelectedToggle().getUserData();
    }
    
    @FXML
    private void undoButtonPressed( ActionEvent e ){
        int count = drawingAreaAnchorPane.getChildren().size();
        if( count > 0 )
            drawingAreaAnchorPane.getChildren().remove( count - 1 );        
    }
    
    @FXML
    private void clearButtonPressed( ActionEvent event ){
        drawingAreaAnchorPane.getChildren().clear();
    }
}
