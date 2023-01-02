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

WebUI.navigateToUrl('https://htcinc-cloud.caretech.com/cmp-mcda/portal/#/login')

WebUI.setText(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/input_User Name_form-control ng-untouched n_fec229'), 
    'Pradeep')

WebUI.setEncryptedText(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/input_Password_form-control ng-untouched ng_e0c371'), 
    'GGbbmOViWeiuZ5NvdDMBPA==')

WebUI.click(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/button_Login'))

not_run: WebUI.click(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/i_Press Enter to open the Dialog box and th_4630ec'))

not_run: WebUI.click(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/a_Name'))

not_run: WebUI.click(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/a_Case'))

not_run: WebUI.setText(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/input_label for searchText_Search'), 
    '3002695')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/input_label for searchText_Search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search Adult Criminal Case/Page_CMP NextGen/a_Accessed 0000002 balya, pradeep kumar, MR'))

