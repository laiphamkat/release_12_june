import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import katalon.common.proceedToCheckoutWithEmail
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Hover over item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2: Hover over item object.png')

"Step 3: Click on link appleChekhlyNaIphone -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_appleChekhlyNaIphone'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3: Click on link appleChekhlyNaIphone - Navigate to page category.png')

"Step 4: Click on link iPhone15SiliconeCaseWithMagSafe -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_iPhone15SiliconeCaseWithMagSafe'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4: Click on link iPhone15SiliconeCaseWithMagSafe - Navigate to page product.png')

"Step 5: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5: Click on label blueTitanium.png')

"Step 6: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/label_blueTitanium'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6: Click on label blueTitanium.png')

"Step 7: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_buy_1'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7: Click on button buy.png')

"Step 8: Click on link placeAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8: Click on link placeAnOrder.png')

"Step 9: Proceed to checkout by providing email for shipping"

proceedToCheckoutWithEmail.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10: Hover over div object.png')

"Step 11: Click on input firstName -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11: Click on input firstName - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Checkout Process for iPhone 15 Silicone Case with MagSafe_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}