package eus.ehu.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FlightBookingGUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FlightBookingGUI.class.getResource("FlightBooking.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 540);
        stage.setTitle("Aeroplof Booking Center");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
