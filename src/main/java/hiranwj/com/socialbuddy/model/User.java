package hiranwj.com.socialbuddy.model;

import java.util.ArrayList;

public class User {
    private int id;
    private String fisrtName;
    private String lastName;
    private String email;
    private String password;
    private ArrayList<Post> posts;
    private ArrayList<Comment> comments;
    private ArrayList<Post> likes;
    private ArrayList<User> friends;

    public User() {
    }

    public User(int id, String fisrtName, String lastName, String email, String password, ArrayList<Post> posts, ArrayList<Comment> comments, ArrayList<Post> likes, ArrayList<User> friends) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.posts = posts;
        this.comments = comments;
        this.likes = likes;
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public ArrayList<Post> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<Post> likes) {
        this.likes = likes;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    public ArrayList<Integer> getFrindsIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (User friend : friends) {
            ids.add(friend.getId());
        }
        return ids;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", posts=" + posts +
                ", comments=" + comments +
                ", likes=" + likes +
                ", friends=" + friends +
                '}';
    }
}
