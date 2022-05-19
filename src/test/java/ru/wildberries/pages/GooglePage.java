package ru.wildberries.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Google")
public class GooglePage extends AbstractMainPage {

    @ElementTitle("Поиск")
    @FindBy(name="q")
    public WebElement field_search;

    @ElementTitle("Поиск в Google")
    @FindBy(name="btnK")
    public WebElement button_search;

    @ElementTitle("wildberries")
    @FindBy(xpath="//a[@href='https://www.wildberries.ru/']//parent::div//div[@class='TbwUpd NJjxre']")
    public WebElement wildberries_link;




}
