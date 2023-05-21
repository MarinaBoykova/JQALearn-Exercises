package Homework7;

import java.util.UUID;

public class generateRandomString {

    // Java method to generate a random string
    public static String generateRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "") + "_Automation";
    }
}
