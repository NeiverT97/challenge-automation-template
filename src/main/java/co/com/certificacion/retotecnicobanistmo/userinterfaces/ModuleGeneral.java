package co.com.certificacion.retotecnicobanistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ModuleGeneral {

    public static final Target COOKIES = Target.the("Acept cookies")
            .locatedBy("//button[@id='btn-aceptar-cookies']");

    public static final Target PRODUCTS = Target.the("Go to products")
            .locatedBy("//a[contains(text(),'Productos')]");

    public static final Target TRANSFER = Target.the("Go to international transfer")
            .locatedBy("//a[contains(text(),'Transferencias')]");

    public static final Target DOCUMENTS = Target.the("associated documents")
            .locatedBy("//a[text()='Documentos asociados']");

    public static final Target PDF = Target.the("PDF")
            .locatedBy("(//span[text()='Solicitud de enmienda de transferencias internacionales'])[1]/following::a[1]");

}
