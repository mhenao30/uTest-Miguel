package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPage {

    public static final Target INP_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target INP_CONFIRM_PASSWORD = Target.the("Confirm Password").located(By.id("confirmPassword"));
    public static final Target CH_TERM_OF_USE = Target.the("Term Of Use").located(By.id("termOfUse"));
    public static final Target CH_PRIVACY_SETTING = Target.the("Privacy Setting").located(By.id("privacySetting"));
    public static final Target BTN_CONFIRM = Target.the("Comfirm").located(By.id("laddaBtn"));




}
