package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class textDocument {
    @Id
    private String textDocument;

    @ManyToOne
    @JsonIgnore
    private Widget widget;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public String getTextDocument() {
        return textDocument;
    }

    public void setTextDocument(String textDocument) {
        this.textDocument = textDocument;
    }

    public textDocument() {
    }
}
