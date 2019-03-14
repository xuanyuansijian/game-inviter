package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ability database table.
 * 
 */
@Entity
@Table(name="ability")
@NamedQuery(name="Ability.findAll", query="SELECT a FROM Ability a")
public class Ability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private short id;

	@Column(nullable=false, length=255)
	private String name;

	public Ability() {
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}