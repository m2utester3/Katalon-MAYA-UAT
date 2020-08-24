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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Forgot Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Forgot Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Forgot Password'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Forgot Password'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Resetting your password is easy. Just enter your info below for validation.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Username'), 0)

g = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Enter your username'), 
    0)

Mobile.verifyEqual(g, 'Enter your username')

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Enter your username'), 'pentestu102', 
    0)

WebUI.delay(3)

h = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - CardAccess Number'), 
    0)

Mobile.verifyEqual(h, 'Card/Access Number')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Enter your card No.'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Enter your card No.'), '7887889000315720', 
    0)

WebUI.delay(3)

i = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - ID Number'), 0)

Mobile.verifyEqual(i, 'ID Number')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Enter ID number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Enter ID number'), 'P2389982', 
    0)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Continue'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - One Time Password'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Confirm'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - One Time Password Enter OTP sent to  60125 XXXX 48 Resend OTP in  01  58 1 2 3 4 5 6 7 8 9 0 Your Otp no. is 481178'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/5.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(15)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Account login'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Create password'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeSecureTextField - Enter new password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeSecureTextField - Enter new password'), 
    'Pass@1278', 0)

WebUI.delay(3)

f = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Show password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(f, 'Show password')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Confirm new password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeTextField - Confirm new password'), 'Pass@1278', 
    0)

WebUI.delay(3)

e = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Between 8-12 characters.'), 
    0)

Mobile.verifyEqual(e, 'Between 8-12 characters.')

d = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Must include at least 1 uppercase 1 lowercase 1 number and 1 special character.'), 
    0)

Mobile.verifyEqual(d, 'Must include at least 1 uppercase, 1 lowercase, 1 number and 1 special character.')

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Must not include 3 consecutive characters. (e.g. 123 abc)'), 
    0)

Mobile.verifyEqual(c, 'Must not include 3 consecutive characters. (e.g. 123, abc)')

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Must not be similar to your Maybank2u user ID.'), 
    0)

Mobile.verifyEqual(b, 'Must not be similar to your Maybank2u user ID.')

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Match Confirm Password.'), 
    0)

Mobile.verifyEqual(a, 'Match Confirm Password.')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Continue (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Transfer'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeSecureTextField'), 'Pass@1278', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeStaticText - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/forgot m2u login/XCUIElementTypeOther - OTHERS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/forgotlogin/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

