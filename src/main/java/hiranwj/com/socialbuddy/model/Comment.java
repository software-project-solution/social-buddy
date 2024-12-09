package hiranwj.com.socialbuddy.model;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private String content;
    private User user;
    private LocalDateTime dateTime;

    public Comment() {
    }

    public Comment(int id, String content, User user, LocalDateTime dateTime) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", dateTime=" + dateTime +
                '}';
    }
}
