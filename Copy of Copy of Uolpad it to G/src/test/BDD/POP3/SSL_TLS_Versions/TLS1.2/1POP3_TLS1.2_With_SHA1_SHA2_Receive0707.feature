Feature: Daliy
 
 Scenario: POP3_TLS1.2_With_SHA1_SHA2_Receive0707

  Given open the URL and login
  When click on Initialize button to rest the setting for the Printer
  #here is the steps for navigate to Security Setting then check all the checkbox
  And I click on tm40 button
  And wait 1 seconds
  And I click on s62 button
  And wait 1 seconds
  And swtich to parents frame
  And swtich to frame '/html/frameset/frame'
  And swtich to frame '//*[@id="printingjobs"]'
  And wait 5 seconds
  And I click on '//*[@id="ClientTlsVersion0"]' with '0'
  And I click on '//*[@id="ClientTlsVersion2"]' with '2'
  And I click on '//*[@id="CTLHash1"]' with '1'
  And I click on '//*[@id="CTLEncrypt4"]' with '4'
  And wait 7 seconds
  And I click on '//*[@id="b100px"]' with 'submit'
  And wait 3 seconds
  And swtich to parents frame
 And here is the steps for Navaigate to Email pop3 then add valid data for POP3 user
  And Go out from POP3 page and back to EMail page and click on Recevie button
   Then get the messages '//*[@id="htValigncenter35px"]/td'
  Then the following messages will be displayed
  |POP3 User 1: OK|
  |POP3 User 2: Protocol off|  
  |POP3 User 3: Protocol off|                                 