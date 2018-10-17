package org.zero.studio.game.inviter.player.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zero.studio.game.inviter.model.AbilityLevel;
import org.zero.studio.toolbox.bean.JSON;
import org.zero.studio.toolbox.dao.EntityDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:data-source-access.xml" })
public class GameInviterModelDaoTest
{
	Logger log;
	@Resource(name = "entityDao")
	EntityDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));
	}

	@Before
	public void setUp() throws Exception
	{
		log = Logger.getLogger(GameInviterModelDaoTest.class);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test()
	{
		try
		{
			AbilityLevel al = new AbilityLevel();
			al.setAbilityId((short) 1);
			al.setLevel((byte) 13);
			al.setDescription("凡符合下列成绩标准之一者，可以申请授予三级运动员称号。\r\n" + "1．在一般市辖区或地、县举行的正式比赛中，获得各单项第6名，团体第2名的主力队员；\r\n"
					+ "2．在省辖市（专区、直辖市的区）或相当于省辖市的少年比赛中获得各单项前8名，团体前3名的主力队员；\r\n" + "3．在不少于16名运动员参加的正式比赛中，获得各单项前2名的运动员。");
			al.setLevelName("三级运动员");
			int r = dao.insertEntity(al, AbilityLevel.class);
			log.info(r);
			//
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("level", 13);
			AbilityLevel a = dao.selectEntityByAndParams(paramMap, null, null, null, AbilityLevel.class);
			log.info(JSON.bean2Json(a));
			assertTrue(true);
		}
		catch (Exception e)
		{
			log.error("test error", e);
			fail("Not yet implemented");
		}
	}
}
