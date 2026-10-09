package Resumen;


public class ResumenAlgoritmos {

    // ============================================================
    // 1. NOTACIÓN O: COMPLEJIDAD COMPUTACIONAL
    // ============================================================

    // La complejidad mide cómo crece el trabajo de un algoritmo
    // cuando aumenta el tamaño de la entrada, normalmente N.
    // O(f(N)) describe una cota superior asintótica del crecimiento.
    // Nos centramos en el término dominante e ignoramos constantes.
    // O(3N + 5) = O(N).
    // O(N^2 + 4N + 2) = O(N^2).
    // O(5N^3 + 2N^2) = O(N^3).

    // COMPLEJIDADES DE MENOR A MAYOR CRECIMIENTO:
    // O(1)       -> constante.
    // O(log N)   -> logarítmica.
    // O(N)       -> lineal.
    // O(N log N) -> lineal-logarítmica.
    // O(N^2)     -> cuadrática.
    // O(N^3)     -> cúbica.
    // O(2^N)     -> exponencial.
    // O(N!)      -> factorial.

    // O(1): el número de operaciones no depende del tamaño de N.
    // Ejemplo: acceder a un elemento de un array mediante su índice.

    // O(log N): el problema se reduce por un factor constante
    // en cada paso, por ejemplo, a la mitad.
    // Ejemplo: búsqueda binaria.

    // O(N): se procesa cada elemento un número constante de veces.
    // Ejemplo: recorrer un array completo.

    // O(N log N): se hacen aproximadamente log N niveles o iteraciones
    // de trabajo lineal.
    // Ejemplo: Merge sort.

    // O(N^2): aparecen dos recorridos lineales anidados o
    // dos bucles cuyo trabajo total es cuadrático.
    // Ejemplo: Bubble sort e Insertion sort en el peor caso.

    // O(2^N): cada llamada puede generar dos nuevas llamadas
    // con un problema ligeramente menor.
    // Ejemplo: metodoRaro(n) que llama dos veces a metodoRaro(n-1).

    // IMPORTANTE:
    // No confundas el tiempo de ejecución con el espacio utilizado.
    // Complejidad temporal = trabajo que realiza el algoritmo.
    // Complejidad espacial = memoria adicional que necesita.
    // Si hay recursividad, hay que considerar la pila de llamadas.


    // ============================================================
    // 2. CÓMO ANALIZAR BUCLES
    // ============================================================

    // Un bucle que se ejecuta N veces suele ser O(N).
    // Dos bucles consecutivos O(N) + O(N) = O(N).
    // Dos bucles anidados O(N) * O(N) = O(N^2).
    // Tres bucles anidados O(N^3), si cada uno recorre N elementos.
    // Si un bucle es O(N^2) y otro posterior es O(N),
    // la complejidad total es O(N^2), no O(N^3).
    // Se suman los trabajos de bloques consecutivos y domina
    // el término de mayor crecimiento.

    // BUCLES ANIDADOS CON EL SEGUNDO DEPENDIENTE DEL PRIMERO:
    // for (int i = 0; i < N; i++)
    //     for (int j = 0; j < i; j++)
    //         contador++;
    //
    // El bucle interior se ejecuta 0, 1, 2, ..., N-1 veces.
    // Total = 0 + 1 + 2 + ... + (N-1).
    // Total = N*(N-1)/2.
    // Complejidad: O(N^2).

    // OTRO BUCLE TRIANGULAR:
    // for (int i = 0; i < N; i++)
    //     for (int j = i; j < N; j++)
    //         contador++;
    //
    // Las iteraciones interiores son N, N-1, ..., 1.
    // Total = N + (N-1) + ... + 1.
    // Total = N*(N+1)/2.
    // Complejidad: O(N^2).

    // BUCLE LOGARITMICO:
    // for (int j = 1; j < N; j *= 2)
    //
    // j toma los valores 1, 2, 4, 8, 16, ...
    // Tras k iteraciones, j = 2^k.
    // El bucle termina cuando 2^k alcanza N.
    // Por tanto, k es aproximadamente log2(N).
    // Complejidad: O(log N).

    // BUCLE LINEAL CON UNO LOGARITMICO ANIDADO:
    // for (int i = 0; i < N; i++)
    //     for (int j = 1; j < N; j *= 2)
    //         contador++;
    //
    // El exterior se ejecuta N veces.
    // El interior se ejecuta aproximadamente log2(N) veces.
    // Total aproximado = N * log2(N).
    // Complejidad: O(N log N).

    // BUCLE DECRECIENTE:
    // for (int i = N; i > 0; i--)
    // Se ejecuta N veces: O(N).

    // CUIDADO CON LOS INDICES:
    // j < N implica que N no se incluye.
    // j <= N implica que N si se incluye.
    // Para calcular el número exacto de iteraciones, escribe
    // los valores que toma el índice antes de aplicar una fórmula.


    // ============================================================
    // 3. MEJOR CASO, PEOR CASO Y CASO MEDIO
    // ============================================================

    // MEJOR CASO: la entrada provoca el menor trabajo posible.
    // PEOR CASO: la entrada provoca el mayor trabajo posible.
    // CASO MEDIO: trabajo esperado para una distribución de entradas.
    // No siempre se pide analizar los tres casos.

    // Ejemplo: buscar un valor en un array sin ordenar.
    // Mejor caso: esta en la primera posición -> O(1).
    // Peor caso: esta al final o no existe -> O(N).

    // Para algoritmos de ordenación, el orden inicial del array
    // puede cambiar mucho el numero de operaciones.

    // IMPORTANTE:
    // O(N^2) en el peor caso no significa que siempre tarde N^2.
    // Puede existir un mejor caso O(N), como en Insertion sort.


    // ============================================================
    // 4. RECURSIVIDAD
    // ============================================================

    // Un método recursivo se llama a sí mismo.
    // Debe tener un caso base que permita detener las llamadas.
    // El caso recursivo reduce el problema y llama al método.
    // Si no se alcanza el caso base, puede producirse un
    // desbordamiento de la pila (StackOverflowError).

    // ESQUEMA GENERAL:
    // static int ejemplo(int n) {
    //     if (casoBase) return resultadoBase;
    //     return operación + ejemplo(problemaMasPequeno);
    // }

    // Para analizar una recursividad:
    // 1. Identificar el caso base.
    // 2. Contar las llamadas recursivas que se hacen por llamada.
    // 3. Analizar cuánto se reduce el problema en cada llamada.
    // 4. Contar el trabajo adicional de cada llamada.
    // 5. Analizar la profundidad y el número total de llamadas.

    // UNA LLAMADA RECURSIVA POR NIVEL:
    // ejemplo(n) llama a ejemplo(n-1).
    // Hay aproximadamente N niveles.
    // Si cada nivel hace trabajo O(1), el tiempo es O(N).
    // La pila de llamadas ocupa O(N).

    // DOS LLAMADAS RECURSIVAS POR NIVEL:
    // metodoRaro(n) llama dos veces a metodoRaro(n-1).
    // T(n) = 2*T(n-1) + O(1).
    // El número de llamadas crece exponencialmente.
    // Complejidad temporal: O(2^N).
    // Profundidad de la pila: O(N).
    // Para n = 3, el número total de llamadas es 15,
    // contando las llamadas que alcanzan n <= 0.

    // IMPORTANTE:
    // Dos llamadas recursivas no implican siempre O(2^N).
    // Depende de como cambie el tamaño del problema.
    // Si cada llamada divide el problema por la mitad y solo
    // hace una llamada recursiva, puede ser O(log N).


    // ============================================================
    // 5. RECURSIVIDAD SOBRE ÁRBOLES
    // ============================================================

    // Un árbol contiene nodos que pueden tener hijos.
    // La raíz es el nodo inicial.
    // Las hojas son los nodos que no tienen hijos.
    // Un árbol N-ario permite varios hijos por nodo.
    // Un árbol binario permite como máximo dos hijos.
    // En un árbol, los hijos pueden ser procesados recursivamente.

    // PATRÓN PARA SUMAR UNA PROPIEDAD DE TODOS LOS NODOS:
    // 1. Definir que aporta el nodo actual.
    // 2. Recorrer los hijos.
    // 3. Sumar la aportación de cada llamada recursiva.
    //
    // Ejemplos:
    // Sumar salarios de un organigrama.
    // Sumar el peso de archivos en una carpeta.
    // Sumar el coste de habilidades de un árbol.

    // PATRÓN PARA CONTAR NODOS:
    // Si el nodo es null, devolver 0.
    // Si no, devolver 1 + número de nodos de sus subárboles.
    // Si hay N nodos y cada uno se procesa una sola vez,
    // la complejidad temporal es O(N).

    // PATRÓN PARA BUSCAR UNA CONDICION:
    // Comprobar primero el nodo actual.
    // Si ya se cumple la condición, devolver true.
    // Si no, buscar recursivamente en los hijos.
    // Si ningún nodo cumple la condición, devolver false.
    // Ejemplo: comprobar si existe una pieza defectuosa.
    // Con cortocircuito, la búsqueda puede terminar antes.
    // En el peor caso, se visitan todos los nodos: O(N).

    // PATRÓN PARA CONTAR COINCIDENCIAS:
    // Comprobar si el nodo actual coincide con el objetivo.
    // Sumar 1 si coincide y 0 si no.
    // Sumar después las coincidencias de los hijos.
    // Complejidad si se visita todo el árbol: O(N).

    // ALTURA DE UN ÁRBOL:
    // La altura se calcula como 1 + max(altura izquierda,
    // altura derecha), tomando como altura del arbol vacío 0.
    // Si el método devuelve 1 + Math.max(izq, der),
    // calcula el número de nodos del camino más largo
    // desde el nodo actual hasta una hoja.
    // Su complejidad temporal es O(N), porque visita cada nodo.
    // Su espacio de pila es O(H), siendo H la altura.

    // ÁRBOL BALANCEADO: H suele ser O(log N).
    // ÁRBOL DEGENERADO: H puede ser O(N).
    // En el peor caso, la recursividad sobre el árbol puede
    // necesitar una pila de profundidad O(N).


    // ============================================================
    // 6. BÚSQUEDA LINEAL Y BÚSQUEDA BINARIA
    // ============================================================

    // BÚSQUEDA LINEAL:
    // Examina los elementos uno por uno hasta encontrar el valor.
    // No necesita que el array esté ordenado.
    // Mejor caso: O(1).
    // Peor caso: O(N).
    // Se usa cuando el array no está ordenado o es pequeño.

    // BÚSQUEDA BINARIA:
    // Necesita que el array esté ordenado.
    // Calcula el elemento central.
    // Si coincide con el buscado, devuelve su índice.
    // Si el buscado es menor, continúa por la mitad izquierda.
    // Si es mayor, continúa por la mitad derecha.
    // Si no quedan elementos, devuelve -1.
    //
    // Cada llamada reduce el problema aproximadamente a la mitad.
    // T(N) = T(N/2) + O(1).
    // Mejor caso: O(1), si el elemento está en el centro inicial.
    // Peor caso: O(log N).
    // Espacio adicional de la versión iterativa: O(1).
    // Espacio de pila de la versión recursiva: O(log N).

    // Si el array no está ordenado, la búsqueda binaria
    // puede descartar la mitad que contiene el valor.
    // Por ello, puede devolver -1 aunque el valor exista.

    // CÁLCULO DEL MEDIO:
    // medio = inicio + (fin - inicio) / 2.
    // Esta formula evita posibles desbordamientos que puede
    // provocar (inicio + fin) / 2 con índices muy grandes.


    // ============================================================
    // 7. INSERTION SORT (ORDENACIÓN POR INSERCIÓN)
    // ============================================================

    // Divide conceptualmente el array en una parte ordenada
    // a la izquierda y otra parte aún por procesar.
    // Toma cada elemento como clave.
    // Desplaza hacia la derecha los elementos mayores que la clave.
    // Inserta la clave en su posición correcta.
    //
    // Mejor caso: O(N), si el array ya está ordenado.
    // Peor caso: O(N^2), si esta ordenado al revés.
    // Caso medio: O(N^2).
    // Espacio adicional: O(1).
    //
    // Si la clave es menor que muchos elementos anteriores,
    // el bucle interior realiza muchos desplazamientos.
    // Si la clave ya es mayor o igual que el anterior,
    // el bucle interior termina rápidamente.
    //
    // Para trazarlo en un examen, analiza cada valor de i.
    // La parte izquierda queda ordenada tras cada iteración.


    // ============================================================
    // 8. BUBBLE SORT (BURBUJA) OPTIMIZADO
    // ============================================================

    // Compara parejas de elementos adyacentes.
    // Si están en orden incorrecto, los intercambia.
    // En cada pasada, un elemento grande puede desplazarse
    // hasta el extremo derecho.
    // Después de cada pasada, se reduce el tramo que falta
    // por ordenar.
    //
    // Versión básica:
    // Mejor caso: O(N^2), si siempre realiza todas las pasadas.
    // Peor caso: O(N^2).
    //
    // Versión optimizada con boolean intercambiado:
    // Al comenzar una pasada, intercambiado = false.
    // Si hay un intercambio, se cambia a true.
    // Si termina una pasada sin intercambios, el array ya
    // está ordenado y se puede detener el algoritmo.
    //
    // Mejor caso optimizado: O(N), si el array ya está ordenado.
    // Peor caso: O(N^2).
    // Espacio adicional: O(1).
    //
    // Si el array tiene N elementos y está ordenado,
    // la primera pasada compara N-1 parejas.
    // No hay intercambios y el algoritmo termina.
    //
    // No confundas una pasada con una comparación:
    // una pasada puede contener varias comparaciones.


    // ============================================================
    // 9. MERGE SORT Y FUSIÓN DE LISTAS ORDENADAS
    // ============================================================

    // Merge sort divide el problema en partes más pequeñas,
    // ordena esas partes y después las fusiona.
    // La fusion compara los primeros elementos disponibles
    // de las dos listas y toma el menor.
    // Cuando una lista se agota, se incorpora el resto de la otra.
    //
    // Fusionar dos listas de longitudes N y M cuesta O(N+M).
    // Merge sort clásico: O(N log N) en mejor, medio y peor caso.
    // Su implementación habitual necesita espacio auxiliar O(N).
    //
    // Una fusion recursiva de listas enlazadas ordenadas:
    // Si l1 es null, devolver l2.
    // Si l2 es null, devolver l1.
    // Comparar l1.dato y l2.dato.
    // Enlazar el menor con el resultado de fusionar el resto.
    //
    // Cada llamada consume un nodo de una de las listas.
    // Tiempo: O(N+M).
    // Pila recursiva: O(N+M) en el peor caso.
    // Si solo se cambian referencias, no es necesario crear
    // un nodo nuevo por cada elemento.


    // ============================================================
    // 10. LISTAS ENLAZADAS
    // ============================================================

    // Una lista enlazada simple contiene nodos con dato y siguiente.
    // Para avanzar, se utiliza actual = actual.siguiente.
    // No se puede acceder directamente al elemento i como en un array.
    //
    // Recorrer una lista de N nodos: O(N).
    // Acceder al elemento de índice i recorriendo desde la cabeza: O(N).
    // Insertar al principio si se tiene la cabeza: O(1).
    // Invertir una lista recorriendo sus nodos: O(N).

    // INVERSIÓN RECURSIVA:
    // Caso base: lista vacía o con un solo nodo.
    // Guardar el resultado de invertir el resto de la lista.
    // Hacer que el siguiente del nodo posterior apunte al actual.
    // Poner actual.siguiente = null para evitar enlaces antiguos.
    // Devolver la nueva cabeza de la lista invertida.
    // Tiempo: O(N).
    // Pila recursiva: O(N).

    // IMPORTANTE:
    // Guardar las referencias antes de modificarlas.
    // De lo contrario, se puede perder el acceso al resto de la lista.
    // Comprobar siempre los casos actual == null y siguiente == null.


    // ============================================================
    // 11. PALÍNDROMOS RECURSIVOS
    // ============================================================

    // Un palíndromo se lee igual de izquierda a derecha
    // que de derecha a izquierda.
    // Caso base: longitud 0 o 1, que siempre son palíndromos.
    // Caso recursivo: comparar primer y último caracter.
    // Si son distintos, devolver false.
    // Si son iguales, comprobar la cadena interior.
    //
    // Si se comparan caracteres y se usan índices:
    // Tiempo: O(N).
    // Pila recursiva: O(N).
    //
    // Cuidado en Java: crear una nueva subcadena en cada llamada
    // puede introducir copias y aumentar el trabajo total.
    // Para evitarlo, se pueden pasar índices inicio y fin.


    // ============================================================
    // 12. PROBLEMAS DE CAMBIO Y BACKTRACKING
    // ============================================================

    // Contar formas de sumar una cantidad con monedas es un
    // problema de decisiones recursivas.
    // En cada paso se prueba una posibilidad y se resuelve
    // el problema restante.
    //
    // Casos base típicos:
    // Objetivo == 0: se ha encontrado una forma válida.
    // Objetivo < 0: esa rama no sirve.
    // No quedan monedas: no se pueden explorar más opciones.
    //
    // Si se prueban muchas combinaciones, el número de llamadas
    // puede crecer exponencialmente.
    // La complejidad exacta depende de las decisiones y de
    // cómo se implementen los estados y las monedas disponibles.
    //
    // IMPORTANTE:
    // Si se repiten los mismos subproblemas, se puede estudiar
    // programación dinámica o memorizacion para evitar recalcularlos.
    // No asumas que toda recursividad es exponencial.


    // ============================================================
    // 13. ÁRBOLES BINARIOS DE BÚSQUEDA (BST)
    // ============================================================

    // En un BST, los valores del subárbol izquierdo son menores
    // que el nodo y los del derecho son mayores.
    // La propiedad debe cumplirse para todos los descendientes,
    // no solamente para los hijos directos.
    //
    // Para validar un BST correctamente se pueden pasar límites
    // mínimo y máximo que cada nodo debe respetar.
    // Al bajar a la izquierda, se actualiza el límite máximo.
    // Al bajar a la derecha, se actualiza el límite mínimo.
    //
    // Validar el árbol completo: O(N), porque se visita cada nodo.
    // Espacio de pila: O(H), siendo H la altura.
    //
    // BÚSQUEDA EN UN BST:
    // En un árbol balanceado, la altura es O(log N).
    // Mejor caso: O(1), si el valor esta en la raíz.
    // Peor caso balanceado: O(log N).
    // Si está degenerado, se comporta como una lista enlazada.
    // Peor caso degenerado: O(N).
    //
    // Un árbol degenerado no garantiza busqueda logarítmica.
    // El tiempo depende de la altura del árbol, no solo del
    // hecho de que sea un árbol binario.


    // ============================================================
    // 14. CASOS LÍMITE Y ERRORES TÍPICOS
    // ============================================================

    // Comprobar referencias null antes de acceder a sus atributos.
    // Comprobar arrays vacios y listas vacías.
    // Comprobar índices fuera de rango.
    // Revisar si el ultimo índice válido es longitud - 1.
    // No acceder a arr[medio] si no se ha comprobado el rango.
    // Tener cuidado con los casos base de la recursividad.
    // Evitar llamadas recursivas que no reduzcan el problema.
    // Comprobar si se deben admitir valores repetidos en un BST.
    // Evitar modificar una estructura sin guardar antes
    // las referencias necesarias.
    // Probar el algoritmo con una entrada normal y con casos límite.
    // Que el código compile no garantiza que sea correcto.
    // Buscar una solución legible y evitar trabajo innecesario.


    // ============================================================
    // 15. TRUCOS RÁPIDOS PARA EL EXAMEN
    // ============================================================

    // Un bucle que divide o multiplica el índice por 2:
    // normalmente O(log N).

    // Un bucle que recorre todos los elementos:
    // normalmente O(N).

    // Dos bucles lineales anidados:
    // normalmente O(N^2).

    // Dos bucles triangulares:
    // sumar 1 + 2 + ... + N, o su variante.
    // La suma es cuadratica: O(N^2).

    // Dos bucles consecutivos, ambos lineales:
    // O(N) + O(N) = O(N).

    // Una llamada recursiva con n-1:
    // suele dar O(N) si el trabajo por llamada es constante.

    // Dos llamadas recursivas con n-1:
    // puede dar O(2^N) si ambas ramas se calculan por separado.

    // Una llamada recursiva con n/2:
    // suele dar O(log N) si el trabajo adicional es constante.

    // Un recorrido completo de un árbol:
    // O(N), donde N es el nímero total de nodos.

    // Una búsqueda binaria:
    // O(log N), pero requiere datos ordenados.

    // Insertion sort:
    // O(N) mejor caso y O(N^2) peor caso.

    // Bubble sort optimizado:
    // O(N) mejor caso y O(N^2) peor caso.

    // Fusión de listas ordenadas:
    // O(N+M).

    // Un árbol degenerado:
    // puede tener altura O(N) y perder las ventajas de un BST.

}
