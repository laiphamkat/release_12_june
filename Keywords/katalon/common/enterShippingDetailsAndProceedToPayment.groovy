package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterShippingDetailsAndProceedToPayment {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object'))
        
        "Step 2: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'))
        
        "Step 3: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_1'))
        
        "Step 4: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_firstName'), data['var_1_input_firstName'])
        
        "Step 5: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'))
        
        "Step 6: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_2'))
        
        "Step 7: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_lastName'), data['var_2_input_lastName'])
        
        "Step 8: Click on input address"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'))
        
        "Step 9: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_3'))
        
        "Step 10: Enter input value in input address"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_address'), data['var_3_input_address'])
        
        "Step 11: Click on input zipCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'))
        
        "Step 12: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_4'))
        
        "Step 13: Enter input value in input zipCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_zipCode'), data['var_4_input_zipCode'])
        
        "Step 14: Click on input city"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'))
        
        "Step 15: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_5'))
        
        "Step 16: Enter input value in input city"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_city'), data['var_5_input_city'])
        
        "Step 17: Click on input state"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'))
        
        "Step 18: Hover over div object"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Page_checkout_shipping_address/div_object_6'))
        
        "Step 19: Enter input value in input state"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_state'), data['var_6_input_state'])
        
        "Step 20: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'))
        
        "Step 21: Enter input value in input phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_shipping_address/input_phone'), data['var_7_input_phone'])
        
        "Step 22: Click on button continueToPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_shipping_address/button_continueToPayment'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_1_input_firstName'] = testData.getValue('var_1_input_firstName', rowIndex)
        data['var_3_input_address'] = testData.getValue('var_3_input_address', rowIndex)
        data['var_2_input_lastName'] = testData.getValue('var_2_input_lastName', rowIndex)
        data['var_6_input_state'] = testData.getValue('var_6_input_state', rowIndex)
        data['var_7_input_phone'] = testData.getValue('var_7_input_phone', rowIndex)
        data['var_4_input_zipCode'] = testData.getValue('var_4_input_zipCode', rowIndex)
        data['var_5_input_city'] = testData.getValue('var_5_input_city', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_1_input_firstName'] = 'default_data'
        data['var_3_input_address'] = 'default_data'
        data['var_2_input_lastName'] = 'default_data'
        data['var_6_input_state'] = 'default_data'
        data['var_7_input_phone'] = 'default_data'
        data['var_4_input_zipCode'] = 'default_data'
        data['var_5_input_city'] = 'default_data'
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

