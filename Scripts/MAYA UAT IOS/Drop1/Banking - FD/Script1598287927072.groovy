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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - FIXED DEPOSITS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - FIXED DEPOSITS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Total Deposits'), 0)

Mobile.tapAtPosition(180, 320)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - Maybank Flexi Fixed Deposit'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - 2123 6100 1687'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeStaticText - RM 50000.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Total Principal Amount RM 5000.00'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Account Name CFS DNO SIX'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Term 12 month(s)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Interest Rate 3.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Maturity Date 3 Nov 2017'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Interest Payment Mode Add to Principal'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther - Instructions on Maturity Auto-Renewal'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - loan and FD/XCUIElementTypeOther'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/12.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

