package com.dytian.yuemee.common.entity;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class Jd_user extends Model<Jd_user> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
	@TableId(value="user_id", type= IdType.AUTO)
	private Integer user_id;
    /**
     * 推荐人ID(第一次可更换)
     */
	private Integer inviter_id;
    /**
     * 唯一标示
     */
	private String app_wx_id;
    /**
     * openid
     */
	private String open_id;
    /**
     * open_id_wx
     */
	private String open_id_wx;
    /**
     * 手机号
     */
	private String phone;
    /**
     * 钱包余额
     */
	private BigDecimal wallet;
    /**
     * 昵称
     */
	private String nick_name;
    /**
     * 头像
     */
	private String head_icon;
    /**
     * 0,正常状态；1,来源于一二线推广
     */
	private Integer status;
    /**
     * 创建时间
     */
	private Date create_time;


	public Integer getUser_id() {
		return user_id;
	}

	public Jd_user setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public Integer getInviter_id() {
		return inviter_id;
	}

	public Jd_user setInviter_id(Integer inviter_id) {
		this.inviter_id = inviter_id;
		return this;
	}

	public String getApp_wx_id() {
		return app_wx_id;
	}

	public Jd_user setApp_wx_id(String app_wx_id) {
		this.app_wx_id = app_wx_id;
		return this;
	}

	public String getOpen_id() {
		return open_id;
	}

	public Jd_user setOpen_id(String open_id) {
		this.open_id = open_id;
		return this;
	}

	public String getOpen_id_wx() {
		return open_id_wx;
	}

	public Jd_user setOpen_id_wx(String open_id_wx) {
		this.open_id_wx = open_id_wx;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public Jd_user setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public BigDecimal getWallet() {
		return wallet;
	}

	public Jd_user setWallet(BigDecimal wallet) {
		this.wallet = wallet;
		return this;
	}

	public String getNick_name() {
		return nick_name;
	}

	public Jd_user setNick_name(String nick_name) {
		this.nick_name = nick_name;
		return this;
	}

	public String getHead_icon() {
		return head_icon;
	}

	public Jd_user setHead_icon(String head_icon) {
		this.head_icon = head_icon;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public Jd_user setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Jd_user setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.user_id;
	}

	@Override
	public String toString() {
		return "Jd_user{" +
			"user_id=" + user_id +
			", inviter_id=" + inviter_id +
			", app_wx_id=" + app_wx_id +
			", open_id=" + open_id +
			", open_id_wx=" + open_id_wx +
			", phone=" + phone +
			", wallet=" + wallet +
			", nick_name=" + nick_name +
			", head_icon=" + head_icon +
			", status=" + status +
			", create_time=" + create_time +
			"}";
	}
}
