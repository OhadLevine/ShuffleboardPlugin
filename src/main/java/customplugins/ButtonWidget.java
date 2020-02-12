package customplugins;

import edu.wpi.first.shuffleboard.api.data.types.NoneType;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@Description(dataTypes = { NoneType.class }, name = "My Test Widget")
@ParametrizedController(value = "ButtonWidget.fxml")
public class ButtonWidget extends SimpleAnnotatedWidget {

    @FXML
    protected Pane _thePane;

    public Pane getView() {
        return _thePane;
    }
}