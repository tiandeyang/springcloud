package com.dytian.yuemee.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 京东商品表
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class Jd_product extends Model<Jd_product> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="pid", type= IdType.AUTO)
	private Integer pid;
    /**
     * sku编号
     */
	private String skuid;
    /**
     * sku名称
     */
	private String sku_name;
    /**
     * sku主图
     */
	private String sku_image;
    /**
     * spu编号
     */
	private String spuid;
    /**
     * 具体规格
     */
	private String spec;
    /**
     * 库存
     */
	private Integer stock;
    /**
     * 供应商编号
     */
	private Integer s_id;
    /**
     * 0,上架状态；1,下架状态
     */
	private Integer on_sale;
    /**
     * 毛利
     */
	private BigDecimal price_ratio;
    /**
     * 毛利率
     */
	private BigDecimal gross_ratio;
    /**
     * 总利润
     */
	private BigDecimal rebate_vip;
    /**
     * 佣金
     */
	private BigDecimal commission;
    /**
     * 服务费
     */
	private BigDecimal service_charge;
    /**
     * 显示用的市场价
     */
	private BigDecimal market_price;
    /**
     * 供货价
     */
	private BigDecimal supply_price;
    /**
     * 内购价格
     */
	private BigDecimal ng_price;
    /**
     * 有邀请码会员的价格
     */
	private BigDecimal price_invite;
    /**
     * 商品类型数组
     */
	private String tag;
    /**
     * 对接平台bn(京东、严选、自营)
     */
	private String supplier_bn;
    /**
     * 创建时间
     */
	private Date create_time;
    /**
     * 销量
     */
	private Integer sale_amount;
    /**
     * 运费模板id
     */
	private Integer shipping_id;


	public Integer getPid() {
		return pid;
	}

	public Jd_product setPid(Integer pid) {
		this.pid = pid;
		return this;
	}

	public String getSkuid() {
		return skuid;
	}

	public Jd_product setSkuid(String skuid) {
		this.skuid = skuid;
		return this;
	}

	public String getSku_name() {
		return sku_name;
	}

	public Jd_product setSku_name(String sku_name) {
		this.sku_name = sku_name;
		return this;
	}

	public String getSku_image() {
		return sku_image;
	}

	public Jd_product setSku_image(String sku_image) {
		this.sku_image = sku_image;
		return this;
	}

	public String getSpuid() {
		return spuid;
	}

	public Jd_product setSpuid(String spuid) {
		this.spuid = spuid;
		return this;
	}

	public String getSpec() {
		return spec;
	}

	public Jd_product setSpec(String spec) {
		this.spec = spec;
		return this;
	}

	public Integer getStock() {
		return stock;
	}

	public Jd_product setStock(Integer stock) {
		this.stock = stock;
		return this;
	}

	public Integer getS_id() {
		return s_id;
	}

	public Jd_product setS_id(Integer s_id) {
		this.s_id = s_id;
		return this;
	}

	public Integer getOn_sale() {
		return on_sale;
	}

	public Jd_product setOn_sale(Integer on_sale) {
		this.on_sale = on_sale;
		return this;
	}

	public BigDecimal getPrice_ratio() {
		return price_ratio;
	}

	public Jd_product setPrice_ratio(BigDecimal price_ratio) {
		this.price_ratio = price_ratio;
		return this;
	}

	public BigDecimal getGross_ratio() {
		return gross_ratio;
	}

	public Jd_product setGross_ratio(BigDecimal gross_ratio) {
		this.gross_ratio = gross_ratio;
		return this;
	}

	public BigDecimal getRebate_vip() {
		return rebate_vip;
	}

	public Jd_product setRebate_vip(BigDecimal rebate_vip) {
		this.rebate_vip = rebate_vip;
		return this;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public Jd_product setCommission(BigDecimal commission) {
		this.commission = commission;
		return this;
	}

	public BigDecimal getService_charge() {
		return service_charge;
	}

	public Jd_product setService_charge(BigDecimal service_charge) {
		this.service_charge = service_charge;
		return this;
	}

	public BigDecimal getMarket_price() {
		return market_price;
	}

	public Jd_product setMarket_price(BigDecimal market_price) {
		this.market_price = market_price;
		return this;
	}

	public BigDecimal getSupply_price() {
		return supply_price;
	}

	public Jd_product setSupply_price(BigDecimal supply_price) {
		this.supply_price = supply_price;
		return this;
	}

	public BigDecimal getNg_price() {
		return ng_price;
	}

	public Jd_product setNg_price(BigDecimal ng_price) {
		this.ng_price = ng_price;
		return this;
	}

	public BigDecimal getPrice_invite() {
		return price_invite;
	}

	public Jd_product setPrice_invite(BigDecimal price_invite) {
		this.price_invite = price_invite;
		return this;
	}

	public String getTag() {
		return tag;
	}

	public Jd_product setTag(String tag) {
		this.tag = tag;
		return this;
	}

	public String getSupplier_bn() {
		return supplier_bn;
	}

	public Jd_product setSupplier_bn(String supplier_bn) {
		this.supplier_bn = supplier_bn;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Jd_product setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public Integer getSale_amount() {
		return sale_amount;
	}

	public Jd_product setSale_amount(Integer sale_amount) {
		this.sale_amount = sale_amount;
		return this;
	}

	public Integer getShipping_id() {
		return shipping_id;
	}

	public Jd_product setShipping_id(Integer shipping_id) {
		this.shipping_id = shipping_id;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.pid;
	}

	@Override
	public String toString() {
		return "Jd_product{" +
			"pid=" + pid +
			", skuid=" + skuid +
			", sku_name=" + sku_name +
			", sku_image=" + sku_image +
			", spuid=" + spuid +
			", spec=" + spec +
			", stock=" + stock +
			", s_id=" + s_id +
			", on_sale=" + on_sale +
			", price_ratio=" + price_ratio +
			", gross_ratio=" + gross_ratio +
			", rebate_vip=" + rebate_vip +
			", commission=" + commission +
			", service_charge=" + service_charge +
			", market_price=" + market_price +
			", supply_price=" + supply_price +
			", ng_price=" + ng_price +
			", price_invite=" + price_invite +
			", tag=" + tag +
			", supplier_bn=" + supplier_bn +
			", create_time=" + create_time +
			", sale_amount=" + sale_amount +
			", shipping_id=" + shipping_id +
			"}";
	}
}
