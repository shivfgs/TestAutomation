Feature: Test Shopping process at My Store application	
	@SmokeTest
	Scenario: Verify the MegaMenu functionality
	GIVEN User Opens <browser>
	AND User starts MyStore application
	WHEN User navigates on Megamenu "Dress-> Summer dresses"
	THEN User verifies that Summer dresses-MyStore page opens
	AND User verifies the page Title
	
	@RegressionTest
	Scenario: Verify the Prodcut Sort By price functionality
	GIVEN User Opens <browser>
	AND User starts MyStore application
	AND User navigates on Megamenu "Dress-> Summer dresses"
	AND User Selects value "Price: Lowest first" from the Sort By combo box
	THEN User verifies that products are arranged as lowest price first order
	AND User Selects value "Price: Highest first" from the Sort By combo box
	AND User verifies that products are arranged as highest price first order
	
	@RegressionTest
	Scenario: Select the product and verify the Cart Summary
	GIVEN User Opens <browser>
	AND User starts MyStore application
	AND User navigates on Megamenu "Dress-> Summer dresses"
	WHEN User selects a product
	AND User selects a <blue> colour product
	AND User clicks to Add to cart button
	AND User clicks to checkout button
	THEN User verifies that Cart summery page
	AND User verifies the name of the product
	AND User verifies the color of the product
	AND User verifies the quantity of the product
