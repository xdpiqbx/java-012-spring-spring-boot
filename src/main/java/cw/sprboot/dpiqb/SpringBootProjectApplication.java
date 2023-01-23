package cw.sprboot.dpiqb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootProjectApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
