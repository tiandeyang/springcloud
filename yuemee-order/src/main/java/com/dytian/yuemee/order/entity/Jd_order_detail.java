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
 * 订单详情表
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class Jd_order_detail extends Model<Jd_order_detail> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户ID
     */
	private Integer user_id;
    /**
     * 订单ID
     */
	private String order_no;
    /**
     * 子订单号
     */
	private String sub_order_no;
    /**
     * 产品标识
     */
	private String skuid;
    /**
     * 商品名
     */
	private String skuName;
    /**
     * 图片链接
     */
	private String imagePath;
    /**
     * 电脑端链接
     */
	private String pcUrl;
    /**
     * 数量
     */
	private Integer num;
    /**
     * 供货价
     */
	private BigDecimal supply_price;
    /**
     * 单价
     */
	private BigDecimal price;
    /**
     * 小计
     */
	private BigDecimal subtotal;
    /**
     * 佣金小计
     */
	private BigDecimal commission;
    /**
     * 创建时间
     */
	private Date create_time;
    /**
     * 0,未支付;1,已支付
     */
	private Integer pay_status;
    /**
     * 退货原因
     */
	private String refund_reason;
    /**
     * 退款金额
     */
	private BigDecimal refund_amt;
    /**
     * 退货数量
     */
	private Integer refund_num;
    /**
     * 退款说明
     */
	private String refund_remark;
    /**
     * 应结算金额
     */
	private BigDecimal should_liquidation_money;
    /**
     * 退款凭证(图片)
     */
	private String refund_voucher;
    /**
     * 退货地址ID
     */
	private Integer refund_addr_id;
    /**
     * 退货联系人
     */
	private String refund_name;
    /**
     * 退货联系电话
     */
	private String refund_mobile;
    /**
     * 退货详细地址
     */
	private String refund_addr_detail;
    /**
     * 物流公司代码
     */
	private String trans_com;
    /**
     * 物流单号
     */
	private String trans_id;
    /**
     * 退款状态(0:待审核,1:审核拒绝,2:审核通过,3:退换货入库,4:已退款)
     */
	private String refund_status;
    /**
     * 申请退款时间
     */
	private Date apply_time;
    /**
     * 客服审核备注
     */
	private String kefu_remark;
    /**
     * 客服审核时间
     */
	private Date kefu_time;
    /**
     * 供应商操作入库时间
     */
	private Date supplier_time;
    /**
     * 审核通过,确认退款时间
     */
	private Date check_time;
    /**
     * 订单包裹号
     */
	private String order_Package_id;


	public Integer getId() {
		return id;
	}

	public Jd_order_detail setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public Jd_order_detail setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public String getOrder_no() {
		return order_no;
	}

	public Jd_order_detail setOrder_no(String order_no) {
		this.order_no = order_no;
		return this;
	}

	public String getSub_order_no() {
		return sub_order_no;
	}

	public Jd_order_detail setSub_order_no(String sub_order_no) {
		this.sub_order_no = sub_order_no;
		return this;
	}

	public String getSkuid() {
		return skuid;
	}

	public Jd_order_detail setSkuid(String skuid) {
		this.skuid = skuid;
		return this;
	}

	public String getSkuName() {
		return skuName;
	}

	public Jd_order_detail setSkuName(String skuName) {
		this.skuName = skuName;
		return this;
	}

	public String getImagePath() {
		return imagePath;
	}

	public Jd_order_detail setImagePath(String imagePath) {
		this.imagePath = imagePath;
		return this;
	}

	public String getPcUrl() {
		return pcUrl;
	}

	public Jd_order_detail setPcUrl(String pcUrl) {
		this.pcUrl = pcUrl;
		return this;
	}

	public Integer getNum() {
		return num;
	}

	public Jd_order_detail setNum(Integer num) {
		this.num = num;
		return this;
	}

	public BigDecimal getSupply_price() {
		return supply_price;
	}

	public Jd_order_detail setSupply_price(BigDecimal supply_price) {
		this.supply_price = supply_price;
		return this;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Jd_order_detail setPrice(BigDecimal price) {
		this.price = price;
		return this;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public Jd_order_detail setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public Jd_order_detail setCommission(BigDecimal commission) {
		this.commission = commission;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Jd_order_detail setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public Integer getPay_status() {
		return pay_status;
	}

	public Jd_order_detail setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
		return this;
	}

	public String getRefund_reason() {
		return refund_reason;
	}

	public Jd_order_detail setRefund_reason(String refund_reason) {
		this.refund_reason = refund_reason;
		return this;
	}

	public BigDecimal getRefund_amt() {
		return refund_amt;
	}

	public Jd_order_detail setRefund_amt(BigDecimal refund_amt) {
		this.refund_amt = refund_amt;
		return this;
	}

	public Integer getRefund_num() {
		return refund_num;
	}

	public Jd_order_detail setRefund_num(Integer refund_num) {
		this.refund_num = refund_num;
		return this;
	}

	public String getRefund_remark() {
		return refund_remark;
	}

	public Jd_order_detail setRefund_remark(String refund_remark) {
		this.refund_remark = refund_remark;
		return this;
	}

	public BigDecimal getShould_liquidation_money() {
		return should_liquidation_money;
	}

	public Jd_order_detail setShould_liquidation_money(BigDecimal should_liquidation_money) {
		this.should_liquidation_money = should_liquidation_money;
		return this;
	}

	public String getRefund_voucher() {
		return refund_voucher;
	}

	public Jd_order_detail setRefund_voucher(String refund_voucher) {
		this.refund_voucher = refund_voucher;
		return this;
	}

	public Integer getRefund_addr_id() {
		return refund_addr_id;
	}

	public Jd_order_detail setRefund_addr_id(Integer refund_addr_id) {
		this.refund_addr_id = refund_addr_id;
		return this;
	}

	public String getRefund_name() {
		return refund_name;
	}

	public Jd_order_detail setRefund_name(String refund_name) {
		this.refund_name = refund_name;
		return this;
	}

	public String getRefund_mobile() {
		return refund_mobile;
	}

	public Jd_order_detail setRefund_mobile(String refund_mobile) {
		this.refund_mobile = refund_mobile;
		return this;
	}

	public String getRefund_addr_detail() {
		return refund_addr_detail;
	}

	public Jd_order_detail setRefund_addr_detail(String refund_addr_detail) {
		this.refund_addr_detail = refund_addr_detail;
		return this;
	}

	public String getTrans_com() {
		return trans_com;
	}

	public Jd_order_detail setTrans_com(String trans_com) {
		this.trans_com = trans_com;
		return this;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public Jd_order_detail setTrans_id(String trans_id) {
		this.trans_id = trans_id;
		return this;
	}

	public String getRefund_status() {
		return refund_status;
	}

	public Jd_order_detail setRefund_status(String refund_status) {
		this.refund_status = refund_status;
		return this;
	}

	public Date getApply_time() {
		return apply_time;
	}

	public Jd_order_detail setApply_time(Date apply_time) {
		this.apply_time = apply_time;
		return this;
	}

	public String getKefu_remark() {
		return kefu_remark;
	}

	public Jd_order_detail setKefu_remark(String kefu_remark) {
		this.kefu_remark = kefu_remark;
		return this;
	}

	public Date getKefu_time() {
		return kefu_time;
	}

	public Jd_order_detail setKefu_time(Date kefu_time) {
		this.kefu_time = kefu_time;
		return this;
	}

	public Date getSupplier_time() {
		return supplier_time;
	}

	public Jd_order_detail setSupplier_time(Date supplier_time) {
		this.supplier_time = supplier_time;
		return this;
	}

	public Date getCheck_time() {
		return check_time;
	}

	public Jd_order_detail setCheck_time(Date check_time) {
		this.check_time = check_time;
		return this;
	}

	public String getOrder_Package_id() {
		return order_Package_id;
	}

	public Jd_order_detail setOrder_Package_id(String order_Package_id) {
		this.order_Package_id = order_Package_id;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Jd_order_detail{" +
			"id=" + id +
			", user_id=" + user_id +
			", order_no=" + order_no +
			", sub_order_no=" + sub_order_no +
			", skuid=" + skuid +
			", skuName=" + skuName +
			", imagePath=" + imagePath +
			", pcUrl=" + pcUrl +
			", num=" + num +
			", supply_price=" + supply_price +
			", price=" + price +
			", subtotal=" + subtotal +
			", commission=" + commission +
			", create_time=" + create_time +
			", pay_status=" + pay_status +
			", refund_reason=" + refund_reason +
			", refund_amt=" + refund_amt +
			", refund_num=" + refund_num +
			", refund_remark=" + refund_remark +
			", should_liquidation_money=" + should_liquidation_money +
			", refund_voucher=" + refund_voucher +
			", refund_addr_id=" + refund_addr_id +
			", refund_name=" + refund_name +
			", refund_mobile=" + refund_mobile +
			", refund_addr_detail=" + refund_addr_detail +
			", trans_com=" + trans_com +
			", trans_id=" + trans_id +
			", refund_status=" + refund_status +
			", apply_time=" + apply_time +
			", kefu_remark=" + kefu_remark +
			", kefu_time=" + kefu_time +
			", supplier_time=" + supplier_time +
			", check_time=" + check_time +
			", order_Package_id=" + order_Package_id +
			"}";
	}
}
