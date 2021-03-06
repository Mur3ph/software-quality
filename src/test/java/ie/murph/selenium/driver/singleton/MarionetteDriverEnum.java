package test.java.ie.murph.selenium.driver.singleton;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum MarionetteDriverEnum {
	INSTANCE;
    private static final Logger LOGGER = LogManager.getLogger(MarionetteDriverEnum.class.getName());
    
    public static void initializeMarionetteDriver() {
    	LOGGER.info("++initializeMarionetteDriver()");
		// Now you can Initialize marionette driver to launch firefox
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
	}
}
