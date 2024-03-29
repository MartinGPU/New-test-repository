package com.marat.test.properties;

import com.marat.config.CredentialsConfig;
import com.marat.test.TestBase;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

@Tag("properties")
public class OwnerTests extends TestBase {

    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
    @Test
    void readCredentialsTest() {
        String login = credentials.login();
        String password = credentials.password();
        String url = credentials.url();

        String message = format("login = %s, password = %s", login, password);
        String message2 = format("url = %s", url);
        System.out.println(message);
        System.out.println(message2);
    }
}
