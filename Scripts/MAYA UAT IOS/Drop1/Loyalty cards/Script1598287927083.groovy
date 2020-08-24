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

Mobile.tapAtPosition(187, 305)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Less cards lighter wallet'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Add your loyalty cards so you can use them on the go. Never worry about leaving them behind again.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Add Cards'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Add Cards'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Add Loyalty Card'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextField - Enter card name'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextField - Enter card name'), 'automation loyalty', 
    0)

Mobile.tapAtPosition(187, 305)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card number'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextField - 0000000000000'), '11', 0)

Mobile.tapAtPosition(187, 305)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Continue'), 0)

d = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Loyalty card number must be more than 3 characters'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(d, 'Loyalty card number must be more than 3 characters')

Mobile.tapAtPosition(187, 305)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextField - 11'), '111222333444555666777888999000', 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Expiry date'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextField - MMYY'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextField - MMYY'), '10/25', 0)

Mobile.tapAtPosition(187, 305)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card colour'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Select Colour'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Description'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextView - inlineEditorInput'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - inlineEditorInput Optional'), 'automation test', 
    0)

Mobile.tapAtPosition(187, 305)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card photo'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - automation loyalty'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - 1112 2233 3444 5556'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Expiry Date 1025'), 0)

Mobile.verifyElementExist(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - 1112223334445556'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Description (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeTextView - inlineEditorInput (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card photo (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Confirm'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Confirm'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Loyalty'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Add Card'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Add Card'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Add Loyalty Card'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (4)'), 0)

WebUI.delay(5)

Mobile.tapAtPosition(187, 200)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - automation loyalty (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card photo (2)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - cameraImage'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (5)'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - menuItem0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'Edit Card')

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - menuItem1'), 0)

Mobile.verifyEqual(c, 'Remove Card')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - menuItem0'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Edit Loyalty Card'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Card photo (3)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - cameraIcon'), 0)

Mobile.verifyElementChecked(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - cameraIcon'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (6)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - automation loyalty (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther (5)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - menuItem1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - menuItem1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Remove Card'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Are you sure you want to remove this card'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Confirm (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Confirm (2)'), 0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeOther - Youve successfully removed your loyalty card.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'You\'ve successfully removed your loyalty card.')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Loyalty/XCUIElementTypeStaticText - Loyalty'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/loyalty/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

