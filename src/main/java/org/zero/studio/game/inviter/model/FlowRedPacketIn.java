package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the flow_red_packet_in database table.
 * 
 */
@Entity
@Table(name="flow_red_packet_in")
@NamedQuery(name="FlowRedPacketIn.findAll", query="SELECT f FROM FlowRedPacketIn f")
public class FlowRedPacketIn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String id;

	@Column(precision=10)
	private BigDecimal amount;

	@Column(length=255)
	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expire_time")
	private Date expireTime;

	@Column(name="player_id")
	private BigInteger playerId;

	private byte type;

	@Column(name="type_match_action_id")
	private BigInteger typeMatchActionId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	public FlowRedPacketIn() {
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

	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
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

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}