package pageUI;

public class CommonPageUI {
    public static final String DYNAMIC_TEXTBOX = "//td[text()='%s']//following-sibling::td/input";
    public static final String DYNAMIC_TEXTAREA = "//textarea[@name='%s']";
    public static final String DYNAMIC_RADIO_BUTTON = "//input[@value='%s']";
    public static final String DYNAMIC_BUTTON = "//input[@type='%s']";
    public static final String DYNAMIC_MESSAGE = "//p[@class='heading3' and contains(text(),'%s')]";
    public static final String DYNAMIC_MENU_LINK  = "//a[contains(text(),'%s')]";
    public static final String DYNAMIC_VALUE_COLUMNNAME = "//td[contains(text(),'%s')]//following-sibling::td";
}
