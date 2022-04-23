package Tasks;

import klikDokterTest.pageObject.loginPageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception {
        Target field;

        switch (fieldType) {

            case "KlikDokter_Email":
                field = loginPageObject.Email_field;
                break;

            default:
                throw new Exception("There is no field type: " + fieldType);
        }
        WaitUntil.the(field, isVisible()).forNoMoreThan(50).seconds();

        return Task.where("{0} input: " + value+ "",
                Enter.theValue(value)
                        .into(field)
        );
    }
}