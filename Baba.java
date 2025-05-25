package baba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javafx.scene.Scene;
import java.util.Optional;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;



public class Baba extends Application {

    @Override
    public void start(Stage primaryStage){
        
        
    BorderPane root = new BorderPane();
    root.setStyle("-fx-background-color:#F3E5F5;");




    Label label = new Label("Library Registration");
    label.setStyle("-fx-padding: 10px;-fx-font-size: 25px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman';");

    VBox topContainer = new VBox();
    topContainer.setAlignment(Pos. BASELINE_CENTER);
    topContainer.getChildren().addAll(label);
    root.setTop(topContainer);
        
        
        //Username newar jorno workdone eikhane hsse.
        TextField usernameField = new TextField();
        usernameField.setPromptText("   ");
        usernameField.setMaxWidth(200);
        BorderPane.setAlignment(usernameField, Pos.CENTER);
       
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("    ");
        passwordField.setMaxWidth(200);
        BorderPane.setAlignment(passwordField, Pos.CENTER);
        
        Button loginButton = new Button("Login");
     
        loginButton.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");
      
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

        if (username.equals("library") && password.equals("12345")) {
        Stage newStage = new Stage();
        BorderPane newRoot = new BorderPane();
        newRoot.setStyle("-fx-background-color: #e2f0ff;");

        Button newStudent = new Button("New Student");
        Button booksInfo = new Button("Books Information");
        Button borrowBook = new Button("Borrow Book");
        Button returnBook = new Button("Return Book");
        Button detailBook = new Button("Details");
        Button logout = new Button("Logout");
                
             
                
         newStudent.setStyle("-fx-padding: 7px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");    
         booksInfo.setStyle("-fx-padding: 7px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");      
         borrowBook.setStyle("-fx-padding: 7px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");
         returnBook.setStyle("-fx-padding: 7px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");
         detailBook.setStyle ("-fx-padding: 7px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");
         logout.setStyle("-fx-padding: 7px;-fx-font-size: 15px;-fx-text-fill:White;-fx-background-color:Green;-fx-font-family: 'Times New Roman'");

         HBox menuButtons = new HBox(5, newStudent, booksInfo, borrowBook, returnBook,detailBook, logout);
         menuButtons.setAlignment(Pos.CENTER);
         menuButtons.setStyle("-fx-padding: 10px;");
         newRoot.setTop(menuButtons);

    
                         
    newStudent.setOnAction(ev -> {
    GridPane formGrid = new GridPane();
    formGrid.setHgap(10);
    formGrid.setVgap(10);
    formGrid.setPadding(new Insets(20));
    formGrid.setAlignment(Pos.CENTER);

    Label idLabel = new Label("Student ID: ");
    idLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField idField = new TextField();

    Label nameLabel = new Label("Student Name: ");
    nameLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField nameField = new TextField();
    Label deptLabel = new Label("Department: ");
    deptLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    ComboBox<String> departmentComboBox = new ComboBox<>();
    departmentComboBox.setPromptText("Select Department");
    departmentComboBox.getItems().addAll("CSE", "EEE", "ME", "CIVIL", "IPE");
    //TextField deptField = new TextField();
    
    
    ComboBox<String> leveltermComboBox = new ComboBox<>();
    leveltermComboBox.setPromptText("Select Level-Term");
    leveltermComboBox.getItems().addAll(
        "Level 1 - Term I", "Level 1 - Term II",
        "Level 2 - Term I", "Level 2 - Term II",
        "Level 3 - Term I", "Level 3 - Term II",
        "Level 4 - Term I", "Level 4 - Term II"
    );


    
    Label levelTermLabel = new Label("Level-Term: ");
    levelTermLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill: Black;-fx-font-family: 'Times New Roman';");
    Label emailLabel = new Label("Email: ");
    emailLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField emailField = new TextField();

    Button saveButton = new Button("Save");
    saveButton.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:green;-fx-text-fill:white");
    //action adding inside save button.
    saveButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent ed) {
            // Check all fields for empty or unselected
            if (idField.getText().isEmpty() ||
                    nameField.getText().isEmpty() ||
                    departmentComboBox.getSelectionModel().isEmpty() ||
                    leveltermComboBox.getSelectionModel().isEmpty() ||
                    emailField.getText().isEmpty()) {
                
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please fill up all the information");
                DialogPane dialogPane= alert.getDialogPane();
                dialogPane.setStyle("-fx-font-family: 'Times New Roman';-fx-font-size: 17px;-fx-background-color:#D1ECF1");
                alert.setWidth(450);
                alert.setHeight(300);
                alert.showAndWait();
            } else {
                
                try {
                    FileWriter writer = new FileWriter("students.txt", true); // append mode
                    writer.write("Student ID: " + idField.getText() + "\n");
                    writer.write("Name: " + nameField.getText() + "\n");
                    writer.write("Department: " + departmentComboBox.getValue() + "\n");
                    writer.write("Level-Term: " + leveltermComboBox.getValue() + "\n");
                    writer.write("Email: " + emailField.getText() + "\n");
                    writer.write("--------------------------------------------------\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("New Student Information");
                alert.setHeaderText("Welcome");
                alert.setContentText("Data is saved successfully");
                DialogPane dialogPane= alert.getDialogPane();
                dialogPane.setStyle(
                        "-fx-background-color: linear-gradient(to bottom, #FFEBEE, #FFCDD2);" +
                                "-fx-font-family: 'Times New Roman';" +
                                "-fx-font-size: 17px;" +
                                "-fx-text-fill: red;"
                );
                
                alert.setWidth(450);
                alert.setHeight(300);
                
                alert.showAndWait();
            }   }
    });

    Button exitButton = new Button("Exit");
    exitButton.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:red;-fx-text-fill:white");
    //exitButton set action.
    exitButton.setOnAction(ef -> {
    idField.clear();
    nameField.clear();
    departmentComboBox.getSelectionModel().clearSelection();
    leveltermComboBox.getSelectionModel().clearSelection();
    emailField.clear();
        
   });
    
    
    HBox buttonBox = new HBox(20, saveButton, exitButton);
    buttonBox.setAlignment(Pos.CENTER);

    formGrid.add(idLabel, 0, 0);
    formGrid.add(idField, 1, 0);

    formGrid.add(nameLabel, 0, 1);
    formGrid.add(nameField, 1, 1);

    formGrid.add(deptLabel, 0, 2);
    formGrid.add(departmentComboBox, 1, 2);

    formGrid.add(levelTermLabel, 0, 3);
    formGrid.add(leveltermComboBox, 1, 3);

    formGrid.add(emailLabel, 0, 4);
    formGrid.add(emailField, 1, 4);

    formGrid.add(buttonBox, 1, 5);


    // 🎯 Wrap form in a styled rectangle
    VBox rectangleBox = new VBox(formGrid);
    rectangleBox.setAlignment(Pos.CENTER);
    rectangleBox.setPadding(new Insets(30));
    rectangleBox.setStyle(
        "-fx-background-color:#FAFAD2;" +
        "-fx-border-color: black;" +
        "-fx-border-radius: 10px;" +
        "-fx-background-radius: 10px;" +
        "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.2), 10, 0, 0, 5);"
    );

    // Set size for the box
    rectangleBox.setMaxWidth(400);

     StackPane centeredPane = new StackPane(rectangleBox);
     centeredPane.setPadding(new Insets(50));
     centeredPane.setStyle("-fx-background-color: #e2f0ff;"); // changed to light blue


    newRoot.setCenter(centeredPane);
});

      booksInfo.setOnAction(ev -> {
    // Form layout
    GridPane bookFormGrid = new GridPane();
    bookFormGrid.setHgap(10);
    bookFormGrid.setVgap(10);
    bookFormGrid.setPadding(new Insets(20));
    bookFormGrid.setAlignment(Pos.CENTER);

    // Book ID
    Label bookIDLabel = new Label("Book ID: ");
    bookIDLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill: Black;-fx-font-family: 'Times New Roman';");
    TextField bookIDField = new TextField();
    bookIDField.setPromptText("Enter Book ID");

    // Book Name
    Label bookNameLabel = new Label("Book Name: ");
    bookNameLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill: Black;-fx-font-family: 'Times New Roman';");
    TextField bookNameField = new TextField();
    bookNameField.setPromptText("Enter Book Name");

    // Department
    Label deptLabel = new Label("Department: ");
    deptLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill: Black;-fx-font-family: 'Times New Roman';");
    ComboBox<String> departmentComboBox = new ComboBox<>();
    departmentComboBox.setPromptText("Select Department");
    departmentComboBox.getItems().addAll("CSE", "EEE", "ME", "CIVIL", "IPE");

    // Level-Term
    Label levelTermLabel = new Label("Level-Term: ");
    levelTermLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill: Black;-fx-font-family: 'Times New Roman';");
    ComboBox<String> leveltermComboBox = new ComboBox<>();
    leveltermComboBox.setPromptText("Select Level-Term");
    leveltermComboBox.getItems().addAll(
        "Level 1-Term I", "Level 1-Term II",
        "Level 2-Term I", "Level 2-Term II",
        "Level 3-Term I", "Level 3-Term II",
        "Level 4-Term I", "Level 4-Term II"
    );

    // Buttons
    Button searchButton = new Button("Search");
    searchButton.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:blue;-fx-text-fill:white");

    searchButton.setOnAction(event -> {
        String id = bookIDField.getText().trim();
        String name = bookNameField.getText().trim();
        String dept = departmentComboBox.getValue();
        String levelTerm = leveltermComboBox.getValue();

        // Sample books (with dummy IDs)
        List<Book> validBooks = List.of(
            new Book("01", "Data Structures and Algorithm I", "CSE", "Level 2-Term I"),
            new Book("02", "Digital Logic Design", "CSE", "Level 2-Term I"),
            new Book("03", "Applied Statistics for CSE", "CSE", "Level 2-Term I"),
            new Book("04", "Applied Statistics for CSE", "CSE", "Level 2-Term I"),
            new Book("05", "Applied Statistics for CSE", "CSE", "Level 2-Term I")
        );

        if (id.isEmpty() || name.isEmpty() || dept == null || levelTerm == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setHeaderText(null);
            alert.setContentText("Fill up all information, please");
            DialogPane dialogPane= alert.getDialogPane();
            dialogPane.setStyle("-fx-font-family: 'Times New Roman';-fx-font-size: 17px;-fx-background-color:#D1ECF1");
            alert.setWidth(450);
            alert.setHeight(300);
            alert.showAndWait();
        } else {
            Optional<Book> foundBook = validBooks.stream().filter(b ->
                b.getBookID().equalsIgnoreCase(id) &&
                b.getBookName().equalsIgnoreCase(name) &&
                b.getDepartment().equalsIgnoreCase(dept) &&
                b.getLevelTerm().equalsIgnoreCase(levelTerm)
            ).findFirst();

            if (foundBook.isPresent()) {
                Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                infoAlert.setTitle("Searching Book Result");
                infoAlert.setHeaderText("Book is found");
                infoAlert.setContentText(foundBook.get().toString());
                DialogPane dialogPane= infoAlert.getDialogPane();
                dialogPane.setStyle("-fx-font-family: 'Times New Roman';-fx-font-size: 17px;");
                infoAlert.setWidth(450);
                infoAlert.setHeight(300);
                infoAlert.showAndWait();
            } else {
                Alert notFoundAlert = new Alert(Alert.AlertType.ERROR);
                notFoundAlert.setTitle("Book Not Found");
                notFoundAlert.setHeaderText(null);
                notFoundAlert.setContentText("Sorry, the book \"" + name + "\" with ID \"" + id +
                        "\" is not available in " + dept + " (" + levelTerm + ").");
                
                DialogPane dialogPane=  notFoundAlert.getDialogPane();
                dialogPane.setStyle(
    "-fx-background-color: linear-gradient(to bottom, #FFEBEE, #FFCDD2);" +
    "-fx-font-family: 'Times New Roman';" +
    "-fx-font-size: 17px;" +
    "-fx-text-fill: red;"
);

                 notFoundAlert.setWidth(450);
                 notFoundAlert.setHeight(300);
                notFoundAlert.showAndWait();
            }
        }
    });

    Button exitButton = new Button("Exit");
    exitButton.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:red;-fx-text-fill:white");
    exitButton.setOnAction(evu -> {
        bookIDField.clear();
        bookNameField.clear();
        departmentComboBox.getSelectionModel().clearSelection();
        leveltermComboBox.getSelectionModel().clearSelection();
    });

    HBox buttonBox = new HBox(20, searchButton, exitButton);
    buttonBox.setAlignment(Pos.CENTER);

    // Add all to Grid
    bookFormGrid.add(bookIDLabel, 0, 0);
    bookFormGrid.add(bookIDField, 1, 0);
    bookFormGrid.add(bookNameLabel, 0, 1);
    bookFormGrid.add(bookNameField, 1, 1);
    bookFormGrid.add(deptLabel, 0, 2);
    bookFormGrid.add(departmentComboBox, 1, 2);
    bookFormGrid.add(levelTermLabel, 0, 3);
    bookFormGrid.add(leveltermComboBox, 1, 3);
    bookFormGrid.add(buttonBox, 1, 4);

    // Styled container like New Student
    VBox rectangleBox = new VBox(bookFormGrid);
    rectangleBox.setAlignment(Pos.CENTER);
    rectangleBox.setPadding(new Insets(30));
    rectangleBox.setStyle(
        "-fx-background-color:#FAFAD2;" +
        "-fx-border-color: black;" +
        "-fx-border-radius: 10px;" +
        "-fx-background-radius: 10px;" +
        "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.2), 10, 0, 0, 5);"
    );
    rectangleBox.setMaxWidth(450);

    StackPane centeredPane = new StackPane(rectangleBox);
    centeredPane.setPadding(new Insets(50));
    centeredPane.setStyle("-fx-background-color: #e2f0ff;"); // light blue

    // Show inside existing window
    newRoot.setCenter(centeredPane);
});

  
    borrowBook.setOnAction(ev -> {
    GridPane borrowGrid = new GridPane();
    borrowGrid.setHgap(10);
    borrowGrid.setVgap(10);
    borrowGrid.setPadding(new Insets(20));
    borrowGrid.setAlignment(Pos.CENTER);

    Label idLabel = new Label("Student ID: ");
    idLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField idField = new TextField();

    Label nameLabel = new Label("Student Name: ");
    nameLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField nameField = new TextField();
    
    Label bookidLabel = new Label("Book ID:");
    bookidLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField bookidField = new TextField();
    

    Label bookLabel = new Label("Book Name: ");
    bookLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField bookField = new TextField();

    Label dateLabel = new Label("Borrow Date: ");
    dateLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField dateField = new TextField();

    Label emailLabel = new Label("Email: ");
    emailLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField emailField = new TextField();

    Button borrowBtn = new Button("Save");
    borrowBtn.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:green;-fx-text-fill:white");

    Button existButton = new Button("Exit");
    existButton.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:red;-fx-text-fill:white");

    // Place Save and Exit buttons side by side
    HBox buttonBox = new HBox(20); // spacing between buttons
    buttonBox.getChildren().addAll(borrowBtn, existButton);
    buttonBox.setAlignment(Pos.CENTER); // align to right

    borrowGrid.add(idLabel, 0, 0);
    borrowGrid.add(idField, 1, 0);
    borrowGrid.add(nameLabel, 0, 1);
    borrowGrid.add(nameField, 1, 1);
    
    borrowGrid.add(bookidLabel,0,2);
    borrowGrid.add(bookidField,1,2);
    
    borrowGrid.add(bookLabel, 0, 3);
    borrowGrid.add(bookField, 1, 3);
    borrowGrid.add(dateLabel, 0, 4);
    borrowGrid.add(dateField, 1, 4);
    borrowGrid.add(emailLabel, 0, 5);
    borrowGrid.add(emailField, 1, 5);
    borrowGrid.add(buttonBox, 1, 6); // Add HBox instead of two separate buttons

    // Save button action
     borrowBtn.setOnAction(evSave -> {
    if (idField.getText().isEmpty() ||
        nameField.getText().isEmpty() ||
        bookidField.getText().isEmpty() ||
        bookField.getText().isEmpty() ||
        dateField.getText().isEmpty() ||
        emailField.getText().isEmpty()) {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill up all the information");
        DialogPane dialogPane= alert.getDialogPane();
        dialogPane.setStyle("-fx-font-family: 'Times New Roman';-fx-font-size: 17px;-fx-background-color:#D1ECF1");
        alert.setWidth(450);
        alert.setHeight(300);
        alert.showAndWait();
    } else {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Borrow Book");
        alert.setHeaderText("Welcome");
        alert.setContentText("Data is saved successfully");
        DialogPane dialogPane= alert.getDialogPane();
        dialogPane.setStyle(
    "-fx-background-color: linear-gradient(to bottom, #FFEBEE, #FFCDD2);" +
    "-fx-font-family: 'Times New Roman';" +
    "-fx-font-size: 17px;" +
    "-fx-text-fill: red;"
);

        alert.setWidth(450);
        alert.setHeight(300);
        alert.showAndWait();

        // Optionally print data to console
        System.out.println("Borrow Book Information:");
        System.out.println("Student ID: " + idField.getText());
        System.out.println("Student Name: " + nameField.getText());
        System.out.println("Book ID: " + bookidField.getText());
        System.out.println("Book Name: " + bookField.getText());
        System.out.println("Borrow Date: " + dateField.getText());
        System.out.println("Email: " + emailField.getText());
    }
});

    existButton.setOnAction(evExit -> {
    idField.clear();
    nameField.clear();
    bookidField.clear();
    bookField.clear();
    dateField.clear();
    emailField.clear();
    System.out.println("Form cleared by Exit button.");
});
    
     VBox rectangleBox = new VBox(borrowGrid);
rectangleBox.setAlignment(Pos.CENTER);
rectangleBox.setPadding(new Insets(30));


rectangleBox.setPrefWidth(390);   
rectangleBox.setPrefHeight(350);  
rectangleBox.setMaxWidth(450);    
rectangleBox.setMaxHeight(425);    


rectangleBox.setStyle(
    "-fx-background-color:#FAFAD2;" +
    "-fx-border-color: black;" +
    "-fx-border-radius: 10px;" +
    "-fx-background-radius: 10px;" +
    "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.3), 10, 0, 0, 5);"
);

// ✅ Proper center placement
newRoot.setCenter(rectangleBox); 
BorderPane.setAlignment(rectangleBox, Pos.CENTER);  
    System.out.println("Borrow Book clicked");
});
                  
    returnBook.setOnAction(ev -> {
    GridPane returnGrid = new GridPane();
    returnGrid.setHgap(10);
    returnGrid.setVgap(10);
    returnGrid.setPadding(new Insets(20));
    returnGrid.setAlignment(Pos.CENTER);

    Label idLabel = new Label("Student ID: ");
    idLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField idField = new TextField();

    Label nameLabel = new Label("Student Name: ");
    nameLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField nameField = new TextField();
    
    Label bookidLabel = new Label("Book ID:");
    bookidLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField bookidField = new TextField();
    

    Label bookLabel = new Label("Book Name: ");
    bookLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField bookField = new TextField();

    Label dateLabel = new Label("Return Date: ");
    dateLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField dateField = new TextField();

    Label emailLabel = new Label("Email: ");
    emailLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
    TextField emailField = new TextField();

    Button returnBtn = new Button("Save");
    returnBtn.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:green;-fx-text-fill:white");

    Button existButton = new Button("Exit");
    existButton.setStyle("-fx-padding: 4px;-fx-font-size:12px;-fx-background-color:red;-fx-text-fill:white");

    // Place Save and Exit buttons side by side
    HBox buttonBox = new HBox(20); // spacing between buttons
    buttonBox.getChildren().addAll(returnBtn, existButton);
    buttonBox.setAlignment(Pos.CENTER); // align to right

    returnGrid.add(idLabel, 0, 0);
    returnGrid.add(idField, 1, 0);
    returnGrid.add(nameLabel, 0, 1);
    returnGrid.add(nameField, 1, 1);
    
    returnGrid.add(bookidLabel,0,2);
    returnGrid.add(bookidField,1,2);
    
    returnGrid.add(bookLabel, 0, 3);
    returnGrid.add(bookField, 1, 3);
    returnGrid.add(dateLabel, 0, 4);
    returnGrid.add(dateField, 1, 4);
    returnGrid.add(emailLabel, 0, 5);
    returnGrid.add(emailField, 1, 5);
    returnGrid.add(buttonBox, 1, 6); // Add HBox instead of two separate buttons

    // Save button action
     returnBtn.setOnAction(evSave -> {
    if (idField.getText().isEmpty() ||
        nameField.getText().isEmpty() ||
        bookidField.getText().isEmpty() ||
        bookField.getText().isEmpty() ||
        dateField.getText().isEmpty() ||
        emailField.getText().isEmpty()) {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill up all the information");
        DialogPane dialogPane= alert.getDialogPane();
        dialogPane.setStyle("-fx-font-family: 'Times New Roman';-fx-font-size: 17px;-fx-background-color:#D1ECF1");
        
        


        alert.setWidth(450);
        alert.setHeight(300);
        alert.showAndWait();
    } else {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Return Book");
        alert.setHeaderText("Welcome");
        alert.setContentText("Data is saved successfully");
        DialogPane dialogPane= alert.getDialogPane();
        dialogPane.setStyle(
    "-fx-background-color: linear-gradient(to bottom, #FFEBEE, #FFCDD2);" +
    "-fx-font-family: 'Times New Roman';" +
    "-fx-font-size: 17px;" +
    "-fx-text-fill: red;");
        alert.setWidth(450);
        alert.setHeight(300);
        alert.showAndWait();

        // Optionally print data to console
        System.out.println("Return Book Information:");
        System.out.println("Student ID: " + idField.getText());
        System.out.println("Student Name: " + nameField.getText());
        System.out.println("Book ID: " + bookidField.getText());
        System.out.println("Book Name: " + bookField.getText());
        System.out.println("Return Date: " + dateField.getText());
        System.out.println("Email: " + emailField.getText());
    }
});

    existButton.setOnAction(evExit -> {
    idField.clear();
    nameField.clear();
    bookidField.clear();
    bookField.clear();
    dateField.clear();
    emailField.clear();
    System.out.println("Form cleared by Exit button.");
});
    
     VBox rectangleBox = new VBox(returnGrid);
rectangleBox.setAlignment(Pos.CENTER);
rectangleBox.setPadding(new Insets(30));


rectangleBox.setPrefWidth(350);   
rectangleBox.setPrefHeight(350);  
rectangleBox.setMaxWidth(400);    
rectangleBox.setMaxHeight(400);    


rectangleBox.setStyle(
    "-fx-background-color:#FAFAD2;" +  //#f0f8ff
            //-fx-background-color: #FFFACD; 
    "-fx-border-color: black;" +
    "-fx-border-radius: 10px;" +
    "-fx-background-radius: 10px;" +
    "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.3), 10, 0, 0, 5);"
);

// ✅ Proper center placement
newRoot.setCenter(rectangleBox); 
BorderPane.setAlignment(rectangleBox, Pos.CENTER);  
    System.out.println("Return Book clicked");
});
    
   //Application for the details portion.
    detailBook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ev) {
                // Create an empty GridPane (similar layout like Borrow Book)
                GridPane detailGrid = new GridPane();
                detailGrid.setHgap(10);
                detailGrid.setVgap(10);
                detailGrid.setPadding(new Insets(20));
                detailGrid.setAlignment(Pos.CENTER);
                
                
                TextArea studentDetailsArea = new TextArea();
                studentDetailsArea.setEditable(false);
                studentDetailsArea.setWrapText(true);
                studentDetailsArea.setPrefSize(400, 300);
                studentDetailsArea.setFont(Font.font("Times New Roman", 14));
                
                try {
                    File file = new File("students.txt");
                    if (file.exists()) {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        StringBuilder content = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                        reader.close();
                        studentDetailsArea.setText(content.toString());
                    } else {
                        studentDetailsArea.setText("No student records found.");
                    }
                } catch (IOException e) {
                    studentDetailsArea.setText("Error reading file: " + e.getMessage());
                    e.printStackTrace();
                }
                
                detailGrid.add(studentDetailsArea, 0, 0);
                
                // No labels, no textfields — it's an empty form layout
                
                // Wrap it in a VBox (just like Borrow Book)
                VBox rectangleBox = new VBox(detailGrid);
                rectangleBox.setAlignment(Pos.CENTER);
                rectangleBox.setPadding(new Insets(30));
                
                rectangleBox.setPrefWidth(470);
                rectangleBox.setPrefHeight(450);
                rectangleBox.setMaxWidth(420);
                rectangleBox.setMaxHeight(420);
                
                // Style same as borrow book form
                rectangleBox.setStyle(
                        "-fx-background-color:#FAFAD2;" +
                                "-fx-border-color: black;" +
                                "-fx-border-radius: 10px;" +
                                "-fx-background-radius: 10px;" +
                                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.3), 10, 0, 0, 5);"
                );
                
                // Place the empty form in center of the second window pane
                newRoot.setCenter(rectangleBox);
                BorderPane.setAlignment(rectangleBox, Pos.CENTER);  // Center it in BorderPane
                
                System.out.println("Details clicked — empty form displayed.");
            }
        });
 
    logout.setOnAction(evLogout -> {
    primaryStage.show(); // Show the primary login stage again
    newStage.close(); // Close the current stage
    System.out.println("Logout clicked");
    });

   Scene newScene = new Scene(newRoot, 650, 550);
   newStage.setTitle("Library System Panel");
   newStage.setScene(newScene);
   newStage.show();
   } 
            
   else {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Login Failed");          
    alert.setHeaderText("Invalid Username or Password");
    alert.setContentText("Please check your username & password again.");
    DialogPane dialogPane= alert.getDialogPane();
    dialogPane.setStyle(
    "-fx-background-color: linear-gradient(to bottom, #FFEBEE, #FFCDD2);" +
    "-fx-font-family: 'Times New Roman';" +
    "-fx-font-size: 17px;" +
    "-fx-text-fill: red;"
);

    alert.setWidth(450);
    alert.setHeight(300);
    alert.showAndWait();
        }
    });

        Label userLabel = new Label("Enter Username:");
        userLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
        HBox userBox = new HBox(10, userLabel, usernameField);
        userBox.setAlignment(Pos.CENTER);

        Label passLabel = new Label("Enter Password:");
        passLabel.setStyle("-fx-padding: 5px;-fx-font-size: 15px;-fx-text-fill:Black;-fx-font-family: 'Times New Roman';");
        HBox passBox = new HBox(10, passLabel, passwordField);
        passBox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(userBox, passBox, loginButton);

        root.setCenter(vbox);
        Scene scene = new Scene(root, 450, 450);
        primaryStage.setTitle("Library Management System");
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(500);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
