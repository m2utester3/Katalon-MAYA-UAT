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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Quick Actions'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Settings'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Tabung individual'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - ACTIVITY'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - ACTIVITY'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/3.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Today Youve just set up a new goal (Tabung individual). 620 PM'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - OVERVIEW'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far RM 0.08'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Goal amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - RM 28.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Remaining'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - RM 28.00 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem3'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem4'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - How much would you like to fund to your Tabung'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - 8'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Date'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Fund Tabung'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - txtSELECT_BOOSTER'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Topup Successful'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - 100575816'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - 13 Aug 2020 1117 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far RM 0.08'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem3'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem3'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Withdraw Tabung'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Withdrawing from your Tabung means it might take longer to reach your goal.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Withdraw'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Withdraw'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - How much would you like to withdraw'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far RM 0.08'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - 9'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Your withdrawal amount should be less than your contributed amount.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/13.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - 8'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Withdraw Funds'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - txtSELECT_BOOSTER'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Withdrawal Successful'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - 100575816'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - 13 Aug 2020 1117 PM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Share Receipt'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Saved so far RM 0.08'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem4'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeOther - menuItem4'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Fund/XCUIElementTypeStaticText - Remove Tabung'), 0)

