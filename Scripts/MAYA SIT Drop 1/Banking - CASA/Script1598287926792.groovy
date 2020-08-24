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

'app launch (peileng) (UAT_test06)'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 1140 1382 3409'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 16034.12'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - MAE'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5147 1200 1309'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 1022.77'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/3.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.swipe(490, 1440, 490, 1340)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account-i'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 1640 1781 0625'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Contact Bank'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5)

Mobile.swipe(490, 770, 490, 1440)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Transfer'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Reload'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Pay Cards'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Send  Request'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/6.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.swipe(490, 1440, 490, 770)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 16034.12 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 0.00'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/7.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.swipe(490, 770, 490, 1440)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - View Transactions'), 
    0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/8.png', FailureHandling.CONTINUE_ON_FAILURE)

'X'
Mobile.tap(findTestObject('Banking Loans/UAT - Banking CASA CROSS btn trx history'), 0)

WebUI.delay(5)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/3 dots on account page'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Copy Account Number'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/9.png', FailureHandling.CONTINUE_ON_FAILURE)

'X'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (1)'), 0)

'back'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/3 dots on account page'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Set as Wallet'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Set as Wallet'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingCASA/10.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

