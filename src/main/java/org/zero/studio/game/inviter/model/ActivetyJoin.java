package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the activety_join database table.
 * 
 */
@Entity
@Table(name="activety_join")
@NamedQuery(name="ActivetyJoin.findAll", query="SELECT a FROM ActivetyJoin a")
public class ActivetyJoin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(name="activety_id", nullable=false)
	private BigInteger activetyId;

	@Column(name="extra_number")
	private byte extraNumber;

	@Column(name="player_id", nullable=false)
	private BigInteger playerId;

	@Column(nullable=false)
	private byte status;

	public ActivetyJoin() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getActivetyId() {
		return this.activetyId;
	}

	public void setActivetyId(BigInteger activetyId) {
		this.activetyId = activetyId;
	}

	public byte getExtraNumber() {
		return this.extraNumber;
	}

	public void setExtraNumber(byte extraNumber) {
		this.extraNumber = extraNumber;
	}

	public BigInteger getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(BigInteger playerId) {
		this.playerId = playerId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}