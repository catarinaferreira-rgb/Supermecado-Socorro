package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import View.*;


public class TelaLogin extends JFrame {


    public TelaLogin() {


        setTitle("Login do Operador");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(173, 216, 230));
        JLabel lblTitulo = new JLabel("Mercadinho Socorro", SwingConstants.CENTER);
        lblTitulo.setBounds(100, 50, 420, 60);
        lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        lblTitulo.setForeground(new Color(255, 174, 201)); // Rosa bebê
        add(lblTitulo);


        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(200, 140, 80, 25);
        add(lblUsuario);


        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(280, 140, 180, 25);


        Color rosa = new Color(255, 182, 193);

        txtUsuario.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(rosa, 2, true),
                BorderFactory.createEmptyBorder(5, 8, 5, 8)
        ));



        add(txtUsuario);


        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(200, 180, 80, 25);
        add(lblSenha);


        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(280, 180, 180, 25);


        txtSenha.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(rosa, 2, true),
                BorderFactory.createEmptyBorder(5, 8, 5, 8)
        ));

        add(txtSenha);


        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(290, 230, 100, 35);
        add(btnEntrar);


        btnEntrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


                String usuario = txtUsuario.getText();
                String senha = String.valueOf(txtSenha.getPassword());


                if(usuario.equals("Cath") && senha.equals("123")) {


                    JOptionPane.showMessageDialog(null,
                            "Login realizado com sucesso!");


                    dispose();
                    new TelaPdv();


                } else {


                    JOptionPane.showMessageDialog(null,
                            "Usuário ou senha inválidos!");


                }
            }
        });


        setLocationRelativeTo(null);
        setVisible(true);
    }
}
