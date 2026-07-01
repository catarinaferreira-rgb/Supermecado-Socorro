package View;


import controller.VendaController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class TelaPdv extends JFrame {
    public static ArrayList<String> produtos = new ArrayList<>();


    public TelaPdv() {


        setTitle("SISTEMA DE VENDAS");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);


        JPanel painelProduto = new JPanel();
        painelProduto.setLayout(new GridLayout(4, 2, 5, 5));
        painelProduto.setBorder(BorderFactory.createTitledBorder("Produto"));
        painelProduto.setBounds(40, 20, 300, 150);


        painelProduto.add(new JLabel("Código:"));
        JTextField txtCodigo = new JTextField();
        painelProduto.add(txtCodigo);


        painelProduto.add(new JLabel("Nome:"));
        JTextField txtNome = new JTextField();
        painelProduto.add(txtNome);


        painelProduto.add(new JLabel("Preço:"));
        JTextField txtPreco = new JTextField();
        painelProduto.add(txtPreco);


        painelProduto.add(new JLabel("Estoque:"));
        JTextField txtEstoque = new JTextField();
        painelProduto.add(txtEstoque);


        add(painelProduto);




        JPanel painelVenda = new JPanel();
        painelVenda.setLayout(new GridLayout(3, 2, 5, 5));
        painelVenda.setBorder(BorderFactory.createTitledBorder("Venda"));
        painelVenda.setBounds(20, 190, 300, 120);


        JButton btnVendaTela = new JButton("Vendas");
        btnVendaTela.setBounds(300, 330, 130, 40);
        add(btnVendaTela);


        btnVendaTela.addActionListener(e -> {
            new VendaController();
            dispose();
        });
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(300, 280, 130, 40);
        add(btnSalvar);
        btnSalvar.addActionListener(e -> {


            if (txtCodigo.getText().trim().isEmpty() ||
                    txtNome.getText().trim().isEmpty() ||
                    txtPreco.getText().trim().isEmpty() ||
                    txtEstoque.getText().trim().isEmpty()) {


                JOptionPane.showMessageDialog(this,
                        "Preencha todos os campos!",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }


            String dados = txtCodigo.getText() + " - "
                    + txtNome.getText() + " - "
                    + txtPreco.getText() + " - "
                    + txtEstoque.getText();


            produtos.add(dados);


            JOptionPane.showMessageDialog(this,
                    "Produto salvo com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);


            txtCodigo.setText("");
            txtNome.setText("");
            txtPreco.setText("");
            txtEstoque.setText("");
        });
        setVisible(true);
        setVisible(true);
    }


    public static void main(String[] args) {
        new TelaPdv ();


    }
}
