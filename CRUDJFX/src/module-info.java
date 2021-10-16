module CRUDJFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
	opens model to javafx.graphics, javafx.fxml, javafx.base;
}
