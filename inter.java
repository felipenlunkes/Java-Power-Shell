
import java.awt.Cursor; 
import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;
public class inter extends jps implements ActionListener{
JFrame janela = new JFrame();  
    JLabel jlUsuario = new JLabel("Usuário:");  
    JLabel jlSenha = new JLabel("Senha:");  
    JTextField jtUsuario = new JTextField(40);  
    JPasswordField jpSenha = new JPasswordField(40);  
    JButton jbConferir = new JButton("Acessar");  
	    
    public static void inter(){ 
        janela.setTitle("Controle de acesso");
        janela.setSize(530,120);
        janela.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
        janela.getContentPane().add(jlUsuario);  
        janela.getContentPane().add(jtUsuario);
        janela.getContentPane().add(jlSenha);
        janela.getContentPane().add(jpSenha); 
        jbConferir.setCursor(new Cursor(Cursor.HAND_CURSOR));  
        janela.add(jbConferir);
        janela.setLocationRelativeTo(null); 
        janela.setVisible(true);      
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false); 
        jbConferir.addActionListener(this);  
    }  
    public static void main(String[] args) {
        new inter();
    }  
   public void actionPerformed(ActionEvent objeto){
        if (objeto.getSource()==jbConferir){
            String usuario=jtUsuario.getText();  
            String senha=new String (jpSenha.getPassword());
            if ((usuario.equals("kilder"))&&(senha.equals("abc"))) { 
                JOptionPane.showMessageDialog(null,"Usuário e senha aceitos.","Controle de acesso",JOptionPane.INFORMATION_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos","Controle de acesso",JOptionPane.ERROR_MESSAGE);  
                jtUsuario.requestFocus(); 
            }
        }  
         
}
}


 