package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.mixing.DVDPlayerConfig;

/*
 * Explicit Configuration - Java mixing Config
 * 
 * ( JavaConfig ) <- {JavaConfig1, JavaConfig2, JavaConfig3}
 * 				  import
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DVDPlayerConfig.class)
public class DVDPlayerMixingConfigTest01 {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DVDPlayer player;
	
	@Test
	public void testPlayernull() {
		assertNotNull(player);
	}
	
}
