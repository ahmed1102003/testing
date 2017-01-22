Feature: Access to POP3 page with Incorrect data setup then on click Test button with connection Error result
 
 Scenario: Access to POP3 page with Incorrect data setup then on click Test button with connection Error result

  Given open the URL and login
  When To enable the POP3 protocol with SSL
  And I click on tm20 button
  And wait 1 seconds
  And I click on s42 button
  And wait 1 seconds
  And swtich to parents frame
  And swtich to frame '/html/frameset/frame'
  And swtich to frame '//*[@id="printingjobs"]'
  And wait 1 seconds
  And I click on '//*[@id="wOneTwentyPX"]' with 'Settings'
  And I enter qatester0217@gmail.com in the arg02_pop3U1Address
  And wait 1 seconds
  And I enter pop.gmail.com in the arg03_pop3U1SrvName
  And I enter 110 in the ntxtbox
  And I enter qatester0217@gmail.com in the arg06_pop3U1LoginUserName
  And I enter  in the pop3U1LoginPassword
  And Turn radio arg21_pop3U2Mode to OFF
  And Turn radio arg41_pop3U3Mode to OFF
  And I click on '//*[@id="b100px"]' with 'Submit'
  And wait 5 seconds
  And I click on '//*[@id="b100px"]' with 'Test'
  And wait 15 seconds
  Then get the messages '//*[@id="htValigncenter35px"]/td'
  
  Then the following messages will be displayed
  |Connection Error    (0x15)|
  |POP3 User 2: Protocol off|  
  |POP3 User 3: Protocol off|                                          