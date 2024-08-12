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

WebUI.callTestCase(findTestCase('Login/Pastikan User Dapat Melakukan Login'), [('username') : 'superadmin', ('password') : 'super123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Overview Pijar Mahir CMS1/div_Atur performansi bisnismu dengan dashboard CMS Pijar Mahir'), 
    'Atur performansi bisnismu dengan dashboard CMS Pijar Mahir')

WebUI.setText(findTestObject('Page_Overview Pijar Mahir CMS1/input_search_id_overview_search'), 'Offline')

WebUI.sendKeys(findTestObject('Page_Overview Pijar Mahir CMS1/input_search_id_overview_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Overview Pijar Mahir CMS1/button_dari1224data ditampilkan_next-page'))

WebUI.click(findTestObject('Page_Overview Pijar Mahir CMS1/button_dari1224data ditampilkan_previous-page'))

WebUI.refresh()

WebUI.click(findTestObject('Page_Overview Pijar Mahir CMS1/button_10 Data'))

WebUI.click(findTestObject('Page_Overview Pijar Mahir CMS1/button_20 Data'))

