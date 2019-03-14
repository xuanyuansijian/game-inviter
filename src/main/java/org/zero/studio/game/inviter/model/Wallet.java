package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the wallet database table.
 * 
 */
@Entity
@Table(name="wallet")
@NamedQuery(name="Wallet.findAll", query="SELECT w FROM Wallet w")
public class Wallet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="player_id", unique=true, nullable=false, length=255)
	private String playerId;

	@Column(name="arena_id")
	private int arenaId;

	@Column(name="cash_amount", precision=10)
	private BigDecimal cashAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update_time")
	private Date lastUpdateTime;

	@Column(name="red_packet_amount", precision=10)
	private BigDecimal redPacketAmount;

	public Wallet() {
	}

	public String getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
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

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public BigDecimal getRedPacketAmount() {
		return this.redPacketAmount;
	}

	public void setRedPacketAmount(BigDecimal redPacketAmount) {
		this.redPacketAmount = redPacketAmount;
	}

}