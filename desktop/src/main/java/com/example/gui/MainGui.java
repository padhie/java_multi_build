package com.example.gui;

import com.example.core.Calculator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGui extends Application {
    @Override
    public void start(Stage stage) {
        Calculator calculator = new Calculator();

        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Button calculateButton = new Button("Berechnen");
        Label resultLabel = new Label("Ergebnis:");

        calculateButton.setOnAction(e -> {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            resultLabel.setText("Ergebnis: " + calculator.add(a, b));
        });

        VBox layout = new VBox(10, num1, num2, calculateButton, resultLabel);
        stage.setScene(new Scene(layout, 300, 200));
        stage.setTitle("Calculator GUI");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
