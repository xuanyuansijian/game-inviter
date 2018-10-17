package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ability_level database table.
 * 
 */
@Entity
@Table(name="ability_level")
@NamedQuery(name="AbilityLevel.findAll", query="SELECT a FROM AbilityLevel a")
public class AbilityLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ability_id")
	private short abilityId;

	@Lob
	private String description;

	private byte level;

	@Column(name="level_name")
	private String levelName;

	public AbilityLevel() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

}