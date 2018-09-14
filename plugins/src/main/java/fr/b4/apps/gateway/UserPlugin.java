package fr.b4.apps.gateway;

/**
 * Created by sboudfor on 14/09/2018.
 * Connect to B4authentication.
 */
public interface UserPlugin {
     Boolean isStillConnected(String token);
     User getUserDetails(String publicID);
     String login(User user, String password);
     String logout(User user, String password);
}
