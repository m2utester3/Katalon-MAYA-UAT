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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeButton - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/71.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Settings'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/72.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Profile Manage account details'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Profile Manage account details'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/73.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeStaticText - Update Profile'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/74.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeStaticText - Last successful login'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeStaticText - 14 Aug 2020 210 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Name'), 0)

Mobile.tapAtPosition(185, 325)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeKey - q'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/75.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Mobile number 6012 XXXX 848'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/76.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Mobile number 6012 XXXX 848'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeStaticText - Whats your mobile number'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeStaticText - Take note that this number will not replace your current mobile number used for Maybank2u transactions.'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 6'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 3'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 9'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 3'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - 0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/77.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Email address Optional'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Save Changes'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/78.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/update profile/XCUIElementTypeOther - Save Changes'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/79.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

