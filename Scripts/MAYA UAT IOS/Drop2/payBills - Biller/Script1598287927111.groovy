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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeSecureTextField'), 'Pass@1278', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - BILLERS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - New Payment'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Bills (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Favourites'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - No Favourites Yet'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Add billers to your favourites list at the end of a successful payment. This will help you access them quicker in the future.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Bills (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Bills (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Pay Bills (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeTextField - telekom'), 'maxis', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Maxis Mobile Sdn Bhd'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Maxis Mobile Sdn Bhd'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Maxis Mobile Sdn Bhd'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Pay Bills (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Maxis Mobile Sdn Bhd'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Account Number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeTextField - paymentDetail'), '568964', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Pay Bills (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Maxis Mobile Sdn Bhd (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - 1123'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeTextField - Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - 8'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Maxis Mobile Sdn Bhd (2)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - 1123 (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - txtTRANSFER_TYPE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeStaticText - Pay from'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Savings Account-i 1640 1781 0625 RM 1744903.73'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/payBills-Biller/XCUIElementTypeOther - Pay Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/7.png', FailureHandling.CONTINUE_ON_FAILURE)

'S2U APPROVE BUTTON'
Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - txtSELECT_BOOSTER (1)'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeStaticText - Scheduled'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Transfer successful')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther - txtTRANSFER_TYPE'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeStaticText - Date  Time'), 0)

Mobile.verifyEqual(b, 'Date & time')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther - txtTRANSFER_TYPE (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/paybills/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeStaticText - Bill Payment'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/PayBills/spy/XCUIElementTypeOther - Done'), 0)

not_run: Mobile.closeApplication()

