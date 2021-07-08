package co.com.utest.tasks;

import co.com.utest.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Devices implements Task {

    public static Devices onThePage() {
        return Tasks.instrumented(Devices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicesPage.BTN_COMFIRM)
        );

    }
}
