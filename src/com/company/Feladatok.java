package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Feladatok {
    private ArrayList<Fuvar> fuvarLista;
    public Feladatok(){
    Beolvas();
        System.out.println("3.feladat: "+fuvarLista.stream()
        .count());
        System.out.println("4.feladat: "+fuvarLista.stream()
                .filter(fuvar ->fuvar.getTaxi()==6185)
                .mapToDouble(fuvar -> fuvar.getVitelDij()+fuvar.getBorravalo())
                .count()+" alatt: "+fuvarLista.stream()
                .filter(fuvar ->fuvar.getTaxi()==6185)
                .mapToDouble(fuvar -> fuvar.getVitelDij()+fuvar.getBorravalo())
                .sum()
        );
        System.out.println("5.feladat");
        System.out.print("bankkártya: ");
                fuvarLista.stream()
                        .filter(fuvar -> fuvar.getFizetesMod().equals("bankkártya"))
                        .count();
        System.out.print("készpénz: ");
        fuvarLista.stream()
                .filter(fuvar -> fuvar.getFizetesMod().equals("készpénz"))
                .count();
        System.out.print("vitatott: ");
        fuvarLista.stream()
                .filter(fuvar -> fuvar.getFizetesMod().equals("vitatott"))
                .count();
        System.out.print("ingyenes: ");
        fuvarLista.stream()
                .filter(fuvar -> fuvar.getFizetesMod().equals("ingyenes"))
                .count();
        System.out.print("ismeretlen: ");
        fuvarLista.stream()
                .filter(fuvar -> fuvar.getFizetesMod().equals("ismeretlen"))
                .count();
        System.out.print("6.feladat");
        fuvarLista.stream().mapToDouble(fuvar -> fuvar.getTavolsag()*1.6).sum();
}

    private void Beolvas() {
        fuvarLista=new ArrayList<>();
        try {

            BufferedReader r=new BufferedReader(new FileReader("fuvar.cs"));
            r.readLine();
            String sor=r.readLine();
            while (sor!=null){
                fuvarLista.add(new Fuvar(sor));
                sor=r.readLine();
            }
           /* for (Fuvar item:fuvarLista
                 ) {
                System.out.println(item);
            }*/
        }catch (IOException e){
            e.getMessage();
        }
    }
}
