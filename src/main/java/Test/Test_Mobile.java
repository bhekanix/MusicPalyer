package Test;


import Functionality.PlayMusic;
import Setup.BaseSetup;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Test_Mobile {
    BaseSetup Setup = new BaseSetup();
    private AndroidDriver driver =  Setup.getDriver();

    public Test_Mobile() throws InterruptedException, MalformedURLException {
    }
    @Test
    public void Click_Songs_Tab () throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        mymusic.Click_Songs_Menu("SONGS");

    }
    @Test(priority = 1)
    public void Play_Over_The_Horizon () throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        TimeUnit.SECONDS.sleep(3);
        mymusic.Play_Over_The_Horizon("Asenzele bona");
        TimeUnit.SECONDS.sleep(1);

    }
    @Test(priority = 2)
    public void Play_Song() throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        TimeUnit.SECONDS.sleep(1);
        mymusic.Click_Play();
    }
    @AfterTest
    public void Close_Player()
    {
        driver.quit();
    }
}

