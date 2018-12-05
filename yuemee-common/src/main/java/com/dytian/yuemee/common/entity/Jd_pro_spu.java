package com.dytian.yuemee.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 京东商品spu表
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class Jd_pro_spu extends Model<Jd_pro_spu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="pid", type= IdType.AUTO)
	private Integer pid;
    /**
     * spu编号
     */
	private String spuid;
    /**
     * spu名称
     */
	private String spu_name;
    /**
     * spu规格
     */
	private String spu_spec;
    /**
     * 分类ID
     */
	private Integer catagory_id;
    /**
     * 供应商ID
     */
	private Integer s_id;
    /**
     * 品牌名称
     */
	private String brand_name;
    /**
     * 一级分类编号
     */
	private Integer first_category;
    /**
     * 二级分类编号
     */
	private Integer second_category;
    /**
     * 三级分类编号
     */
	private Integer third_category;
    /**
     * 一级分类
     */
	private String first_category_name;
    /**
     * 二级分类
     */
	private String second_category_name;
    /**
     * 三级分类名称
     */
	private String third_category_name;
    /**
     * 产品主图
     */
	private String image;
    /**
     * 轮播图(存数组即可)
     */
	private String images;
    /**
     * 偏远地区是否发货(0,发货;1,不发)
     */
	private Integer remote_deliver;
    /**
     * 创建时间
     */
	private Date create_time;


	public Integer getPid() {
		return pid;
	}

	public Jd_pro_spu setPid(Integer pid) {
		this.pid = pid;
		return this;
	}

	public String getSpuid() {
		return spuid;
	}

	public Jd_pro_spu setSpuid(String spuid) {
		this.spuid = spuid;
		return this;
	}

	public String getSpu_name() {
		return spu_name;
	}

	public Jd_pro_spu setSpu_name(String spu_name) {
		this.spu_name = spu_name;
		return this;
	}

	public String getSpu_spec() {
		return spu_spec;
	}

	public Jd_pro_spu setSpu_spec(String spu_spec) {
		this.spu_spec = spu_spec;
		return this;
	}

	public Integer getCatagory_id() {
		return catagory_id;
	}

	public Jd_pro_spu setCatagory_id(Integer catagory_id) {
		this.catagory_id = catagory_id;
		return this;
	}

	public Integer getS_id() {
		return s_id;
	}

	public Jd_pro_spu setS_id(Integer s_id) {
		this.s_id = s_id;
		return this;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public Jd_pro_spu setBrand_name(String brand_name) {
		this.brand_name = brand_name;
		return this;
	}

	public Integer getFirst_category() {
		return first_category;
	}

	public Jd_pro_spu setFirst_category(Integer first_category) {
		this.first_category = first_category;
		return this;
	}

	public Integer getSecond_category() {
		return second_category;
	}

	public Jd_pro_spu setSecond_category(Integer second_category) {
		this.second_category = second_category;
		return this;
	}

	public Integer getThird_category() {
		return third_category;
	}

	public Jd_pro_spu setThird_category(Integer third_category) {
		this.third_category = third_category;
		return this;
	}

	public String getFirst_category_name() {
		return first_category_name;
	}

	public Jd_pro_spu setFirst_category_name(String first_category_name) {
		this.first_category_name = first_category_name;
		return this;
	}

	public String getSecond_category_name() {
		return second_category_name;
	}

	public Jd_pro_spu setSecond_category_name(String second_category_name) {
		this.second_category_name = second_category_name;
		return this;
	}

	public String getThird_category_name() {
		return third_category_name;
	}

	public Jd_pro_spu setThird_category_name(String third_category_name) {
		this.third_category_name = third_category_name;
		return this;
	}

	public String getImage() {
		return image;
	}

	public Jd_pro_spu setImage(String image) {
		this.image = image;
		return this;
	}

	public String getImages() {
		return images;
	}

	public Jd_pro_spu setImages(String images) {
		this.images = images;
		return this;
	}

	public Integer getRemote_deliver() {
		return remote_deliver;
	}

	public Jd_pro_spu setRemote_deliver(Integer remote_deliver) {
		this.remote_deliver = remote_deliver;
		return this;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public Jd_pro_spu setCreate_time(Date create_time) {
		this.create_time = create_time;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.pid;
	}

	@Override
	public String toString() {
		return "Jd_pro_spu{" +
			"pid=" + pid +
			", spuid=" + spuid +
			", spu_name=" + spu_name +
			", spu_spec=" + spu_spec +
			", catagory_id=" + catagory_id +
			", s_id=" + s_id +
			", brand_name=" + brand_name +
			", first_category=" + first_category +
			", second_category=" + second_category +
			", third_category=" + third_category +
			", first_category_name=" + first_category_name +
			", second_category_name=" + second_category_name +
			", third_category_name=" + third_category_name +
			", image=" + image +
			", images=" + images +
			", remote_deliver=" + remote_deliver +
			", create_time=" + create_time +
			"}";
	}
}
