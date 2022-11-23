/**
 * generated by Xtext 2.28.0
 */
package gameoflife.grid.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import gameoflife.grid.GameDSLRuntimeModule;
import gameoflife.grid.GameDSLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GameDSLIdeSetup extends GameDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    GameDSLRuntimeModule _gameDSLRuntimeModule = new GameDSLRuntimeModule();
    GameDSLIdeModule _gameDSLIdeModule = new GameDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_gameDSLRuntimeModule, _gameDSLIdeModule));
  }
}