import io.firat.examples.jaxrswebapp.rs.HelloWorld;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import javax.ws.rs.core.Application;
import static org.junit.Assert.assertEquals;



public final class HelloWorldTest extends JerseyTest {



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    @Test
    public void testMultiply() {

        final int    a      = 12;
        final int    b      = 6;
        final String result = target("/multiply/" + a + "/" + b).request()
                                                                .get(String.class);

        assertEquals("72", result);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @Test
    public void testSayHello() {

        final String name  = "FIRAT";
        final String hello = target("/hello/" + name).request()
                                                     .get(String.class);

        assertEquals("Hello " + name + "!", hello);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @Test
    public void testSayHelloWorld() {

        final String hello = target("/hello").request()
                                             .get(String.class);

        assertEquals("Hello World!", hello);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @Override
    protected Application configure() {

        return new ResourceConfig(HelloWorld.class);
    }
}
