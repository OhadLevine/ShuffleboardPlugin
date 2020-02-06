package customplugins;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;
import java.util.List;

@Description(
    group = "TRIGON.5990",
    name = "TrigonTheme",
    version = "2020.1.0",
    summary = "Trigons color theme plugin"
)
public final class TrigonThemePlugin extends Plugin {

  private final Theme TrigonTheme = new Theme(getClass(), "Trigon Theme", "TrigonTheme.css");

  @Override
  public List<Theme> getThemes() {
    return List.of(TrigonTheme);
  }
}