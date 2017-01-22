Feature: Daliy
 
 Scenario: Setup Security Setttings with SSL3.0TLS1.0 with all and SHA1 then click Receive button with connection ok result

  Given open the URL and login
  When To enable the POP3 protocol with SSL
And here is the steps for Navaigate to Email pop3 then add valid data for POP3 user
  And Go out from POP3 page and back to EMail page and click on Recevie button
  Then get the messages '//*[@id="htValigncenter35px"]/td'
  Then the following messages will be displayed
  |POP3 User 1: Connection Error|
  |POP3 User 2: Protocol off|  
  |POP3 User 3: Protocol off|                                 