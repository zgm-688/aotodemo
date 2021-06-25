package com.zgm.aotodemo.downPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service(value = "getSJPicV2")
public class GetPageHtml {

    private final static Logger logger = LoggerFactory.getLogger(GetPageHtml.class);

    public static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        getHtml();
    }

    /**
     * 备注:
     * 当前网站:  https://www.exception.site/java8/java8-stream-tutorial
     */
    public static String getHtml() throws Exception {
        if (driver == null) {
            initWebDriver();
        }
        try {
            String url = "https://www.exception.site/java8/java8-stream-tutorial";
            driver.get(url); // 打开指定的网站
            String pageSource = driver.getPageSource();
            System.out.println(pageSource);
        } catch (Exception e) {
            logger.error("出现异常==", e);
        } finally {
//            Thread.sleep(4000);
        }
        return null;
    }

    public static WebDriver initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\tmp\\7\\chromedriver.exe");// chromedriver服务地址
        driver = new ChromeDriver(); // 新建一个WebDriver 的对象，但是new 的是谷歌的驱动
        return driver;
    }


}
