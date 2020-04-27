package Test;


import Functionality.PlayMusic;
import Setup.BaseSetup;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Test_Mobile {
    BaseSetup Setup = new BaseSetup();
    private AndroidDriver driver =  Setup.getDriver();

    public Test_Mobile() throws InterruptedException, MalformedURLException {
    }
   // @Test
    public void playmusic () throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        TimeUnit.SECONDS.sleep(30);
        mymusic.MusicPlayer();

    }
    @Test(priority = 1)
    public void Artist() throws InterruptedException {
        PlayMusic mymusic =new PlayMusic(driver);
        mymusic.Scroll_To_Element("ALBUMS");
    }

}

