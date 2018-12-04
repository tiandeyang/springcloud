package com.dytian.yuemee.order.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class Jd_order extends Model<Jd_order> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 订单号
     */
	private String order_no;
    /**
     * 是否是主订单
     */
	private Integer if_primary;
    /**
     * 子订单号
     */
	private String sub_order_no;
    /**
     * 用户ID
     */
	private Integer user_id;
    /**
     * 分享者
     */
	private Integer share_user_id;
    /**
     * 拆分供应商ID
     */
	private Integer supplier_id;
    /**
     * 运费
     */
	private BigDecimal dis_fee;
    /**
     * 当前订单在线支付方式：1微信,2支付宝,3银联,4保留,5保留,6保留,7线下支付
     */
	private String pay_type;
    /**
     * 当前订单优惠券支付部分
     */
	private BigDecimal c_ticket;
    /**
     * 当前订单卡片支付部分
     */
	private BigDecimal c_card;
    /**
     * 如果是 99 是代开订单
     */
	private BigDecimal c_recruit;
    /**
     * 当前订单佣金支付部分
     */
	private BigDecimal c_profit;
    /**
     * 当前订单余额支付部分
     */
	private BigDecimal c_money;
    /**
     * 当前订单价格(主订单的话 包含 运费)
     */
	private BigDecimal c_amount;
    /**
     * 订单收货地址ID
     */
	private Integer address_id;
    /**
     * 地区ID
     */
	private Integer addr_region;
    /**
     * 详细地址
     */
	private String addr_detail;
    /**
     * 联系人
     */
	private String addr_name;
    /**
     * 联系电话
     */
	private String addr_mobile;
    /**
     * 创建IP
     */
	private Long create_from;
    /**
     * 外部订单ID
     */
	private String ext_order_id;
    /**
     * 外部订单状态：0未创建,1失败,2成功,3...参见文档
     */
	private Integer ext_status;
    /**
     * 是否已推送
     */
	private Integer if_self;
    /**
     * 物流公司代码
     */
	private String trans_com;
    /**
     * 物流单号
     */
	private String trans_id;
    /**
     * 物流详情
     */
	private String trans_trace;
    /**
     * 是否已确认
     */
	private Integer trans_fin;
    /**
     * 确认收货时间
     */
	private Long trans_time;
    /**
     * 备注
     */
	private String remark;
    /**
     * dfk,dfh,dsh,ywc,ytk;(待付款,待发货,待收货,已完成)close 关闭
     */
	private String order_status;
    /**
     * 0:没退款,1:部分退款,2:全部退款
     */
	private String if_refund;
    /**
     * 0,未付款;1已支付
     */
	private Integer pay_status;
    /**
     * 0:未清算 1:已清算
     */
	private Integer settle_status;
    /**
     * 创建时间
     */
	private Date create_time;
    /**
     * 支付时间
     */
	private Date pay_time;
    /**
     * 确认收货时间
     */
	private Date ywc_time;
    /**
     * 更新时间
     */
	private Date update_time;
    /**
     * 审核人
     */
	private Integer auditor;


	public Long getId() {
		return id;
	}

	public Jd_order setId(Long id) {
		this.id = id;
		return this;
	}

	public String getOrder_no() {
		return order_no;
	}

	public Jd_order setOrder_no(String order_no) {
		this.order_no = order_no;
		return this;
	}

	public Integer getIf_primary() {
		return if_primary;
	}

	public Jd_order setIf_primary(Integer if_primary) {
		this.if_primary = if_primary;
		return this;
	}

	public String getSub_order_no() {
		return sub_order_no;
	}

	public Jd_order setSub_order_no(String sub_order_no) {
		this.sub_order_no = sub_order_no;
		return this;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public Jd_order setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public Integer getShare_user_id() {
		return share_user_id;
	}

	public Jd_order setShare_user_id(Integer share_user_id) {
		this.share_user_id = share_user_id;
		return this;
	}

	public Integer getSupplier_id() {
		return supplier_id;
	}

	public Jd_order setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
		return this;
	}

	public BigDecimal getDis_fee() {
		return dis_fee;
	}

	public Jd_order setDis_fee(BigDecimal dis_fee) {
		this.dis_fee = dis_fee;
		return this;
	}

	public String getPay_type() {
		return pay_type;
	}

	public Jd_order setPay_type(String pay_type) {
		this.pay_type = pay_type;
		return this;
	}

	public BigDecimal getC_ticket() {
		return c_ticket;
	}

	public Jd_order setC_ticket(BigDecimal c_ticket) {
		this.c_ticket = c_ticket;
		return this;
	}

	public BigDecimal getC_card() {
		return c_card;
	}

	public Jd_order setC_card(BigDecimal c_card) {
		this.c_card = c_card;
		return this;
	}

	public BigDecimal getC_recruit() {
		return c_recruit;
	}

	public Jd_order setC_recruit(BigDecimal c_recruit) {
		this.c_recruit = c_recruit;
		return this;
	}

	public BigDecimal getC_profit() {
		return c_profit;
	}

	public Jd_order setC_profit(BigDecimal c_profit) {
		this.c_profit = c_profit;
		return this;
	}

	public BigDecimal getC_money() {
		return c_money;
	}

	public Jd_order setC_money(BigDecimal c_money) {
		this.c_money = c_money;
		return this;
	}

	public BigDecimal getC_amount() {
		return c_amount;
	}

	public Jd_order setC_amount(BigDecimal c_amount) {
		this.c_amount = c_amount;
		return this;
	}

	public Integer getAddress_id() {
		return address_id;
	}

	public Jd_order setAddress_id(Integer address_id) {
		this.address_id = address_id;
		return this;
	}

	public Integer getAddr_region() {
		return addr_region;
	}

	public Jd_order setAddr_region(Integer addr_region) {
		this.addr_region = addr_region;
		return this;
	}

	public String getAddr_detail() {
		return addr_detail;
	}

	public Jd_order setAddr_detail(String addr_detail) {
		this.addr_detail = addr_detail;
		return this;
	}

	public String getAddr_name() {
		return addr_name;
	}

	public Jd_order setAddr_name(String addr_name) {
		this.addr_name = addr_name;
		return this;
	}

	public String getAddr_mobile() {
		return addr_mobile;
	}

	public Jd_order setAddr_mobile(String addr_mobile) {
		this.addr_mobile = addr_mobile;
		return this;
	}

	public Long getCreate_from() {
		return create_from;
	}

	public Jd_order setCreate_from(Long create_from) {
		this.create_from = create_from;
		return this;
	}

	public String getExt_order_id() {
		return ext_order_id;
	}

	public Jd_order setExt_order_id(String ext_order_id) {
		this.ext_order_id = ext_order_id;
		return this;
	}

	public Integer getExt_status() {
		return ext_status;
	}

	public Jd_order setExt_status(Integer ext_status) {
		this.ext_status = ext_status;
		return this;
	}

	public Integer getIf_self() {
		return if_self;
	}

	public Jd_order setIf_self(Integer if_self) {
		this.if_self = if_self;
		return this;
	}

	public String getTrans_com() {
		return trans_com;
	}

	public Jd_order setTrans_com(String trans_com) {
		this.trans_com = trans_com;
		return this;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public Jd_order setTrans_id(String trans_id) {
		this.trans_id = trans_id;
		return this;
	}

	public String getTrans_trace() {
		return trans_trace;
	}

	public Jd_order setTrans_trace(String trans_trace) {
		this.trans_trace = trans_trace;
		return this;
	}

	public Integer getTrans_fin() {
		return trans_fin;
	}

	public Jd_order setTrans_fin(Integer trans_fin) {
		this.trans_fin = trans_fin;
		return this;
	}

	public Long getTrans_time() {
		return trans_time;
	}

	public Jd_order setTrans_time(Long trans_time) {
		this.trans_time = trans_time;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public Jd_order setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public String getOrder_status() {
		return order_status;
	}

	public Jd_order setOrder_status(String order_status) {
		this.order_status = order_status;
		return this;
	}

	public String getIf_refund() {
		return if_refund;
	}

	public Jd_order setIf_refund(String if_refund) {
		this.if_refund = if_refund;
		return this;
	}

	public Integer getPay_status() {
		return pay_status;
	}

	public Jd_order setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
		return this;
	}

	public Integer getSettle_status() {
		return settle_status;
	}

	public Jd_order setSettle_status(Integer settle_status) {
		this.settle_status = settle_status;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Jd_order setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public Jd_order setPay_time(Date pay_time) {
		this.pay_time = pay_time;
		return this;
	}

	public Date getYwc_time() {
		return ywc_time;
	}

	public Jd_order setYwc_time(Date ywc_time) {
		this.ywc_time = ywc_time;
		return this;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public Jd_order setUpdate_time(Date update_time) {
		this.update_time = update_time;
		return this;
	}

	public Integer getAuditor() {
		return auditor;
	}

	public Jd_order setAuditor(Integer auditor) {
		this.auditor = auditor;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Jd_order{" +
			"id=" + id +
			", order_no=" + order_no +
			", if_primary=" + if_primary +
			", sub_order_no=" + sub_order_no +
			", user_id=" + user_id +
			", share_user_id=" + share_user_id +
			", supplier_id=" + supplier_id +
			", dis_fee=" + dis_fee +
			", pay_type=" + pay_type +
			", c_ticket=" + c_ticket +
			", c_card=" + c_card +
			", c_recruit=" + c_recruit +
			", c_profit=" + c_profit +
			", c_money=" + c_money +
			", c_amount=" + c_amount +
			", address_id=" + address_id +
			", addr_region=" + addr_region +
			", addr_detail=" + addr_detail +
			", addr_name=" + addr_name +
			", addr_mobile=" + addr_mobile +
			", create_from=" + create_from +
			", ext_order_id=" + ext_order_id +
			", ext_status=" + ext_status +
			", if_self=" + if_self +
			", trans_com=" + trans_com +
			", trans_id=" + trans_id +
			", trans_trace=" + trans_trace +
			", trans_fin=" + trans_fin +
			", trans_time=" + trans_time +
			", remark=" + remark +
			", order_status=" + order_status +
			", if_refund=" + if_refund +
			", pay_status=" + pay_status +
			", settle_status=" + settle_status +
			", create_time=" + create_time +
			", pay_time=" + pay_time +
			", ywc_time=" + ywc_time +
			", update_time=" + update_time +
			", auditor=" + auditor +
			"}";
	}
}
