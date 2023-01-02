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

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/a_Detail'))

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Case Information'), 'Case Information')

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/textarea_Case Summary_form-control ng-untou_92d3db'), 
    'Notes')

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Case Status Summary'), 'Case Status Summary')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/td_Case Status  Pending Review'), 
    'Case Status: Pending Review')

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Assigned Staff Summary'), 'Assigned Staff Summary')

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Add Assigned Staff'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_6f263d'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/span_Deputy District Attorney'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_8cbf32'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/span_Abraham, Laurie'))

WebUI.click(findTestObject('Case Detail/Page_CMP NextGen/Add assigned staff button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Assigned Staff Saved Successfully'), 
    'Assigned Staff Saved Successfully.')

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Case Detail Summary'), 'Case Detail Summary')

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Add Case Detail'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_588100'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/li_New Case Identifier'))

WebUI.setText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/textarea_Case Detail_CaseDetail'), 'Case Details')

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/app-root_Processing request .Skip to main c_e5b108_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Related Cases Summary'), 'Related Cases Summary')

WebUI.verifyElementText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/div_Keywords'), 'Keywords')

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Add Keywords'))

WebUI.setText(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/input_Keyword_keyWord'), 'a')

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Search'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Add'))

WebUI.click(findTestObject('Object Repository/Case Detail/Page_CMP NextGen/button_Done'))

