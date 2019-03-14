package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the player_login_type database table.
 * 
 */
@Entity
@Table(name="player_login_type")
@NamedQuery(name="PlayerLoginType.findAll", query="SELECT p FROM PlayerLoginType p")
public class PlayerLoginType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private short id;

	@Column(name="is_need_password", nullable=false)
	private byte isNeedPassword;

	@Column(nullable=false, length=50)
	private String name;

	public PlayerLoginType() {
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public byte getIsNeedPassword() {
		return this.isNeedPassword;
	}

	public void setIsNeedPassword(byte isNeedPassword) {
		this.isNeedPassword = isNeedPassword;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}