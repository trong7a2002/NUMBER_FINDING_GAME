module com.example.number_finding_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.client.number_finding_game to javafx.fxml;
    exports com.client.number_finding_game;
}