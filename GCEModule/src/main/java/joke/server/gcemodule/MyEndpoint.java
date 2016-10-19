/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package joke.server.gcemodule;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.io.UnsupportedEncodingException;

import fetch.a.joke.JokeFetcher;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "gcemodule.server.joke",
                ownerName = "gcemodule.server.joke",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() throws UnsupportedEncodingException {
        MyBean response = new MyBean();
        response.setData((new JokeFetcher()).fetchJoke());

        return response;
    }

}
