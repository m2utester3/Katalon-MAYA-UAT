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

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeSecureTextField'), 'Pass@1278', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - DUITNOW'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - DUITNOW'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - DuitNow (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/33.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - DuitNow (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - ID type'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/34.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Mobile Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Mobile Number (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - NRIC Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Passport Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - ArmyPolice ID'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Business Registration Number'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - NRIC Number'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/35.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeStaticText - NRIC Number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeTextField - nricNumber'), '910224010663', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/36.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Continue'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeStaticText - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - NRIC/XCUIElementTypeStaticText - BIMBB TEST DUITNOW ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/37.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeTextField - inputReference'), 'ios duit NRIC', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/38.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - GO WEE SEONG (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - 010 9011 236'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Date'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/39.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Transfer type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Transfer type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - txtTRANSFER_TYPE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - ID type (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Mobile Number (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Recipient reference'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - txtRECIPIENT_REFERENCE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Payment details'), 0)

Mobile.swipe(185, 500, 185, 200)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Note'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Transfer from'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Transfer Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/40.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Transfer Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/41.png', FailureHandling.CONTINUE_ON_FAILURE)

'S2U APPROVE BUTTON'
Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeOther - txtSELECT_BOOSTER (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Transfer successful'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/42.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - 17180734663M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - 14 Aug 2020 316 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/43.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/DuitNow - Mobile/XCUIElementTypeOther - Done'), 0)

Mobile.closeApplication()

