package hiranwj.com.socialbuddy.model;

import java.util.HashSet;
import java.util.Set;

public class Channel {

    private static Channel instance;
    private final Set<String> subscribers;
    private StringBuilder posts;

    private Channel() {
        subscribers = new HashSet<>();
        posts = new StringBuilder();
    }

    public static synchronized Channel getInstance() {
        if (instance == null) {
            instance = new Channel();
        }
        return instance;
    }

    public void postMessage(String message) {
        posts.append(message).append("\n");
    }

    public String getPosts() {
        return posts.toString();
    }

    public void subscribe(String user) throws Exception {
        if (!subscribers.add(user)) {
            throw new Exception("User is already subscribed!");
        }
    }

    public void unsubscribe(String user) throws Exception {
        if (!subscribers.remove(user)) {
            throw new Exception("User is not subscribed!");
        }
    }

    public Set<String> getSubscribers() {
        return subscribers;
    }
}
