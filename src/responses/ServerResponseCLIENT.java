package responses;

import server.ServerRequest;
/**
 * @author Piotr Szyma
 */

public class ServerResponseCLIENT implements ServerResponse {

    private String response;

    public ServerResponseCLIENT(ServerRequest request) {
        response = request.getRequest();
    }

    @Override
    public String get() {
        return response;
    }
}
