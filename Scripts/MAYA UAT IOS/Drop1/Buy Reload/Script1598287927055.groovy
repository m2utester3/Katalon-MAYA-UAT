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

Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', false)

WebUI.delay(3)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Reload'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Reload'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeSecureTextField'), 'Pass@1247', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Reload'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Altel'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeTextField'), 'umobile', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - UMobile'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - UMobile'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - UMobile'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Reload (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - UMobile'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Enter mobile number'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (1)'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Please enter a valid mobile number.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Please enter a valid mobile number.')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 6'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 3'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 9'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 3'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Reload (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - UMobile (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 011 2631 193'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - How much would you like to reload'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 5.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 10.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 30.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 50.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Enter mobile number'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 7'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 3 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 7'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 3 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 3 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - UMobile (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 011 2737 3395'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - How much would you like to reload (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 5.00 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 5.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Continue'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - One-Tap Authorisation is currently unavailable. TAC will be used instead.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - UMobile (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 011 2737 3395 (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - RM 5.00 (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 3 Aug 2020'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Pay from'), 0)

Mobile.swipe(350, 480, 20, 480)

WebUI.delay(3)

Mobile.swipe(350, 480, 20, 480)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Savings Account-i 1640 1781 0625 RM 1745280.87'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Savings Account-i 1640 1781 0625 RM 1745280.87'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Pay Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Pay Now'), 0)

not_run: def otpMessage = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC msg 3'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/9.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: for (def i = 122; i <= 127; i++) {
    if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 9'), 0)
    }
}

not_run: WebUI.delay(5)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC ok btn 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Reload successful'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 180678155M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 03 Aug 2020 1253 AM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Provider'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - UMobile (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Mobile Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - 011 2737 3395 (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - RM 5.00'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.verifyEqual(b, 'Share Receipt')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Share Receipt'), 0)

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'Share Receipt')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther (5)'), 0)

d = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Done'), 0)

Mobile.verifyEqual(d, 'Done')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/XCUIElementTypeOther - Reload'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/buyReload/12.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

