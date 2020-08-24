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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeSecureTextField'), 'Pass@1247', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - SELF'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/UAT IOS trn own select acct'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/UAT IOS trn own select acct'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/UAT IOS trn own select acct'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - 1640 1781 0625'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Savings Account-i'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - RM'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Amount should be in between RM 0.01 to  RM  999999.99 for Fund Transfer.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer.')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - RM'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - Password (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - 1640 1781 0625 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Savings Account-i (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Maybank (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField'), 'ios trans own account', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - ios trans own'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Continue'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Savings Account-i (2)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - 1640 1781 0625 (2)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - txtSELECT_date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Recipient reference'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - txtRECIPIENT_REFERENCE'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - txtRECIPIENT_REFERENCE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - ios trans own'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - ios trans own'), 'ios own account transfer', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - ios own accoun'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Continue'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Bank name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Maybank (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Payment details'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - inputReference'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeTextField - inputReference'), 'ios pyt deatils', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Note'), 0)

Mobile.swipe(200, 500, 200, 200)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer from'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Savings Account 1140 1382 3409 RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer failed'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - 17180678275M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - 3 Aug 2020 306 AM'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferOwnAcc/14.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

