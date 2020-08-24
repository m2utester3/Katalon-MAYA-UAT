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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeSecureTextField'), 'Pass@1278', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - SELF'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - OTHERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - Instant'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - Instant'), 0)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Account number'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeTextField'), '501600000048', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/24.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Amount should be in between RM 0.01 to  RM  999999.99 for Fund Transfer.'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Enter amount'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Transfer'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeTextField'), 'IOS third party', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Date'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - txtSELECT_date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Recipient reference'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - txtRECIPIENT_REFERENCE'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Bank name'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Payment details'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Note'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeStaticText - Transfer from'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - Transfer Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/XCUIElementTypeOther - Transfer Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - One-Tap Authorisation'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - txtSELECT_BOOSTER'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Transfer successful'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - 17180723751M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - 13 Aug 2020 1116 AM'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Share Receipt'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeStaticText - Third Party Transfer'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Transfer third party/spy/XCUIElementTypeOther - Done'), 0)

not_run: Mobile.closeApplication()

