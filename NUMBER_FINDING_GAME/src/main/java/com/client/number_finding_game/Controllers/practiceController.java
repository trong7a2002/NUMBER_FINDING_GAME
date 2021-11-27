package com.client.number_finding_game.Controllers;

import com.client.number_finding_game.Models.Map;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.*;

public class practiceController implements Initializable {
    @FXML
    private Pane pane2;
    Random rand = new Random();
    List<Circle> circleList = new ArrayList<>();


    public void setPane2(Pane pane) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 100; i++) {
            Rectangle rectangle = new Rectangle(25, 25);
            StackPane stackPane = new StackPane();
            Label label = new Label();
            label.setText(list.get(i).toString());
            stackPane.setId("SP_" + list.get(i));
            rectangle.setFill(Color.BLUE);

            stackPane.getChildren().addAll(rectangle, label);
            stackPane.setLayoutX(Math.random() * 800);
            stackPane.setLayoutY(Math.random() * 500);
            stackPane.setOnMouseClicked(mouseEvent -> {
                rectangle.setFill(Color.RED);
                System.out.println(label.getText());
            });

            if(stackPane.getId().equalsIgnoreCase("SP_1")){
                rectangle.setFill(Color.DARKGOLDENROD);

            }
            pane.getChildren().add(stackPane);
        }
    }

    Map map;

    public void init(Pane pane) {
        map = new Map();

        map.startValue = 1;
        map.endValue = 100;

        map.createNew(770, 0, 470, 0);

        map.list.forEach(model -> {
            Rectangle rectangle = new Rectangle(25, 25);
            StackPane stackPane = new StackPane();
            Label label = new Label();

            label.setText(String.valueOf(model.value));
            stackPane.setId("SP_" + String.valueOf(model.value));
            rectangle.setFill(Color.valueOf("6fcffa"));

            stackPane.getChildren().addAll(rectangle, label);

            stackPane.setLayoutX(model.posX);
            stackPane.setLayoutY(model.posY);

            stackPane.setOnMouseClicked(mouseEvent -> {
                String color;
                if (model.getValue() % 2 == 0)
                    color = "0xffa500ff";
                else
                    color = "ffee04";

                if (!map.isChosen(model.getValue())) {
                    rectangle.setFill(Color.valueOf(color));
                    map.setColorByValue(model.getValue(), color);
                    System.out.println(label.getText()
                            + " : "
                            + model.getValue()
                            + " : "
                            + model.chosenColor);
                }
            });

            pane.getChildren().add(stackPane);
        });

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        setPane2(pane2);
        init(pane2);
    }
}