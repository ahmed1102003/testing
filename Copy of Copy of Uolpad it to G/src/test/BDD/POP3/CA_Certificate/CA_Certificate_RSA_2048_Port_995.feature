Feature: CA_Certificate_RSA_2048_Port_995
 
 Scenario: Receive email 
 
  Given Send an emails to User qatester0217 with JPEG JPG JPE JFIF TXT PRN PDF PS TIFF TIF XPS OXPS PDF attachment to gmail account with 'NW012-104' subject
  When test id NW012102
  Then Confrim the message with OK OFF OFF