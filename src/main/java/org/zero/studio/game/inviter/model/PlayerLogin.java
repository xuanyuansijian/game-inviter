package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the player_login database table.
 * 
 */
@Entity
@Table(name="player_login")
@NamedQuery(name="PlayerLogin.findAll", query="SELECT p FROM PlayerLogin p")
public class PlayerLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(name="login_type_id", nullable=false)
	private byte loginTypeId;

	@Column(length=50)
	private String password;

	@Column(name="player_id", nullable=false)
	private BigInteger playerId;

	@Column(nullable=false, length=50)
	private String username;

	public PlayerLogin() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getLoginTypeId() {
		return this.loginTypeId;
	}

	public void setLoginTypeId(byte loginTypeId) {
		this.loginTypeId = loginTypeId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigInteger getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(BigInteger playerId) {
		this.playerId = playerId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}