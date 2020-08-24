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

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Login'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Wallet Tabung Food Promotions Loyalty Movie Tickets Travel Deals Bus Tickets ERL Tickets Flight Tickets Apply Notifications'), 
    0)

WebUI.delay(3)

Mobile.tapAtPosition(56, 222)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Wallet'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/2.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Send  Request'), 0)

Mobile.tapAtPosition(134, 528)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - PENDING'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - PAST'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Id like to'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Send Money'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Request Money'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Send Money'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeSecureTextField'), 'Pass@1267', 0)

WebUI.delay(3)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Send  Request'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/4.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(10)

WebUI.delay(3)

Mobile.tapAtPosition(187, 222)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - 11 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Add'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Add'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Account Not Linked'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Sorry your contact hasnt set up their Wallet on the app yet. Send money via DuitNow instead'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - No'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Yes'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Yes'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Account Not Linked'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Sorry the contact youve selected is not on MAE or DuitNow. Would you like to invite them to MAE'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Invite Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - PENDING'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Send Money'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Send Money'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Send  Request'), 0)

WebUI.delay(3)

Mobile.tapAtPosition(187, 289)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - 11 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Add'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Add'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Batman'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - RM'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - 3'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/UAT IOS send money amt  OK btn'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.verifyEqual(b, 'Confirmation')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Batman (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Today'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Notes'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Send from'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/UAT IOS send money SEND NOW btn'), 0)

WebUI.delay(3)

Mobile.tapAtPosition(187, 630)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/11.png', FailureHandling.CONTINUE_ON_FAILURE)

'S2U APPROVE BUTTON'
Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - txtSELECT_BOOSTER (1)'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Transfer successful'), 0)

Mobile.verifyEqual(a, 'Transfer successful')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Reference ID (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - SM17180716575 (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Date  time (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Batman (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Contact (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - 6010 2264 481 (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Amount (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - RM 1.32'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/UAT IOS send money Share Receipt parent'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/UAT IOS send money Share Receipt parent'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/UAT IOS send money Share Receipt BACK btn parent'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Done (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Done (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - PAST'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - PAST'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Requests'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Completed TE Youve sent RM 0.01 to Test. Sent on 11 Aug 2020 1200 PM'), 
    0)

WebUI.delay(3)

Mobile.tapAtPosition(187, 472)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Send  Request (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Youve sent money to'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Test'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Completed'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Remove From List'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - Remove From List'), 10)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/sendmoney/17.png', FailureHandling.CONTINUE_ON_FAILURE)

'refresh button on send & request'
not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther (1)'), 0)

'search box send & request'
not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther (2)'), 0)

not_run: Mobile.closeApplication()

