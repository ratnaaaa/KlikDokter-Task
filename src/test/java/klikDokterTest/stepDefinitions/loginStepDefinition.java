package klikDokterTest.stepDefinitions;

import Tasks.ClickOn;
import Tasks.InputText;
import Tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;

public class loginStepDefinition {
    @Given("{actor} open Homepage Klikdokter")
    public void openHomepage(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("KlikDokter Login")
        );
    }

    @When("{actor} Click login button")
    public void Clicklogin(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("masuk homepage")
        );

    }
    @And("{actor} input email")
    public void inputEmail(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("email_login");

        actor.attemptsTo(
                InputText.onField("email field", email)
        );

    }
    @And("{actor} click Selanjutnya button")
    public void clickLoginButton(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Selanjutnya Button")
        );
    }

    @And("{actor} Input OTP")
    public void inputOTP(Actor actor) throws Exception {

    }
    @And("{actor} click send otp button")
    public void buttonOTP(Actor actor) throws Exception {

    }
    @Then("successfully login")
    public void SuccessLogin(Actor actor) throws Exception {

    }
}
