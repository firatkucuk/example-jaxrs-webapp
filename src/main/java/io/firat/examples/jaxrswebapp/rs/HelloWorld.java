
package io.firat.examples.jaxrswebapp.rs;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/")
public final class HelloWorld {



    //~ --- [CONSTRUCTORS] ---------------------------------------------------------------------------------------------

    public HelloWorld() {

    }



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public int mulitiply(@PathParam("a") final int a,
            @PathParam("b") final int b) {

        return a * b;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @GET
    @Path("/hello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") final String name) {

        return "hello " + name;
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloWorld() {

        return "Hello World!";
    }
}
