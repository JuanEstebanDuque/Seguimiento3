package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowCalculator {
	
	@FXML
    private Button addBTM;

    @FXML
    private Button calculateBTM;

    @FXML
    private Button ceroBTM;
    
    @FXML
    private Button clearBTM;

    @FXML
    private Button eightBTM;

    @FXML
    private Button fiveBTM;

    @FXML
    private Button fourBTM;

    @FXML
    private TextArea historialTA;

    @FXML
    private Button minusBTM;

    @FXML
    private Button multiplicationBTM;

    @FXML
    private Button nineBTM;

    @FXML
    private Button oneBTM;

    @FXML
    private TextField operationTF;
    
    @FXML
    private Button removeHistorialBTM;

    @FXML
    private TextField resultTF;

    @FXML
    private Button sevenBTM;

    @FXML
    private Button sixBTM;

    @FXML
    private Button threeBTM;

    @FXML
    private Button twoBTM;

    @FXML
    void press(ActionEvent event) {
		Button number = (Button) event.getSource();
		String text = number.getText();
		operationTF.appendText(text);
    }
    
    @FXML
    void remove(ActionEvent event) {
    	resultTF.setText("");
    	operationTF.setText("");
    }
    
    @FXML
    void removeHistorial(ActionEvent event) {
    	historialTA.setText("");
    }

    @FXML
    void result(ActionEvent event) {
		String operation = operationTF.getText();
		String[] add = operation.split("\\+");
		String[] minus = operation.split("-");
		String[] multiplication = operation.split("\\*");
		if(add.length > 1) {
			int firstOperator = Integer.parseInt(add[0]);
			int secondOperator = Integer.parseInt(add[1]);
			int result = firstOperator + secondOperator;
			String resultOperation = result+"";
			String historial = operation+"="+result;
			resultTF.appendText(resultOperation);
			historialTA.appendText(historial+"\n");
		} else if(minus.length>1) {
			int firstOperator = Integer.parseInt(minus[0]);
			int secondOperator = Integer.parseInt(minus[1]);
			int result = firstOperator - secondOperator;
			String resultOperation = result+"";
			String historial = operation+"="+result;
			resultTF.appendText(resultOperation);
			historialTA.appendText(historial+"\n");
		} else if(multiplication.length>1) {
			int firstOperator = Integer.parseInt(multiplication[0]);
			int secondOperator = Integer.parseInt(multiplication[1]);
			int result = firstOperator * secondOperator;
			String resultOperation = result+"";
			String historial = operation+"="+result;
			resultTF.appendText(resultOperation);
			historialTA.appendText(historial+"\n");
		}
    }
    
    
}
