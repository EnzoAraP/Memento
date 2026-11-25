package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnimalTest {

    @Test
    void deveArmazenarEstadosDoAnimal() {
        Gir gir = new Gir();
        gir.setDono("Ana");
        gir.setPreco(10000);
        gir.salvarEstado();

        gir.setDono("Bruno");
        gir.salvarEstado();

        assertEquals(2, gir.getEstados().size());
    }

    @Test
    void deveRestaurarEstadoAnteriorDoGir() {
        Gir gir = new Gir();
        gir.setDono("Ana");
        gir.setPreco(10000);
        gir.setRGN("GIR-001");
        gir.setProducaoLeiteMes(500);
        gir.salvarEstado();

        gir.setDono("Bruno");
        gir.setPreco(20000);
        gir.setRGN("GIR-002");
        gir.setProducaoLeiteMes(650);
        gir.restaurarEstado(0);

        assertEquals("Ana", gir.getDono());
        assertEquals(10000.0, gir.getPreco(), 0.0);
        assertEquals("GIR-001", gir.getRGN());
        assertEquals(500, gir.getProducaoLeiteMes());
    }

    @Test
    void deveRestaurarAtributoEspecificoDoNelore() {
        Nelore nelore = new Nelore();
        nelore.setDono("Carlos");
        nelore.setPeso(450);
        nelore.setPreco(450 * 148.0);
        nelore.salvarEstado();

        nelore.setPeso(520);
        nelore.restaurarEstado(0);

        assertEquals(450, nelore.getPeso());
    }

    @Test
    void deveLancarExcecaoParaIndiceInvalido() {
        Gir gir = new Gir();

        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> gir.restaurarEstado(0)
        );

        assertEquals("Índice inválido", excecao.getMessage());
    }
}
