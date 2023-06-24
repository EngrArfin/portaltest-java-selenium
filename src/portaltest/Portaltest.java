/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portaltest;

/**
 *
 * @author arfin
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Portaltest {

    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "E:\\Testing\\chromedriverwin32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        //Test 1
        driver.get("https://studentportal.green.edu.bd/Account/login?ReturnUrl=%2F");
        Thread.sleep(1000);
        driver.findElement(By.id("Input_LoginId")).sendKeys("191002229");
        Thread.sleep(1000);
        driver.findElement(By.id("Input_Password")).sendKeys("524864");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
       
       // Test 2
        
        Thread.sleep(1000);
        driver.get("https://studentportal.green.edu.bd/Account/login?ReturnUrl=%2F");
        Thread.sleep(1000);
        driver.findElement(By.id("Input_LoginId")).sendKeys("191002229");
        Thread.sleep(1000);
        driver.findElement(By.id("Input_Password")).sendKeys("123454@#");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
            
//        //Test 3
         Thread.sleep(1000);
         driver.get("https://studentportal.green.edu.bd/Student/StudentCourseHistory");
         Thread.sleep(1000);
         driver.findElement(By.id("srcInput")).sendKeys("Object Oriented Programming");
         Thread.sleep(1000);
//         
//         //Test 4
//         
         driver.get("https://studentportal.green.edu.bd/Student/StudentBillHistory");
         Thread.sleep(1000);
         driver.findElement(By.id("srcInput")).sendKeys("IT & Library Services Fees");
         Thread.sleep(1000);
//         
//         //Test 5
//         
//         driver.get("https://studentportal.green.edu.bd/Registration/Evaluation");
//         Thread.sleep(1000);
//         driver.findElement(By.xpath("/html/body/div/main/div[2]/div/section/div[3]/div/div/div/div/div/div[1]/div[2]/select")).click();
//         Thread.sleep(1000);
//         driver.findElement(By.id("grade")).sendKeys("B");
//         Thread.sleep(1000);
//         
//         //Test 6
//         
//          driver.get("https://studentportal.green.edu.bd/Registration/PreAdvising");
//          Thread.sleep(1000);
//          
//          //Test 7
//          
//          driver.get("https://studentportal.green.edu.bd/Registration/Preadvising_Retake");
//           Thread.sleep(1000);
//           
//          //Test 8
//           
//          driver.get(" https://studentportal.green.edu.bd/Student/StudentProfile");
//           Thread.sleep(2000);
//           
//           //Test 8
//           
//          driver.get("https://studentportal.green.edu.bd/Student/StudentClassRoutine");
//            Thread.sleep(2000);
//            
//           //Test 9
//           
//           driver.get("https://studentportal.green.edu.bd/Student/StudentLedger");
//           Thread.sleep(1000);
//           //Test10
//          
//          driver.get("https://studentportal.green.edu.bd/Student/StudentAdmitCard");
//          Thread.sleep(1000);
//          driver.findElement(By.xpath("//*[@id=\"StudentAdmitCardController\"]/div[3]/div/div[2]/div/div/div[1]/select")).sendKeys("Final");
//          Thread.sleep(1000);
//          driver.findElement(By.xpath("//*[@id=\"StudentAdmitCardController\"]/div[3]/div/div[2]/div/div/div[2]/button")).click();
//          Thread.sleep(1000);
//         //Test 11 not matched check
//          
//         driver.get("https://studentportal.green.edu.bd/Account/ChangePasswordV2");
//         Thread.sleep(1000);
//         driver.findElement(By.id("P_Password")).sendKeys("191002137");
//         Thread.sleep(1000);
//         driver.findElement(By.id("New_psw")).sendKeys("191002137");
//         Thread.sleep(1000);
//         driver.findElement(By.id("Con_psw")).sendKeys("524864");
//        Thread.sleep(1000);
//        
//        //Test 12 matched check
//        driver.get("https://studentportal.green.edu.bd/Account/ChangePasswordV2");
//        Thread.sleep(1000);
//        driver.findElement(By.id("P_Password")).sendKeys("191002137");
//        Thread.sleep(1000);
//        driver.findElement(By.id("New_psw")).sendKeys("191002137");
//        Thread.sleep(1000);
//        driver.findElement(By.id("Con_psw")).sendKeys("191002137");
//        Thread.sleep(1000);
//        
//       // driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
//        //Test 13
       driver.get(" https://studentportal.green.edu.bd/Student/StudentProgramChange");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"ddlNewProgram\"]")).sendKeys("English");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"txtRemarks\"]")).sendKeys("For sick");
       Thread.sleep(8000);
       driver.findElement(By.xpath("//*[@id=\"ApplicationForm\"]/div/div[4]/div[2]/button")).click();
       Thread.sleep(1000);
//        //Test 14
//       driver.get(" https://studentportal.green.edu.bd/Student/StudentOthersExamApply");
//       Thread.sleep(1000);
//       driver.findElement(By.xpath("//*[@id=\"StudentOthersExamApplyController\"]/div[3]/div/div[2]/div/div/div[1]/select")).sendKeys("Mid Term Overlap, Improvement, Make-Up");
//       Thread.sleep(1000);
//       driver.findElement(By.xpath("//*[@id=\"StudentOthersExamApplyController\"]/div[3]/div/div[2]/div/div/div[2]/button")).click();
//       Thread.sleep(1000);
//       driver.get(" https://studentportal.green.edu.bd/Student/StudentOthersExamApply");
//       Thread.sleep(1000);
//        
//       //Test15 logout
//          Thread.sleep(1000);
//         driver.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/div/ul/li[3]/a")).click(); 
 }
    
}
