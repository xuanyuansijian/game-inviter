package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the arena_court_fix_schedule database table.
 * 
 */
@Entity
@Table(name="arena_court_fix_schedule")
@NamedQuery(name="ArenaCourtFixSchedule.findAll", query="SELECT a FROM ArenaCourtFixSchedule a")
public class ArenaCourtFixSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="arena_court_id")
	private int arenaCourtId;

	private byte clock;

	@Column(name="player_id")
	private BigInteger playerId;

	@Column(name="utility_time")
	private Timestamp utilityTime;

	private byte week;

	public ArenaCourtFixSchedule() {
	}

	public int getArenaCourtId() {
		return this.arenaCourtId;
	}

	public void setArenaCourtId(int arenaCourtId) {
		this.arenaCourtId = arenaCourtId;
	}

	public byte getClock() {
		return this.clock;
	}

	public void setClock(byte clock) {
		this.clock = clock;
	}

	public BigInteger getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(BigInteger playerId) {
		this.playerId = playerId;
	}

	public Timestamp getUtilityTime() {
		return this.utilityTime;
	}

	public void setUtilityTime(Timestamp utilityTime) {
		this.utilityTime = utilityTime;
	}

	public byte getWeek() {
		return this.week;
	}

	public void setWeek(byte week) {
		this.week = week;
	}

}