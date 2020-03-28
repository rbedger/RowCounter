package com.robenheimer.rowcounter.ui.doproject;

import androidx.lifecycle.ViewModel;

public class DoProjectViewModel extends ViewModel {
    private String id;
    private String content;
    private String details;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
