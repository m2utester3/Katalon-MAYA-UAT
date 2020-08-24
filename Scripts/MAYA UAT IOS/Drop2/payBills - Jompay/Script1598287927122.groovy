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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.tapAtPosition(180, 320)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Accounts'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Bills'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeSecureTextField'), 'Pass@1278', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - BILLERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeOther - JomPAY'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeOther - JomPAY'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeStaticText - Biller Code'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeTextField - paymentDetail'), '1123', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeStaticText - Reference 1'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/UAT IOS Paybills ref1 - paymentDetail'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - paymentDetail'), '568964', 
    0)

WebUI.delay(15)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - Continue'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeTextField - Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - 8'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - 1'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - txtTRANSFER_TYPE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Pay from'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - Pay Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - Pay Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - txtSELECT_BOOSTER'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeStaticText - Failed'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'Transfer successful')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - txtTRANSFER_TYPE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeStaticText - JomPAY reference'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - txtTRANSFER_TYPE (1)'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeStaticText - Date  Time'), 0)

Mobile.verifyEqual(a, 'Date & time')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy2/XCUIElementTypeOther - txtTRANSFER_TYPE (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/XCUIElementTypeOther - Done'), 0)

not_run: Mobile.closeApplication()

