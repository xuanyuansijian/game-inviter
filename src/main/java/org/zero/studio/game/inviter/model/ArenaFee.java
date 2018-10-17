package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the arena_fee database table.
 * 
 */
@Entity
@Table(name="arena_fee")
@NamedQuery(name="ArenaFee.findAll", query="SELECT a FROM ArenaFee a")
public class ArenaFee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="arena_id")
	private int arenaId;

	private byte clock;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="day_in_week")
	private byte dayInWeek;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="favourable_begin_time")
	private Date favourableBeginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="favourable_end_time")
	private Date favourableEndTime;

	private BigDecimal fee;

	private byte level;

	private byte type;

	public ArenaFee() {
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

	public byte getClock() {
		return this.clock;
	}

	public void setClock(byte clock) {
		this.clock = clock;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public byte getDayInWeek() {
		return this.dayInWeek;
	}

	public void setDayInWeek(byte dayInWeek) {
		this.dayInWeek = dayInWeek;
	}

	public Date getFavourableBeginTime() {
		return this.favourableBeginTime;
	}

	public void setFavourableBeginTime(Date favourableBeginTime) {
		this.favourableBeginTime = favourableBeginTime;
	}

	public Date getFavourableEndTime() {
		return this.favourableEndTime;
	}

	public void setFavourableEndTime(Date favourableEndTime) {
		this.favourableEndTime = favourableEndTime;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}