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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/36.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Tabung'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Pick a category to start saving.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Shopping For whatever you desire.'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Shopping For whatever you desire.'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - What are you saving for'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/37.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeTextField - Enter Tabung name'), 'Tabung individual', 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - How much are you planning to save'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/38.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - 8'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - 0'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - 0'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - DoneClick'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - When would you like to start your Tabung'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/39.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Tap to select start date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - When would you like to complete this Tabung'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/40.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Tap to select end date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (2)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeSecureTextField'), 'Pass@1247', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Name'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/41.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Tabung future'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Target amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - RM 28.00'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Start date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - End date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Target amount is'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - RM 28.00'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - You'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - RM 14.00'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Test'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - RM 14.00 (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Add More'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (3)'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Link this goal to your account'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Just so we know where to transfer your funds to for when your goal is closed or completed.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Select account'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Select account'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done (2)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (4)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Continue (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/42.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Name (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Target amount (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Select frequency'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Create Tabung'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Create Tabung'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Tabung created successfully.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/tabung/43.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - 100561648'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/Tabung Group/XCUIElementTypeOther - Done (3)'), 0)

not_run: Mobile.closeApplication()

