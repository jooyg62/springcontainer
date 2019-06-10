package config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.springcontainer.videosystem.DVDPlayer;
import com.cafe24.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {

	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {
		return new DVDPlayer();
	}
	
}
