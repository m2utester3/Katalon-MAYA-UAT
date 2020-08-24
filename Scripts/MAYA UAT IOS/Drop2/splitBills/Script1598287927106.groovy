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

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Split Bill'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - TO COLLECT'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - TO PAY'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - PAST'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - GROUP'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Got an IOU situation'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Evenly or separately its time to split the bill with friends'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Split a Bill'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Split a Bill'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Split Bill (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Whats this bill for'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextField - Enter bill name'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextField - Enter bill name'), 'ios split bill', 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Add notes (optional)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextField - Enter notes'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextField - Enter notes'), 'Fine Dine', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Howd you like to split this bill'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Separately'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Evenly'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Evenly'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Continue'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Continue'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Split Bill (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - How much would you like to split'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - RM'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextField - 0.00'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - 6'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - 2'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - 3'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther'), 0)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - RM 62.35  0.00'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - 2'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Add Contact'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - FRIENDS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - GROUPS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - 130 contacts selected'), 0)

Mobile.tapAtPosition(187, 335)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - 230 contacts selected'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Split Bill (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Selected friends (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Katalon'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Test'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Add More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Split Bill (4)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Split amount'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - RM 62.37'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Bill name'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextView - inlineEditorInput'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Notes'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeTextView - inlineEditorInput (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeStaticText - Receipt'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther (2)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeButton - From Gallery'), 0)

not_run: Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeButton - OK'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeOther - Photos'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeImage'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeImage (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/XCUIElementTypeButton - Choose'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Your receipt image has been successfully added.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - MAE contacts (2)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Katalon'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - RM 31.19'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Test'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - RM 31.18'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Split Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Split Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Split bill created'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - MC264553B'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Date  time'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - 12 Aug 2020 350 PM'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Done'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Done'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Ttygg KA TE Collected so far RM 31.18 of RM 62.37 Expires on 11 Sep 2020'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Ttygg KA TE Collected so far RM 31.18 of RM 62.37 Expires on 11 Sep 2020'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Split Bill (1)'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Ttygg'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - RM 62.37'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Expires on 11 Sep 2020'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Participants'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Katalon (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - RM 31.18 (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Test (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - RM 31.18 (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Split Bill (1)'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - menuItem0'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - menuItem1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - menuItem2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - menuItem3'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - menuItem3'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Remove Bill'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeStaticText - Bill sorted Remove it from your list now.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Confirm'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/splitbills/split bill 2/XCUIElementTypeOther - Confirm'), 0)

not_run: Mobile.closeApplication()

