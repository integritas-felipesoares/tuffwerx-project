package com.tuffwerx.lab;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @felipesoares
 *
 */

public class App 
{
	 public static final File PHANTOMJS_EXE =
             new File(System.getProperty("user.dir"), 
             "/phantomjs/phantomjs.exe");
	 
    public String loadPage(String url)
    {   
        // prepare capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("phantomjs.binary.path", 
                    PHANTOMJS_EXE.getAbsolutePath());

        // Launch driver (will take care and ownership of the phantomjs process)
        PhantomJSDriver driver = new PhantomJSDriver(caps);
        
        // Load Page
        driver.get(url);
        
        // Locate the Search field on the Page
        WebElement element = driver.findElementById("home");
        
        // Check results contains the term we searched for
        String result = element.getText();
        
        // done
        driver.quit();
        
        return result;
    }
    
    public String executeScriptJS(String url, int increment)
    {   
        // prepare capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("phantomjs.binary.path", 
                    PHANTOMJS_EXE.getAbsolutePath());

        // Launch driver (will take care and ownership of the phantomjs process)
        PhantomJSDriver driver = new PhantomJSDriver(caps);
        
        // Load Page JS
        driver.get(url);
        
        increment++;
        String javascript = "( function calc() {" +
        	" document.getElementById('test').innerHTML = "+increment+";" +
             " })() ";
        driver.executeScript(javascript);
        WebElement element = driver.findElementById("test");
        
        // Check results contains the term we searched for
        String result = element.getText();
        
        // done
        driver.quit();
        
        return result;
    }
}
