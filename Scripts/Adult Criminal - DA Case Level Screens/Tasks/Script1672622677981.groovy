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

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/button_Add Task'))

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_3a32f0'))

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/span_Order Lab Test'))

WebUI.setText(findTestObject('Object Repository/Tasks/Page_CMP NextGen/input__dueDate'), 't+1')

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_eea713'))

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/span_balya, Pradeep kumar'))

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/span_Choose_ui-multiselect-trigger-icon ui-_8f5c02'))

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/div_Choose_ui-chkbox-box ui-widget ui-corne_e5e673'))

WebUI.setText(findTestObject('Object Repository/Tasks/Page_CMP NextGen/textarea__taskDescp'), 'Task - Automation.')

WebUI.click(findTestObject('Object Repository/Tasks/Page_CMP NextGen/button_Save'))

WebUI.verifyElementText(findTestObject('Tasks/Page_CMP NextGen/div_Task saved successfully'), 'Task saved successfullly')

