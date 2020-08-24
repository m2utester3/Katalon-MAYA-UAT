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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Expenses'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Hi Meet your finance BFF'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Were here to give you a rundown of your expenses with Maybank be it locally or abroad. You can add cash transactions too.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Expense'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Expense'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Validation Error'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Invalid input please check your amount field the amount should be bigger than zero'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Today -RM  0.00'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 8'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Expense'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Validation Error'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Invalid input please check your category field please select a category'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Set Category'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Set Category'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Categories'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Select a category'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Financial Services'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Financial Services'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Financial Services'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Select a subcategory'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Foreign currency'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Foreign currency'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Payment Cash'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Expense'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Expense'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Spent So Far RM 1.28'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Latest Categories Merchants'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Expense Filter'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Foreign currency'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - 13 Aug 2020 1226am'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - CASH'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - -RM 1.28'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Payment CASH (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Edit Transaction'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Edit Transaction'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Save'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Today -RM  1.28'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Today -RM  1.28'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Save'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Save'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Youve successfully updated an expense from your list.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - CASH'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - -RM 12.85'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Spent So Far RM 12.85'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Home'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Expenses'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Spent So Far RM 12.85'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Foreign currency'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - CASH'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Delete Expense'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Are you sure you want to delete '), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - No'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Yes'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Yes'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Youve successfully deleted an expense from your list.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Hi Meet your finance BFF'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - Add Now'), 0)

not_run: Mobile.closeApplication()

