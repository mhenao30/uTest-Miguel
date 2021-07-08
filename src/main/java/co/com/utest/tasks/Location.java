package co.com.utest.tasks;


import co.com.utest.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Location implements Task {

    public static Location onThePage() {
        return Tasks.instrumented(Location.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocationPage.BTN_LAST_STEP)
        );
    }
}
