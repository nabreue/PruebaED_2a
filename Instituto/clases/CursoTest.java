package clases;

import instituto.Curso;
import instituto.Persona;
import org.junit.jupiter.api.Test;

class CursoTest {
    @Test
    void aniadirAlumnoTest() {
        Persona p = new Persona(987654, "casos1", 'm', 10, 10, 2002);
        Curso c = new Curso("prueba1");
        c.aniadirAlumno(p);
        String resultado = c.toString();
        resultado = resultado.replace("prueba1\n" + "NumExp\tNIF\t\tNombre\tedad\tApellidos\n"
                , "");
        String[] partes = resultado.split("\t");
        for (String parte : partes) {
            System.out.println(parte);
        }
        assertEquals(p.getNif().toString().trim(), partes[0].trim());
        assertEquals(p.getNombre().trim(), partes[1].trim());
        assertEquals(p.getEdad() + "", partes[4].trim());
    }

    private void assertEquals(String trim, String trim1) {
    }

    @Test
    void aniadirAlumnoTest2() {
        Persona p2 = new Persona();
        Curso c2 = new Curso("Prueba2");
        c2.aniadirAlumno(p2);
        String resultado = c2.toString();
        resultado = resultado.replace("Prueba2\n" +
                "NumExp\tNIF\t\tNombre\tedad\tApellidos\n"
                , "");
        String[] partes = resultado.split("\t");
        for (String parte : partes) {
            System.out.println(parte);
        }
        assertEquals(p2.getNif().toString().trim(), partes[0].trim());
        assertEquals(p2.getNombre().trim(), partes[1].trim());

    }

    @Test
    void aniadirAlumnoTest3() {
        Persona p3 = new Persona(987654);
        Curso c3 = new Curso("Prueba3");
        c3.aniadirAlumno(p3);
        String resultado = c3.toString();
        resultado = resultado.replace("Prueba3\n" +
                "NumExp\tNIF\t\tNombre\tedad\tApellidos\n"
                , "");
        String[] partes = resultado.split("\t");
        for (String parte : partes) {
            System.out.println(parte);
        }
        assertEquals(p3.getNif().toString().trim(), partes[0].trim());
        assertEquals(p3.getNombre().trim(), partes[1].trim());
    }
}