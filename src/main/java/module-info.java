module com.example.empresa {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.empresa to javafx.fxml;
    exports com.example.empresa;
}