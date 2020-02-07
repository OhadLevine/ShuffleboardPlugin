package customplugins;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.scene.layout.Pane;

@Description(dataTypes = Boolean.class, name = "my test widget")
public class buttonWidget extends SimpleAnnotatedWidget {
    protected Pane buttonWidgetPane;

    public Pane getView() {
        return buttonWidgetPane;
    }

}