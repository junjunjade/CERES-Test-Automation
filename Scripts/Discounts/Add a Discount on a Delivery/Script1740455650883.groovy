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

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DELIVERY'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Grab Food'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText'), 'GF-143M', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SUBMIT DELIVERY CODE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - BLACK COFFEE'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Item Value'), '120', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SUBMIT ITEM VALUE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PASTA'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CARBONARA'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Item Value'), '135', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SUBMIT ITEM VALUE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PWD'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Name'), 'Juan Dela', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - ID No'), '042092947-153', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - TIN'), '123456789', 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Business Style'), 'Sample Business', 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PAYMENT LOOKUP'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CASH'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - OK - SETTLE TRANSACTION'), 0)

Mobile.closeApplication()

