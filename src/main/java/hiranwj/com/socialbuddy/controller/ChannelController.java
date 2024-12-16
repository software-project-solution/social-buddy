package hiranwj.com.socialbuddy.controller;

import hiranwj.com.socialbuddy.model.Channel;

import java.util.Set;

public class ChannelController {
    private final Channel channel;

    public ChannelController() {
        this.channel = Channel.getInstance();
    }

    public void postMessage(String message) {
        channel.postMessage(message);
    }

    public String getPosts() {
        return channel.getPosts();
    }

    public void subscribe(String user) throws Exception {
        channel.subscribe(user);
    }

    public void unsubscribe(String user) throws Exception {
        channel.unsubscribe(user);
    }

    public Set<String> getSubscribers() {
        return channel.getSubscribers();
    }
}
