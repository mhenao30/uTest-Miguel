package co.com.utest.tasks;

import co.com.utest.userinterface.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Confirm implements Task {
    private String strPassword;
    private String strConfirmPassword;

    public Confirm(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }



    public static  Confirm onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Confirm.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue(strPassword).into(ConfirmPage.INP_PASSWORD),
            Enter.theValue(strConfirmPassword).into(ConfirmPage.INP_CONFIRM_PASSWORD),
            Click.on(ConfirmPage.CH_TERM_OF_USE),
            Click.on(ConfirmPage.CH_PRIVACY_SETTING),
            Click.on(ConfirmPage.BTN_CONFIRM)
    );
    }
}
