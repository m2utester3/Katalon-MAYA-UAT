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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeSecureTextField'), 'Pass@1278', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - New Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer to'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search btn'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search SET TEXT'), 'affin bank berhad', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.tapAtPosition(200, 300)

WebUI.delay(1)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Account number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField (1)'), '105151000359', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - 1051 5100 0359'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - AFFIN BANK BERHAD (2)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField - Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB amount ok btn'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Amount should be in between RM 0.01 to  RM  999999.99 for Fund Transfer.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer.')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB amount ok btn'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS SET TEXT recp ref'), 'details', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Please select your transfer type'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, '')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Funds Transfer'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type done btn'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - DuitNow - Instant Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation receiver name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Date'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - txtSELECT_date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer type (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Loan Payment'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Service Fee RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Recipient reference'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Payment details'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation optional'), 'ios IBFT RSA', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 450, 200, 150)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Note'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation note 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation note 2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Transaction rejected due to security reasons. Please contact the bank for further assistance.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Date  time (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 12 Aug 2020 0936 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer to'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search btn'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search SET TEXT'), 'hsbc', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Account number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField (1)'), '301056628101', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField - Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB amount ok btn'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS SET TEXT recp ref'), 'details', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type done btn'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation receiver name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Date'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - txtSELECT_date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer type (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Loan Payment'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Service Fee RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Recipient reference'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - AFFIN BANK BERHAD (3)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Payment details'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation optional'), 'ios IBFT s2U expired', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 400, 200, 150)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Note'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation note 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation note 2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/15.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(60)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - One-Tap Authorisation has expired. Please perform the transaction again.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 17180722444M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 12 Aug 2020 916 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer to'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search btn'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search SET TEXT'), 'hsbc', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search result BANK'), 0)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - AFFIN BANK BERHAD (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Account number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField (1)'), '301056628101', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField - Password'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB amount ok btn'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS SET TEXT recp ref'), 'details', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Funds Transfer'), 0)

WebUI.delay(10)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type done btn'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation receiver name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Date'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation optional'), 'ios IBFT s2U REJECT', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(200, 400, 200, 150)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - txtSELECT_BOOSTER'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Transaction declined'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Reference ID (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 17180722474M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Date  time (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 12 Aug 2020 921 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer to'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search btn'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search SET TEXT'), 'hsbc', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search result BANK'), 0)

Mobile.tapAtPosition(200, 300)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Account number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField (1)'), '301056628101', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB amount ok btn'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS SET TEXT recp ref'), 'details', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn after amt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Funds Transfer'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type done btn'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation receiver name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Date'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation optional'), 'ios IBFT s2U APPROVED', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 400, 200, 150)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - txtSELECT_BOOSTER (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Transfer successful'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Reference ID (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 17180722504M'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Date  time (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 12 Aug 2020 924 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 611'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Add to Favourites'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Add to Favourites'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Add as Favourites'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeTextField - MY HBMB 372-349233'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Bank name'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/IBFT/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - HSBC (M) Berhad'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Registered name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - MY HBMB 372-349233'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Account number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - 3010 5662 8101'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Transfer type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeStaticText - Funds Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Add to Favourites (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop4/IBFT/XCUIElementTypeOther - Done (1)'), 0)

not_run: Mobile.closeApplication()

