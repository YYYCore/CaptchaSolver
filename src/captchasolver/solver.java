package captchasolver;

import java.io.*;
import javax.imageio.*;
import javax.net.ssl.HttpsURLConnection;
import javax.xml.ws.WebServiceException;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.WritableRaster;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.*;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.google.gson.JsonObject;

import java.net.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.commons.codec.binary.Base64;



public class solver {
	
	
	static WebElement toclick1 = null;
	static WebElement toclick2 = null;
	static WebElement toclick3 = null;
	static WebElement toclick4 = null;
	static WebElement toclick5 = null;
	static WebElement toclick6 = null;
	static WebElement toclick7 = null;
	static WebElement toclick8 = null;
	static WebElement toclick9 = null;
	static WebElement toclick10 = null;
	static WebElement toclick11 = null;
	static WebElement toclick12 = null;
	static WebElement toclick13 = null;
	static WebElement toclick14 = null;
	static WebElement toclick15 = null;
	static WebElement toclick16 = null;
	
	static WebElement textbox = null;
	static WebElement request = null;
	static WebElement frameswitch = null;
	static WebElement click = null;
	static WebElement frameswitch2 = null;
	static WebElement cappic = null;
	static WebElement cappic2 = null;
	static WebElement textinst = null;
	static WebElement send = null;
	
	static int setwidth = 2;
	static int setheight = 3;
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		
		String mykey = "0c5d71229b104bfbf35d020c04b94116";
			
		Point image1 = new Point(470, 160);
		Point image2 = new Point(600, 160);
		Point image3 = new Point(730, 160);
		
		Point image4 = new Point(0, 0);
		Point image5 = new Point(0, 0);
		Point image6 = new Point(0, 0);
		
		Point image7 = new Point(0, 0);
		Point image8 = new Point(0, 0);
		Point image9 = new Point(0, 0);
			
		
		String usedproxy = "108.59.10.135:55555";
		
		boolean sendagain = false;
		
		
		try {
			
	    String proxyHost = "108.59.10.135";
	    int proxyPort = 55555;
	    String ignoreProxy = "localhost, 127.0.0.1";
	    
		FirefoxProfile profile = new FirefoxProfile();		
		profile.setEnableNativeEvents(true);
	
        profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.http", proxyHost);
        profile.setPreference("network.proxy.http_port", proxyPort);
        profile.setPreference("network.proxy.ssl", proxyHost);
        profile.setPreference("network.proxy.ssl_port", proxyPort);
        profile.setPreference("network.proxy.socks", proxyHost);
        profile.setPreference("network.proxy.socks_port", proxyPort);
        profile.setPreference("network.proxy.ftp", proxyHost);
        profile.setPreference("network.proxy.ftp_port", proxyPort);
        profile.setPreference("network.proxy.no_proxies_on", ignoreProxy);
        profile.setPreference("intl.accept_languages", "en");
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
	
		
		FirefoxDriver driver = new FirefoxDriver(profile);
		
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.navigate().to("https://raiblocks.net/#/distribution");
//		driver.navigate().to("http://whatismyip.com");
		String  handle= driver.getWindowHandle();
		 	 
		byte[] arrScreen = driver.getScreenshotAs(OutputType.BYTES);
		BufferedImage imageScreen;
		
		imageScreen = ImageIO.read(new ByteArrayInputStream(arrScreen));
		
			
		
		
		
		
		
		
		textbox = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/textarea");
		request = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[4]/button[1]");
		frameswitch = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[3]/div/div/iframe");
		
		textbox.sendKeys("xrb_3ymtez6mh1o1hr8cdpcgq48imrnp68pn6nbjmgffd6ogfbyc1onpytt51fu6");

		driver.switchTo().frame(frameswitch);
		
		click = driver.findElement(By.cssSelector("div[class=recaptcha-checkbox-checkmark]"));	
		
		click.click();
		
		driver.switchTo().window(handle);	

	
		
		frameswitch2 = driver.findElementByXPath("/html/body/div[3]/div[4]/iframe");
		
	

		driver.switchTo().frame(frameswitch2);
		
		
		
		cappic = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]");
		cappic2 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[1]/div[1]");
		textinst = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div[1]");
		send = driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div");
			

		
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]/div").isEmpty()){		
			setwidth = 3;
		}		
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div").isEmpty()){		
			setwidth = 4;
		}
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[1]/div").isEmpty()){		
			setheight = 4;
		}
		
		
		
		
		
//		textbox.sendKeys("xrb_3ymtez6mh1o1hr8cdpcgq48imrnp68pn6nbjmgffd6ogfbyc1onpytt51fu6");
//		driver.switchTo().frame(frameswitch);						
//		click.click();	
//		driver.switchTo().window(handle);	
//		driver.switchTo().frame(frameswitch2);
		
	
		String textinstruction = textinst.getText();
		
	
		if (textinstruction.contains("Click verify once there are none left")) {
			
			textinstruction = textinstruction.replace("Click verify once there are none left.", " ");
			sendagain = true;
			
		}
	
		
		int width = cappic.getSize().getWidth();

		Thread.sleep(500);

		while(true){
			
			
			//still need to add stuff
			
			while(true){	
				
				
				File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				BufferedImage  fullImg = ImageIO.read(screenshot);	
				Point point = cappic.getLocation();
				int eleWidth = cappic.getSize().getWidth();
				int eleHeight = cappic.getSize().getHeight();		
				BufferedImage eleScreenshot= fullImg.getSubimage(point.getX() + eleWidth + 40, point.getY() + 13, eleWidth, eleHeight);
				ImageIO.write(eleScreenshot, "jpg", screenshot);
				
				
				File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				BufferedImage  fullImg2 = ImageIO.read(screenshot2);	
				Point point2 = cappic2.getLocation();
				int eleWidth2 = cappic2.getSize().getWidth();
				int eleHeight2 = cappic2.getSize().getHeight();
				BufferedImage eleScreenshot2= fullImg2.getSubimage(point2.getX() + eleWidth2 + 40, point2.getY() + 13, eleWidth2, eleHeight2);
				ImageIO.write(eleScreenshot2, "jpg", screenshot2);
				
			
				
				BufferedImage resizedImage = new BufferedImage(setwidth*100, setheight*100, BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = resizedImage.createGraphics();
				g.drawImage(eleScreenshot, 0, 0, setwidth*100, setheight*100, null);
				
				g.dispose();	
				
				
				WritableRaster raster = resizedImage.getRaster();
				WritableRaster newraster = raster.createWritableChild(0, 0, resizedImage.getWidth(), resizedImage.getHeight(), 0, 0, new int[] {0, 1, 2});
				DirectColorModel cm = (DirectColorModel)resizedImage.getColorModel();
				DirectColorModel newCM = new DirectColorModel(cm.getPixelSize(),
				cm.getRedMask(), cm.getGreenMask(), cm.getBlueMask());
				BufferedImage resizedImagejpg = new BufferedImage(newCM, newraster, false, null);
				
				
				File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
				ImageIO.write(resizedImagejpg, "jpg", screenshot3);
				
		
				BufferedImage resizedImage2 = new BufferedImage(99, 50, BufferedImage.TYPE_INT_ARGB);
				Graphics2D g2 = resizedImage2.createGraphics();
				g2.drawImage(eleScreenshot2, 0, 0, 99, 50, null);
				g2.drawImage(eleScreenshot2, 0, 0, eleScreenshot2.getWidth(), eleScreenshot2.getHeight(), null);
				g2.dispose();
				
				
				
				
				WritableRaster raster2 = resizedImage2.getRaster();
				WritableRaster newraster2 = raster2.createWritableChild(0, 0, resizedImage2.getWidth(), resizedImage2.getHeight(), 0, 0, new int[] {0, 1, 2});
				DirectColorModel cm2 = (DirectColorModel)resizedImage2.getColorModel();
				DirectColorModel newCM2 = new DirectColorModel(cm2.getPixelSize(),
				cm2.getRedMask(), cm2.getGreenMask(), cm2.getBlueMask());
				BufferedImage eleScreenshot2jpg = new BufferedImage(newCM2, newraster2, false, null);
				
				ImageIO.write(eleScreenshot2jpg, "jpg", screenshot2);
				
		//		FileUtils.copyFile(screenshot2, new File("c:\\test\\newtest\\2.jpg"));		
		//		System.out.println("Success in creating image!");
				
			
				
		//		byte[] base64EncodedData = Base64.encodeBase64(loadFileAsBytesArray("c:\\test\\1.jpg"), true);
		//		writeByteArraysToFile("targetFile1", base64EncodedData);
		//		
		//		byte[] base64EncodedData2 = Base64.encodeBase64(loadFileAsBytesArray("c:\\test\\2.jpg"), true);
		//		writeByteArraysToFile("targetFile2", base64EncodedData2);
				
		
				String site = "http://2captcha.com/in.php";
				URL url = new URL (site);
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				
				
		
				//needthis
				
			
				
				BufferedImage uploadimage = ImageIO.read(screenshot3);
				BufferedImage uploadimage2 = ImageIO.read(screenshot2);
				
				
				ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
				ImageIO.write(uploadimage, "jpg", byteArray);
				byteArray.flush();
				byte[] byteImage = byteArray.toByteArray();
				String dataImage = new Base64().encodeToString(byteImage);
				
				ByteArrayOutputStream byteArray2 = new ByteArrayOutputStream();
				ImageIO.write(uploadimage2, "jpg", byteArray2);
				byteArray2.flush();
				byte[] byteImage2 = byteArray2.toByteArray();
				String dataImage2 = new Base64().encodeToString(byteImage2);
				
				
				params.add(new BasicNameValuePair("method", "base64"));
				params.add(new BasicNameValuePair("key", mykey));
				params.add(new BasicNameValuePair("recaptcha", "1"));
				params.add(new BasicNameValuePair("can_no_answer", "1"));
				params.add(new BasicNameValuePair("textinstructions", textinstruction));
		//		params.add(new BasicNameValuePair("column", "3"));
		//		params.add(new BasicNameValuePair("row", "3"));		
				params.add(new BasicNameValuePair("submit", "download and get the ID"));
				params.add(new BasicNameValuePair("body", dataImage));
				
	
				
				HttpClient httpClient = new DefaultHttpClient();
				HttpPost httpPost = new HttpPost("http://2captcha.com/in.php");
				httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		
				HttpResponse response = httpClient.execute(httpPost);
		        System.out.println("Status: " + response);
		        
		
				
		        StringBuilder stringbuilder = new StringBuilder();
		        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()), 65728);
		        String line = null;
		        
		        while ((line = reader.readLine()) != null) {
		        	stringbuilder.append(line);
		        }
				
		        System.out.println("Response: " + stringbuilder.toString());
		        
		        String CaptchaId = "";
		        
		        if (stringbuilder.toString().contains("OK")){
		        	stringbuilder.deleteCharAt(0);
		        	stringbuilder.deleteCharAt(0);
		        	stringbuilder.deleteCharAt(0);
		        	
		        	CaptchaId = stringbuilder.toString();
//		        	System.out.println("CaptchaID: " + CaptchaId);
		        	    	
		        }
		        
		        
		        
		        StringBuffer responseget = new StringBuffer();
		        
		        initClick(driver);
		        
		        
	//	        while(!(responseget.toString().contains("OK")) && !(responseget.toString().contains("ERROR"))){
		        	
		        	String rrr = "NOT";
		        	while (rrr.contains("NOT")){
		        		responseget.delete(0, responseget.length());
				        String geturl = "http://2captcha.com/res.php?key=" + mykey + "&action=get&id=" + CaptchaId;
				        URL urlget = new URL (geturl);
				        HttpURLConnection con = (HttpURLConnection) urlget.openConnection();
				        
				        con.setRequestMethod("GET");
				        
						int responseCode = con.getResponseCode();
//						System.out.println("\nSending 'GET' request to URL : " + url);
						System.out.println("Response Code : " + responseCode);
				
						BufferedReader in = new BufferedReader(
						        new InputStreamReader(con.getInputStream()));
						String inputLine;
				
						while ((inputLine = in.readLine()) != null) {
							responseget.append(inputLine);
						}
						in.close();
				
						
						System.out.println(responseget.toString());
//						System.out.println("get url: " + geturl);
						rrr = responseget.toString();
						Thread.sleep(2000);
		        	}
					
					String whattoclick;
					
//					System.out.println("last known response: " + responseget.toString());
				
					
					
					if (responseget.toString().contains("OK")){
						if (responseget.toString().contains("ERROR")) {
							break;
						}
						
						whattoclick = responseget.toString().substring(9, responseget.toString().length());
						
						System.out.println("what to click: " + whattoclick);
						
						
						
						
						
						if (whattoclick.contains("images")){
//							System.out.println("All images sent");
							sendagain = false;
						}
						if (whattoclick.contains("10")){
							toclick10.click();
							whattoclick = whattoclick.replace("10", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("11")){
							toclick11.click();
							whattoclick = whattoclick.replace("11", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("12")){
							toclick12.click();
							whattoclick = whattoclick.replace("12", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("13")){
							toclick13.click();
							whattoclick = whattoclick.replace("13", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("14")){
							toclick14.click();
							whattoclick = whattoclick.replace("14", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("15")){
							toclick15.click();
							whattoclick = whattoclick.replace("15", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("16")){
							toclick16.click();
							whattoclick = whattoclick.replace("16", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("9")){
							if (setwidth == 4) {
								toclick9.click();
							} else {
								toclick11.click();
							}						
							whattoclick = whattoclick.replace("9", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("8")){
							if (setwidth == 4) {
								toclick8.click();
							} else {
								toclick10.click();
							}						
							whattoclick = whattoclick.replace("8", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("7")){
							if (setwidth == 4){
								toclick7.click();
							} else {
								toclick9.click();
							}					
							whattoclick = whattoclick.replace("7", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("6")){
							if (setwidth == 4){
								toclick6.click();
							} else {
								toclick7.click();
							}					
							whattoclick = whattoclick.replace("6", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("5")){
							if (setwidth == 4){
								toclick5.click();
							} else {
								toclick6.click();
							}
							whattoclick = whattoclick.replace("5", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("4")){
							if (setwidth == 4){
								toclick4.click();
							} else {
								toclick5.click();
							}		
							whattoclick = whattoclick.replace("4", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("3")){
							if (setwidth == 3 || setwidth == 4){
								toclick3.click();
							}						
							whattoclick = whattoclick.replace("3", "");
							Thread.sleep(110);
						}
						if (whattoclick.contains("2")){
							toclick2.click();
							whattoclick = whattoclick.replace("2", "");
							Thread.sleep(100);
						}
						if (whattoclick.contains("1")){
							toclick1.click();
							whattoclick = whattoclick.replace("1", "");
							Thread.sleep(100);
						}
					
						if (sendagain == false){
							break;
						}		
					
					}
	
				
				responseget.delete(0, responseget.length());
				
				Thread.sleep(1000);
				
			
				
			
	        }
			
			
			Thread.sleep(100);
			send.click();
			Thread.sleep(100);
			driver.switchTo().defaultContent();	
			
			if (frameswitch2.isDisplayed()) {
				System.out.println("Solving Service Sucks");		
			} else {
				System.out.println("Captcha solved!");
				Thread.sleep(150);
					
	//			request.click();
				System.out.println("Mraaaaiii! :)");
				
				driver.navigate().to("https://raiblocks.net/#/distribution");
				
			}
	}
	

		
		
        
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	

	
    public static void writeByteArraysToFile(String fileName, byte[] content) throws IOException {
    	 
        File file = new File(fileName);
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
        writer.write(content);
        writer.flush();
        writer.close();
 
    }
    
	public static byte[] loadFileAsBytesArray(String fileName) throws Exception {
		 
        File file = new File(fileName);
        int length = (int) file.length();
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[length];
        reader.read(bytes, 0, length);
        reader.close();
        return bytes;
 
    }
	
	public static void initClick (FirefoxDriver driver){
		
		toclick1 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/div");
		toclick2 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div");
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]/div").isEmpty()){		
			toclick3 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]/div");
			setwidth = 3;
		}
			
		
		toclick5 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]/div");
		toclick6 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]/div");
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]/div").isEmpty()){		
			toclick7 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]/div");
		}
		
		
		toclick9 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[1]/div");
		toclick10 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[2]/div");
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[3]/div").isEmpty()){		
			toclick11 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[3]/div");
		}
		
		
		
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div").isEmpty()){		
			toclick4 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div");
			setwidth = 4;
		}
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[4]/div").isEmpty()){		
			toclick8 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[4]/div");
		}
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[4]/div").isEmpty()){		
			toclick12 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[4]/div");
		}
		
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[1]/div").isEmpty()){		
			toclick13 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[1]/div");
			setheight = 4;
		}
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/div").isEmpty()){		
			toclick14 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/div");
		}
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[3]/div").isEmpty()){		
			toclick15 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[3]/div");
		}
		if (!driver.findElementsByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[4]/div").isEmpty()){		
			toclick16 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[4]/div");
		}
		
		
	}
	
	public static void initFrame(FirefoxDriver driver){
		
		
		textbox = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/textarea");
		request = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[4]/button[1]");
		frameswitch = driver.findElementByXPath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[3]/div/div/iframe");
		
		driver.switchTo().frame(frameswitch);
		
		click = driver.findElement(By.cssSelector("div[class=recaptcha-checkbox-checkmark]"));	
		
		frameswitch2 = driver.findElementByXPath("/html/body/div[3]/div[4]/iframe");
		
	
		driver.switchTo().frame(frameswitch2);
		
		cappic = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]");
		cappic2 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[1]/div[1]");
		textinst = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div[1]");
		send = driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div");
	}
	
	public static void initFrame2(FirefoxDriver driver, String handle){
		frameswitch2 = driver.findElementByXPath("/html/body/div[3]/div[4]/iframe");
		
		driver.switchTo().window(handle);	
		driver.switchTo().frame(frameswitch2);
		
		cappic = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[2]");
		cappic2 = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[1]/div[1]");
		textinst = driver.findElementByXPath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div[1]");
		send = driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div");
	}
	
	

}
