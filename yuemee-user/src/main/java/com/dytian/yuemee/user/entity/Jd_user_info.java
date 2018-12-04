package com.dytian.yuemee.user.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class Jd_user_info extends Model<Jd_user_info> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户id
     */
	private Integer user_id;
    /**
     * 用户姓名
     */
	private String user_name;
    /**
     * 预留手机号
     */
	private String user_phone;
    /**
     * 微信号
     */
	private String wechat_no;
    /**
     * 身份证
     */
	private String id_number;
    /**
     * 身份证正面
     */
	private String id_front_image;
    /**
     * 身份证反面照
     */
	private String id_back_image;
    /**
     * 手持身份证
     */
	private String id_inhand_image;
    /**
     * 银行卡号
     */
	private String bank_card_number;
    /**
     * 银行卡正面
     */
	private String bank_card_front_image;
    /**
     * 银行卡反面照
     */
	private String bank_card_back_image;
    /**
     * 开户行名称
     */
	private String open_bank_name;
    /**
     * 审核状态（0，未审核；2，审核中；3，审核失败；1，审核通过）
     */
	private Integer verify_status;
    /**
     * 备注
     */
	private String remark;
    /**
     * 创建时间
     */
	private Date create_time;


	public Integer getId() {
		return id;
	}

	public Jd_user_info setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public Jd_user_info setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public String getUser_name() {
		return user_name;
	}

	public Jd_user_info setUser_name(String user_name) {
		this.user_name = user_name;
		return this;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public Jd_user_info setUser_phone(String user_phone) {
		this.user_phone = user_phone;
		return this;
	}

	public String getWechat_no() {
		return wechat_no;
	}

	public Jd_user_info setWechat_no(String wechat_no) {
		this.wechat_no = wechat_no;
		return this;
	}

	public String getId_number() {
		return id_number;
	}

	public Jd_user_info setId_number(String id_number) {
		this.id_number = id_number;
		return this;
	}

	public String getId_front_image() {
		return id_front_image;
	}

	public Jd_user_info setId_front_image(String id_front_image) {
		this.id_front_image = id_front_image;
		return this;
	}

	public String getId_back_image() {
		return id_back_image;
	}

	public Jd_user_info setId_back_image(String id_back_image) {
		this.id_back_image = id_back_image;
		return this;
	}

	public String getId_inhand_image() {
		return id_inhand_image;
	}

	public Jd_user_info setId_inhand_image(String id_inhand_image) {
		this.id_inhand_image = id_inhand_image;
		return this;
	}

	public String getBank_card_number() {
		return bank_card_number;
	}

	public Jd_user_info setBank_card_number(String bank_card_number) {
		this.bank_card_number = bank_card_number;
		return this;
	}

	public String getBank_card_front_image() {
		return bank_card_front_image;
	}

	public Jd_user_info setBank_card_front_image(String bank_card_front_image) {
		this.bank_card_front_image = bank_card_front_image;
		return this;
	}

	public String getBank_card_back_image() {
		return bank_card_back_image;
	}

	public Jd_user_info setBank_card_back_image(String bank_card_back_image) {
		this.bank_card_back_image = bank_card_back_image;
		return this;
	}

	public String getOpen_bank_name() {
		return open_bank_name;
	}

	public Jd_user_info setOpen_bank_name(String open_bank_name) {
		this.open_bank_name = open_bank_name;
		return this;
	}

	public Integer getVerify_status() {
		return verify_status;
	}

	public Jd_user_info setVerify_status(Integer verify_status) {
		this.verify_status = verify_status;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public Jd_user_info setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Jd_user_info setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Jd_user_info{" +
			"id=" + id +
			", user_id=" + user_id +
			", user_name=" + user_name +
			", user_phone=" + user_phone +
			", wechat_no=" + wechat_no +
			", id_number=" + id_number +
			", id_front_image=" + id_front_image +
			", id_back_image=" + id_back_image +
			", id_inhand_image=" + id_inhand_image +
			", bank_card_number=" + bank_card_number +
			", bank_card_front_image=" + bank_card_front_image +
			", bank_card_back_image=" + bank_card_back_image +
			", open_bank_name=" + open_bank_name +
			", verify_status=" + verify_status +
			", remark=" + remark +
			", create_time=" + create_time +
			"}";
	}
}
