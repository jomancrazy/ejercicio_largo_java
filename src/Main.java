// * 1. Todos las importaciones que hacemos para poder usarlas dentro del codigo
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ? 2. Creacion de objetos para poder usarlos posteriormente
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Random random = new Random();

        // ? 3. Todas las variables que vamos a usar
        Integer opcion, numero1, numero2, operacion, contador = 0;
        String respuesta, respuestaLista;

        // ? 4.Creacion de la lista en donde estaran las respuestas de las adivinanzas
        List<String> listaAdivinanzas = new ArrayList<>();

        // ? 5. Agregar elementos a la lista
        listaAdivinanzas.add("paraguas");
        listaAdivinanzas.add("ajo");
        listaAdivinanzas.add("periodico");

        // ? 6. Numero random
        int aleatorio = random.nextInt(3) + 1;

        // ? 7. Imprimira por pantalla las opciones que hay
        System.out.println("Escoja la opcion que desea:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Adivinar la adivinanza");
        opcion = entrada.nextInt();

        // ? 8. Creacion de switch en donde iran las opciones
        switch (opcion) {
            case 1:
                // ? 9. Pide dos numeros para poder sumarlos
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero a sumar: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero a sumar: "));

                // ? 10. Hace la suma de los dos numeros que se ingresaron y luego los imprime en un cuadro flotante y sale del switch
                operacion = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"La suma de sus dos numeros es de " + operacion);
                break;

            case 2:
                // ? 11. Pide dos numeros para poder restarlos
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a restar: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero a restar: "));

                // ? 12. Hace la resta de los numeros que se ingresaron y luego las imprime en un cuadro flotante y luego sale del switch
                operacion = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La resta de sus dos numeros es de " + operacion);
                break;

            case 3:
                // ? 13. Pide dos numeros para poder multiplicarlos
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a multiplicar: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero a multiplicar: "));

                // ? 14. Hace la multiplicacion de los numeros que se ingresaron y luego los imprime en un cuadro flotante y luego sale del switch
                operacion = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La multiplicacion de sus dos numeros es de " + operacion);
                break;

            case 4:
                // ? 15. Inicia otro switch en donde escoje cualquier numero rando de 1 a 3
                switch (aleatorio) {
                    case 1:
                        // ? 16. Obtiene el primer valor de la lista de adivinanzas que es la respuesta de la misma
                        respuestaLista = listaAdivinanzas.get(0);

                        // ? 17. Hace un ciclo que se termina cuando adivina la adivinanza o pierda las 3 oportunidades que tiene
                        do {
                            // ? 18. Imprime la primer adivinanza y lee la respuesta
                            System.out.println("Siempre va de arriba abajo, pero nunca se moja ¿Que es?");
                            respuesta = entrada2.nextLine();

                            // ? 19. Condicion que hace que termine el ciclo porque adivino la respuesta
                            if(respuesta.equals(respuestaLista)) {
                                System.out.println("Adivino la respuesta de la adivinanza");
                                break;
                            }
                            // ? 20. EL contador empieza a contar y lo imprime en pantalla
                            else {
                                contador++;
                                System.out.println("Lleva " + contador + " intentos");

                                // ? 21. Condicion que dice que si el contador llega a 3 sale del ciclo y el jugador perdio
                                if(contador == 3) {
                                    System.out.println("Se le agotaron las oportunidades");
                                    break;
                                }
                            }
                        // ? 22. Condicion del ciclo que hara que se repita mientras el jugador no adivine
                        }while (!respuesta.equals(respuestaLista));
                        break;

                    case 2:
                        // ? 23. Obtiene el segundo valor de la lista
                        respuestaLista = listaAdivinanzas.get(1);

                        // ? 24. Hace el ciclo para adivinar la respuesta
                        do {
                            System.out.println("Tiene dientes y no come, tiene cabeza y no piensa ¿Que es?");
                            respuesta = entrada2.nextLine();

                            // ? 25. Condicion si se adivina la respuesta se sale del ciclo
                            if(respuesta.equals(respuestaLista)) {
                                System.out.println("Adivino la adivinanza!!");
                                break;
                            }
                            // ? 26. Si no se adivina la respuesta se suma uno al contador hasta llegar a 3 intentos y salir del ciclo
                            else {
                                contador++;
                                System.out.println("Lleva " + contador + " intentos");

                                if(contador == 3){
                                    System.out.println("Se le agotaron las oportunidades");
                                    break;
                                }
                            }
                        }while (!respuesta.equals(respuestaLista));
                        break;

                    case 3:
                        // ? 27. Obtiene el valor del tercer item de la lista
                        respuestaLista = listaAdivinanzas.get(2);

                        // ? 28. Ciclo que inicia para que el jugador adivine
                        do {
                            // ? 29. Obtiene la respuesta del jugador
                            System.out.println("Tiene hojas pero no es una arbol, tiene paginas pero no es un libro ¿Que es?");
                            respuesta = entrada2.nextLine();

                            // ? 30. Condicion si adivina el jugador sale del ciclo
                            if(respuesta.equals(respuestaLista)) {
                                System.out.println("Adivino la adivinanza!!!");
                                break;
                            }
                            // ? 31. Si no adivina se suma uno al contdor y si llega a 3 sale del ciclo
                            else {
                                contador++;
                                System.out.println("Lleva " + contador + " intentos");

                                if(contador == 3) {
                                    System.out.println("Se le agotaron las oportunidades");
                                }
                            }
                        } while (!respuesta.equals(respuestaLista));
                        break;
                }
                break;
         }

        }
    }