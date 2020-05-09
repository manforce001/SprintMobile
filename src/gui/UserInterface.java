/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Entite.User;
import com.codename1.components.SpanLabel;
import com.codename1.ui.Button;
import static com.codename1.ui.CN.CENTER;
import com.codename1.ui.Command;
import static com.codename1.ui.Component.LEFT;
import static com.codename1.ui.Component.RIGHT;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import service.ServiceUser;

/**
 *
 * @author Nasri
 */
public class UserInterface {

    Form f;
    SpanLabel lb;
    Command cmd1, cmd2, cmd3, cmdBack, cmdExit,cmd4,cmd5;
    Label erreur ; 
    User user ; 
   private Resources theme;


  
    public UserInterface(User user) 
    {
        this.user= user; 
         TextField login = new TextField("USERNAME", "Login", 20, TextField.EMAILADDR) ;
         f=new Form(); 
         f.add(login); 
         cmd4 = new Command("");
      
       Container a = new Container(); 
       
       
              
        f.getToolbar().addCommandToSideMenu(cmd4);
        f.getToolbar().addCommandToSideMenu(cmd4);
        f.getToolbar().addCommandToSideMenu(cmd4);
        f.getToolbar().addCommandToSideMenu(cmd4);

          theme = UIManager.initFirstTheme("/theme");


        f.getToolbar().addCommandToSideMenu("modifier profil", null,
        e->{
            
           EditProfil edit = new EditProfil(user); 
           edit.getF().show();
            System.err.println("test valider");
        });
        f.getToolbar().addCommandToSideMenu("envoyez une réclamation", null,
        e->{
            
          
            System.err.println("test valider");
        });
        
        f.getToolbar().addCommandToSideMenu("déconnexion", null,
        e->{
            
            HomePage H = new HomePage(theme); 
            H.getF().show();
            System.err.println("test valider");
        });
        
        
      
        
    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }
}