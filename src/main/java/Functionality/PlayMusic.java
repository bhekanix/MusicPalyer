package Functionality;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PlayMusic {
    protected AndroidDriver driver;
    private PlayMusic.MusicPlayer musicPlayer;

    public PlayMusic(AndroidDriver driver) {
        this.driver = driver;

    }
    public void MusicPlayer() throws InterruptedException {
        TimeUnit.SECONDS.sleep(60);
        musicPlayer.buttonPlay.click();
        System.out.println("let go");

    }
    public void Scroll_To_Element(String _visibleText) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        MobileElement ed = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains("+ "\""+ _visibleText+"\"" +"));");
        ed.click();
    }
    class MusicPlayer {
        @CacheLookup
        @FindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]")
        WebElement buttonPlay;


    }

}
