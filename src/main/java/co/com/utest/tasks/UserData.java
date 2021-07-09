package co.com.utest.tasks;

import co.com.utest.userinterface.UserDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class UserData implements Task{
    private String strFirtName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;

    public UserData(String strFirtName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear) {
        this.strFirtName = strFirtName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }



    public static UserData onThePage(String strFirtName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear) {
        return Tasks.instrumented(UserData.class, strFirtName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserDataPage.BTN_JOIN_TODAY),
                Enter.theValue(strFirtName).into(UserDataPage.INP_FIRTNAME),
                Enter.theValue(strLastName).into(UserDataPage.INP_LASTNAME),
                Enter.theValue(strEmail).into(UserDataPage.INP_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UserDataPage.SEL_BIRTHMONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(UserDataPage.SLT_BIRTHDAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(UserDataPage.SLT_BIRTHYEAR),
                Click.on(UserDataPage.BTN_LOCATION)
        );

    }
}
