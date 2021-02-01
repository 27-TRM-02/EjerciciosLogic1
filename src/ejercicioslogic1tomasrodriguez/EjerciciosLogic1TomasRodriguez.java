
package ejercicioslogic1tomasrodriguez;

/**
 * @author trm = Tomás Rodríguez-Mata Suárez - UFV Cetys
 * *****************************************************************************
 * Ejercicios Java de CodingBat Logic1
 */
public class EjerciciosLogic1TomasRodriguez {
    
    /**
     * Ejercicio1 cigarParty
     * *************************************************************************
     * Devuelve true si la fiesta entre 40 y 60 cigars; o si isWeekend que no hay 
     * límite de cigars. 
     * Sino devuelve false
     * @param cigars
     * @param isWeekend
     * @return 
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40) || (cigars >= 40 && cigars <= 60) ? true : false;
     }

    /**
     * Ejercicio2 dateFashion
     * *************************************************************************
     * Devuelve 2: Si you o date es mayor o igual que 8, salvo que el otro, sea
     * 2 o menos
     * Devuelve 1: Si you and date estan entre x > 2 && x < 8
     * Devuelve 0: Si alguno es menor o igual que 2
     * @param you
     * @param date
     * @return 
     */
    public int dateFashion(int you, int date) {
        return (you <= 2 || date <= 2) ? 0 : (you >= 8 || date >= 8) ? 2 : 1;
     }

    /**
     * Ejercicio3 squirrelPlay
     * *************************************************************************
     * Si la temp esta entre 60 y 90 devuelve true. Cuando isSummer, temp puede
     * llegar hasta 100, devolviendo true tambien.
     * @param temp
     * @param isSummer
     * @return 
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        return (isSummer && temp >= 90 && temp <= 100) ? true : (temp >= 60 && temp <= 90) ? true : false;     
     }
    
    /**
     * Ejercicio4 caughtSpeeding
     * *************************************************************************
     * Si es tu cumpleaños se le resta 5 a speed
     * Devuelve 2 si speed es mayor que 80
     * Devuelve 1 si speed esta entra 60 y 80
     * Devuelve 0 si speed es menor que 60
     * @param speed
     * @param isBirthday
     * @return 
     */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        // si es tu cumple, le resta 5 a la velocidad
        if (isBirthday){
            speed -= 5; //velocidad -= 5;
        }
        // en culaquier valor superior devolvemos multa grande
        return (speed <= 60) ? 0 : (speed > 60 && speed <= 80) ? 1 : 2;
      }
    
    /**
     * Ejercicio5 sortaSum
     * *************************************************************************
     * Devuelve la suma entre a y b. Si el resultado esta comprendido entre 10
     * y 19, devuelve 20.
     * @param a
     * @param b
     * @return 
     */
    public int sortaSum(int a, int b) {
        return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
     }
    
    /**
     * Ejercicio6 alarmClock
     * *************************************************************************
     * Método que devuelve hora de alarma dependiendo del dia de la semana y si
     * es o no vacaciones
     * Cuando !vacation : Entre semana devuelve 7:00 y fin de semana 10:00
     * Cuando vacation: Entre semana devuelve 10:.. y fin de semana "off"
     * @param day
     * @param vacation
     * @return 
     */
    public String alarmClock(int day, boolean vacation) {
        if (day >= 1 && day <= 5 && !vacation) {
            return "7:00";
        }
        if ((day == 0 || day == 6) && !vacation) {
            return "10:00";
        }
        return ((day == 0 || day == 6) && vacation) ? "off" : "10:00";
     }

    /**
     * Ejercicio7 love6
     * *************************************************************************
     * Devuelve true si, alguno de los numeros es 6, si la suma entre ellos es
     * 6, o ai la diferencia entre ellos es 6. Sino devuelve false
     * @param a
     * @param b
     * @return 
     */
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6){
          return true;
        }
        if (Math.abs(a - b) == 6) {
          return true;
        }
        if (a + b == 6){
          return true;
        }
        return false;
     }
    
    /**
     * Ejercicio8 in1To10
     * *************************************************************************
     * Devuelve true cuando n está compendido entre 1 y 10
     * Cuando outsideMode = true: Devuelve true cuando n esta fuera de (1, 10)
     * @param n
     * @param outsideMode
     * @return 
     */
    public boolean in1To10(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10 && !outsideMode) {
            return true;
        }
        return (n >= 10 || n <= 1) && outsideMode ? true: false; 
     }
    /**
     * Ejercicio9 specialEleven
     * *************************************************************************
     * Si n es multiplo de 11 o uno mas que un multiplo de 11, devuelve true,
     * sino devuelve false.
     * @param n
     * @return 
     */
    public boolean specialEleven(int n) {
        return (n % 11 == 0) ? true : (n % 11 == 1) ? true : false;
     }

    /**
     * Ejercicio10 more20
     * *************************************************************************
     * Si n es 1 o 2 mas que un multiplo de 20, devuelve true, sino false
     * @param n
     * @return 
     */
    public boolean more20(int n) {
        return (n % 20 == 1) ? true : (n % 20 == 2) ? true : false;
     }

    /**
     * Ejercicio11 old35
     * *************************************************************************
     * Devuelve true si n es multiplo de 3 o de 5, no de los dos, sino devuelve
     * false
     * @param n
     * @return 
     */
    public boolean old35(int n) {
        return (n % 3 == 0 && n % 5 == 0) ? false : (n % 3 == 0 || n % 5 == 0) ? true : false;
     }
    
    /**
     * Ejercicio12 less20
     * *************************************************************************
     * Si n es 1 o 2 menos que un multiplo de 20, devuelve true, sino false
     * @param n
     * @return 
     */
    public boolean less20(int n) {
        return (n % 20 == 18 || n % 20 == 19) ? true : false;
     }

    /**
     * Ejercicio13 nearTen
     * *************************************************************************
     * Si num es 2 mas o menos que su porcentaje devuelve true, sino false
     * @param num
     * @return 
     */
    public boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 == 8 || num % 10 == 9 ) ? true : false;
     }

    /**
     * Ejercicio14 teenSum
     * *************************************************************************
     * Devuelve la suma de los enteros pasados por parámetro.
     * En el caso que uno de ellos este comprendido entre 13 y 19, devuelve 19
     * @param a
     * @param b
     * @return 
     */
    public int teenSum(int a, int b) {
        return (a >= 13 && a <= 19) ? 19 : (b >= 13 && b <= 19) ? 19 : a + b;
     }

    /**
     * Ejercicio15 answerCell
     * *************************************************************************
     * Metodo que devuelve true (si coge el tlf) o false (sino lo coge)
     * Si isMorning, no coge el teléfono, salvo que sea su madre (isMom)
     * Si isAsleep no coge el teléfono. En todos los demás casos, lo coge.
     * @param isMorning
     * @param isMom
     * @param isAsleep
     * @return 
     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return isMorning && !isMom ? false : isAsleep ? false : true;
     }

    /**
     * Ejercicio16 teaParty
     * *************************************************************************
     * Si tea or candy son menores que 5, devuelve 0
     * Si alguno de ellos es el doble o más que el otro, devuelve 2
     * En todos los demas casos devuelve 1
     * @param tea
     * @param candy
     * @return 
     */
    public int teaParty(int tea, int candy) {
        return (tea < 5 || candy < 5) ? 0 : (tea >= candy * 2 || tea * 2 <= candy) ? 2 : 1;
     }

    /**
     * Ejercicio17 fizzString
     * *************************************************************************
     * Si el string empieza por "f", devuelve Fizz
     * Si el string termina en "b", devuelve Buzz
     * Si el string empieza por "f" y termina en "b",  devuelve FizzBuzz
     * Sino, devuelve el string sin ninguna modificación
     * @param str
     * @return 
     */
    public String fizzString(String str) {
        if (str.startsWith("f") && !str.endsWith("b")) {
          return "Fizz";
        }
        if (!str.startsWith("f") && str.endsWith("b")) {
          return "Buzz";
        }
        if (str.startsWith("f") && str.endsWith("b")) {
          return "FizzBuzz";
        }
        return str;
     }
    
    /**
     * Ejercicio18 fizzString2
     * *************************************************************************
     * Si n es multiplo de 3 y de 5, devuelve FizzBuzz!
     * Si n es multiplo de 3, devuelve Fizz!
     * Si n es multiplo de 5, devuelve Buzz!
     * Sino, devuelve n!
     * @param n
     * @return 
     */
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0){
          return "FizzBuzz!";
        }
        if (n % 3 == 0){
          return "Fizz!";
        }
        if (n % 5 == 0){
          return "Buzz!";
        }
        return n + "!";
     }

    /**
     * Ejercicio19 twoAsOne
     * *************************************************************************
     * Devuelve true, si la suma entre dos de los numeros pasados es igual que 
     * el tercero, sino devuelve false.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (a + c == b) || (c + b == a)) ? true : false;
     }

    /**
     * Ejercicio20 inOrder
     * *************************************************************************
     * Si b0k, devuelve true si c es mayor que b. Si !b0k devuelve true cuando
     * tambien b es mayor que a, sino devuelve false.
     * @param a
     * @param b
     * @param c
     * @param bOk
     * @return 
     */
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return c > b && bOk ? true : b > a && c > b ? true : false;
     }

    /**
     * Ejercicio21 inOrderEqual
     * *************************************************************************
     * Devuelve true cuando a, b, c, son dif., estan ordenados de menor a mayor
     * Si equalOk, permite que se repitan numeros
     * Sino devuelve false
     * @param a
     * @param b
     * @param c
     * @param equalOk
     * @return 
     */
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (a <= b && b <= c && equalOk) || (a < b && b < c && !equalOk) ? true : false;
     }

    /**
     * Ejercicio22 lastDigit
     * *************************************************************************
     * Dados 3 enteros de dos cifras, devuelve true, si alguno tiene el mismo 
     * digito a la dcha.
     * Sino devuelve false
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean lastDigit(int a, int b, int c) {
        return (a % 10) == (b % 10) || (a % 10) == (c % 10) || (c % 10) == (b % 10) ? true : false;
     }

    /**
     * Ejercicio23 lessBy10
     * *************************************************************************
     * Si la diferencia entre alguno de los enteros pasadps por parametro, es
     * mayor o igual que 10, devuelve true, sino devuelve false.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10) || (Math.abs(a - c) >= 10) || (Math.abs(c - b) >= 10);
     }
    
    /**
     * Ejercicio24 withoutDoubles
     * *************************************************************************
     * Devuelve la suma entre die1 and die2. Si noDoubles and die1 = die2, se 
     * devuelve la suma + 1.
     * @param die1
     * @param die2
     * @param noDoubles
     * @return 
     */
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return (noDoubles && die1 == die2) ? die1 + die2 + 1 : die1 + die2; 
     }

    /**
     * Ejercicio25 maxMod5
     * *************************************************************************
     * Devuelve el numero mas alto. Si los dos numeros tienen el mismo resto al
     * dividirse por 5, devuelve el numero mas bajo
     * @param a
     * @param b
     * @return 
     */
    public int maxMod5(int a, int b) {
        if (a % 5 == b % 5 && a != b) {
          return (a < b) ? a : b;
        }
        return (a > b) ? a : (b > a) ? b : 0;
     }

    /**
     * Ejercicio26 redTicket
     * *************************************************************************
     * Si todos los numeros son 2 devuelve 10. Si son iguales !2 devuelve 5.
     * Si b y c es distinto de a, devuelve 1, sino devuelve 0.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int redTicket(int a, int b, int c) {
        return a == 2 && b == 2 && c == 2 ? 10 : a == b && b == c ? 5 : (a != b && a != c) ? 1 : 0;
     }
    
    /**
     * Ejercicio27 greenTicket
     * *************************************************************************
     * Si todos los numeros son iguales, devuelve 20. Si 2 numeros son iguales,
     * devuelve 10, sino devuelve 0.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c){
          return 20;
        }
        if (a == b || a == c || b == c){
          return 10;
        }
        return 0;
     }

    /**
     * Ejercicio28 blueTicket
     * *************************************************************************
     * Si la suma entre 2 numeros es 10, devuelve 10.
     * Si ab sumados, es 10 o mas que la suma entre los otros dos, devuelve 5
     * Sino devuelve 0.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || c + b == 10 || a + c == 10){
          return 10;
        }
        if (a + b == b + c + 10 || a + b == a + c + 10){
          return 5;
        }
        return 0;
     }

    /**
     * Ejercicio29 shareDigit
     * *************************************************************************
     * Si alguno de los gigitos de los 2 donumeros de 2 cifras pasadps por 
     * parametro son iguales, devuelve true, sino devuelve false
     * @param a
     * @param b
     * @return 
     */
    public boolean shareDigit(int a, int b) {
        return a/10 == b/10 || a%10 == b%10 || a%10 == b/10 || a/10 == b%10 ? true : false;
     }

    /**
     * Ejercicio30 sumLimit
     * *************************************************************************
     * Si las cifras de a, son menores que las del resultado de la suma, 
     * devuelve a, sino devuelve la suma entre a + b.
     * @param a
     * @param b
     * @return 
     */
    public int sumLimit(int a, int b) {
        int s = a + b;
        String suma = Integer.toString(s);
        String A = Integer.toString(a);
       if (A.length() < suma.length()) {
         return a;
       } 
       return s;
     }

    




    /*************************MAIN**********************************************
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase 
        EjerciciosLogic1TomasRodriguez logic1 = new EjerciciosLogic1TomasRodriguez();
    }
    
}
