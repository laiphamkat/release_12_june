import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.common.proceedToCheckoutWithEmailForShipping
import katalon.common.enterPersonalDetailsAndProceedToPayment
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2: Click on button addToCart.png')

"Step 3: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Parameterized Objects/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3: Hover over item object.png')

"Step 4: Click on link apple -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4: Click on link apple - Navigate to page category.png')

"Step 5: Click on button hotNewiPhone15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/button_hotNewiPhone15', ['internalHasTextVariable': button_hotNewiPhone15_internalHasTextVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5: Click on button hotNewiPhone15.png')

"Step 6: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_256Gb', ['internalTextVariable': label_256Gb_internalTextVariable, 'forVariable': label_256Gb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6: Click on label 256Gb.png')

"Step 7: Click on label 256Gb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_category/label_256Gb', ['internalTextVariable': label_256Gb_internalTextVariable, 'forVariable': label_256Gb_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7: Click on label 256Gb.png')

"Step 8: Click on button dialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_dialog'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8: Click on button dialog.png')

"Step 9: Click on link goToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9: Click on link goToCart.png')

"Step 10: Proceed to checkout by providing email for shipping"

proceedToCheckoutWithEmailForShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Enter personal details for shipping and proceed to payment"

enterPersonalDetailsAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12: Click on button completeOrder - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout Process for iPhone 15_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}