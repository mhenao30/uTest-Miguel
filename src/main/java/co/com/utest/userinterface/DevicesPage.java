package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DevicesPage {
    public static final Target BTN_COMFIRM = Target.the("Next: Comfirm").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
