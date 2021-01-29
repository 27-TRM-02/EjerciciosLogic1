
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
        return (isWeekend && cigars >= 40) ? true : (cigars >= 40 && cigars <= 60) ? true : false;
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
    

    /*************************MAIN**********************************************
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase 
        EjerciciosLogic1TomasRodriguez logic1 = new EjerciciosLogic1TomasRodriguez();
    }
    
}
