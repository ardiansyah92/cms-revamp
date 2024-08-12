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

WebUI.callTestCase(findTestCase('Pengguna/Pastikan User dapat mengakses Menu Pengguna'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna/input_Pengguna_id_pengguna_search'), 'Superadmin')

WebUI.sendKeys(findTestObject('Page_Pijar Mahir CMS Pengguna/input_Pengguna_id_pengguna_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/img_Pengguna_legion-image  css-yfh2mk'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/span_Semua Role'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/span_Admin Internal'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/span_Semua Role'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/Page_Pijar Mahir CMS/span_Semua Role'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/button_10 Data'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/button_50 Data'))

WebUI.refresh()

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/button_dari91data ditampilkan_next-page'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/button_dari91data ditampilkan_previous-page'))

