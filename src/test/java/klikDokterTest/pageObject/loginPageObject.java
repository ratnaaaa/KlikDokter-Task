package klikDokterTest.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.klikdokter.com/")
public class loginPageObject extends PageObject {
    public static Target HomePage_masuk = Target.the("homepage masuk")
            .locatedBy("#login");
    public static Target Email_field = Target.the("email field")
            .locatedBy(".form-input-text");
    public static Target Selanjutnya_button = Target.the("Selanjutnya Button")
            .locatedBy(".form-submit authentication--login--form__field-submit");

}