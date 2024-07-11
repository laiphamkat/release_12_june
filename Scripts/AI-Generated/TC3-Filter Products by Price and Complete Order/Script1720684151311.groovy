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

"Step 1: Navigate to category/*"

TrueTestScripts.navigate("category/${GlobalVariable.category_id}")

"Step 2: Click on input priceMin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/input_priceMin'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Click on input priceMin.png')

"Step 3: Click on input priceMin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/input_priceMin'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3: Click on input priceMin.png')

"Step 4: Navigate to cart, provide checkout info, shipping address, and proceed to payment"

completeCheckoutProcess.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Click on button completeOrder - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Filter Products by Price and Complete Order_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}