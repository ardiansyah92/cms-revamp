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

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/img'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role/div_Ubah Data'))

WebUI.sendKeys(findTestObject('Page_Pijar Mahir CMS Role Update/input__name'), Keys.chord(Keys.CONTROL, 'a', Keys.CLEAR))

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Role Update/input__name'), 'Edit Data')

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/span_Tidak Aktif'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/span_Aktif'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/span_Tidak Aktif'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/u_Batalkan Pilihan'))

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Role Update/input__id_role_search_hak_akses'), 'Pengguna')

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/span_Pengguna'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/img_Batalkan Pilihan_legion-image  css-yfh2mk'))

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Role Update/input__id_role_search_hak_akses'), 'Overview')

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/span_Overview'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/button_Simpan'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Role Update/Page_Pijar Mahir CMS/button_Simpan'))

