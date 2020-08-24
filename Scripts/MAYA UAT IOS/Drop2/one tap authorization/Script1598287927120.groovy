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

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeButton - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Settings'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Maybank2u Manage Maybank2u settings'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Maybank2u Manage Maybank2u settings'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeSecureTextField'), 'Pass@1267', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - One-Tap Authorisation'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'One-Tap Authorisation')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - One-Tap Authorisation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - One-Tap Authorisation'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Approve transactions safely and quickly with a single tap on the app. Skip SMS TAC and get things done faster.'), 
    0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Activate Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'Activate Now')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Activate Now'), 0)

if (Mobile.verifyElementExist(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Youve already registered for One-Tap Authorisation on a different device. Would you like to use it here instead'), 
    0)) {
    Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - No'), 0)

    Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Yes'), 0)

    Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Yes'), 0)
}

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - One Time Password'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Not Mine'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Confirm'), 0)

otpMessage = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Your OTP no. is 275955'), 
    0)

for (def i = 16; i <= 21; i++) {
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

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (6)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Enter ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Enter your ID number'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - (MyKad  Police ID  Army ID  Passport  Business Registration  MyPR  Others)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeTextField - Your ID number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeTextField - Your ID number'), 'P2389982', 
    0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Device Name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Enter your device name'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Your device name must be alphanumeric characters with no symbols and spaces'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeTextField - Oldiphone'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - One-Tap Authorisation enabled'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'One-Tap Authorisation enabled')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - You may now authorise your transactions securely via the app.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - One-Tap Authorisation'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - One-Tap Authorisation'), 0)

d = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Disable One-Tap Authorisation'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(d, 'Disable One-Tap Authorisation')

e = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Are you sure want to disable One-Tap Authorisation'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(e, 'Are you sure want to disable One-Tap Authorisation?')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Confirm (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Confirm (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - One-Tap Authorisation'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onetap/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

