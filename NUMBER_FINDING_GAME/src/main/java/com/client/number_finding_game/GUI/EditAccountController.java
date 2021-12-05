package com.client.number_finding_game.GUI;

import com.client.number_finding_game.LoginForm;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class EditAccountController implements Initializable {
    @FXML
    public Button Edt_btnChangePass, Edt_btnCancel, Edt_btnSave;
    @FXML
    public TextField Edt_usrName, Edt_fullName;
    @FXML
    public RadioButton Edt_RBMale, Edt_RBFemale, Edt_RBOthers;
    @FXML
    public DatePicker Edt_Dob;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        initRadioGroup();
        Edt_btnChangePass.setOnAction(this::setEdt_btnChangePass);
        Edt_btnCancel.setOnAction(this::setEdt_btnCancel);
        Edt_btnSave.setOnAction(this::setEdt_btnSave);
        Edt_Dob.setOnAction(this::getDatePicker);
    }

    public void setEdt_btnChangePass(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginForm.class.getResource("ChangePassword.fxml"));
            Parent parent = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Edit Account Info");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initRadioGroup() {
        ToggleGroup toggleGroup = new ToggleGroup();
        Edt_RBMale.setToggleGroup(toggleGroup);
        Edt_RBFemale.setToggleGroup(toggleGroup);
        Edt_RBOthers.setToggleGroup(toggleGroup);

        //listen to changes in selected toggle
        toggleGroup.selectedToggleProperty().addListener((observable, oldVal, newVal) -> System.out.println(newVal + " was selected"));
    }

    public void setEdt_btnCancel(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void setEdt_btnSave(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void getDatePicker(ActionEvent event) {
        System.out.println(Edt_Dob.getValue());
    }

}
