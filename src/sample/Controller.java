package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {


    public Label helloLabel;

    public void sayHello(ActionEvent actionEvent) {
        helloLabel.setText("Hello LBYCPEI!");
    }
}
