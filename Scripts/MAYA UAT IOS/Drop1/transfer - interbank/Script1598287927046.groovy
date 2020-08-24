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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeOther - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeSecureTextField'), 'Pass@1247', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - OTHERS (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - New Transfer'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Instant'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer to'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search btn'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search SET TEXT'), 'affin bank berhad', 
    0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search result BANK'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search result BANK'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB search result BANK'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - AFFIN BANK BERHAD (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Account number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField (1)'), '105151000359', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - 1051 5100 0359'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - AFFIN BANK BERHAD (2)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeTextField - Password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB amount ok btn'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Amount should be in between RM 0.01 to  RM  999999.99 for Fund Transfer.'), 
    0)

Mobile.verifyEqual(a, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/4.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Please select your transfer type'), 
    0)

Mobile.verifyEqual(b, '')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type dropdown btn1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Funds Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB trns type done btn'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Transfer mode'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - DuitNow - Instant Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Continue btn at trns type'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation receiver name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeOther - btnEditAmount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Date'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/8.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - AFFIN BANK BERHAD (3)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Payment details'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation optional'), 'ios IB transfer details', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(5)

Mobile.swipe(200, 550, 200, 150)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/XCUIElementTypeStaticText - Note'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation note 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation note 2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Confirmation Trns NOW'), 0)

def otpMessage = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC msg 1'), 0)

not_run: for (def i = 122; i <= 127; i++) {
    if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 9'), 0)
    }
}

WebUI.delay(5)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC ok btn 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 3'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 4'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 6'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 6'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 61'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 611'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 7'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - interbank/spy/UAT IOS IB Succes msg 7'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/transfer - own account/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/transferInterbank/13.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

