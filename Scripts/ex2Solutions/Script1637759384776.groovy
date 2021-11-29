 //import WebElement and JUnit for Assertion, same as how you do in Java
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
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
import org.openqa.selenium.WebElement as WebElement


WebUI.openBrowser('')

WebUI.navigateToUrl('https://sigarra.up.pt/feup/en/vld_validacao.login?p_address=WEB_PAGE.INICIAL&p_app=162&p_amo=55')

WebUI.click(findTestObject('Object Repository/ex2TestObjects/input_Username_p_user'))

WebUI.setText(findTestObject('Object Repository/ex2TestObjects/input_Username_p_user'), '20210555555')

WebUI.click(findTestObject('Object Repository/ex2TestObjects/inputButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ex2TestObjects/li_Mandatory field'),50)

WebUI.closeBrowser()

