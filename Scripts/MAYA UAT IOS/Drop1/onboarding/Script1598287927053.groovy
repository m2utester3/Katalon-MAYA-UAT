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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', true)

WebUI.delay(5)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Skip'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Next'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Next'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Next'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Next'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Lets Get Started'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Set Up Wallet'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Log in to enjoy the app to its fullest.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - No account Get started with MAE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Register for Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Login to Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Please enter your username'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Forgot Login Details'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Forgot Login Details'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - M2U Web'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Register for Maybank2u (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Register for Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - M2U Web'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Please enter your username'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (3)'), 'pentestu102', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

not_run: Mobile.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Is this your security phrase'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Not Mine'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Not Mine'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Contact Bank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - For any enquiries regarding your account please call the Customer Care Hotline at 1 300 88 6688.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Call Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Call Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - 1300886688'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeButton - Call'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeButton - Cancel'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeButton - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Yes Its Mine'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Yes Its Mine'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (4)'), 'Pass@1247', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - 6-digit PIN'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Create your 6-digit PIN'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - This 6-digit PIN will be used each time you access your Wallet or as backup to your biometric login.'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (3)'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - PIN must consist of at least 6 digits.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'PIN must consist of at least 6 digits.')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - 6-digit PIN (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Confirm your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (4)'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - PIN must consist of at least 6 digits.'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'PIN must consist of at least 6 digits.')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 6'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (4)'), 0)

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - PIN must match the 6-digit PIN created.'), 
    0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'PIN must match the 6-digit PIN created.')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Verify Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Your mobile number in our records is 6012 XXXX 848. Would you like to set up MAE with this number'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Changing your number will not replace your current mobile number used for Maybank2u transactions.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Use a Different Number'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Use a Different Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Welcome Onboard'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Whats your mobile number'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (5)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Yes Proceed'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Yes Proceed'), 0)

def otpMessage = Mobile.getText(findTestObject('MAYA UAT IOS/test/IOS UAT msg'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - One Time Password'), 0)

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

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/test/IOS UAT msg 2'), 0)

not_run: WebUI.delay(20)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther (6)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Welcome Onboard (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - How would you like us to address you'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - This will be used for social interactions within the app so make sure its recognisable.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeTextField - Enter your name'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeTextField - Enter your name'), 'katalon', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Continue'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Final Step'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Pick a spending account for your daily expenses settling IOUs and more.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Savings Account 1140 1382 3409 RM 14335.40'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Savings Account 1140 1382 3409 RM 14335.40'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Set Up Successful'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeStaticText - Youre all set. Now its time to start using the app'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Hello katalon'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - Wallet RM 14335.40'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/onboarding/19.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

