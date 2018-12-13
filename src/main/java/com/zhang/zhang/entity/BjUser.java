package com.zhang.zhang.entity;

import com.zhang.zhang.entity.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张铁志
 * @since 2018-12-05
 */
public class BjUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String headImage;

    private String blogCover;

    private String qrCode;

    private String createBy;

    private String updateBy;

    private Boolean isRemind;


    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getBlogCover() {
        return blogCover;
    }

    public void setBlogCover(String blogCover) {
        this.blogCover = blogCover;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Boolean getRemind() {
        return isRemind;
    }

    public void setRemind(Boolean isRemind) {
        this.isRemind = isRemind;
    }

    @Override
    public String toString() {
        return "BjUser{" +
        "headImage=" + headImage +
        ", blogCover=" + blogCover +
        ", qrCode=" + qrCode +
        ", createBy=" + createBy +
        ", updateBy=" + updateBy +
        ", isRemind=" + isRemind +
        "}";
    }
}
