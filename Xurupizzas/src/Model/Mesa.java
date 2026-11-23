/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author henri
 */
import java.util.ArrayList;


public class Mesa {

    private int numero;
    private ArrayList<String> itens = new ArrayList<>();
    private double total;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public void adicionarItem(String item, double valor) {
        itens.add(item + " - R$ " + valor);
        total += valor;
    }

    public ArrayList<String> getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public void limparMesa() {
        itens.clear();
        total = 0;
    }
}
