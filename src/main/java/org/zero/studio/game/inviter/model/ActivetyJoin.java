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

	@Column(name="activety_id")
	private BigInteger activetyId;

	@Column(name="player_id")
	private BigInteger playerId;

	private byte status;

	public ActivetyJoin() {
	}

	public BigInteger getActivetyId() {
		return this.activetyId;
	}

	public void setActivetyId(BigInteger activetyId) {
		this.activetyId = activetyId;
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