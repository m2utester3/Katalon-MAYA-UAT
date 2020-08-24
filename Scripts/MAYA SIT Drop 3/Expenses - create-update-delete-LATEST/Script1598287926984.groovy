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

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - katalon'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 6-digit PIN'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Forgot PIN'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - APR'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAR'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Hi Meet your finance BFF'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Were here to give you a rundown of your expenses with Maybank be it locally or abroad. You can add cash transactions too.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Now'), 0)

'MAR - ADD Expenses'
not_run: Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAR'), 0)

'MAR - ADD Expenses'
not_run: Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Now'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Now'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Set Category'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.EditText0 - Add Notes'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Payment'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Cash'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 1'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 01 Jun 2020'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 01 Jun 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 01 Jun 2020'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 01 Jun 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 09 Jun 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.00 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 1 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 1 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - M2ULife'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Invalid input please check your category field please select a category'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses CROSS btn validation error'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.01'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.01'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - M2ULife'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Invalid input please check your amount field the amount should be bigger than zero'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses CROSS btn validation error'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.00 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 9 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  999999.99'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - M2ULife'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Invalid input please check your category field please select a category'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses CROSS btn validation error'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  999999.99'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  999999.99'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 1 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 1 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Set Category (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Set Category (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Categories'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Select a category'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (4)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Set Category (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Set Category (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Categories'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Select a category'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automotive'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Education'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Electronics'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Entertainment'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Financial Services'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Food  Beverage (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Select a subcategory'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Beverage'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Grocery'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Bakery'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Eating places  restaurants'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - New Category'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Eating places  restaurants'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Fast food restaurants'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Fast food restaurants'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Fast food restaurants (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.EditText0 - Add Notes (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 3/Expenses/android.widget.EditText0 - Add Notes (2)'), 'Teh Tarik', 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Youve successfully added an expense from your list.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses - This months spending'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - RM 0.02'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses - Sepnd so far CLICK - header msg'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses - Sepnd so far CLICK - header body msg'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses - Sepnd so far CLICK - CROSS btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Latest'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Categories (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Merchants'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Expense (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Filter'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/15.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 900)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automotive (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Today (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/UAT - Expenses SPENT SO FAR TEXT'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - RM 0.01'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/16.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 900)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automotive (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (3)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (3)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automobile rental'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Today (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (4)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (5)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automobile rental (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 11 Jun 2020 251pm'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (6)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Payment (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (3)'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/spy reg2/UAT expenses Split Bills'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/spy reg2/UAT expenses Edit Transactions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/spy reg2/UAT expenses Edit Transactions'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automobile rental (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Automobile rental (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Education (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Education (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Select a subcategory (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/Expenses - sub cat school'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/Expenses - sub cat school TICK'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.01 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.01 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (8)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (9)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Today (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Today (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 4'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done (3)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Done (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 04 Jun 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM  0.02'), 0)

Mobile.setText(findTestObject('MAYA Drop 3/Expenses/android.widget.EditText0 - Add Notes (3)'), 'books', 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.EditText0 - books'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Save'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Save'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Youve successfully updated an expense from your list.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Books'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/Expenses - back btn after edit trxn'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/Expenses - Edit trxn back button'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/Expenses - Edit trxn back button 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Expenses (3)'), 0)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 800)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Education (4)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.02'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 4 Jun 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.02 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Books (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.02 (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (4)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Education (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 04 Jun 2020 350pm'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Books (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.02 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Books'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Payment (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (5)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Logout'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Logout'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Login'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Login'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 6-digit PIN (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 5 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home (2)'), 0)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 900)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Spending Summary'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Youve spent'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - RM 0.01 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 -  this month.'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Top Expenses'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - 11062020'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (7)'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/spy reg2/UAT expenses spending more'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - -RM 0.01 (7)'), 0)

WebUI.delay(3)

Mobile.swipe(500, 1500, 500, 900)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (4)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/32.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - CASH (4)'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/spy reg2/UAT expenses Edit Transactions'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.ImageView0 (11)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Delete Transaction'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Are you sure you want to remove this transaction'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/33.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Confirm'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/34.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - MAY (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - JUN (2)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Add Now (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Expenses/35.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Home (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 3/Expenses/android.widget.TextView0 - Spending Summary (1)'), 0)

not_run: Mobile.closeApplication()

