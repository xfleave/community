package com.lb.model;

/**
 * @author 李彪(libiao)
 * 2019/10/12   12:18
 */
public class Question {
    private Integer id;
    private String title;
    private Long create_time;
    private Long gmt_modified;
    private Integer creator;
    private Integer comment_count;
    private Integer view_count;
    private Integer like_count;
    private String tag;

    public Question() {
    }

    public Question(String title, Long create_time, Long gmt_modified, Integer creator, Integer comment_count, Integer view_count, Integer like_count, String tag) {
        this.title = title;
        this.create_time = create_time;
        this.gmt_modified = gmt_modified;
        this.creator = creator;
        this.comment_count = comment_count;
        this.view_count = view_count;
        this.like_count = like_count;
        this.tag = tag;
    }

    public Question(Integer id, String title, Long create_time, Long gmt_modified, Integer creator, Integer comment_count, Integer view_count, Integer like_count, String tag) {
        this.id = id;
        this.title = title;
        this.create_time = create_time;
        this.gmt_modified = gmt_modified;
        this.creator = creator;
        this.comment_count = comment_count;
        this.view_count = view_count;
        this.like_count = like_count;
        this.tag = tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Long gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
