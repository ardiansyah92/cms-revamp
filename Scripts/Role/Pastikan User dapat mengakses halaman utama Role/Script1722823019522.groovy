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

WebUI.callTestCase(findTestCase('Role/Pastikan User Dapat Mengakses Menu Role'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Role/input_Role_id_role_search'), 'New')

WebUI.sendKeys(findTestObject('Page_Pijar Mahir CMS Role/input_Role_id_role_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/img_Role_legion-image  css-yfh2mk'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/button_dari11data ditampilkan_next-page'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/button_dari11data ditampilkan_previous-page'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/button_10 Data'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/button_20 Data'))

