package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activety_level database table.
 * 
 */
@Entity
@Table(name="activety_level")
@NamedQuery(name="ActivetyLevel.findAll", query="SELECT a FROM ActivetyLevel a")
public class ActivetyLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private byte id;

	@Column(length=255)
	private String comment;

	@Column(nullable=false, length=255)
	private String name;

	public ActivetyLevel() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}