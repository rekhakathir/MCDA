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

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/a_Events'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/button_Add Event'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_3be6c5'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Court'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_e963a1'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Arraignment'))

WebUI.setText(findTestObject('Object Repository/Events/Page_CMP NextGen/input__EventDate'), 't+1')

WebUI.setText(findTestObject('Object Repository/Events/Page_CMP NextGen/input__eventTime'), 't')

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_3d2972'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Justice Center'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_7c6933'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_JC1'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_0dd287'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_ADAMS, DIBA'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_4a5384'))

WebUI.setText(findTestObject('Object Repository/Events/Page_CMP NextGen/input_Select_ui-dropdown-filter ui-inputtex_493715'), 
    '')

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_A Docket, FNU'))

WebUI.setText(findTestObject('Object Repository/Events/Page_CMP NextGen/textarea_Notes_Note'), 'Events Notes')

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Add Event Result'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_b3a146'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Cancelled'))

WebUI.setText(findTestObject('Object Repository/Events/Page_CMP NextGen/input__resultDate'), 't')

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/span_Choose_ui-multiselect-trigger-icon ui-_8b4e86'))

WebUI.click(findTestObject('Object Repository/Events/Page_CMP NextGen/div_Choose_ui-chkbox-box ui-widget ui-corne_9fa9f5'))

WebUI.click(findTestObject('Unique Objects/Popup Window Save button'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click On_Add Attachments'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select Document Type'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select Document Type_Police Report'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__DocumentSource'), 'Document Source')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__DocumentName'), 'Document Title')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/textarea_Notes_Note'), 'Notes - incident attachment')

WebUI.uploadFile(findTestObject('Object Repository/Page_CMP NextGen/Choose File'), GlobalVariable.Fileupload)

WebUI.click(findTestObject('Unique Objects/Popup Window Save button'))

WebUI.click(findTestObject('Events/Page_CMP NextGen/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Events/Page_CMP NextGen/div_Event Saved Successfully'), 'Event Saved Successfully.')

WebUI.verifyElementText(findTestObject('Events/Page_CMP NextGen/div_File Uploaded Successfully'), 'File Uploaded Successfully')

