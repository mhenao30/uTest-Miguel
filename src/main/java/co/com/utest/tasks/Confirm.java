package co.com.utest.tasks;

import co.com.utest.userinterface.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Confirm implements Task {
    public static  Confirm onThePage() {
        return Tasks.instrumented(Confirm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Enter.theValue("Password").into(ConfirmPage.INP_PASSWORD),
            Enter.theValue("ConfirmP").into(ConfirmPage.INP_CONFIRM_PASSWORD),
            Click.on(ConfirmPage.CH_TERM_OF_USE),
            Click.on(ConfirmPage.CH_PRIVACY_SETTING),
            Click.on(ConfirmPage.BTN_CONFIRM)
    );
    }
}
