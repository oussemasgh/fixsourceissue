module com.example.fixsourceissue {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.fixsourceissue to javafx.fxml;
    exports com.example.fixsourceissue;
}