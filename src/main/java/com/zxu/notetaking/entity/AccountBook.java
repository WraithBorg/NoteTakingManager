package com.zxu.notetaking.entity;

import javax.persistence.*;

@Table(name = "accountbook")
public class AccountBook {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 账本名
     */
    private String name;

    /**
     * 描述
     */
    @Column(name = "imgUrl")
    private String imgurl;

    /**
     * 用户
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取账本名
     *
     * @return name - 账本名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置账本名
     *
     * @param name 账本名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取描述
     *
     * @return imgUrl - 描述
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置描述
     *
     * @param imgurl 描述
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * 获取用户
     *
     * @return userId - 用户
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户
     *
     * @param userid 用户
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public AccountBook(String id,String name, String imgurl, String userid) {
        this.id = id;
        this.name = name;
        this.imgurl = imgurl;
        this.userid = userid;
    }
}