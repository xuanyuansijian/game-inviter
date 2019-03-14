package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the player_ability database table.
 * 
 */
@Entity
@Table(name="player_ability")
@NamedQuery(name="PlayerAbility.findAll", query="SELECT p FROM PlayerAbility p")
public class PlayerAbility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(name="ability_id", nullable=false)
	private int abilityId;

	@Column(name="ability_level_id")
	private int abilityLevelId;

	@Column(length=200)
	private String comment;

	@Column(name="player_id", nullable=false)
	private BigInteger playerId;

	public PlayerAbility() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAbilityId() {
		return this.abilityId;
	}

	public void setAbilityId(int abilityId) {
		this.abilityId = abilityId;
	}

	public int getAbilityLevelId() {
		return this.abilityLevelId;
	}

	public void setAbilityLevelId(int abilityLevelId) {
		this.abilityLevelId = abilityLevelId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BigInteger getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(BigInteger playerId) {
		this.playerId = playerId;
	}

}