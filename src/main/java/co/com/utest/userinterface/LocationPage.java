package co.com.utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {

    public static final Target BTN_LAST_STEP = Target.the("Next: Devices").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));

}
