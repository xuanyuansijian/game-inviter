package org.zero.studio.game.inviter.model;

import java.io.Serializable;
import javax.persistence.*;


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
	@Column(name="player_id")
	private String playerId;

	@Column(name="login_type_id")
	private byte loginTypeId;

	private String password;

	private String username;

	public PlayerLogin() {
	}

	public String getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}