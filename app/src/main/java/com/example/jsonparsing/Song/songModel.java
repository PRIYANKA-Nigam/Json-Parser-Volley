package com.example.jsonparsing.Song;

public class songModel {
    String image,url,title;

    public songModel(String image, String url, String title) {
        this.image = image;
        this.url = url;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
