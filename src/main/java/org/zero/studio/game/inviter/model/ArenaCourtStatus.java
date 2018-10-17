package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the arena_court_status database table.
 * 
 */
@Entity
@Table(name="arena_court_status")
@NamedQuery(name="ArenaCourtStatus.findAll", query="SELECT a FROM ArenaCourtStatus a")
public class ArenaCourtStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private short id;

	private String explain;

	private byte status;

	public ArenaCourtStatus() {
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getExplain() {
		return this.explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}