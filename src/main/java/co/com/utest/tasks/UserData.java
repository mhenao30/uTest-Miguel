package co.com.utest.tasks;

import co.com.utest.userinterface.UserDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class UserData implements Task{


    public static UserData onThePage() {
        return Tasks.instrumented(UserData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UserDataPage.BTN_JOIN_TODAY),
                Enter.theValue("Miguel").into(UserDataPage.INP_FIRTNAME),
                Enter.theValue("Henao").into(UserDataPage.INP_LASTNAME),
                Enter.theValue("mghenao95@gmail.es").into(UserDataPage.INP_EMAIL),
                SelectFromOptions.byVisibleText("January").from(UserDataPage.SEL_BIRTHMONTH),
                SelectFromOptions.byVisibleText("30").from(UserDataPage.SLT_BIRTHDAY),
                SelectFromOptions.byVisibleText("1995").from(UserDataPage.SLT_BIRTHYEAR),
                Click.on(UserDataPage.BTN_LOCATION)
        );

    }
}
