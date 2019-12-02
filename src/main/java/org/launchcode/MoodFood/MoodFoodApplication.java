package org.launchcode.MoodFood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner; // I use scanner because it's command line.

@SpringBootApplication
public class MoodFoodApplication {

	private void splashScreenInit() {
		ImageIcon myImage = new ImageIcon(com.devdaily.splashscreen.SplashScreenMain.class.getResource("SplashImage.gif"));
		screen = new SplashScreen(myImage);
		screen.setLocationRelativeTo(null);
		screen.setProgressMax(100);
		screen.setScreenVisible(true);
	}


		}
