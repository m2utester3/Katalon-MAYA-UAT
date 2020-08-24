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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeButton - More'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Settings - All/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Settings'), 0)

Mobile.tapAtPosition(91, 305)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Promotions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeTextField - Type to search'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeTextField - Type to search'), 'pizza', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Search Results'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - We found 1 promotion that match your search.'), 
    0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - 5'), 0)

WebUI.delay(10)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyNotEqual(b, a)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther (1)'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeTextField - Type to search'), 'watermelon', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Bummer No Results Found'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Couldnt find what youre looking for Search or select a different filter.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - New Search'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - New Search'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeTextField - Type to search'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther (2)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeTextField - Type to search'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeTextField - Type to search'), 'genting2222', 
    0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Bummer No Results Found'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther (3)'), 0)

d = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Sort  Filter'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(d, 'Sort & Filter')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Sort by'), 0)

e = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Popularity'), 0)

Mobile.verifyEqual(e, 'Popularity')

f = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Latest'), 0)

Mobile.verifyEqual(f, 'Latest')

g = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Oldest'), 0)

Mobile.verifyEqual(g, 'Oldest')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Oldest'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Filter by'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Categories'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Categories (1)'), 0)

Mobile.tapAtPosition(80, 416)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Close'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Food  Beverage'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Food  Beverage'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Food  Beverage'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Clear'), 0)

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Apply Filter'), 0)

Mobile.verifyEqual(c, 'Apply Filter')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeOther - Apply Filter'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/promotions/XCUIElementTypeStaticText - Bummer No Results Found'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/promotions/8.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

