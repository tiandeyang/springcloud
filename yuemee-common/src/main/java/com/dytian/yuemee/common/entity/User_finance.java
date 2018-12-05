package com.dytian.yuemee.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 账户
 * </p>
 *
 * @author dytian
 * @since 2018-12-04
 */
public class User_finance extends Model<User_finance> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
	private Integer user_id;
    /**
     * 现金余额,全账户
     */
	private BigDecimal money;
    /**
     * 阅币余额,区块链货币
     */
	private BigDecimal coin;
    /**
     * 佣金余额,自买省的
     */
	private BigDecimal profit_self;
    /**
     * 佣金余额,分享赚的
     */
	private BigDecimal profit_share;
    /**
     * 佣金余额,团队管理佣金
     */
	private BigDecimal profit_team;
    /**
     * 礼包佣金,直接招聘佣金
     */
	private BigDecimal recruit_dir;
    /**
     * 礼包佣金,间接招聘佣金
     */
	private BigDecimal recruit_alt;
    /**
     * 总监激活收益
     */
	private BigDecimal cheif_active_profit;
    /**
     * 总经理激活收益
     */
	private BigDecimal director_active_profit;
    /**
     * 推荐卡位总监奖励
     */
	private BigDecimal recommend_cheif_prize;
    /**
     * 推荐卡位经理奖励
     */
	private BigDecimal recommend_director_prize;
    /**
     * 支付密码
     */
	private String passwd;
    /**
     * 直接礼包佣金解锁任务状态：0未解锁,1已解锁()
     */
	private Integer thew_status;
    /**
     * 直接礼包佣金解锁任务开始时间
     */
	private Long thew_launch;
    /**
     * 直接礼包佣金解锁目标佣金
     */
	private BigDecimal thew_target;
    /**
     * 直接礼包佣金解锁累积消费佣金
     */
	private BigDecimal thew_money;
    /**
     * 直接礼包佣金解锁开始时间
     */
	private Long thew_start;
    /**
     * 直接礼包佣金解锁到期时间
     */
	private Long thew_expire;
    /**
     * 晋升总监任务状态：0未解锁,1已解锁
     */
	private Integer cheif_status;
    /**
     * 晋升总监任务开始时间（等于注册日期）
     */
	private Long cheif_start;
    /**
     * 晋升总监任务开始时间结束时间（3个月后）
     */
	private Long cheif_expire;
    /**
     * 晋升总监需要直招人数
     */
	private Integer cheif_target_dir;
    /**
     * 晋升总监需要间招人数
     */
	private Integer cheif_target_alt;
    /**
     * 晋升总监需要直招人数
     */
	private Integer cheif_value_dir;
    /**
     * 晋升总监需要间招人数
     */
	private Integer cheif_value_alt;
    /**
     * 晋升总经理任务状态：0未解锁,1已解锁
     */
	private Integer director_status;
    /**
     * 晋升总经理任务开始时间（等于注册日期）
     */
	private Long director_start;
    /**
     * 晋升总经理任务开始时间结束时间（3个月后）
     */
	private Long director_expire;
    /**
     * 晋升总经理需要团队人数
     */
	private Integer director_target_team;
    /**
     * 晋升总经理需要总监人数
     */
	private Integer director_target_cheif;
    /**
     * 晋升总经理需要团队人数
     */
	private Integer director_value_team;
    /**
     * 晋升总经理需要总监人数
     */
	private Integer director_value_cheif;
    /**
     * 直推佣金状态(0或1)
     */
	private Integer direct_recruit_status;


	public Integer getUser_id() {
		return user_id;
	}

	public User_finance setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public User_finance setMoney(BigDecimal money) {
		this.money = money;
		return this;
	}

	public BigDecimal getCoin() {
		return coin;
	}

	public User_finance setCoin(BigDecimal coin) {
		this.coin = coin;
		return this;
	}

	public BigDecimal getProfit_self() {
		return profit_self;
	}

	public User_finance setProfit_self(BigDecimal profit_self) {
		this.profit_self = profit_self;
		return this;
	}

	public BigDecimal getProfit_share() {
		return profit_share;
	}

	public User_finance setProfit_share(BigDecimal profit_share) {
		this.profit_share = profit_share;
		return this;
	}

	public BigDecimal getProfit_team() {
		return profit_team;
	}

	public User_finance setProfit_team(BigDecimal profit_team) {
		this.profit_team = profit_team;
		return this;
	}

	public BigDecimal getRecruit_dir() {
		return recruit_dir;
	}

	public User_finance setRecruit_dir(BigDecimal recruit_dir) {
		this.recruit_dir = recruit_dir;
		return this;
	}

	public BigDecimal getRecruit_alt() {
		return recruit_alt;
	}

	public User_finance setRecruit_alt(BigDecimal recruit_alt) {
		this.recruit_alt = recruit_alt;
		return this;
	}

	public BigDecimal getCheif_active_profit() {
		return cheif_active_profit;
	}

	public User_finance setCheif_active_profit(BigDecimal cheif_active_profit) {
		this.cheif_active_profit = cheif_active_profit;
		return this;
	}

	public BigDecimal getDirector_active_profit() {
		return director_active_profit;
	}

	public User_finance setDirector_active_profit(BigDecimal director_active_profit) {
		this.director_active_profit = director_active_profit;
		return this;
	}

	public BigDecimal getRecommend_cheif_prize() {
		return recommend_cheif_prize;
	}

	public User_finance setRecommend_cheif_prize(BigDecimal recommend_cheif_prize) {
		this.recommend_cheif_prize = recommend_cheif_prize;
		return this;
	}

	public BigDecimal getRecommend_director_prize() {
		return recommend_director_prize;
	}

	public User_finance setRecommend_director_prize(BigDecimal recommend_director_prize) {
		this.recommend_director_prize = recommend_director_prize;
		return this;
	}

	public String getPasswd() {
		return passwd;
	}

	public User_finance setPasswd(String passwd) {
		this.passwd = passwd;
		return this;
	}

	public Integer getThew_status() {
		return thew_status;
	}

	public User_finance setThew_status(Integer thew_status) {
		this.thew_status = thew_status;
		return this;
	}

	public Long getThew_launch() {
		return thew_launch;
	}

	public User_finance setThew_launch(Long thew_launch) {
		this.thew_launch = thew_launch;
		return this;
	}

	public BigDecimal getThew_target() {
		return thew_target;
	}

	public User_finance setThew_target(BigDecimal thew_target) {
		this.thew_target = thew_target;
		return this;
	}

	public BigDecimal getThew_money() {
		return thew_money;
	}

	public User_finance setThew_money(BigDecimal thew_money) {
		this.thew_money = thew_money;
		return this;
	}

	public Long getThew_start() {
		return thew_start;
	}

	public User_finance setThew_start(Long thew_start) {
		this.thew_start = thew_start;
		return this;
	}

	public Long getThew_expire() {
		return thew_expire;
	}

	public User_finance setThew_expire(Long thew_expire) {
		this.thew_expire = thew_expire;
		return this;
	}

	public Integer getCheif_status() {
		return cheif_status;
	}

	public User_finance setCheif_status(Integer cheif_status) {
		this.cheif_status = cheif_status;
		return this;
	}

	public Long getCheif_start() {
		return cheif_start;
	}

	public User_finance setCheif_start(Long cheif_start) {
		this.cheif_start = cheif_start;
		return this;
	}

	public Long getCheif_expire() {
		return cheif_expire;
	}

	public User_finance setCheif_expire(Long cheif_expire) {
		this.cheif_expire = cheif_expire;
		return this;
	}

	public Integer getCheif_target_dir() {
		return cheif_target_dir;
	}

	public User_finance setCheif_target_dir(Integer cheif_target_dir) {
		this.cheif_target_dir = cheif_target_dir;
		return this;
	}

	public Integer getCheif_target_alt() {
		return cheif_target_alt;
	}

	public User_finance setCheif_target_alt(Integer cheif_target_alt) {
		this.cheif_target_alt = cheif_target_alt;
		return this;
	}

	public Integer getCheif_value_dir() {
		return cheif_value_dir;
	}

	public User_finance setCheif_value_dir(Integer cheif_value_dir) {
		this.cheif_value_dir = cheif_value_dir;
		return this;
	}

	public Integer getCheif_value_alt() {
		return cheif_value_alt;
	}

	public User_finance setCheif_value_alt(Integer cheif_value_alt) {
		this.cheif_value_alt = cheif_value_alt;
		return this;
	}

	public Integer getDirector_status() {
		return director_status;
	}

	public User_finance setDirector_status(Integer director_status) {
		this.director_status = director_status;
		return this;
	}

	public Long getDirector_start() {
		return director_start;
	}

	public User_finance setDirector_start(Long director_start) {
		this.director_start = director_start;
		return this;
	}

	public Long getDirector_expire() {
		return director_expire;
	}

	public User_finance setDirector_expire(Long director_expire) {
		this.director_expire = director_expire;
		return this;
	}

	public Integer getDirector_target_team() {
		return director_target_team;
	}

	public User_finance setDirector_target_team(Integer director_target_team) {
		this.director_target_team = director_target_team;
		return this;
	}

	public Integer getDirector_target_cheif() {
		return director_target_cheif;
	}

	public User_finance setDirector_target_cheif(Integer director_target_cheif) {
		this.director_target_cheif = director_target_cheif;
		return this;
	}

	public Integer getDirector_value_team() {
		return director_value_team;
	}

	public User_finance setDirector_value_team(Integer director_value_team) {
		this.director_value_team = director_value_team;
		return this;
	}

	public Integer getDirector_value_cheif() {
		return director_value_cheif;
	}

	public User_finance setDirector_value_cheif(Integer director_value_cheif) {
		this.director_value_cheif = director_value_cheif;
		return this;
	}

	public Integer getDirect_recruit_status() {
		return direct_recruit_status;
	}

	public User_finance setDirect_recruit_status(Integer direct_recruit_status) {
		this.direct_recruit_status = direct_recruit_status;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.user_id;
	}

	@Override
	public String toString() {
		return "User_finance{" +
			"user_id=" + user_id +
			", money=" + money +
			", coin=" + coin +
			", profit_self=" + profit_self +
			", profit_share=" + profit_share +
			", profit_team=" + profit_team +
			", recruit_dir=" + recruit_dir +
			", recruit_alt=" + recruit_alt +
			", cheif_active_profit=" + cheif_active_profit +
			", director_active_profit=" + director_active_profit +
			", recommend_cheif_prize=" + recommend_cheif_prize +
			", recommend_director_prize=" + recommend_director_prize +
			", passwd=" + passwd +
			", thew_status=" + thew_status +
			", thew_launch=" + thew_launch +
			", thew_target=" + thew_target +
			", thew_money=" + thew_money +
			", thew_start=" + thew_start +
			", thew_expire=" + thew_expire +
			", cheif_status=" + cheif_status +
			", cheif_start=" + cheif_start +
			", cheif_expire=" + cheif_expire +
			", cheif_target_dir=" + cheif_target_dir +
			", cheif_target_alt=" + cheif_target_alt +
			", cheif_value_dir=" + cheif_value_dir +
			", cheif_value_alt=" + cheif_value_alt +
			", director_status=" + director_status +
			", director_start=" + director_start +
			", director_expire=" + director_expire +
			", director_target_team=" + director_target_team +
			", director_target_cheif=" + director_target_cheif +
			", director_value_team=" + director_value_team +
			", director_value_cheif=" + director_value_cheif +
			", direct_recruit_status=" + direct_recruit_status +
			"}";
	}
}
