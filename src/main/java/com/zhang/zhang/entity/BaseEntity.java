package com.zhang.zhang.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.zhang.zhang.config.BeanUtils;

public class BaseEntity extends BeanUtils implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.ID_WORKER_STR)
	protected String id;
	protected String remark; // 备注
	@TableField(fill = FieldFill.INSERT)
	protected Date createDate; // 创建日期
	@TableField(fill = FieldFill.INSERT_UPDATE)
	protected Date updateDate; // 更新日期
	@TableLogic
	protected String delFlag; // 备注
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
