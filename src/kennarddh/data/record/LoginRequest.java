package kennarddh.data.record;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Create login request");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
