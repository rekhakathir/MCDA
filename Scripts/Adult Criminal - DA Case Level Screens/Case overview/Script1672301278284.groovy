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

not_run: WebUI.callTestCase(findTestCase('Case Intake/Adult Criminal - Case Intake - DA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/li_Case Overview'), 'Case Overview')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Case Details'), 'Case Details')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Events'), 'Events')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Case Summary'), 'Case Summary')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Participants'), 'Participants')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/a_balya MR., pradeep kumar'), 'balya MR., pradeep kumar')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/span_Recent Activity'), 'Recent Activity')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Incidents'), 'Incidents')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Case Status History'), 'Case Status History')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Related Cases'), 'Related Cases')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/div_Judge History'), 'Judge History')

