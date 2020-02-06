package customplugins;

import java.util.List;
import java.util.Map;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

@Description(
    group = "com.example",
    name = "Example Plugin",
    version = "0.0.0",
    summary = "An example plugin")
public class ExamplePlugin extends Plugin {

    // Gets the data types defined by this plugin
    @Override
    public List<DataType> getDataTypes() {
        return List.of(Point2DType.Instance);
    }

    // Gets the components defined by this plugin
    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(Point2DWidget.class));
    }

    // Gets the default components to use for each data type
    @Override
    public Map<DataType, ComponentType> getDefaultComponents() {
        return Map.of(Point2DType.Instance, WidgetType.forAnnotatedWidget(Point2DWidget.class));
    }
}