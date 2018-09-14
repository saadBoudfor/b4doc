package fr.b4.apps.gateway;

/**
 * Created by sboudfor on 14/09/2018.
 * Provide fictive user.
 */
public class UserPluginMock implements UserPlugin {
    @Override
    public Boolean isStillConnected(String token) {
        return null;
    }

    @Override
    public User getUserDetails(String publicID) {
        User user = null;
        if(publicID.equals("gw:12345")) {
            user = User.builder()
                    .firstName("Sara")
                    .lastName("One")
                    .phone("0766778877")
                    .email("sara.one@email.com")
                    .build();
        }
        return user;
    }

    @Override
    public String login(User user, String password) {
        return null;
    }

    @Override
    public String logout(User user, String password) {
        return null;
    }
}
