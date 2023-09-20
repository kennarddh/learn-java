package kennarddh.main;

import kennarddh.data.record.LoginRequest;

public class RecordMain {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("username", "password");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        LoginRequest loginRequestOverloaded = new LoginRequest("username");

        System.out.println(loginRequestOverloaded.username());
        System.out.println(loginRequestOverloaded.password());
        System.out.println(loginRequestOverloaded);

        LoginRequest loginRequestOverloaded2 = new LoginRequest();

        System.out.println(loginRequestOverloaded2.username());
        System.out.println(loginRequestOverloaded2.password());
        System.out.println(loginRequestOverloaded2);
    }
}
