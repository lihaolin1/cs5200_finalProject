package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Widget extends LearningModule{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne
//    @JsonIgnore
//    private LearningModule learningModule;
	private String Widget_name;
	
	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "widget")
    private List<RawHtml> rawHtmls = new ArrayList<>();

	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "widget")
    private List<Slide> slides = new ArrayList<>();

	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "widget")
    private List<textDocument> textDocuments = new ArrayList<>();

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "widget")
    private List<YoutubeVideo> youtubeVideos = new ArrayList<>();

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

//    public void setRawHtmls(List<RawHtml> rawHtmls) {
//        this.rawHtmls = rawHtmls;
//    }
//
//    public LearningModule getLearningModule() {
//        return learningModule;
//    }
//
//    public void setLearningModule(LearningModule learningModule) {
//        this.learningModule = learningModule;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public Widget() {
    }

	public String getWidget_name() {
		return Widget_name;
	}

	public void setWidget_name(String widget_name) {
		Widget_name = widget_name;
	}
}
