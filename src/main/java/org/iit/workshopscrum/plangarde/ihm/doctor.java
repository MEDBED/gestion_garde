package org.iit.workshopscrum.plangarde.ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class doctor extends JFrame {

private static final long serialVersionUID = 1L;
private JButton BtnOK = new JButton("OK");
private JLabel LblNom = new JLabel("*Nom :");
private JLabel LblPrenom = new JLabel("*Prénom :");
private JLabel LblPhone = new JLabel("*Téléphone :");
private JLabel LblMail = new JLabel("*Email :");
private JTextField TxtNom  = new JTextField(35);
private JTextField TxtPrenom  = new JTextField(35);
private JTextField TxtTel  = new JTextField(35);
private JTextField TxtMail  = new JTextField(35);
private JTextArea TxtZone = new JTextArea("Resumé de votre saisie \n",4,8);
private JLabel LblN = new JLabel("*Date début:");
private JLabel LblP = new JLabel("*Date fin :");
private JTextField TxtN = new JTextField(35);
private JTextField TxtP  = new JTextField(35);

       // @SuppressWarnings("deprecation")
		public doctor(){
        	setBackground(Color.GRAY);
            java.awt.Container c = getContentPane();
             c.setLayout(null);
             c.setBackground(Color.gray);
             
           
                this.setTitle("Gardes");
                this.setSize(1000, 1000);
                //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //this.setLocationRelativeTo(null);
                this.setContentPane(c);
                this.setVisible(true);
               
                LblNom.setBounds(new Rectangle(10, 55, 50, 10));
                TxtNom.setBounds(new Rectangle(125, 55, 150, 24));
                
                LblPrenom.setBounds(new Rectangle(10, 90, 85, 10));
                TxtPrenom.setBounds(new Rectangle(125, 90, 200, 24));
                
                LblPhone.setBounds(new Rectangle(10, 160, 125, 10));
                TxtTel.setBounds(new Rectangle(125, 160, 100, 24));
                
                LblMail.setBounds(new Rectangle(10, 195, 125, 10));
                TxtMail.setBounds(new Rectangle(125, 195, 90, 24));
                
                BtnOK.setBounds(new Rectangle(150, 270, 90, 24));
                TxtZone.setBounds(new Rectangle(10, 300, 450, 150));
 
                TxtZone.enable(false);
               
                
                LblN.setBounds(new Rectangle(10, 100, 100, 100));
                TxtN.setBounds(new Rectangle(125, 20, 400, 30));
                
                LblPrenom.setBounds(new Rectangle(10, 90, 85, 10));
                TxtPrenom.setBounds(new Rectangle(125, 90, 200, 24));
                c.add(LblNom);
                c.add(TxtNom);
                c.add(TxtPrenom);
                c.add(LblPrenom);
                c.add(TxtTel);
                c.add(LblPhone);
                c.add(TxtMail);
                c.add(LblMail);
                c.add(BtnOK);
                c.add(TxtZone);                 
                 Ecouteur gest = new Ecouteur();
                 BtnOK.addActionListener(gest);
 
     }// fin du construecteur
      
// classe privéé pour implémenter le clic sur le boution
 
class Ecouteur implements ActionListener
{
  public void actionPerformed (ActionEvent ev)
  {
   String ch =null;
 
   if (ev.getSource()==BtnOK)
   {
      // contrôle de la saisie
       if(TxtNom.getText().isEmpty()==true ||TxtPrenom.getText().isEmpty()==true ||
    	TxtTel.getText().isEmpty()==true ||TxtMail.getText().isEmpty()==true )
       {
           JOptionPane.showMessageDialog(null, "Veuillez renseigner tous les champs obligatoires" ,"Données manquantes",1);
       }
       else
       {
     ch =TxtNom.getText()+" " +TxtPrenom.getText()+" "+TxtTel.getText()+" " +TxtMail.getText();
     TxtZone.append(ch+"\n");
     TxtNom.setText(null);
     TxtPrenom.setText(null);
     TxtTel.setText(null);
     TxtMail.setText(null);

       }// fin else
   }
  }//fin méthode action performed
 
}// classe privée

}// fin de la classe







