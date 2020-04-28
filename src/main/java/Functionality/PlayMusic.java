package Functionality;

import com.sun.javafx.css.Size;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class PlayMusic {
    protected AndroidDriver driver;
    private PlayMusic.MusicPlayer musicPlayer;

    public PlayMusic(AndroidDriver driver) {
        this.driver = driver;
    }
    public void Click_Songs_Menu(String _visibleText) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        MobileElement ed = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains("+ "\""+ _visibleText+"\"" +"));");
        ed.click();
    }
    public void Play_Over_The_Horizon(String _song) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        MobileElement ed = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains("+ "\""+ _song+"\"" +"));");
        ed.click();
    }
    public void Click_Play() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        musicPlayer.Album.click();
        musicPlayer.Playbutton.click();
        TimeUnit.SECONDS.sleep(5);
    }

    class MusicPlayer {
        @CacheLookup
        @FindBy(id = "com.universalmusicplayer:id/blurredAlbumart")
        WebElement Album;
        @FindBy(id="com.universalmusicplayer:id/playpausefloating")
        WebElement Playbutton;


    }

}

