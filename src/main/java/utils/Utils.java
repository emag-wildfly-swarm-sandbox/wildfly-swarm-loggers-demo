package utils;

import org.jboss.logging.Logger;

public class Utils {

  public static void log(Logger logger) {
    logger.trace("This is TRACE log");
    logger.debug("This is DEBUG log");
    logger.info ("This is INFO  log");
    logger.warn ("This is WARN  log");
    logger.error("This is ERROR log");
  }

}
