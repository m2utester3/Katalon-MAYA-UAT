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

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeOther - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/send money/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - Bus Tickets'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - Depart'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - Depart'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - BUY BUS TICKETS ONLINE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - Malaysia  Singapore'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeButton - SEARCH'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeButton - SEARCH'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - Kuala Lumpur - Singapore'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeStaticText - Select An Onward Trip'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeButton'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/bus tickets/XCUIElementTypeButton'), 0)

not_run: Mobile.closeApplication()

