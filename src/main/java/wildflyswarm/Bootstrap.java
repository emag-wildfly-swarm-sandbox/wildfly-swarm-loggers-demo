package wildflyswarm;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.config.logging.Level;
import org.wildfly.swarm.logging.LoggingFraction;

public class Bootstrap {

  private static final String FILE_HANDLER_KEY = "FILE";
  private static final String FILE_PATH = "server.log";
  private static final String FILE_FORMATTER = "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n";

  public static void main(String[] args) throws Exception {
    Swarm swarm = new Swarm();

    swarm.fraction(LoggingFraction.createDefaultLoggingFraction()
      .defaultFormatter()
      .fileHandler(FILE_HANDLER_KEY, FILE_PATH, Level.ALL, FILE_FORMATTER)
      .rootLogger(Level.INFO, LoggingFraction.CONSOLE, FILE_HANDLER_KEY)
      .logger("one", l -> l
        .level(Level.INFO)
      )
      .logger("one.two", l -> l
        .level(Level.DEBUG)
      )
      .logger("one.two.three", l -> l
        .level(Level.TRACE)
      ));

    swarm.start().deploy();
  }

}
