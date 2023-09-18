package mapa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapaTest {
    private Mapa mapa;

    @BeforeEach
    void setUp() {
        mapa = new Mapa();
    }

    @Test
    void testPutAndGet() {
        mapa.put("chave1", "chave1");
        assertEquals("chave1", mapa.get("chave1"));
    }

    @Test
    void testPutDuplicateKey() {
        mapa.put("chave1", "valor1");
        mapa.put("chave2", "valor2");
        assertEquals("valor2", mapa.get("chave1"));
    }


    @Test
    void testRemove() {
        mapa.put("chave1", "valor1");
        String removedValue = mapa.remove("chave1");
        assertNull(mapa.get("chave1"));
        assertEquals("valor1", removedValue);
    }


    @Test
    void testSize() {
        mapa.put("chave1", "valor1");
        mapa.put("chave2", "valor2");
        assertEquals(2, mapa.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(mapa.isEmpty());
        mapa.put("chave1", "valor1");
        assertFalse(mapa.isEmpty());
    }
}
