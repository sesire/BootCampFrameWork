package SearchNewsPage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchNews extends CommonAPI {
    @Test
    public void searchBox()throws InterruptedException{
        typeByCss("#hdr-search-box", "politics");
        clickByXpath(".//*[@id='hdr-search']/form/div/div[2]/input");
        Thread.sleep(10);
    }

}
