Feature: 3 Users
 
 Scenario: Receive email 
 
  Given Send 10 emails to User qatester0217 with .xps attachment to gmail account with 'NW012101user1' subject
  #And Send 10 emails to User qatester77777 with .doc attachment to gmail account with 'NW012101user2' subject
  #And Send 10 emails to User qatester171717 without attachment to gmail account with 'NW012101user3' subject
  #When test id NW012101
  #Then Confrim the message with OK OK OK
  Then Email should be deleted from gmail account for user1