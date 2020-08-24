import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Uat_test06'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Quick Actions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/71.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Tabung- MORE'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/72.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Tabung- MORE'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Active Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 24.00 of RM 25.85'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 2 weeks from now'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0 active booster(s)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/73.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Overview'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Activity'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 24.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal amount'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 25.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remaining'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 1.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/74.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 1000)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/75.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal duration'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1 months'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Start date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - End date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 28 Jun 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Auto Deduction'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Set up an automated contribution to ensure you reach your goals on time.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 4.31 weekly'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Next deduction will be on 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Spare Change'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00 (1)'), 
    0)

not_run: Mobile.verifyElementExist(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.Switch0 - ON'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.Switch0 - ON'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Edit Photo'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remove Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Rename Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/76.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung withdraw msg without funding'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/77.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - How much would you like to fund to your Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.EditText0 - 0.00'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/78.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Please enter how much youd like to fund.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/79.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 5'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money SET PWD'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money SET PWD'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (3)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 5000.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 07 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Transfer from'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/80.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(2)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/81.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1640 1781 0625'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 1744084.28'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung (1)'), 
    0)

not_run: def otpTaFund = Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung withdrawal OTP'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw TAC 1'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/82.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: for (def i = 16; i <= 21; i++) {
    if ((otpTaFund[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpTaFund[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpTaFund[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpTaFund[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpTaFund[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpTaFund[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpTaFund[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpTaFund[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpTaFund[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpTaFund[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung withdrawal OK btn'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw - OTP kp TICK 1'), 
    0)

WebUI.delay(2)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA amount'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header - To'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header to - value'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header from'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header from - value'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header- trx type'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header- trx type value'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header- date'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA header- date- value'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA - APPROVE'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - OTA - APPROVE'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg 2'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg refid'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg refid - value'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg datetime'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg datetime - value'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg DONE'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/83.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung funding - SUCCESS msg DONE'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 24.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal amount'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 25.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remaining'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 1.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/84.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 1000)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal duration'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1 months'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Start date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - End date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 28 Jun 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Auto Deduction'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Set up an automated contribution to ensure you reach your goals on time.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 4.31 weekly'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Next deduction will be on 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Spare Change'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00 (1)'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.Switch0 - ON'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/85.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Edit Photo'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remove Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Rename Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remove Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/86.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung WITHDRAW confirm btn'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - How much would you like to withdraw'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far RM 5024.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.EditText0 - 0.00 (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/87.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Please enter how much youd like to fund. (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 2'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 5'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Your withdrawal amount should be less than your contributed amount.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/88.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (2)'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (2)'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (2)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (3)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 2500.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 07 May 2020'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/89.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Transfer from'), 
    0)

WebUI.delay(2)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(2)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(5)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/90.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/91.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - One-Tap Authorisation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM  5000'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Approve'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Approve'), 
    0)

not_run: def otpTaWithdraw = Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung withdrawal OTP'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw TAC 1'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/92.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: for (def i = 16; i <= 21; i++) {
    if ((otpTaWithdraw[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung withdrawal OK btn'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/93.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 2'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 3'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 4'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 5'), 
    0)

not_run: Mobile.closeApplication()

