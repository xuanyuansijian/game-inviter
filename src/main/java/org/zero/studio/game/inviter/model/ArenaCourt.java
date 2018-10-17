package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the arena_court database table.
 * 
 */
@Entity
@Table(name="arena_court")
@NamedQuery(name="ArenaCourt.findAll", query="SELECT a FROM ArenaCourt a")
public class ArenaCourt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="arena_id")
	private int arenaId;

	private byte level;

	private String number;

	private byte status;

	public ArenaCourt() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getArenaId() {
		return this.arenaId;
	}

	public void setArenaId(int arenaId) {
		this.arenaId = arenaId;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}