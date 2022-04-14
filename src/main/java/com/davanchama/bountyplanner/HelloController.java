package com.davanchama.bountyplanner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private int counter = 0;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        counter++;
        if (counter%2 == 1) {
            welcomeText.setText("MergeShuffler 1.0, Koeri Inc. (2022)");
        } else {
            welcomeText.setText("Tschüss");
        }
    }
}