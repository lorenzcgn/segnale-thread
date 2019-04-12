/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprova;

/**
 *
 * @author 70625638
 */
public class mandasegnale implements Runnable {
    private gestsegnale segn;
    private String s;

    public mandasegnale(gestsegnale segn, String s) {
  this.s=s;
  this.segn=segn;
    }
    

    @Override
    public void run() {
      for (int i=0; i<10; i++) {
      while(s==segn.getSegnale()){
              System.out.println(Thread.currentThread().getName()+" "+i+" Devo aspettare");
      }
              System.out.println(Thread.currentThread().getName()+" "+i+" "+segn.setSegnale(s));
          }    
}
}
