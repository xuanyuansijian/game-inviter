package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the activety database table.
 * 
 */
@Entity
@NamedQuery(name="Activety.findAll", query="SELECT a FROM Activety a")
public class Activety implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="ability_id")
	private short abilityId;

	@Column(name="activety_arena_config_id")
	private int activetyArenaConfigId;

	@Column(name="activety_level_id")
	private byte activetyLevelId;

	@Column(name="arena_fee_id")
	private String arenaFeeId;

	@Column(name="arena_id")
	private int arenaId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="begin_time")
	private Date beginTime;

	private String comment;

	@Column(name="duration_hours")
	private byte durationHours;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="initial_player_id")
	private BigInteger initialPlayerId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="launch_time")
	private Date launchTime;

	@Column(name="max_age_limit")
	private byte maxAgeLimit;

	@Column(name="min_age_limit")
	private byte minAgeLimit;

	private String name;

	private byte status;

	public Activety() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public short getAbilityId() {
		return this.abilityId;
	}

	public void setAbilityId(short abilityId) {
		this.abilityId = abilityId;
	}

	public int getActivetyArenaConfigId() {
		return this.activetyArenaConfigId;
	}

	public void setActivetyArenaConfigId(int activetyArenaConfigId) {
		this.activetyArenaConfigId = activetyArenaConfigId;
	}

	public byte getActivetyLevelId() {
		return this.activetyLevelId;
	}

	public void setActivetyLevelId(byte activetyLevelId) {
		this.activetyLevelId = activetyLevelId;
	}

	public String getArenaFeeId() {
		return this.arenaFeeId;
	}

	public void setArenaFeeId(String arenaFeeId) {
		this.arenaFeeId = arenaFeeId;
	}

	public int getArenaId() {
		return this.arenaId;
	}

	public void setArenaId(int arenaId) {
		this.arenaId = arenaId;
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

	public BigInteger getInitialPlayerId() {
		return this.initialPlayerId;
	}

	public void setInitialPlayerId(BigInteger initialPlayerId) {
		this.initialPlayerId = initialPlayerId;
	}

	public Date getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(Date launchTime) {
		this.launchTime = launchTime;
	}

	public byte getMaxAgeLimit() {
		return this.maxAgeLimit;
	}

	public void setMaxAgeLimit(byte maxAgeLimit) {
		this.maxAgeLimit = maxAgeLimit;
	}

	public byte getMinAgeLimit() {
		return this.minAgeLimit;
	}

	public void setMinAgeLimit(byte minAgeLimit) {
		this.minAgeLimit = minAgeLimit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}