import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import katalon.common.completeCheckoutProcess
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Click on link apple - Navigate to page category.png')

"Step 3: Click on button bestChoiceHotNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_bestChoiceHotNew'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3: Click on button bestChoiceHotNew.png')

"Step 4: Click on label gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_gb'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on label gb.png')

"Step 5: Click on label gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/label_gb'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on label gb.png')

"Step 6: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on button buy.png')

"Step 7: Navigate to cart, provide checkout info, shipping address, and proceed to payment"

completeCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on button completeOrder - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Purchase Apple Phone_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}