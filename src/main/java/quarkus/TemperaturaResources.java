package quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/temperaturas")
public class TemperaturaResources {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatura medicion(){
        return new Temperatura("Piura",26,36);
    }
}
