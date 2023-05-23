package co.com.certificacion.retotecnicobanistmo.tasks;

import co.com.certificacion.retotecnicobanistmo.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.certificacion.retotecnicobanistmo.userinterfaces.ModuleGeneral.*;

public class DownloadPDF implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DOCUMENTS),
                Click.on(DOCUMENTS),
                Click.on(PDF),
                WaitHook.theSeconds(4000)
        );
    }

    public static DownloadPDF pdf(){
        return Tasks.instrumented(DownloadPDF.class);
    }
}
