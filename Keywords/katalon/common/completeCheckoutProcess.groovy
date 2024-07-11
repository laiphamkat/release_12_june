package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class completeCheckoutProcess {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on span goToCart -> Navigate to page '/cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/span_goToCart'))
        
        "Step 2: Click on button proceedToCheckout -> Navigate to page 'checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_proceedToCheckout'))
        
        "Step 3: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_email'))
        
        "Step 4: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_email'), data['var_1_input_email'])
        
        "Step 5: Click on button continueToShipping -> Navigate to page 'checkout/shipping-address'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_continueToShipping'))
        
        "Step 6: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 7: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['var_2_input_firstName'])
        
        "Step 8: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        
        "Step 9: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['var_3_input_lastName'])
        
        "Step 10: Click on div address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/div_address'))
        
        "Step 11: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        
        "Step 12: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['var_4_input_address'])
        
        "Step 13: Click on input zipcode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'))
        
        "Step 14: Enter input value in input zipcode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipcode'), data['var_5_input_zipcode'])
        
        "Step 15: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        
        "Step 16: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['var_6_input_city'])
        
        "Step 17: Click on input state"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        
        "Step 18: Enter input value in input state"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['var_7_input_state'])
        
        "Step 19: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))
        
        "Step 20: Enter input value in input phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), data['var_8_input_phone'])
        
        "Step 21: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_email'] = testData.getValue('var_1_input_email', rowIndex)
        data['var_2_input_firstName'] = testData.getValue('var_2_input_firstName', rowIndex)
        data['var_3_input_lastName'] = testData.getValue('var_3_input_lastName', rowIndex)
        data['var_4_input_address'] = testData.getValue('var_4_input_address', rowIndex)
        data['var_5_input_zipcode'] = testData.getValue('var_5_input_zipcode', rowIndex)
        data['var_6_input_city'] = testData.getValue('var_6_input_city', rowIndex)
        data['var_7_input_state'] = testData.getValue('var_7_input_state', rowIndex)
        data['var_8_input_phone'] = testData.getValue('var_8_input_phone', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_email'] = 'default_data'
        data['var_2_input_firstName'] = 'default_data'
        data['var_3_input_lastName'] = 'default_data'
        data['var_4_input_address'] = 'default_data'
        data['var_5_input_zipcode'] = 'default_data'
        data['var_6_input_city'] = 'default_data'
        data['var_7_input_state'] = 'default_data'
        data['var_8_input_phone'] = 'default_data'
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

