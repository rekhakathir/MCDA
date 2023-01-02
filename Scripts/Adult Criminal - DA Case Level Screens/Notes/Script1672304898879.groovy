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

WebUI.click(findTestObject('Object Repository/Notes/Page_CMP NextGen/a_Notes'))

WebUI.click(findTestObject('Object Repository/Notes/Page_CMP NextGen/button_Add Case Notes'))

WebUI.click(findTestObject('Object Repository/Notes/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_d83b20'))

WebUI.click(findTestObject('Object Repository/Notes/Page_CMP NextGen/span_Additional Case Facts'))

WebUI.setText(findTestObject('Object Repository/Notes/Page_CMP NextGen/textarea__Note'), 'Notes')

WebUI.click(findTestObject('Unique Objects/Popup Window Save button'))

WebUI.verifyElementText(findTestObject('Object Repository/Notes/Page_CMP NextGen/div_Case note saved successfully'), 'Case note saved successfully.')

