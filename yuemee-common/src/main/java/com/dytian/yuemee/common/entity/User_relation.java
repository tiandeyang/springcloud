package com.dytian.yuemee.common.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户关系表
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class User_relation extends Model<User_relation> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
	private Integer user_id;
    /**
     * 归属经理ID
     */
	private Integer director_id;
    /**
     * 总监ID
     */
	private Integer cheif_id;
    /**
     * 推荐人ID
     */
	private Integer inviter_id;
    /**
     * 用户级别 0,访客；1,VIP;2,总监;3,经理
     */
	private Integer level_u;
    /**
     * 0,无效；1，有效
     */
	private Integer status;
	private Integer inner1;
    /**
     * 状态来源，0=NONE,1=内部,2=付费,3=卡邀VIP,4=无码付费,5=内部职能部
     */
	private Integer vip_from;
    /**
     * 0=NONE,1=内部,2=晋升,3=卡位,4=卡邀,5=特批,6=内部职能部门
     */
	private Integer cheif_from;
    /**
     * 状态来源，0=NONE,1=内部经理,2=晋升,3=卡位,4=特批经理,5=特批卡位经理
     */
	private Integer director_from;
    /**
     * 创建时间
     */
	private Date create_time;
    /**
     * 成为有效VIP的时间
     */
	private Date vip_valid_time;
    /**
     * 成为有效总监的时间
     */
	private Date cheif_valid_time;
    /**
     * 成为有效经理的时间
     */
	private Date director_valid_time;
    /**
     * 升级VIP时间
     */
	private Date vip_upgrade_time;
    /**
     * 总监升级时间
     */
	private Date cheif_upgrade_time;
    /**
     * 经理升级时间
     */
	private Date director_upgrade_time;
    /**
     * 卡位标示 2 经理 3 经理
     */
	private String target_level;
    /**
     * 更新时间
     */
	private Date update_time;
    /**
     * 团队标识
     */
	private Integer permission;
    /**
     * 内部总经理类型：0：职能部，1：直营部
     */
	private Integer director_type;
    /**
     * 总监编号备份
     */
	private Integer cheif_id_bak;
    /**
     * 总监变换时间
     */
	private String cheif_id_update_time;
    /**
     * 总监变换是否改变：0：未改变 ， 1：改变
     */
	private Integer cheif_id_status;


	public Integer getUser_id() {
		return user_id;
	}

	public User_relation setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public Integer getDirector_id() {
		return director_id;
	}

	public User_relation setDirector_id(Integer director_id) {
		this.director_id = director_id;
		return this;
	}

	public Integer getCheif_id() {
		return cheif_id;
	}

	public User_relation setCheif_id(Integer cheif_id) {
		this.cheif_id = cheif_id;
		return this;
	}

	public Integer getInviter_id() {
		return inviter_id;
	}

	public User_relation setInviter_id(Integer inviter_id) {
		this.inviter_id = inviter_id;
		return this;
	}

	public Integer getLevel_u() {
		return level_u;
	}

	public User_relation setLevel_u(Integer level_u) {
		this.level_u = level_u;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public User_relation setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Integer getInner1() {
		return inner1;
	}

	public User_relation setInner1(Integer inner1) {
		this.inner1 = inner1;
		return this;
	}

	public Integer getVip_from() {
		return vip_from;
	}

	public User_relation setVip_from(Integer vip_from) {
		this.vip_from = vip_from;
		return this;
	}

	public Integer getCheif_from() {
		return cheif_from;
	}

	public User_relation setCheif_from(Integer cheif_from) {
		this.cheif_from = cheif_from;
		return this;
	}

	public Integer getDirector_from() {
		return director_from;
	}

	public User_relation setDirector_from(Integer director_from) {
		this.director_from = director_from;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public User_relation setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public Date getVip_valid_time() {
		return vip_valid_time;
	}

	public User_relation setVip_valid_time(Date vip_valid_time) {
		this.vip_valid_time = vip_valid_time;
		return this;
	}

	public Date getCheif_valid_time() {
		return cheif_valid_time;
	}

	public User_relation setCheif_valid_time(Date cheif_valid_time) {
		this.cheif_valid_time = cheif_valid_time;
		return this;
	}

	public Date getDirector_valid_time() {
		return director_valid_time;
	}

	public User_relation setDirector_valid_time(Date director_valid_time) {
		this.director_valid_time = director_valid_time;
		return this;
	}

	public Date getVip_upgrade_time() {
		return vip_upgrade_time;
	}

	public User_relation setVip_upgrade_time(Date vip_upgrade_time) {
		this.vip_upgrade_time = vip_upgrade_time;
		return this;
	}

	public Date getCheif_upgrade_time() {
		return cheif_upgrade_time;
	}

	public User_relation setCheif_upgrade_time(Date cheif_upgrade_time) {
		this.cheif_upgrade_time = cheif_upgrade_time;
		return this;
	}

	public Date getDirector_upgrade_time() {
		return director_upgrade_time;
	}

	public User_relation setDirector_upgrade_time(Date director_upgrade_time) {
		this.director_upgrade_time = director_upgrade_time;
		return this;
	}

	public String getTarget_level() {
		return target_level;
	}

	public User_relation setTarget_level(String target_level) {
		this.target_level = target_level;
		return this;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public User_relation setUpdate_time(Date update_time) {
		this.update_time = update_time;
		return this;
	}

	public Integer getPermission() {
		return permission;
	}

	public User_relation setPermission(Integer permission) {
		this.permission = permission;
		return this;
	}

	public Integer getDirector_type() {
		return director_type;
	}

	public User_relation setDirector_type(Integer director_type) {
		this.director_type = director_type;
		return this;
	}

	public Integer getCheif_id_bak() {
		return cheif_id_bak;
	}

	public User_relation setCheif_id_bak(Integer cheif_id_bak) {
		this.cheif_id_bak = cheif_id_bak;
		return this;
	}

	public String getCheif_id_update_time() {
		return cheif_id_update_time;
	}

	public User_relation setCheif_id_update_time(String cheif_id_update_time) {
		this.cheif_id_update_time = cheif_id_update_time;
		return this;
	}

	public Integer getCheif_id_status() {
		return cheif_id_status;
	}

	public User_relation setCheif_id_status(Integer cheif_id_status) {
		this.cheif_id_status = cheif_id_status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.user_id;
	}

	@Override
	public String toString() {
		return "User_relation{" +
			"user_id=" + user_id +
			", director_id=" + director_id +
			", cheif_id=" + cheif_id +
			", inviter_id=" + inviter_id +
			", level_u=" + level_u +
			", status=" + status +
			", inner1=" + inner1 +
			", vip_from=" + vip_from +
			", cheif_from=" + cheif_from +
			", director_from=" + director_from +
			", create_time=" + create_time +
			", vip_valid_time=" + vip_valid_time +
			", cheif_valid_time=" + cheif_valid_time +
			", director_valid_time=" + director_valid_time +
			", vip_upgrade_time=" + vip_upgrade_time +
			", cheif_upgrade_time=" + cheif_upgrade_time +
			", director_upgrade_time=" + director_upgrade_time +
			", target_level=" + target_level +
			", update_time=" + update_time +
			", permission=" + permission +
			", director_type=" + director_type +
			", cheif_id_bak=" + cheif_id_bak +
			", cheif_id_update_time=" + cheif_id_update_time +
			", cheif_id_status=" + cheif_id_status +
			"}";
	}
}
