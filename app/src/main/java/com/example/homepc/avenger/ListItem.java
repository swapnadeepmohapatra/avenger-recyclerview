package com.example.homepc.avenger;

public class ListItem {

    private String head;
    private String release;
    private String desc;
    private String imageUrl;

    public ListItem(String head, String release, String desc, String imageUrl) {
        this.head = head;
        this.release = release;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public String getHead() {
        return head;
    }

    public String getRelease() {
        return release;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
