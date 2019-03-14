package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activety_arena_config database table.
 * 
 */
@Entity
@Table(name="activety_arena_config")
@NamedQuery(name="ActivetyArenaConfig.findAll", query="SELECT a FROM ActivetyArenaConfig a")
public class ActivetyArenaConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="arean_id", nullable=false)
	private int areanId;

	@Column(name="auto_cancel_time_difference")
	private int autoCancelTimeDifference;

	@Column(name="max_players_per_court")
	private short maxPlayersPerCourt;

	@Column(name="min_players_per_court")
	private short minPlayersPerCourt;

	public ActivetyArenaConfig() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAreanId() {
		return this.areanId;
	}

	public void setAreanId(int areanId) {
		this.areanId = areanId;
	}

	public int getAutoCancelTimeDifference() {
		return this.autoCancelTimeDifference;
	}

	public void setAutoCancelTimeDifference(int autoCancelTimeDifference) {
		this.autoCancelTimeDifference = autoCancelTimeDifference;
	}

	public short getMaxPlayersPerCourt() {
		return this.maxPlayersPerCourt;
	}

	public void setMaxPlayersPerCourt(short maxPlayersPerCourt) {
		this.maxPlayersPerCourt = maxPlayersPerCourt;
	}

	public short getMinPlayersPerCourt() {
		return this.minPlayersPerCourt;
	}

	public void setMinPlayersPerCourt(short minPlayersPerCourt) {
		this.minPlayersPerCourt = minPlayersPerCourt;
	}

}