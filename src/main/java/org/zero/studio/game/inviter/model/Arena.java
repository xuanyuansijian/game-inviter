package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the arena database table.
 * 
 */
@Entity
@NamedQuery(name="Arena.findAll", query="SELECT a FROM Arena a")
public class Arena implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ability_id")
	private short abilityId;

	private String address;

	@Column(name="close_time")
	private Time closeTime;

	private String comment;

	@Column(name="court_amount")
	private byte courtAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="join_time")
	private Date joinTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update_time")
	private Date lastUpdateTime;

	@Column(name="location_x")
	private BigDecimal locationX;

	@Column(name="location_y")
	private BigDecimal locationY;

	private String name;

	@Column(name="open_time")
	private Time openTime;

	@Column(name="phone_number")
	private String phoneNumber;

	public Arena() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getAbilityId() {
		return this.abilityId;
	}

	public void setAbilityId(short abilityId) {
		this.abilityId = abilityId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Time getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(Time closeTime) {
		this.closeTime = closeTime;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte getCourtAmount() {
		return this.courtAmount;
	}

	public void setCourtAmount(byte courtAmount) {
		this.courtAmount = courtAmount;
	}

	public Date getJoinTime() {
		return this.joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public BigDecimal getLocationX() {
		return this.locationX;
	}

	public void setLocationX(BigDecimal locationX) {
		this.locationX = locationX;
	}

	public BigDecimal getLocationY() {
		return this.locationY;
	}

	public void setLocationY(BigDecimal locationY) {
		this.locationY = locationY;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(Time openTime) {
		this.openTime = openTime;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}