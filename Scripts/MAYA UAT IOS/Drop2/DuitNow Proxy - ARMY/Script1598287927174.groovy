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

'army_rpp01'
Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeButton - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/55.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeButton - More'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Settings'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Settings'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Maybank2u Manage Maybank2u settings'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeOther - Maybank2u Manage Maybank2u settings'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeStaticText - Enter your password'), 
    0)

Mobile.setText(findTestObject('MAYA UAT IOS/Drop1/one tap authorization/XCUIElementTypeSecureTextField'), 'rpp12345', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - DuitNow'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/56.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Link your Maybank account to an ID for DuitNow'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/57.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - ID Number 4178 Maybank'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - ID Number 4178 Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - NRIC Number'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - 4178'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Status'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/58.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - ACTIVE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Receiving bank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Receiving Account'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - 2552'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Switch account'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Switch account'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Link Maybank account to DuitNow'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/59.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Deregister DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Disable Temporarily'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Disable Temporarily'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Disable DuitNow'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/60.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Your DuitNow account will be temporarily disabled. Are you sure you want to proceed'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Confirm'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Confirm'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - One Time Password'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/61.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Confirm (1)'), 0)

def otpMessage = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC msg 3'), 0)

for (def i = 122; i <= 127; i++) {
    if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 9'), 0)
    }
}

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC ok btn 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - DuitNow'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/62.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Link your Maybank account to an ID for DuitNow'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - ID Number 4178 Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Status'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/63.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - INACTIVE'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Enable'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Enable'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/64.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Confirm'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - One Time Password'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - Confirm (1)'), 0)

def otpMessage1 = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC msg 3'), 0)

for (def i = 122; i <= 127; i++) {
    if ((otpMessage1[i]) == '0') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 0'), 0)
    }
    
    if ((otpMessage1[i]) == '1') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 1'), 0)
    }
    
    if ((otpMessage1[i]) == '2') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 2'), 0)
    }
    
    if ((otpMessage1[i]) == '3') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 3'), 0)
    }
    
    if ((otpMessage1[i]) == '4') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 4'), 0)
    }
    
    if ((otpMessage1[i]) == '5') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 5'), 0)
    }
    
    if ((otpMessage1[i]) == '6') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 6'), 0)
    }
    
    if ((otpMessage1[i]) == '7') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 7'), 0)
    }
    
    if ((otpMessage1[i]) == '8') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 8'), 0)
    }
    
    if ((otpMessage1[i]) == '9') {
        Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/ios kp 9'), 0)
    }
}

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/Buy Reload/spy/UAT - reload ios TAC ok btn 1'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - DuitNow'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/65.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Link your Maybank account to an ID for DuitNow'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeOther - ID Number 4178 Maybank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - Status'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/duitnow/66.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop2/DuitNow Proxy - ARMY/XCUIElementTypeStaticText - INACTIVE'), 0)

not_run: Mobile.closeApplication()

