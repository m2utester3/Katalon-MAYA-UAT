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

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeOther - ACCOUNTS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - RM 4746735.79'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - Total Balance'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeOther - menuItem0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeOther - menuItem0'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - Contact Bank'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - For any enquiries regarding your account please call the Customer Care Hotline at'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - 1 300 88 6688.'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeOther - Call Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeOther - Call Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - 1300886688'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeButton - Call'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeButton - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - Maybank2u'), 0)

not_run: Mobile.closeApplication()

