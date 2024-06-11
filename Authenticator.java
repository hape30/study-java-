import javax.swing.JOptionPane;

public class Authenticator {
    public static void main(String[] args) {
        
        String username = 
                JOptionPane.showInputDialog("Name user ");
        String password = 
                JOptionPane.showInputDialog("Password");
        
        if (!(username == null || password == null)) {
            if ((username.equals("burd") && password.equals("swordfish")) ||
                (username.equals("hritter") && password.equals("preakston"))) {
                JOptionPane.showMessageDialog(null, "Welcome");
            } else {
                JOptionPane.showMessageDialog(null, "Password is incorrect"); 
            }
        }
    }
}