package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class proceedThroughCheckoutProcess {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on span  -> Navigate to page 'cart'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))
        WebUI.takeScreenshot()
        "Step 2: Click on button 'Proceed to checkout' -> Navigate to page 'checkout/info'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        WebUI.takeScreenshot()
        "Step 3: Click on input field 'email'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        WebUI.takeScreenshot()
        "Step 4: Enter input value in input field 'email'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['input_email'])
        WebUI.takeScreenshot()
        "Step 5: Click on button 'CONTINUE TO SHIPPING' -> Navigate to page 'checkout/shipping-address'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        WebUI.takeScreenshot()
        "Step 6: Click on input field 'shipping address.first name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        WebUI.takeScreenshot()
        "Step 7: Enter input value in input field 'shipping address.first name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['input_shipping_address_first_name'])
        WebUI.takeScreenshot()
        "Step 8: Click on input field 'shipping address.last name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        WebUI.takeScreenshot()
        "Step 9: Enter input value in input field 'shipping address.last name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['input_shipping_address_last_name'])
        WebUI.takeScreenshot()
        "Step 10: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_address'))
        WebUI.takeScreenshot()
        "Step 11: Click on input field 'shipping address.address line 1'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        WebUI.takeScreenshot()
        "Step 12: Enter input value in input field 'shipping address.address line 1'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['input_shipping_address_address_line_1'])
        WebUI.takeScreenshot()
        "Step 13: Click on input field 'shipping address.zip'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        WebUI.takeScreenshot()
        "Step 14: Enter input value in input field 'shipping address.zip'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['input_shipping_address_zip'])
        WebUI.takeScreenshot()
        "Step 15: Click on input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        WebUI.takeScreenshot()
        "Step 16: Enter input value in input field 'shipping address.city'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['input_shipping_address_city'])
        WebUI.takeScreenshot()
        "Step 17: Click on input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        WebUI.takeScreenshot()
        "Step 18: Enter input value in input field 'shipping address.state'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['input_shipping_address_state'])
        WebUI.takeScreenshot()
        "Step 19: Click on input field 'shipping address.phone'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))
        WebUI.takeScreenshot()
        "Step 20: Enter input value in input field 'shipping address.phone'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), data['input_shipping_address_phone'])
        WebUI.takeScreenshot()
        "Step 21: Click on button 'CONTINUE TO PAYMENT'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/shipping-address?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
        WebUI.takeScreenshot()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_shipping_address_first_name'] = testData.getValue('input_shipping_address_first_name', rowIndex)
        data['input_shipping_address_last_name'] = testData.getValue('input_shipping_address_last_name', rowIndex)
        data['input_shipping_address_address_line_1'] = testData.getValue('input_shipping_address_address_line_1', rowIndex)
        data['input_shipping_address_zip'] = testData.getValue('input_shipping_address_zip', rowIndex)
        data['input_shipping_address_city'] = testData.getValue('input_shipping_address_city', rowIndex)
        data['input_shipping_address_state'] = testData.getValue('input_shipping_address_state', rowIndex)
        data['input_shipping_address_phone'] = testData.getValue('input_shipping_address_phone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_email'] = 'default_data'
        data['input_shipping_address_first_name'] = 'default_data'
        data['input_shipping_address_last_name'] = 'default_data'
        data['input_shipping_address_address_line_1'] = 'default_data'
        data['input_shipping_address_zip'] = 'default_data'
        data['input_shipping_address_city'] = 'default_data'
        data['input_shipping_address_state'] = 'default_data'
        data['input_shipping_address_phone'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

