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

'peileng'
Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', false)

WebUI.delay(3)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - FIXED DEPOSITS'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - FIXED DEPOSITS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - LOANS'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - LOANS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Outstanding Balance'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(180, 320)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Maybank Islamic Hire Purchase'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - RM 35099.75'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Maybank Islamic Hire Purchase 7898 0101 4114'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Car Registration No. WWW1411'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Account Name CFS DNO SIX (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Payment Due Date 1 Aug 2020'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Outstanding Balance -RM 35099.75'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Monthly Instalment RM 950.00'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Instalment Due RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Profit Rate 0.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Period of Financing 60 months'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Pay Loan'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Pay Loan'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeSecureTextField'), 'pass1234', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Any amount RM 0.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Any amount RM 0.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Pay from'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Pay Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Pay Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Payment successful'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - 180742619M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - 16 Aug 2020 747 PM'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Payment'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Done'), 0)

not_run: Mobile.closeApplication()

