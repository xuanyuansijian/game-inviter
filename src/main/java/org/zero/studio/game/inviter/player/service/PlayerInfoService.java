package org.zero.studio.game.inviter.player.service;

import org.zero.studio.carriage.api.CaMessage;
import org.zero.studio.carriage.api.game.inviter.AddPlayerReq;
import org.zero.studio.carriage.api.game.inviter.AmendPlayerReq;

/**
 * 
 * @author Administrator
 *
 */
public interface PlayerInfoService
{
	/**
	 * add player informations
	 * 
	 * @param request
	 * @return
	 */
	CaMessage<?> add(CaMessage<AddPlayerReq> request);

	/**
	 * amend player informations
	 * 
	 * @param request
	 * @return
	 */
	CaMessage<?> amend(CaMessage<AmendPlayerReq> request);
}
