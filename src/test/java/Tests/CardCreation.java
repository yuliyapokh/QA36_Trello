package Tests;

import model.Card;
import org.testng.annotations.Test;

public class CardCreation extends TestBase{

    @Test
    public void cardCreation1(){
        Card card= Card.builder().cardName("test1").color("green").build();

        app.getBoard().clickOnTheFirstBoard();
        app.getBoard().pause(2000);
        app.getList().createList("test36");
        app.getList().pause(2000);
        app.getCard().initCardCreation();
        app.getCard().fillInCardCreationForm(card);
        app.getCard().submitCardCreation();
        app.getBoard().returnToHomePage();
    }
}