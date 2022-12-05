import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    SauceDemo demo=new SauceDemo();

    @Given("user should open url")
    public void userShouldOpenUrl() {
        demo.urlPage();
    }

    @When("user able to login")
    public void userAbleToLogin() {
        demo.login();
    }

    @Given("user choose a product")
    public void userChooseAProduct() {
        demo.AddToCart();
        demo.Cart();
        demo.CheckOut();
    }

    @When("user give the details")
    public void userGiveTheDetails() {
        demo.Information();
    }

    @Then("User should overview order")
    public void userShouldOverviewOrder() {
        demo.Overview();
    }

    @When("User back to homepage")
    public void userBackToHomepage() throws InterruptedException {
        demo.BackToHome();
    }

    @Then("User can logout")
    public void userCanLogout() throws InterruptedException {
        demo.Logout();
    }

    @Given("User able to close the browser")
    public void userAbleToCloseTheBrowser() throws InterruptedException {
        demo.Quit();

    }
}
