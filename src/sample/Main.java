package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }



    public static void main(String[] args) {
        /* Set proxy for url usage */
        System.setProperty("https.proxyHost","proxy.dlsu.edu.ph");
        System.setProperty("https.proxyPort","80");
        System.setProperty("http.proxyHost","proxy.dlsu.edu.ph");
        System.setProperty("http.proxyPort","80");
        launch(args);
    }

}


// Text

//@Override
//    public void start(Stage primaryStage){
//
//        Text text1 = new Text(140, 40, "love of fate");
//        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 48));
//
//        Text text2 = new Text(180, 80, "\'Amor fati\'");
//        text2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 24));
//
//        Text text3 = new Text(10, 120, "love of fate\namor fate");
//        text3.setFill(Color.GREEN);
//        text3.setUnderline(true);
//        text3.setStrikethrough(true);
//
//        String quote = "\"a will to live without rejecting \n " +
//                " anything of life, \n " +
//                "which is the virtue \n " +
//                "I honor most in this world.\"";
//        Text text4 = new Text(10, 180, quote);
//        text4.setFont(Font.font("Lucida Handwriting", FontWeight.NORMAL, FontPosture.REGULAR, 24));
//        text4.setFill(Color.RED);
//        text4.setUnderline(true);
//
//
//        Pane pane = new Pane();
//        pane.setPadding(new Insets(8, 8, 8, 8));
//        pane.getChildren().add(text1);
//        pane.getChildren().add(text2);
//        pane.getChildren().add(text3);
//        pane.getChildren().add(text4);
//        Scene scene = new Scene(pane, 520, 300);
//        primaryStage.setScene(scene); primaryStage.show();
//    }



// 2D Shapes
//
//    @Override
//public void start(Stage primaryStage){
//    Circle circle = new Circle(60);
//    circle.setFill(Color.BLUE);
//    circle.setStroke(Color.BLACK);
//    circle.setStrokeWidth(5.0);
//
//    Rectangle rect = new Rectangle(160, 80);
//    rect.setFill(Color.GREEN);
//
//    // Create a line
//    Line line = new Line(0, 40, 120, 0);
//    line.setStrokeWidth(5.0);
//    line.setStroke(Color.AQUAMARINE);
//
//    // Create a parallelogram
//    Polygon parallelogram = new Polygon();
//    parallelogram.getPoints().addAll(30.0, 0.0,
//            150.0, 0.0,
//            120.00, 50.0,
//            0.0, 50.0);
//    parallelogram.setFill(Color.RED);
//    parallelogram.setStroke(Color.BLACK);
//    parallelogram.setStrokeWidth(5.0);
//
//
//    // A CHORD arc with no fill and a stroke
//    Arc arc = new Arc(0, 0, 100, 100, 0, 90);
//    arc.setFill(Color.TRANSPARENT);
//    arc.setStroke(Color.BLACK);
//    arc.setType(ArcType.CHORD);
//    arc.setStrokeWidth(5.0);
//
//    // Add all shapes to an HBox
//    VBox root =  new VBox(circle, rect, line, parallelogram, arc);
//    root.setSpacing(10);
//    root.setStyle("-fx-padding: 10;" +
//            "-fx-border-style: solid inside;" +
//            "-fx-border-width: 4;" +
//            "-fx-border-insets: 5;" +
//            "-fx-border-radius: 5;" +
//            "-fx-border-color: blue;");
//
//    Scene scene = new Scene(root);
//    primaryStage.setScene(scene);
//    primaryStage.setTitle("Shapes");
//    primaryStage.show();
//}



// Random Shapes

//    @Override
//    public void start(Stage primaryStage){
//
//        Canvas canvas = new Canvas(400, 400);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//
//        // Rectangle
//        gc.setStroke(Color.GREEN);
//        gc.strokeRect(120,50,100,70);
//
//        // Filled Rect: Blue
//        gc.setFill(Color.BLUE);
//        gc.fillRect(10,20,100,70);
//
//        // Filled Rect: Red
//        gc.setFill(Color.RED);
//        gc.fillRect(10,120,100,70);
//
//        // Text
//        gc.setFill(Color.WHITE);
//        gc.setFont(new Font("Courier New", 18));
//        gc.fillText("Hello LBYCPEI!", 150, 140);
//
//        // Simple line
//        gc.setStroke(Color.MAROON);
//        gc.strokeLine(10,230, 100, 230);
//        gc.setLineWidth(10);
//
//        // Colored Smiley
//        gc.setFill(Color.YELLOW);
//        gc.fillOval(150,150,200,200);
//        gc.setFill(Color.rgb(0,0,255));
//        gc.fillOval(200,200,20,10);
//        gc.setFill(Color.rgb(0,255,255));
//        gc.fillOval(275,200,20,10);
//        gc.setFill(Color.rgb(255,0,0));
//        gc.fillRect(215,300,50,4);
//
//        Pane root = new Pane();
//        Scene scene = new Scene(root);
//        root.getChildren().add(canvas);
//        root.setStyle("-fx-background-color: silver");
//
//        primaryStage.setTitle("GraphicsContext Shapes");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }


// Smiley

//@Override
//public void start(Stage primaryStage){
//
//    Canvas canvas = new Canvas(400, 300);
//
//    /* Draw Smiley Face */
//    GraphicsContext gc = canvas.getGraphicsContext2D();
//    gc.strokeOval(100, 50, 200, 200);
//    gc.fillOval(155, 100, 10, 20);
//    gc.fillOval(230, 100, 10, 20);
//    gc.strokeArc(150, 160, 100, 50, 180, 180, ArcType.OPEN);
//
//    Pane root = new Pane();
//    Scene scene = new Scene(root);
//    root.getChildren().add(canvas);
//    root.setStyle("-fx-background-color: pink");
//
//    primaryStage.setTitle("Hello World");
//    primaryStage.setScene(scene);
//    primaryStage.show();
//
//}




// Adding Images

//    @Override
//    public void start(Stage primaryStage) {
//        Image image = new Image("https://www.adventureinyou.com/wp-content/uploads/2014/01/philippines-elnido-960x640.jpg");
//        //Image image= new Image("file:assets/DLSU.png");
//        ImageView imageView = new ImageView(image);
//        StackPane root = new StackPane();
//        root.getChildren().add(imageView);
//        root.setAlignment(Pos.CENTER);
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 600, 600));
//        primaryStage.show();
//    }



// Hello World Text

//    @Override
//    public void start(Stage primaryStage) {
//        Text msg = new Text("Hello JavaFX");
//        VBox root = new VBox();
//        root.getChildren().add(msg);
//        root.setAlignment(Pos.CENTER);
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 250));
//        primaryStage.show();
//    }

// Default

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//    }


