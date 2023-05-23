package co.com.certificacion.retotecnicobanistmo.interactions;

import co.com.certificacion.retotecnicobanistmo.utils.OwnWebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class SwithTo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        OwnWebDriver.nuevo().getWindowHandle();
        actor.attemptsTo(
                WaitHook.theSeconds(3000)
        );
    }

    public static SwithTo window(){
        return Tasks.instrumented(SwithTo.class);
    }
}
