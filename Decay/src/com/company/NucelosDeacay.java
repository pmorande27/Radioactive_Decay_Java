package com.company;
public class NucelosDeacay {
    //Declaración de variables de clase
    private double lambda; // Valor de la constante de decaimiento
    int range;// Longitud de la Array de Núcleos, con un total de Range*Range núcleos.
    double ts; //Time-lapse, intervalo de tiempo que pasa entre iteraciones.
    double p;// probabilidad de que un átomo decaiga en el intervalo de tiempo dado.
    public /*Al usar la palabra this y los atributos de clase en el método no podmeos usar la palabra static en su declaración*/ NucelosDeacay(double a, int b , double c){//Ejecutando constructor con dos argumentos.
        System.out.println("Ejecutando constructor con 3 argumentos"); // Se inicializan los valores de las variables
        this.lambda = a;
        this.range = b;
        this.ts = c;
        this.p = a * c;
    }
    public void decay(){
        int[][] arrayDeNucleos = new int[this.range][this.range]; // Declaración del array 2D de Núcleos de dimensiones R*R
        //Declaración e inicialización de variables para contar el número de átomos que han decaido y los vivos iniciales
        int muertos = 0;
        int vivosInicio = this.range* this.range;
        int vivos = vivosInicio;
        double t = 0; // Muestra el tiempo que ha pasado
        /*Inicializamos los valores del Array, los unos simbolizan átomos no decaidos,
         al comienzo todos están en este estado*/
        for (int i = 0;i<this.range;i++ ) {
            for (int j = 0; j < range; j++) {
                arrayDeNucleos[i][j] = 1;
            }
        }
        while (muertos < vivosInicio/2){ /*Bucle infinito hasta que pueda acceder a la sentencia break*/
//Iteraciones por cada intervalo de tiempo en la matriz
                t += this.ts;
                for (int a = 0;a<this.range;a++ ){
                    for (int b = 0;b<this.range;b++ ) {
                        if (arrayDeNucleos[a][b] == 1){
                            if (Math.random() < this.p) {
                                arrayDeNucleos[a][b] = 0;
                                muertos++;
                                vivos--;
                            }
                        }
                    }
                }
             }
        System.out.println("Matriz de Núcleos");
        System.out.println("[");

        for (int i = 0; i<this.range; i++) {
            System.out.print("[");
            for (int c = 0; c < this.range; c++) {
                System.out.print(arrayDeNucleos[i][c]+" , ");
            }
            System.out.println("\b"+"\b" +"\b"+"]," );
        }
        System.out.println("\b"+"]");
        System.out.println("Constante Calculada= "+t);
        System.out.println("Átomos Decaidos = "+ muertos);
        System.out.println("Átomos no Decaidos = " + vivos);
    }
}




