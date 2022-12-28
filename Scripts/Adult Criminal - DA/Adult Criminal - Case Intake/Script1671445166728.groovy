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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/Enter User Name'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/Enter Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Login button'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on Manage in the Menu'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Case Intake button'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Assigned To drop down'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select Case Type-Adult Criminal'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on Case Intake button_Continue'))

WebUI.delay(5)

int random

random = ((Math.random() * 700000) as int)

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/Enter__LEA'), random.toString())

WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/Enter__LEA'), '763623')
WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__BeginDate'), 't-3')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input_Offense To Date_EndDate'), 't-2')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/span_Adult and Family Services'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select LEA_Adult and Family Services'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click On_Add Attachments'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select Document Type'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select Document Type_Police Report'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__DocumentSource'), 'Document Source')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/input__DocumentName'), 'Document Title')

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/textarea_Notes_Note'), 'Notes - incident attachment')

WebUI.uploadFile(findTestObject('Object Repository/Page_CMP NextGen/Choose File'), GlobalVariable.Fileupload)

WebUI.click(findTestObject('Page_CMP NextGen/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_CMP NextGen/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Next_button'))

WebUI.delay(3)

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('File Uploaded Successfully.', false)

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select Intake type - Case Info Page'))

WebUI.click(findTestObject('Page_CMP NextGen/Select_Felony'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Next_button'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/Enter_Defendant_LastName'), 'balya')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Known Person Search'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select_Defendant'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Custody Status dropdown list'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Custody'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Initiation Status dropdown list'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Click on_Arrest Warrant'))

WebUI.scrollToPosition(50, 260)

WebUI.click(findTestObject('Page_CMP NextGen/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Next_button'))

WebUI.setText(findTestObject('Object Repository/Page_CMP NextGen/Enter_Partial StatuteOffense Title_partialStatute'), '107.718-e')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Statute Lookup'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/a_Select'))

WebUI.click(findTestObject('Page_CMP NextGen/button_Save_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CMP NextGen/label_balya - pradeep'), 'balya - pradeep')

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Next_button'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Add Assigned Staff'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Staff Type Dropdown'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Select_Unit'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Assigned To drop down'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/li_DV DDAs'))

WebUI.click(findTestObject('Page_CMP NextGen/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/Next_button'))

WebUI.scrollToPosition(50, 260)

//WebUI.executeJavaScript(GlobalVariable.Pagedown, [])
WebUI.click(findTestObject('Object Repository/Page_CMP NextGen/button_Submit'))

//WebUI.verifyElementText(findTestObject('Page_CMP NextGen/Case Created Successfully'), 'Intake')
String text = WebUI.getText(findTestObject('Page_CMP NextGen/Case Created Successfully'))

println(text)

//WebUI.verifyMatch(text, '^Case .* created successfully', true, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyMatch(text, '^Case #.*', true, FailureHandling.STOP_ON_FAILURE)

WebUI.takeElementScreenshot(findTestObject('Page_CMP NextGen/Case Created Successfully'))

WebUI.takeFullPageScreenshot()

