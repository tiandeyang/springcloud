package com.dytian.yuemee.order.entity;




import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * <p>
 * 购物车
 * </p>
 *
 * @author dytian
 * @since 2019-03-09
 */
public class JdCart extends Model<JdCart> implements Serializable {

    private static final long serialVersionUID = 1L;


	public boolean addProItem(JdCart cart){
		return cart.insert();

	}

	public boolean removeProItem(JdCart cart){
    	return removeProItem(cart);
	}

	public List<JdCart> carts(QueryWrapper wrapper){
		return selectList(wrapper);
	}

	public List<JdCart> page(Page page,QueryWrapper wrapper){
		return this.selectPage(page,wrapper).getRecords();
	}




	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户ID
     */
	private Integer user_id;
    /**
     * 产品标识
     */
	private String skuid;
    /**
     * 产品价格
     */
	private BigDecimal price;
    /**
     * 数量
     */
	private Integer num;
    /**
     * 商品名
     */
	@TableField("skuName")
	private String skuName;
    /**
     * 图片链接
     */
	@TableField("imagePath")
	private String imagePath;
    /**
     * 库存
     */
	private Integer stock;
    /**
     * 0上架，1下架
     */
	private Integer on_sale;
    /**
     * 创建时间
     */
	private Date create_time;



	public Integer getId() {
		return id;
	}


	public JdCart setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getUser_id() {
		return user_id;
	}


	public JdCart setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public String getSkuid() {
		return skuid;
	}


	public JdCart setSkuid(String skuid) {
		this.skuid = skuid;
		return this;
	}

	public BigDecimal getPrice() {
		return price;
	}


	public JdCart setPrice(BigDecimal price) {
		this.price = price;
		return this;
	}

	public Integer getNum() {
		return num;
	}


	public JdCart setNum(Integer num) {
		this.num = num;
		return this;
	}

	public String getSkuName() {
		return skuName;
	}


	public JdCart setSkuName(String skuName) {
		this.skuName = skuName;
		return this;
	}

	public String getImagePath() {
		return imagePath;
	}


	public JdCart setImagePath(String imagePath) {
		this.imagePath = imagePath;
		return this;
	}

	public Integer getStock() {
		return stock;
	}


	public JdCart setStock(Integer stock) {
		this.stock = stock;
		return this;
	}

	public Integer getOn_sale() {
		return on_sale;
	}


	public JdCart setOn_sale(Integer on_sale) {
		this.on_sale = on_sale;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}


	public JdCart setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	public static final String ID = "id";

	public static final String USER_ID = "user_id";

	public static final String SKUID = "skuid";

	public static final String PRICE = "price";

	public static final String NUM = "num";

	public static final String SKUNAME = "skuName";

	public static final String IMAGEPATH = "imagePath";

	public static final String STOCK = "stock";

	public static final String ON_SALE = "on_sale";

	public static final String CREATE_TIME = "create_time";


	@Override
	public String toString() {
		return "JdCart{" +
			"id=" + id +
			", user_id=" + user_id +
			", skuid=" + skuid +
			", price=" + price +
			", num=" + num +
			", skuName=" + skuName +
			", imagePath=" + imagePath +
			", stock=" + stock +
			", on_sale=" + on_sale +
			", create_time=" + create_time +
			"}";
	}



}
