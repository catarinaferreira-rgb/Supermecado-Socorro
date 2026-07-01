package controller;


import model.ItemVenda;


public class VendaController{


    private VendaController vendaAtual;


    public  VendaController() {
        vendaAtual = new VendaController();
    }


    public VendaController getVendaAtual() {
        return vendaAtual;
    }


    public double calcularTotal() {
        return vendaAtual.calcularTotal();
    }


    public void limparVenda() {
        vendaAtual.limparVenda();
    }
}
