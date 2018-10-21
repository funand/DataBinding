package com.example.prince.databindingass;

import java.util.List;


public class UFC {

    private int id;
    private String externalUrlText;
    private String author;
    private String title;
    private Object articleMediaId;
    private String articleDate;
    private String thumbnail;
    private String externalUrl;
    private String introduction;
    private Object articleFighterId;
    private String featuredNewsCategory;
    private String lastModified;
    private String urlName;
    private String created;
    private List<Integer> keywordIds = null;
    private String publishedStartDate;

    public UFC(int id, String externalUrlText, String author, String title, Object articleMediaId, String articleDate, String thumbnail, String externalUrl, String introduction, Object articleFighterId, String featuredNewsCategory, String lastModified, String urlName, String created, List<Integer> keywordIds, String publishedStartDate) {
        this.id = id;
        this.externalUrlText = externalUrlText;
        this.author = author;
        this.title = title;
        this.articleMediaId = articleMediaId;
        this.articleDate = articleDate;
        this.thumbnail = thumbnail;
        this.externalUrl = externalUrl;
        this.introduction = introduction;
        this.articleFighterId = articleFighterId;
        this.featuredNewsCategory = featuredNewsCategory;
        this.lastModified = lastModified;
        this.urlName = urlName;
        this.created = created;
        this.keywordIds = keywordIds;
        this.publishedStartDate = publishedStartDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExternalUrlText() {
        return externalUrlText;
    }

    public void setExternalUrlText(String externalUrlText) {
        this.externalUrlText = externalUrlText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getArticleMediaId() {
        return articleMediaId;
    }

    public void setArticleMediaId(Object articleMediaId) {
        this.articleMediaId = articleMediaId;
    }

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Object getArticleFighterId() {
        return articleFighterId;
    }

    public void setArticleFighterId(Object articleFighterId) {
        this.articleFighterId = articleFighterId;
    }

    public String getFeaturedNewsCategory() {
        return featuredNewsCategory;
    }

    public void setFeaturedNewsCategory(String featuredNewsCategory) {
        this.featuredNewsCategory = featuredNewsCategory;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<Integer> getKeywordIds() {
        return keywordIds;
    }

    public void setKeywordIds(List<Integer> keywordIds) {
        this.keywordIds = keywordIds;
    }

    public String getPublishedStartDate() {
        return publishedStartDate;
    }

    public void setPublishedStartDate(String publishedStartDate) {
        this.publishedStartDate = publishedStartDate;
    }

}