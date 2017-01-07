package one.two;

import org.jboss.logging.Logger;
import utils.Utils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/two")
public class TwoController {

  private final Logger logger = Logger.getLogger(getClass());

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String get() {
    Utils.log(logger);
    return "{\"value\":\"Hello\"}";
  }

}
