package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class YoutubeVideo {
    @Id
    private String YoutubeVideo;

    @ManyToOne
    @JsonIgnore
    private Widget widget;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public String getYoutubeVideo() {
        return YoutubeVideo;
    }

    public void setYoutubeVideo(String youtubeVideo) {
        YoutubeVideo = youtubeVideo;
    }

    public YoutubeVideo() {
    }
}
