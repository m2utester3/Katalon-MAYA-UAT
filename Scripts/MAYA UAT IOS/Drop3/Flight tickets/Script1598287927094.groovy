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

WebUI.delay(3)

Mobile.tapAtPosition(180, 320)

WebUI.delay(3)

Mobile.swipe(300, 475, 100, 475)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeOther - Flight Tickets'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeOther - Flight Tickets'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Flight Tickets'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - DEPART'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Search'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Search'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Detail'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Book'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Book'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Contact Information'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Please Input Contact Data'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Please Input Contact Data'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Select Contact'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Title'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeOther -'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - First Name'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeTextField'), 'mosaj', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Last Name'), 0)

WebUI.delay(5)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeTextField (1)'), 'gohar', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Country'), 0)

WebUI.delay(10)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeTextField - 60'), '1126311930', 0)

WebUI.delay(10)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeTextField (2)'), 'mosajgohar@gmail.com', 
    0)

WebUI.delay(10)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - save'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - save'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Please Input Passenger Data'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Please Input Passenger Data'), 
    0)

WebUI.delay(10)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeOther - - Use Passenger List -'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeOther - - Use Passenger List -'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - save (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - save (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Book Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Book Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - Total'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeStaticText - I agree to the'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeSwitch - 0'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Submit Payment'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/flight tickets/XCUIElementTypeButton - Submit Payment'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeSecureTextField'), 'Pass@1247', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Now'), 0)

WebUI.delay(15)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tickets/1.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

