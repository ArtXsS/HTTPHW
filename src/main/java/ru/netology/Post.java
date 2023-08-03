package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final int id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public Post(
            @JsonProperty("id") int id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "\nid=" + id +
                "\ntext='" + text + '\'' +
                "\ntype='" + type + '\'' +
                "\nuser='" + user + '\'' +
                "\nuptovers=" + upvotes +
                '}';
    }
}
