package com.nmaokafor.android.fashionnews;

public class Fashion {
    String section;
    String title;
    String author;
    String url;
    String date;

    public Fashion(String section, String title, String author, String url, String date) {
        this.section = section;
        this.title = title;
        this.author = author;
        this.url = url;
        this.date = date;

    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Fashion{" +
                "section='" + section + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
