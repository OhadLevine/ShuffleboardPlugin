package customplugins;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import java.util.List;
import com.google.common.collect.ImmutableList;

@Description(
    group = "TRIGON.5990",
    name = "TrigonTheme",
    version = "2020.1.0",
    summary = "Trigons color theme plugin"
)
public class TrigonPlugin extends Plugin {

  private final Theme TrigonTheme = new Theme(getClass(), "Trigon Theme", "TrigonTheme.css");

  @Override
  public List<Theme> getThemes() {
    return List.of(TrigonTheme);
  }

  @Override
  public List<ComponentType> getComponents(){
    return ImmutableList.of(WidgetType.forAnnotatedWidget(buttonWidget.class));
  }
}