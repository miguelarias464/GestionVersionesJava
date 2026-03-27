package model;

public class User {
    private int userId;
    private String username;
    private String email;
    private String passwordHash;
    private String status;
    private String createdAt;

    public User(int userId, String username, String email, String passwordHash, String status, String createdAt) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getUserId() { return userId; }
    public String getUsername() { return username; }
}