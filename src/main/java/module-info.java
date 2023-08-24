module com.example.match_gara {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.match_gara to javafx.fxml;
    exports com.example.match_gara;
}