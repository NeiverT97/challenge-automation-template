package co.com.certificacion.retotecnicobanistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.List;

public class ValidateInformation implements Question {

    private String msj;
    private List<String> informationList;

    public ValidateInformation(String msj, List<String> informationList) {
        this.msj = msj;
        this.informationList = informationList;
    }

    @Override
    public Object answeredBy(Actor actor) {

        return informationList.contains(msj);


    }

    public static ValidateInformation answered(String msj, List<String> informationList){
        return new ValidateInformation(msj,informationList);
    }
}
