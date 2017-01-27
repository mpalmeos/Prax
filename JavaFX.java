import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * Created by mpalmeos on 27.01.2017.
 */
public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        TextField text = new TextField("Kirjuta kõik");
        Button submit = new Button("Joonista!");
        submit.setTranslateX(170);
        submit.setDefaultButton(true);

        submit.setOnAction(event -> {
            //Küsida inputi väärtus
            String input = text.getText();

            //Lahutada numbrid
            String[] k = input.split("-");
            int[] intK = new int[k.length];
            for (int i = 0; i < k.length; i++) {
                intK[i]= Integer.parseInt(k[i]);
            }

            //Joonista joon
            Line line = new Line(intK[0], intK[1], intK[2], intK[3]);
            pane.getChildren().add(line);

        });

        pane.getChildren().addAll(text, submit);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
