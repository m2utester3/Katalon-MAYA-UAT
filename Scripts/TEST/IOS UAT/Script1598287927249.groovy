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

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Skip'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Lets Get Started'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Set Up Wallet'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Log in to enjoy the app to its fullest.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - No account Get started with MAE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Register for Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Login to Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Please enter your username'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Forgot Login Details'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Forgot Login Details'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - M2U Web'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Hello (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Register for Maybank2u (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Register for Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - M2U Web'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Login to Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Please enter your username'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (3)'), 'pentestu102', 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Is this your security phrase'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Not Mine'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Not Mine'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Contact Bank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - For any enquiries regarding your account please call the Customer Care Hotline at 1 300 88 6688.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Call Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Call Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - 1300886688'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeButton - Call'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeButton - Cancel'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeButton - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Yes Its Mine'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther - Yes Its Mine'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeStaticText - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/onboarding/XCUIElementTypeOther (4)'), 'pass1234', 0)

not_run: Mobile.closeApplication()

