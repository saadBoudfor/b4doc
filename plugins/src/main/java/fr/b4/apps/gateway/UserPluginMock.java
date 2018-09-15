package fr.b4.apps.gateway;

/**
 * Created by sboudfor on 14/09/2018.
 * Provide fictive user.
 */
public class UserPluginMock implements UserPlugin {
    private static final String DUMP_TOKEN = "";
    @Override
    public Boolean isStillConnected(String token) {
        return token.equals(DUMP_TOKEN);
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
        return DUMP_TOKEN;
    }

    @Override
    public String logout(User user, String password) {
        return DUMP_TOKEN;
    }
}
