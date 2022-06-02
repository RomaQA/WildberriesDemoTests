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
    @FindBy(xpath="//img[@alt='Wildberries']")
    public WebElement logo;

    @ElementTitle("Первый товар из списка")
    @FindBy(xpath="//div[@class='product-card j-card-item j-good-for-listing-event'][1]")
    public WebElement first_product;

    @ElementTitle("В корзину")
    @FindBy(xpath="(//a[contains(@class,'btn-main-sm j-add-to-basket')])[1]")
    public WebElement to_basket;

    @ElementTitle("pop-up добавлен в корзину")
    @FindBy(xpath="(//p[@class='action-notification show'])[1]")
    public WebElement pop_up_add_to_basket;

    @ElementTitle("Корзина")
    @FindBy(xpath="(//span[@class='navbar-pc__icon navbar-pc__icon--basket'])[1]")
    public WebElement basket;

    @ElementTitle("один товар в корзине")
    @FindBy(xpath="(//span[@class='navbar-pc__icon navbar-pc__icon--basket'])[1]")
    public WebElement one_item_in_basket;








}
