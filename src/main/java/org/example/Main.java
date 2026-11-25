package org.example;

public class Main {
    public static void main(String[] args) {
        Gir gir = new Gir();
        gir.setRGN("GIR-001");
        gir.setDono("Ana");
        gir.setProducaoLeiteMes(500);
        gir.setPreco(10000);
        gir.salvarEstado();

        gir.setDono("Bruno");
        gir.setProducaoLeiteMes(650);
        gir.venderConsumo();
        gir.salvarEstado();

        System.out.println(gir.getDono() + " - R$ " + gir.getPreco());

        gir.restaurarEstado(0);
        System.out.println(gir.getDono() + " - R$ " + gir.getPreco());
    }
}
