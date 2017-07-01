package server;

import java.util.Date;

/**
 * Created by Piotr Szyma on 08.06.2017.
 */
public class ServerLogger {
    public static void log(String message) {
        Date dateNow = new Date();
        System.out.println(dateNow.toString().substring(0, 19) + ": " + message);
    }
}
