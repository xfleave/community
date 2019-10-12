package com.lb.model;

/**
 * @author 李彪(libiao)
 * 2019/10/12   10:06
 */
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long createTime;
    private Long getModifie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getGetModifie() {
        return getModifie;
    }

    public void setGetModifie(Long getModifie) {
        this.getModifie = getModifie;
    }
}
