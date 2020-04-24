package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class User_panel {
    public void profile(MouseEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("profile.fxml"));

        Main.window.setTitle("My Profile");
        Main.window.setScene(new Scene(root));
        System.out.println(Controller.usern);
    }
    public void pt( MouseEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Points_table.fxml"));
        Main.window.setTitle("Points Table");
        Main.window.setScene(new Scene(root));
    }
    public void fixture(MouseEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("fixtures.fxml"));
        Main.window.setTitle("Fixtures");
        Main.window.setScene(new Scene(root));
    }
    public void leagueinfo(MouseEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("leagueinfo.fxml"));
        Main.window.setTitle("League Info");
        Main.window.setScene(new Scene(root));
    }
}