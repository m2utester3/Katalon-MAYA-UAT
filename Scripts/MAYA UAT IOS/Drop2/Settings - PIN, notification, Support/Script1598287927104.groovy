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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Quick Actions'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Settings'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Profile Manage account details'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Profile Manage account details'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Update Profile'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Last successful login'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Email address Optional'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Maybank2u Manage Maybank2u settings'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Maybank2u Manage Maybank2u settings'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeSecureTextField'), 'Pass@1278', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Scan  Pay'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Scan  Pay'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Scan  Pay'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - backButton'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - One-Tap Authorisation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - DuitNow'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Link your Maybank account to an ID for DuitNow'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Mobile Number 4848 Maybank'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Mobile Number 4848 Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Status'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - ACTIVE'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Link your Maybank account to an ID for DuitNow (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Change Password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Change Password'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Change Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Unlink Maybank2u Account'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Unlink Maybank2u Account'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Unlink Maybank2u Account'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Are you sure you want to unlink your Maybank2u account from the MAE app'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Cancel'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Security Manage security settings'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Security Manage security settings'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Change PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Change PIN'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Enter your current PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Create your new 6-digit PIN'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Confirm your new 6-digit PIN'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Notifications Manage notifications'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Notifications Manage notifications'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Manage notifications you receive from the app.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Promotions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - toggle'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Notification preferences successfully saved.'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - toggle'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Notifications successfully disabled.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Notifications'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Support Feedback  FAQ'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Support Feedback  FAQ'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Helpline'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Helpline'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - For any enquiries regarding your account please call the respective hotline below.'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - About About MAE'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - About About MAE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - About Us'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - About Us'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - About Us'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Terms  Conditions'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther - Terms  Conditions'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Terms  Conditions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeStaticText - Settings'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/settings/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeOther (4)'), 0)

not_run: Mobile.closeApplication()

