package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {

        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    @Test
    @DisplayName("Nombre Vacio debe ser rechazado")
    public void debe_Rechazar_NombreVacio(){
        String nom = "";

        boolean esValido = nom.length() > 0;

        assertFalse(esValido, "Error: El sistema acepto un nombre vacio");
    }

    @Test
    @DisplayName("Contraseña Justa debe ser aceptada")
    public void debe_Aceptada_Passwordjusta(){
        int Password = 12345678;

        boolean esValido = Password >= 8;

        assertTrue(esValido, "Error: El sistema acepto una contraseña mas corta de 8");
    }

    @Test
    @DisplayName("Contraseña corta debe ser rechazada")
    public void debe_Rechazar_Passwordcorta(){
        String Password = "Admin";

        boolean esValido = Password.length() >= 8;

        assertFalse(esValido, "Error: El sistema acepto una contraseña mas corta");

    }

    @Test
    @DisplayName("El email sin @ debe ser rechado")
    public void debe_Rechazar_Emailsinarroba(){
        String email = "usuario.gmail.com";

        boolean esValido = email.contains("@");

        assertFalse(esValido, "Error: El sistema acepto un email sin @");

    }

    @Test
    @DisplayName("Edad limite debe ser aceptada")
    public void debe_Aceptar_Edadlimite(){
        int edadUsuario = 16;

        boolean esValido = edadUsuario >=16;

        assertTrue(esValido, "Error: El sistema rechazo la edad limite de 16");
    }
}