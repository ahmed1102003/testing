Feature: From CCRX : POP3 = OFF and ON
 
 Scenario: Receive email 


 #Given Send an email to gmail account with 'NW012001' subject
 When test id NW012001 
 Then Confrim the message with OFF OFF OFF 
# Then check the reslt 
  
  Scenario: Receive email 
 Given Send an email to gmail account with 'NW012002' subject 
 When test id NW012002
 Then Confrim the message with OK OFF OFF
  
   Scenario: Receive email 
 Given Send an email to gmail account with 'NW012005' subject
 When test id NW012005 
 Then Confrim the message with OK OFF OFF
  
   Scenario: Receive email 
 Given Send an email to gmail account with 'NW012006' subject 
 When test id NW012006
  #how to wait until this TC will be done then run the rest as the other may offect this test case  or here i should add other TC like SMTP
 
 Given Send an email to gmail account with 'NW012007' subject
 When test id NW012007
                                            
 Given Send an email to gmail account with 'NW012010' subject 
 When test id NW012010
 # how to read how many mins user added to the sleep mood 
 Then Confrim the message with OK OFF OFF
  
 #Given Send an email to gmail account with 'NW012011' subject 
 #When test id NW012011
 # how to read how many mins user added to the sleep mood 
 #Then Confrim the message with OK OFF OFF
    
 #Given Send an email to gmail account with 'NW012014' subject
 #When test id NW012014
 # how to read how many mins user added to the sleep mood 
 #Then Confrim the message with OK OFF OFF
  

 #Given Send an email to gmail account with 'NW012015a' subject
 When test id NW012015
 # how to read how many mins user added to the sleep mood 
 Then Confrim the message with OK OFF OFF