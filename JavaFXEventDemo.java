import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class JavaFXEventDemo extends Application {

Label response;
public static void main(String args[])
{
launch(args);
}
public void start(Stage myStage){
myStage.setTitle("This is Title of Demo Application");
FlowPane rootNode=new FlowPane(10,10);
rootNode.setAlignment(Pos.CENTER);
Scene myScene=new Scene(rootNode, 300, 100);
myStage.setScene(myScene);

response=new Label("Push a Button");

Button btnA=new Button("Alpha");
Button btnB=new Button("Beta");

btnA.setOnAction(new EventHandler<ActionEvent>(){
public void handle(ActionEvent ae){
response.setText("Alpha was Pressed.");
}
});

btnBeta.setOnAction(new EventHandler<ActionEvent>(){
public void handle(ActionEvent ae){
response.setText("Beta was Pressed.");
}});

rootNode.getChildren().addAll(btnA, btnB, response);
myStage.show();
}
}