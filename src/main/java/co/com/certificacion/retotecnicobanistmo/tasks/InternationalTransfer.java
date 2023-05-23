package co.com.certificacion.retotecnicobanistmo.tasks;

import static co.com.certificacion.retotecnicobanistmo.userinterfaces.ModuleGeneral.*;

import co.com.certificacion.retotecnicobanistmo.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class InternationalTransfer implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitHook.theSeconds(1000),
                Click.on(COOKIES),
                Click.on(PRODUCTS),
                Click.on(TRANSFER)
        );
    }

    public static InternationalTransfer with(){
        return Tasks.instrumented(InternationalTransfer.class);
    }
}
