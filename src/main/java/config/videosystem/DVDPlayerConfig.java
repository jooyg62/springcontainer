package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {


	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	/**
	 * Avengers Bean 이 두개 생기지는 않는다. 주입 
	 */
	// 주입하기1
	// @Bean
	public DVDPlayer dvdPlayer() {
		return new DVDPlayer(avengers());
	}
	
	/**
	 * parameter가 보이면 자동으로 넣어준다. 
	 */
	// 주입하기2
	// @Bean
	public DVDPlayer dvdPlayer2(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	// 주입하기3
	@Bean(name="dvdPlayer3")
	public DVDPlayer dvdPlayer3(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer(dvd);
		player.setDigitalVideoDisc(dvd);
		return player;
	}
	
	// 주입하기4
	@Bean(name="dvdPlayer4")
	public DVDPlayer dvdPlayer4() {
		return new DVDPlayer(avengers());
	}
	
}
