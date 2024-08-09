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

"Step 2: Click on link iPhone15Pro -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_iPhone15Pro'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2: Click on link iPhone15Pro - Navigate to page product.png')

"Step 3: Click on button minus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/button_minus', ['classVariable': button_minus_classVariable, 'internalRoleButtonNameVariable': button_minus_internalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3: Click on button minus.png')

"Step 4: Click on button minus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/button_minus', ['classVariable': button_minus_classVariable, 'internalRoleButtonNameVariable': button_minus_internalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4: Click on button minus.png')

"Step 5: Click on button minus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/button_minus', ['classVariable': button_minus_classVariable, 'internalRoleButtonNameVariable': button_minus_internalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5: Click on button minus.png')

"Step 6: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_blueTitanium', ['internalTextVariable': label_blueTitanium_internalTextVariable, 'forVariable': label_blueTitanium_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6: Click on label blueTitanium.png')

"Step 7: Click on label blueTitanium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/label_blueTitanium', ['internalTextVariable': label_blueTitanium_internalTextVariable, 'forVariable': label_blueTitanium_forVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7: Click on label blueTitanium.png')

"Step 8: Click on button minus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Parameterized Objects/Page_product/button_minus', ['classVariable': button_minus_classVariable, 'internalRoleButtonNameVariable': button_minus_internalRoleButtonNameVariable]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8: Click on button minus.png')

"Step 9: Click on link placeAnOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_placeAnOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9: Click on link placeAnOrder.png')

"Step 10: Proceed to checkout by providing email for shipping"

proceedToCheckoutWithEmailForShipping.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Enter personal details for shipping and proceed to payment"

enterPersonalDetailsAndProceedToPayment.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on button completeOrder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/payment?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_payment/button_completeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12: Click on button completeOrder - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Ordering Process for iPhone 15 Pro in Blue Titanium_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}