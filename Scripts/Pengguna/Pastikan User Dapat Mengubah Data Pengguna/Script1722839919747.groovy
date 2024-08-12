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

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/img'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna/div_Ubah Data'))

WebUI.sendKeys(findTestObject('Page_Pijar Mahir CMS Pengguna Update/input__fullname'), Keys.chord(Keys.COMMAND, 'a', Keys.CLEAR))

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Update/input__fullname'), fullname)

WebUI.sendKeys(findTestObject('Page_Pijar Mahir CMS Pengguna Update/input__email'), Keys.chord(Keys.COMMAND, 'a', Keys.CLEAR))

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Update/input__email'), email)

WebUI.sendKeys(findTestObject('Page_Pijar Mahir CMS Pengguna Update/input__username'), Keys.chord(Keys.COMMAND, 'a', Keys.CLEAR))

WebUI.setText(findTestObject('Page_Pijar Mahir CMS Pengguna Update/input__username'), username)

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Update/div_Admin Internal'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Update/span_B2B'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Update/div_Binus Center'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Update/span_Accelerice'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Update/button_Simpan'))

WebUI.click(findTestObject('Page_Pijar Mahir CMS Pengguna Update/Page_Pijar Mahir CMS/button_Simpan'))

