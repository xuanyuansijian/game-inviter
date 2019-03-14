package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the flow_cash_out database table.
 * 
 */
@Entity
@Table(name="flow_cash_out")
@NamedQuery(name="FlowCashOut.findAll", query="SELECT f FROM FlowCashOut f")
public class FlowCashOut implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String id;

	@Column(precision=10)
	private BigDecimal amount;

	@Column(length=255)
	private String comment;

	@Column(name="player_id")
	private BigInteger playerId;

	private byte type;

	@Column(name="type_match_action_id")
	private BigInteger typeMatchActionId;

	@Column(name="unique_access_str", length=255)
	private String uniqueAccessStr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	public FlowCashOut() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public BigInteger getTypeMatchActionId() {
		return this.typeMatchActionId;
	}

	public void setTypeMatchActionId(BigInteger typeMatchActionId) {
		this.typeMatchActionId = typeMatchActionId;
	}

	public String getUniqueAccessStr() {
		return this.uniqueAccessStr;
	}

	public void setUniqueAccessStr(String uniqueAccessStr) {
		this.uniqueAccessStr = uniqueAccessStr;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}