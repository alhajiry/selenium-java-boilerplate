package moneylion.utils;

import moneylion.pages.CareerPage;
import moneylion.pages.HomePage;

public class PageObjectManager {

    public HomePage homePage() {return new HomePage();}
    public CareerPage careerPage() {return new CareerPage();}
}
