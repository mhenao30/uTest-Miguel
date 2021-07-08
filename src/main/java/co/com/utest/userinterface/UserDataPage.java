package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class UserDataPage {
    public static final Target BTN_JOIN_TODAY = Target.the("Join Today").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INP_FIRTNAME = Target.the("First Name").located(By.id("firstName"));
    public static final Target INP_LASTNAME = Target.the("Last Name").located(By.id("lastName"));
    public static final Target INP_EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target SEL_BIRTHMONTH = Target.the("Birth Month").located(By.id("birthMonth"));
    public static final Target SLT_BIRTHDAY = Target.the("Birth Day").located(By.id("birthDay"));
    public static final Target SLT_BIRTHYEAR = Target.the("Birth Year").located(By.id("birthYear"));
    public static final Target BTN_LOCATION = Target.the("Next: Location").located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));

}

//select[@id='birthMonth']//option
