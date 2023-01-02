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

WebUI.click(findTestObject('Documents/Page_CMP NextGen/a_Documents'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/button_Add Document'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/span_Attachment_ui-radiobutton-icon ui-clickable'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_5e5b26'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/span_Single Template'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_e11ced'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/span_Charging Document'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/span_Choose_ui-multiselect-trigger-icon ui-_3dccec_1_2'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/div_Choose_ui-chkbox-box ui-widget ui-corne_787874_1'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/div_Template Name Felony IndictmentFelony I_122dcb'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/button_Next'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/i_Primary_ml-2 fa-lg fas fa-chevron-circle-down'))

WebUI.setText(findTestObject('Object Repository/Documents/Page_CMP NextGen/input_balya MR., pradeep kumar_form-control_4f077a'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/button_Apply'))

WebUI.click(findTestObject('Object Repository/Documents/Page_CMP NextGen/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Documents/Page_CMP NextGen/div_Document Details Updated Successfully'), 
    'Information successfully submitted for document generation.')

