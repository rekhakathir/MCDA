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

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/a_Evidence'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/button_Add Evidence'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_b2b24e'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Blood Test'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Choose_ui-multiselect-trigger-icon ui-_6120a4'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Choose_ui-chkbox-box ui-widget ui-corne_5eccc9'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_d1246f'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Box'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/textarea_Evidence Description_EvidenceDescription'), 
    'Evidence Description')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Quantity_Quantity'), '5')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_332e80'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/li_KG'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Serial Number_SerialNum'), '1234')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Value_Value'), '3')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_18b269'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_64802'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/textarea_How Recovered_HowRecovered'), 'Police')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Seized Date_SeizedDate'), 't-2')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Seized Time_SeizedTime'), 't')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Evid ID_EvidID'), '321')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Exhibit_Exhibit'), '345')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Is Admissible_ui-chkbox-box ui-widget u_255e0e'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Is Search Warrant_ui-chkbox-box ui-widg_476003'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_6aa442'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Applied towards financial obligations'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Disposition Date_DispositionDate'), 't-3')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/textarea_Evidence Notes_EvidenceNotes'), 'Evidence Notes')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_98d211'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Junction Avenue Evidence Warehouse'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Section_Section'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Section_Section'), '412')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Shelf_Shelf'), 'Shelf')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Select_ui-dropdown-trigger ui-state-def_bb6f8a'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Justice Center'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_39e20b'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Contraband'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_a84e2f'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Adult and Family Services'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/label_Aberle, Kenneth'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Bar Code_BarCode'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Bar Code_BarCode'), '4533')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Add TestAction'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_ebe20d'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Insufficient Blow'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input__ActionDate'), 't-3')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_TestAction Id_TestActionIdNum'), '456')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Choose_ui-multiselect-trigger-icon ui-_f9f514'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Choose_ui-chkbox-box ui-widget ui-corne_bc9747'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_72ec43'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Amphetamines'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Amount_Amount'), '5000')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_7117a9'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_KG'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_B.A_BA'), 'B.A')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input_Actor_Actor'), 'Actor')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Select_ui-dropdown-trigger-icon ui-cli_13e30c'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/li_CSI'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/textarea_Results_Results'), 'Test Action')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/textarea_TestAction Notes_TestActionNotes'), 'Test Action Notes')

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/div_Cancel_ui-scrollpanel-bar ui-scrollpanel-bar-y'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/button_Save'))

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/span_Add Attachments'))

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input__DocumentSource'), 'Document Evidence Source')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/input__DocumentName'), 'Document Evidence Title')

WebUI.setText(findTestObject('Object Repository/Evidence/Page_CMP NextGen/textarea_Notes_Note'), 'Notes')

WebUI.uploadFile(findTestObject('Object Repository/Page_CMP NextGen/Choose File'), GlobalVariable.Fileupload)

WebUI.click(findTestObject('Object Repository/Evidence/Page_CMP NextGen/button_Save_1'))

