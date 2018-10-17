package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the arena_preferential_policy database table.
 * 
 */
@Entity
@Table(name="arena_preferential_policy")
@NamedQuery(name="ArenaPreferentialPolicy.findAll", query="SELECT a FROM ArenaPreferentialPolicy a")
public class ArenaPreferentialPolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="arena_id")
	private int arenaId;

	@Column(name="cash_amount")
	private BigDecimal cashAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="red_packet_amount")
	private BigDecimal redPacketAmount;

	@Column(name="valid_period")
	private short validPeriod;

	public ArenaPreferentialPolicy() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getArenaId() {
		return this.arenaId;
	}

	public void setArenaId(int arenaId) {
		this.arenaId = arenaId;
	}

	public BigDecimal getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getRedPacketAmount() {
		return this.redPacketAmount;
	}

	public void setRedPacketAmount(BigDecimal redPacketAmount) {
		this.redPacketAmount = redPacketAmount;
	}

	public short getValidPeriod() {
		return this.validPeriod;
	}

	public void setValidPeriod(short validPeriod) {
		this.validPeriod = validPeriod;
	}

}