package ru.wildberries.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Сайт Wildberries")
public class WildberriesPage extends AbstractMainPage {

    @ElementTitle("Поиск")
    @FindBy(id="searchInput")
    public WebElement element;

    @ElementTitle("Лого")
    @FindBy(xpath="//img[@alt='Wildberries2']")
    public WebElement logo;




}
