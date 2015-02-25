import io.firat.examples.jaxrswebapp.rs.HelloWorld;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import javax.ws.rs.core.Application;
import static org.junit.Assert.assertEquals;



public final class HelloWorldTest extends JerseyTest {



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    @Test
    public void testSayHello() {

        final String hello = target("hello").request()
                                            .get(String.class);

        assertEquals("Hello World!", hello);
    }



    //~ ----------------------------------------------------------------------------------------------------------------

    @Override
    protected Application configure() {

        return new ResourceConfig(HelloWorld.class);
    }
}
