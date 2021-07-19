
package pkg1lista_simple.ejecicio.aseguradora;

import javax.swing.JOptionPane;

public class Aseguradora {

    public static void main(String[] args) {
        
        List safes = new List();
        List pays = new List();
        int code = 100, number;
        String client, type, opt;
        double value, cost;
        String menu[]={"Add safe", "Delete safe", "Pay safe", "Search", "Total","Print",
            "Exit"};
        String mtype[]={"Car", "Home", "Life"};
        
        do{
            opt=(String)JOptionPane.showInputDialog(null,"Selected option", "Main menu",
                    1,null,menu, menu[0]);
            switch(opt)
            {
                case "Add safe":
                    client = JOptionPane.showInputDialog("Enter name");
                    type = (String)JOptionPane.showInputDialog(null,"Selected option", "Type menu",
                        1,null,mtype, mtype[0]);
                    value = Double.parseDouble(JOptionPane.showInputDialog("Enter value"));
                    cost = Double.parseDouble(JOptionPane.showInputDialog("Enter cost"));
                    safes.Add(new Seguro(code, client, type, value, cost));
                    JOptionPane.showMessageDialog(null,"Created safe");
                    code++;
                    break;
                    
                case "Print":
                    JOptionPane.showMessageDialog(null,safes.toString());
                    break;
                    
                case "Delete safe":
                    number=Integer.parseInt(JOptionPane.showInputDialog("Enter code"));
                    Seguro s = safes.Delete(number);
                    if(s!=null)
                        JOptionPane.showMessageDialog(null,"Canceled safe");
                    else
                        JOptionPane.showMessageDialog(null,"Safe not exist");
                    break;
                    
                case "Pay safe":
                    number=Integer.parseInt(JOptionPane.showInputDialog("Enter code"));
                    s = safes.Delete(number);
                    if(s!=null)
                    {
                        pays.AddLast(s);  //lo llevamos a la nueva lista
                        JOptionPane.showMessageDialog(null,"safe paid: " + s.toString());
                        JOptionPane.showMessageDialog(null,pays.toString());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Safe not exist");
                    }
                        break;
                case "Total":
                    type = (String)JOptionPane.showInputDialog(null,"Selected option", "Type menu",
                        1,null,mtype, mtype[0]);
                    JOptionPane.showMessageDialog(null,"Total of " + type + " is: " + safes.Total(type) );
                    break;
                    
                case "Search":
                    client = JOptionPane.showInputDialog("Enter name");
                    JOptionPane.showMessageDialog(null,"The safes are: \n" + safes.Search(client) + 
                            "\n the paid safes are: \n" + pays.Search(client));
                    break;
            }
        }while(!opt.equals("Exit"));
            
        
    }
    
}


   