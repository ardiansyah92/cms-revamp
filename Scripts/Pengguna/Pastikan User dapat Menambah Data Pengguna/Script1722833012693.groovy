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

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/button_Pengguna'))

WebUI.verifyElementText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/h1_Tambah Pengguna'), 'Tambah Pengguna')

WebUI.verifyElementText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/h1_Informasi Pengguna'), 'Informasi Pengguna')

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/input__fullname'), fullname)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/input__email'), email)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/input__username'), username)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/input__password'), password)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/input__retypePassword'), retype_password)

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Add/input__phone'), phone)

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Add/span_Pilih role'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Add/span_Admin Internal'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Add/span_Pilih Lembaga Pelatihan'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Add/span_Binus Center'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Add/button_Simpan'))

