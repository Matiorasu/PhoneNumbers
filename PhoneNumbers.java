/*
*Seth Medders 3/2/2020
 */
package phonenumbers;
import javax.swing.*;
import javax.swing.JOptionPane;

public class PhoneNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String[]names = new String [30];
        names[0]="Gina";   names[1]="Marcia";
        names[2]="Gina";   names[3]="Marcia";
        names[4]="Gina";   names[5]="Marcia";
        names[6]="Gina";   names[7]="Marcia";
        names[8]="Gina";   names[9]="Marcia";
        String numbers[] = new String [30];
        numbers[0]= "2568204443";
        numbers[1]= "2568204444";
        numbers[2]= "2568204445";
        numbers[3]= "2568204446";
        numbers[4]= "2568204447";
        numbers[5]= "2568204448";
        numbers[6]= "2568204449";
        numbers[7]= "2568204450";
        numbers[8]= "2568204451";
        numbers[9]= "2568204452";
        
        String entryName, entryPhone;
        int x;
        boolean isFound = false;
        int highest = 10;
        entryName = JOptionPane.showInputDialog(null,
                "Enter name to look up. Type 'quit' to quit.");
        while(highest < 30 && !entryName.equals("quit"))
        {
            for (x = 0; x < highest; ++x)
                if(entryName.equals(names[x]))
                {
                    isFound = true;
                    JOptionPane.showMessageDialog(null,
                            names[x]+ "'s phone number is "+numbers[x]);
                    x = highest;
                }
        
        if(!isFound)
            {
            entryPhone = JOptionPane.showInputDialog(null,
                    "Enter phone number for " +entryName);
            names[highest] = entryName;
            numbers[highest] = entryPhone;
            ++highest;
            }
            entryName = JOptionPane.showInputDialog(null,
                    "Enter name to look up. Type 'quit' to quit.");
            isFound = false;
    }
    } 
}

