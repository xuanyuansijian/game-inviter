package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the arena_court_reserve database table.
 * 
 */
@Entity
@Table(name="arena_court_reserve")
@NamedQuery(name="ArenaCourtReserve.findAll", query="SELECT a FROM ArenaCourtReserve a")
public class ArenaCourtReserve implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="arena_court_id")
	private int arenaCourtId;

	@Column(name="arena_court_status_id")
	private short arenaCourtStatusId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="begin_time")
	private Date beginTime;

	private String comment;

	@Column(name="duration_hours")
	private byte durationHours;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	private BigDecimal fee;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="launch_time")
	private Date launchTime;

	@Column(name="player_id")
	private BigInteger playerId;

	private byte type;

	public ArenaCourtReserve() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getArenaCourtId() {
		return this.arenaCourtId;
	}

	public void setArenaCourtId(int arenaCourtId) {
		this.arenaCourtId = arenaCourtId;
	}

	public short getArenaCourtStatusId() {
		return this.arenaCourtStatusId;
	}

	public void setArenaCourtStatusId(short arenaCourtStatusId) {
		this.arenaCourtStatusId = arenaCourtStatusId;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte getDurationHours() {
		return this.durationHours;
	}

	public void setDurationHours(byte durationHours) {
		this.durationHours = durationHours;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public Date getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(Date launchTime) {
		this.launchTime = launchTime;
	}

	public BigInteger getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(BigInteger playerId) {
		this.playerId = playerId;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}