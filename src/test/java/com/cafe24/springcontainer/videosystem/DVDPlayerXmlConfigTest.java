package com.cafe24.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * Auto Configuration - XML Config(Annotation Config)
 * Component Scanning(@Component, @Named, @Autowired, @Inject) 
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")
	private DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	private DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("captainAmerica")
	private DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengerDirectorEdition")
	private DigitalVideoDisc dvd7;
	
	@Autowired
	@Qualifier("avengerExpansionPack1")
	private DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengerExpansionPack2")
	private DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengerExpansionPack3")
	private DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("avengersTriplepack")
	private DVDPack dvdPack;

	
	
	@Autowired
	@Qualifier("dvdPlayer2")
	private DVDPlayer player2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player3;
	
	@Autowired
	@Qualifier("dvdPlayer4")
	private DVDPlayer player4;
	
	@Autowired
	@Qualifier("dvdPlayer5")
	private DVDPlayer player5;
	
	@Autowired
	@Qualifier("dvdPlayer6")
	private DVDPlayer player6;
	
	@Autowired
	@Qualifier("dvdPlayer7")
	private DVDPlayer player7;
	
	
	@Test
	public void testDVD2Null() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=AVENGERS Infinity War, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=AVENGERS Endgame, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=AVENGERS Age Of Ultron, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=Captain America, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Director's Edition, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack1, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
		assertEquals("BlankDisc [title=Avengers Expansion Pack3, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPackNull() {
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
		assertEquals("DVDPack [title=Avengers Triplepack, dvds=[BlankDisc [title=AVENGERS Age Of Ultron, studio=MARVEL, actors=null], BlankDisc [title=AVENGERS Infinity War, studio=MARVEL, actors=null], BlankDisc [title=AVENGERS Endgame, studio=MARVEL, actors=null]]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	
	
	
	@Test
	public void testPlayer2Null() {
		assertNotNull(player2);
	}
	
	@Test
	public void testPlayer3Null() {
		assertNotNull(player3);
	}
	
	@Test
	public void testPlayer4Null() {
		assertNotNull(player4);
	}
	
	@Test
	public void testPlayer5Null() {
		assertNotNull(player5);
	}
	
	@Test
	public void testPlayer6Null() {
		assertNotNull(player6);
	}
	
	@Test
	public void testPlayer7Null() {
		assertNotNull(player7);
	}
	
	@Test
	public void testPlay2() {
		player2.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay6() {
		player6.play();
		assertEquals("Playing Movie MARVEL's AVENGERS Infinity War", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay7() {
		player7.play();
		assertEquals("Playing Movie MARVEL's AVENGERS Infinity War", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
