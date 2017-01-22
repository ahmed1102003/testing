 Feature: Xmail Server
 
 Scenario: Receive email 
 
  Given Send an emails to User qatester0217 with JPEG JPG JPE JFIF TXT PRN PDF PS TIFF TIF XPS OXPS PDF attachment to gmail account with 'NW012-087' subject
  When test id NW012087
  Then Confrim the message with OK OFF OFF