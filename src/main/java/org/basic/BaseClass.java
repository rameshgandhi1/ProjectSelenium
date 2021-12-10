package org.basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	public static void winMax() {
    driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void printTitle() {
    System.out.println(driver.getTitle());
	}
    public static void printCurrentUrl() {
    System.out.println(driver.getCurrentUrl());
	}
    public static void fill(WebElement ele, String value ) {
    ele.sendKeys(value);
	}
    public static void btnClick(WebElement ele) {
    	ele.click();
	}
    public static void closeChrome() {
    driver.close();
	}
    public static void rightClick(WebElement ele) {
    Actions a=new Actions(driver);
    a.contextClick(ele).perform();
	}
    public static void mouseOver(WebElement ele) {
    Actions a=new Actions(driver);
    a.moveToElement(ele).perform();
	}
    public static void doubleClick(WebElement ele) {
    Actions a=new Actions(driver);
    a.doubleClick(ele).perform();
	}
    public static void keyDown( WebElement ele) {
    	Actions a=new Actions(driver);
    	a.keyDown(ele, Keys.SHIFT).perform();
	}   
    public static void keyUp(WebElement ele) {
    	Actions a=new Actions(driver);
    	a.keyUp(ele, Keys.SHIFT).perform();
	}
    public static String getData(int rowNumber,int cellNumber) throws IOException {
    File f=new File("C:\\Users\\Ramesh\\eclipse-workspace\\SeleniumProject\\testData\\book1.xlsx");
    FileInputStream fin=new FileInputStream(f);
    Workbook w=new XSSFWorkbook(fin);
    Sheet s = w.getSheet("greens");
    Row row = s.getRow(rowNumber);
    Cell cell = row.getCell(cellNumber);
    int cellType = cell.getCellType();
    String value="";
    if (cellType==1) {
		value = cell.getStringCellValue();
	}
    else if (cellType==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd,mm,yyyy");
		    value = sim.format(d);
			}
		else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
		    value = String.valueOf(l);
		}
	}
    return value;
    
    
    
    
    
    
    
	}
    
    public static void down() throws AWTException {
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
	}
    public static void enter() throws AWTException {
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
	}
    public void tab() throws AWTException {
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
	}
    public static void paste() throws AWTException {
   	Robot r=new Robot();
   	r.keyPress(KeyEvent.VK_CONTROL);
   	r.keyPress(KeyEvent.VK_V);
   	r.keyRelease(KeyEvent.VK_CONTROL);
   	r.keyRelease(KeyEvent.VK_V);
	}
    public static void accept() {
    Alert alert = driver.switchTo().alert();
    alert.accept();
	}
    public static void dismiss() {
    	Alert alert = driver.switchTo().alert();
    	alert.dismiss();
	}
    public static void alertFill(String value) {
    Alert alert = driver.switchTo().alert();
    alert.sendKeys(value);
	}
    public static void alertText() {
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());	
	}
    
}
