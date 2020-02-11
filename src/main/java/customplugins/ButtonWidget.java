package customplugins;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@Description(dataTypes = Boolean.class, name = "my test widget")
public final class ButtonWidget extends SimpleAnnotatedWidget {

    @FXML
    protected Pane buttonWidgetPane;

    public Pane getView() {
        return buttonWidgetPane;
    }

}