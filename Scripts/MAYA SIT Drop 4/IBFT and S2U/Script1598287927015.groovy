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

'app launch'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Wallet'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/1.png', FailureHandling.CONTINUE_ON_FAILURE)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Wallet'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Wallet'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/2.png', FailureHandling.CONTINUE_ON_FAILURE)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Transfer'), 0)

'enter password'
not_run: Mobile.setText(findTestObject('MAYA SIT Regression SPY/UAT - transfer SET PWD'), 'pass1234', 0)

'enter password'
Mobile.setText(findTestObject('MAYA SIT Regression SPY/spy reg2/UAT IBFT SET TEXT PWD'), 'pass1234', 0)

WebUI.delay(5)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

WebUI.delay(10)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/3.png', FailureHandling.CONTINUE_ON_FAILURE)

'Click Instant'
Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

WebUI.delay(5)

not_run: Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer to'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '105151000359', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - 1051 5100 0359'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

WebUI.delay(2)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/4.png', FailureHandling.CONTINUE_ON_FAILURE)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

WebUI.delay(4)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'IBFT and S2U drop4 testing', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'instant s2u transfer', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/5.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done (1)'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Continue'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS - CONTINUE btn'), 0)

WebUI.delay(3)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Confirmation'), 0)

'entry from WALLET'
not_run: Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Confirmation - OTP Down msg'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - acc name'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - acc num'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - amount'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Bank name'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Bank namw value'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - date'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - date value'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Ref'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Ref value'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode - value'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode - Service fee'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns type'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns type - value'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 700)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note value 1'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note value 2'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - peay details'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - pay details value'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns from'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/8.png', FailureHandling.CONTINUE_ON_FAILURE)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Transfer Now'), 0)

'S2U flow'
if (Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U header msg'), 0) == 'One-Tap Authorisation') {
    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U FROM'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U FROM value'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U TO'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U TO value'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U tran type'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U trans type value'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Date'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Date value'))

    'APPROVAL FLOW'
    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Approve btn'))

    WebUI.delay(3)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/9.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Approve btn'), 0)

    WebUI.delay(5)

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success ref'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success ref value'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success date timea'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success date time value'))

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Success DONE btn'))

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Add to Fav'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/10.png', FailureHandling.CONTINUE_ON_FAILURE)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Add to Fav'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - sender name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - bank name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - bank name value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - acc num'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - acc num value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - registered name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - registered name  value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - Trns type'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - Trns type value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - Add to Fav'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/11.png', FailureHandling.CONTINUE_ON_FAILURE)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - back btn'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Share Receipt'), 0)

    not_run: WebUI.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Success DONE btn'))

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Success DONE btn'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Transfer'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Transfer'), 0)

    'enter password'
    not_run: Mobile.setText(findTestObject('MAYA SIT Regression SPY/UAT - transfer SET PWD'), 'pass1234', 0)

    not_run: WebUI.delay(5)

    not_run: Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

    WebUI.delay(10)

    'horizontal swipe'
    Mobile.swipe(890, 1375, 150, 1400)

    WebUI.delay(5)

    'Click Instant'
    Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

    WebUI.delay(5)

    not_run: Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer to'), 0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD'), 
        0)

    Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '105151000359', 
        0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - 1051 5100 0359'), 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

    WebUI.delay(2)

    'enter RM 0.02'
    Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

    'keypad - ok'
    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

    WebUI.delay(4)

    Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'IBFT and S2U drop4 testing', 
        0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

    Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'instant transfer with s2u', 
        0)

    WebUI.delay(3)

    not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Continue'), 
        0)

    WebUI.delay(3)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

    WebUI.delay(3)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS - CONTINUE btn'), 0)

    WebUI.delay(3)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Confirmation'), 0)

    'entry from WALLET'
    not_run: Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Confirmation - OTP Down msg'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - acc name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - acc num'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - amount'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Bank name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Bank namw value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - date'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - date value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Ref'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Ref value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode - value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode - Service fee'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns type'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns type - value'), 0)

    Mobile.swipe(500, 1500, 500, 700)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note value 1'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note value 2'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - peay details'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - pay details value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns from'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Transfer Now'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U header msg'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U REJECT'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/12.png', FailureHandling.CONTINUE_ON_FAILURE)

    'REJECTION FLOW'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U REJECT'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject msg'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject ref'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject ref value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject date time'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject date time value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject DONE'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/13.png', FailureHandling.CONTINUE_ON_FAILURE)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Reject DONE'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Transfer'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Account - Transfer'), 0)

    'enter password'
    not_run: Mobile.setText(findTestObject('MAYA SIT Regression SPY/UAT - transfer SET PWD'), 'pass1234', 0)

    not_run: WebUI.delay(5)

    not_run: Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

    WebUI.delay(10)

    'horizontal swipe'
    Mobile.swipe(890, 1375, 150, 1400)

    WebUI.delay(5)

    'Click Instant'
    Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

    WebUI.delay(5)

    not_run: Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer to'), 0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD'), 
        0)

    Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '105151000359', 
        0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - 1051 5100 0359'), 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

    WebUI.delay(2)

    'enter RM 0.02'
    Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

    'keypad - ok'
    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

    WebUI.delay(4)

    Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'IBFT and S2U drop4 testing', 
        0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

    Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'instant transfer with s2u', 
        0)

    WebUI.delay(3)

    not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Continue'), 
        0)

    WebUI.delay(3)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

    WebUI.delay(3)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS - CONTINUE btn'), 0)

    WebUI.delay(3)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Confirmation'), 0)

    'entry from WALLET'
    not_run: Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Confirmation - OTP Down msg'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - acc name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - acc num'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - amount'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Bank name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Bank namw value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - date'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - date value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Ref'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Ref value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode - value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns mode - Service fee'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns type'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns type - value'), 0)

    Mobile.swipe(500, 1500, 500, 700)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note value 1'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - note value 2'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - peay details'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - pay details value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - trns from'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - Transfer Now'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U header msg'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/14.png', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(60)

    not_run: Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Approve btn'), 0)

    'entry from WALLET'
    not_run: Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry msg'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry Ref'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry Ref value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry adte time'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry date time value'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/15.png', FailureHandling.CONTINUE_ON_FAILURE)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry DONE'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT S2U Expiry DONE'), 0)
}

'TAC flow'
not_run: if (Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - OTP msg - IF CONDITION'), 
    0) == 'Transaction Authorisation Code') {
    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - OTP msg - IF CONDITION'), 0)

    'entry from WALLET'
    otpMessage = Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - OTP msg'), 0)

    for (def i = 16; i <= 21; i++) {
        if ((otpMessage[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((otpMessage[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((otpMessage[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((otpMessage[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((otpMessage[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((otpMessage[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((otpMessage[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((otpMessage[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((otpMessage[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((otpMessage[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/16.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - confirmation - OTP OK btn'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success ref'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success ref value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success date time'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success date time value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Share Receipt'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success DONE'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Add to Fav'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/17.png', FailureHandling.CONTINUE_ON_FAILURE)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Add to Fav'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - sender name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - bank name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - bank name value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - acc num'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - acc num value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - registered name'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - registered name  value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - Trns type'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - Trns type value'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - Add to Fav'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/18.png', FailureHandling.CONTINUE_ON_FAILURE)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Add as Fav - back btn'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Share Receipt'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Transfer Success Share Receipt'), 0)

    Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

    WebUI.delay(5)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/19.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt BACK btn'), 0)

    WebUI.delay(5)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success DONE'), 0)

    'entry from WALLET'
    Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success DONE'), 0)

    'entry from WALLET'
    Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - Success DONE'), 0)
}

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/20.png', FailureHandling.CONTINUE_ON_FAILURE)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX header'), 0)

'entry from WALLET'
not_run: Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX today'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX trnx history'), 0)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX trnx history drop down'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX trnx history CANCEL'), 0)

'entry from WALLET'
Mobile.getText(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX trnx history DONE'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/21.png', FailureHandling.CONTINUE_ON_FAILURE)

'entry from WALLET'
Mobile.tap(findTestObject('MAYA Drop 4/IBFT and S2U/UAT - IBFT - VIEW TRNX trnx history DONE'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/22.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/IBFTandS2U/23.png', FailureHandling.CONTINUE_ON_FAILURE)

