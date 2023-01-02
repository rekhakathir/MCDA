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

WebUI.click(findTestObject('Object Repository/Costs/Page_CMP NextGen/a_Costs'))

WebUI.click(findTestObject('Object Repository/Costs/Page_CMP NextGen/button_Add Case Costs'))

WebUI.click(findTestObject('Object Repository/Costs/Page_CMP NextGen/span_Select Expense Category_ui-dropdown-tr_cc139e'))

WebUI.click(findTestObject('Object Repository/Costs/Page_CMP NextGen/span_Expert Witness'))

WebUI.setText(findTestObject('Object Repository/Costs/Page_CMP NextGen/input__Amount'), '1000')

WebUI.setText(findTestObject('Object Repository/Costs/Page_CMP NextGen/input_Payee_Payee'), 'Pradeep')

WebUI.setText(findTestObject('Object Repository/Costs/Page_CMP NextGen/input__IncurredDate'), 't-1')

WebUI.setText(findTestObject('Object Repository/Costs/Page_CMP NextGen/input_Invoice_InvoiceNum'), 'Test')

WebUI.setText(findTestObject('Object Repository/Costs/Page_CMP NextGen/textarea_Notes_Note'), 'Costs')

WebUI.click(findTestObject('Unique Objects/Popup Window Save button'))

WebUI.verifyElementText(findTestObject('Costs/Page_CMP NextGen/div_Case Cost Saved Successfully'), 'Case Cost Saved Successfully.')

