@TestRun 
Feature: Choosing any Period Time should reflect in their children pages 
	As a user, when I choose any period time on Pages site and go to the children's page, I want to see all filters from cards reflecting the same period. 


Background: 
	Given a user is logged into Pages content 
	
@TestRun 
Scenario: Asset Card - Last 07 Days
	When a user choose the "Last 07 Days" option on dropdown list 
	And choose any link from Page List  
	Then a user will be redirected to another site and will see, on Asset Card, the same period time from the previous filter. 
	
@TestRun 
Scenario: Localization Card - Last 07 Days
	When a user choose the "Last 07 Days" option on dropdown list 
	And choose any link from Page List  
	Then a user will be redirected to another site and will see, on Localization Card, the same period time from the previous filter.
	
@TestRun 
Scenario: Segments Card - Last 07 Days
	When a user choose the "Last 07 Days" option on dropdown list 
	And choose any link from Page List
	Then a user will be redirected to another site and will see, on Views By Segments Card, the same period time from the previous filter.
	
@TestRun 
Scenario: Visitors Behavior Card - Last 07 Days
	When a user choose the "Last 07 Days" option on dropdown list 
	And choose any link from Page List
	Then a user will be redirected to another site and will see, on Visitors Behavior Card, the same period time from the previous filter.
	
@TestRun 
Scenario: Views By Technology Card - Last 07 Days
	When a user choose the "Last 07 Days" option on dropdown list 
	And choose any link from Page List
	Then a user will be redirected to another site and will see, on Views By Technology Card, the same period time from the previous filter.
	
