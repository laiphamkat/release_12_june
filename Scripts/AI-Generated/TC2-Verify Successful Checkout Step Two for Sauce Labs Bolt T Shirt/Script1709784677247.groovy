import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://katalon.atlassian.net/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Login into Application"

WebUI.takeScreenshot()

TrueTestScripts.login()

"Step 3: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/div_object'))

"Step 4: Click on input field 'user-name'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_username'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/input_username'))

"Step 5: Enter input value in input field 'user-name'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_username'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_home/input_username'), input_user_name)

"Step 6: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/div_object_1'))

"Step 7: Click on input field 'password'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_password'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/input_password'))

"Step 8: Enter input value in input field 'password'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_password'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_home/input_password'), input_password)

"Step 9: Click on input field 'login-button' -> Navigate to page 'inventory.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_login_button'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/input_login_button'))

"Step 10: Click on link  -> Navigate to page 'inventory-item.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_inventory_html/hyperlink_object_4'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory_html/hyperlink_object_4'))

"Step 11: Click on button 'add-to-cart-sauce-labs-bolt-t-shirt'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_inventory-item_html/button_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory-item_html/button_object_1'))

"Step 12: Click on link  -> Navigate to page 'cart.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_inventory-item_html/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory-item_html/hyperlink_object'))

"Step 13: Click on button 'checkout' -> Navigate to page 'checkout-step-one.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_cart_html/button_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_cart_html/button_object'))

"Step 14: Click on input field 'firstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_object'))

"Step 15: Enter input value in input field 'firstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_checkout-step-one_html/input_object'), input_firstname)

"Step 16: Click on input field 'lastName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_object_1'))

"Step 17: Enter input value in input field 'lastName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_checkout-step-one_html/input_object_1'), input_lastname)

"Step 18: Click on input field 'postalCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_object_2'))

"Step 19: Enter input value in input field 'postalCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_checkout-step-one_html/input_object_2'), input_postalcode)

"Step 20: Click on input field 'continue' -> Navigate to page 'checkout-step-two.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_object_3'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_object_3'))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Checkout Step Two for Sauce Labs Bolt T Shirt_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
