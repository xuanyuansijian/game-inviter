package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activety_config database table.
 * 
 */
@Entity
@Table(name="activety_config")
@NamedQuery(name="ActivetyConfig.findAll", query="SELECT a FROM ActivetyConfig a")
public class ActivetyConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private short id;

	@Column(name="abililty_id")
	private short abililtyId;

	@Column(name="gender_limit")
	private byte genderLimit;

	private String name;

	public ActivetyConfig() {
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public short getAbililtyId() {
		return this.abililtyId;
	}

	public void setAbililtyId(short abililtyId) {
		this.abililtyId = abililtyId;
	}

	public byte getGenderLimit() {
		return this.genderLimit;
	}

	public void setGenderLimit(byte genderLimit) {
		this.genderLimit = genderLimit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}