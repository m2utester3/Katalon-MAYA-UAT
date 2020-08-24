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

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/41.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 6-digit PIN'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Forgot PIN'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/42.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses (1)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses SPENT SO FAR TEXT'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - RM 0.01'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/43.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 900)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Categories'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/44.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Categories'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Financial Services'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 4 Transactions'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 1510.58'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Other Expenses'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 3 Transactions'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 7.57'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Education'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 3 Transactions (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.06'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/45.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Education'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Elementary School'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 4 Jul 2020'), 
    0)

String trxT1 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.06 (1)'), 
    0).substring(4)

String trxT11 = trxT1.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trxT11)

int trxT111 = ((trxT11) as Integer)

System.out.println(trxT111)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - CASH'), 0)

String trx4 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.02'), 
    0).substring(4)

String trx41 = trx4.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx41)

int trx411 = ((trx41) as Integer)

System.out.println(trx411)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - CASH (1)'), 0)

String trx5 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.02 (1)'), 
    0).substring(4)

String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx51)

int trx511 = ((trx51) as Integer)

System.out.println(trx511)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - CASH (2)'), 0)

String trx6 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.02 (2)'), 
    0).substring(4)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

int value = (trx411 + trx511) + trx611

System.out.println(value)

if (value == trxT111) {
    System.out.println('INDIVIDUAL expenses is EQUAL to TOTAL expenses')
} else {
    System.out.println('INDIVIDUAL expenses is NOT EQUAL to TOTAL expenses')
}

not_run: Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Education'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Elementary School'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 4 Jul 2020'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.06 (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - CASH'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.02'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - CASH (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.02 (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - CASH (2)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 0.02 (2)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/46.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Merchants'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/47.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Merchants'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Merchants (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - VISAMASTER ASTRO'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 3 Transactions (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 7.57 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - VISAMASTER ASTRO'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/48.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - VISAMASTER ASTRO'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - VISAMASTER ASTRO (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - 2 Jul 2020'), 0)

String VISAMASTER = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 7.57 (2)'), 
    0).substring(4)

String VISAMASTER1 = VISAMASTER.replaceAll('[^a-zA-Z0-9]+', '')

int VISAMASTER11 = ((VISAMASTER1) as Integer)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - MEASAT BROADCAST NE 0920037999'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Other expenses (1)'), 
    0)

String VAL1 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 3.56'), 
    0).substring(4)

String VAL11 = VAL1.replaceAll('[^a-zA-Z0-9]+', '')

int VAL111 = ((VAL11) as Integer)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - MEASAT BROADCAST NE 0920037999 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Other expenses (2)'), 
    0)

String VAL2 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 1.45'), 
    0).substring(4)

String VAL21 = VAL2.replaceAll('[^a-zA-Z0-9]+', '')

int VAL211 = ((VAL21) as Integer)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - MEASAT BROADCAST NE 0920037999 (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Other expenses (3)'), 
    0)

String VAL3 = Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - -RM 2.56'), 
    0).substring(4)

String VAL31 = VAL3.replaceAll('[^a-zA-Z0-9]+', '')

int VAL311 = ((VAL31) as Integer)

int totalSum = (VAL111 + VAL211) + VAL311

if (totalSum == VISAMASTER11) {
    System.out.println('INDIVIDUAL expenses is EQUAL to TOTAL expenses')
} else {
    System.out.println('INDIVIDUAL expenses is NOT EQUAL to TOTAL expenses')
}

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/49.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Expenses'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses - Categories and Merchant/android.widget.TextView0 - Merchants (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/50.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

