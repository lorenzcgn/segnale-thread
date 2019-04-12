
package threadprova;

/**
 *
 * @author 70625638
 */
public class Threadprova {

    public static void main(String[] args) {
   gestsegnale segnale=new gestsegnale("");
        mandasegnale A=new mandasegnale(segnale, "Parla A");
        mandasegnale B=new mandasegnale(segnale, "Parla B");
        Thread TA=new Thread(A);
        Thread TB=new Thread(B);
        TA.start();
        TB.start();
    }
    
}
