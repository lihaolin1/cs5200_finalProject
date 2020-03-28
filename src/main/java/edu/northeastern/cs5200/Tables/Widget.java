package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonIgnore
    private LearningModule learningModule;

    @OneToMany(mappedBy = "widget")
    private List<RawHtml> rawHtmls;

    @OneToMany(mappedBy = "widget")
    private List<Slide> slides;

    @OneToMany(mappedBy = "widget")
    private List<textDocument> textDocuments;

    @OneToMany(mappedBy = "widget")
    private List<YoutubeVideo> youtubeVideos;

    public List<YoutubeVideo> getYoutubeVideos() {
        return youtubeVideos;
    }

    public void setYoutubeVideos(List<YoutubeVideo> youtubeVideos) {
        this.youtubeVideos = youtubeVideos;
    }

    public List<textDocument> getTextDocuments() {
        return textDocuments;
    }

    public void setTextDocuments(List<textDocument> textDocuments) {
        this.textDocuments = textDocuments;
    }

    public List<Slide> getSlides() {
        return slides;
    }

    public void setSlides(List<Slide> slides) {
        this.slides = slides;
    }

    public List<RawHtml> getRawHtmls() {
        return rawHtmls;
    }

    public void setRawHtmls(List<RawHtml> rawHtmls) {
        this.rawHtmls = rawHtmls;
    }

    public LearningModule getLearningModule() {
        return learningModule;
    }

    public void setLearningModule(LearningModule learningModule) {
        this.learningModule = learningModule;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Widget() {
    }
}
