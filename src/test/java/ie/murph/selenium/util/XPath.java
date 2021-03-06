package test.java.ie.murph.selenium.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum XPath
{
	INPUT_PLACEHOLDER_EMAIL_ADDRESS_MESSAGE("//input[@placeholder='Your Email Address']"),
	STACK_TRACE("");
	
	private static final Logger LOGGER = LogManager.getLogger(XPath.class.getName());
	private final String text;

    private XPath(final String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
    	LOGGER.info("++toString()");
        return this.text;
    }
}
