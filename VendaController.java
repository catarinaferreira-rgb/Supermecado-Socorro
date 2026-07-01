package controller;



import Service.Caixa;
import javax.swing.*;
import java.awt.*;




public class Venda extends JFrame {




    public Venda() {




        setTitle("VENDAS");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);




        JLabel lbl = new JLabel("TELA VENDAS");
        lbl.setBounds(180, 20, 200, 30);
        add(lbl);




        // PAINEL
        JPanel painelvendavisu = new JPanel();
        painelvendavisu.setLayout(new GridLayout(3, 2, 5, 5));
        painelvendavisu.setBorder(BorderFactory.createTitledBorder("Venda"));
        painelvendavisu.setBounds(20, 70, 440, 150);




        painelvendavisu.add(new JLabel("Código Produto:"));
        JTextField txtCodVenda = new JTextField();
        painelvendavisu.add(txtCodVenda);




        painelvendavisu.add(new JLabel("Quantidade:"));
        JTextField txtQuantidade = new JTextField();
        painelvendavisu.add(txtQuantidade);




        JButton btnAdicionar = new JButton("Adicionar");
        painelvendavisu.add(btnAdicionar);




        add(painelvendavisu);




        // BOTÕES
        JButton btnNovaVenda = new JButton("Nova Venda");
        btnNovaVenda.setBounds(20, 250, 130, 40);
        add(btnNovaVenda);




        JButton btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setBounds(170, 250, 130, 40);
        add(btnFinalizar);




        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(320, 250, 130, 40);
        add(btnCancelar);




        JButton btnFinanceiro = new JButton("Financeiro");
        btnFinanceiro.setBounds(170, 310, 130, 40);
        add(btnFinanceiro);




        JButton btnVendaTela = new JButton("Voltar PDV");
        btnVendaTela.setBounds(20, 310, 130, 40);
        add(btnVendaTela);




        // AÇÃO DO BOTÃO ADICIONAR
        btnAdicionar.addActionListener(e -> {




            String codigo = txtCodVenda.getText();
            String quantidade = txtQuantidade.getText();




            boolean encontrou = false;




            for (String produto : Venda.produto) {




                if (produto.startsWith(codigo + " -")) {




                    JOptionPane.showMessageDialog(this,
                            "Produto encontrado!\n\n"
                                    + produto
                                    + "\nQuantidade: " + quantidade);




                    encontrou = true;
                    break;
                }
            }




            if (!encontrou) {
                JOptionPane.showMessageDialog(this, "Produto não encontrado!");
            }




        });




        btnNovaVenda.addActionListener(e -> {
            txtCodVenda.setText("");
            txtQuantidade.setText("");
            JOptionPane.showMessageDialog(this, "Nova venda iniciada!");
        });




        btnFinalizar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Venda finalizada!");
        });




        btnCancelar.addActionListener(e -> {
            txtCodVenda.setText("");
            txtQuantidade.setText("");
            JOptionPane.showMessageDialog(this, "Venda cancelada!");
        });




        btnVendaTela.addActionListener(e -> {
            new TelaPdv();
            dispose();
        });




        btnFinanceiro.addActionListener(e -> {
            new Caixa();
        });




        setVisible(true);
    }
}
