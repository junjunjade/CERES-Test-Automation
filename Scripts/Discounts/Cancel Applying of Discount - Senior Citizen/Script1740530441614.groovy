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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String apkPath = GlobalVariable.APK_PATH;
Mobile.startApplication(apkPath, true);

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Discounts/android.widget.EditText - Password'), 'tzH6RvlfSTg=', 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - POS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - BLACK COFFEE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CHICKEN'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - BUFFALO'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SC DISCOUNT'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 'Juan One', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - ID No'), '1046', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - TIN'), '123456789', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Business Style'), 'Sample Business', 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CANCEL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SC DISCOUNT'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

