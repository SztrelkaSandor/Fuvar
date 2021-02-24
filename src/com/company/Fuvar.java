package com.company;

import java.time.LocalDateTime;

public class Fuvar {

        private int taxi;
    private LocalDateTime indulas;
    private int utazasIdo;

    public double getTavolsag() {
        return tavolsag;
    }

    public double getVitelDij() {
        return vitelDij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public String getFizetesMod() {
        return fizetesMod;
    }

    private double tavolsag;
    private double vitelDij;
    private double borravalo;
        private String fizetesMod;

        public Fuvar(String s){
            String[] adatok = s.split(";");

            this.taxi =Integer.parseInt(adatok[0]);
            this.indulas =LocalDateTime.parse(adatok[1]);
            this.utazasIdo =Integer.parseInt(adatok[2]);
            this.tavolsag=Double.parseDouble(adatok[3]);
            this.vitelDij=Double.parseDouble(adatok[4]);
            this.borravalo=Double.parseDouble(adatok[5]);
            this.fizetesMod=adatok[6];

        }

        public int getTaxi() {
            return taxi;
        }

        public int getUtazasIdo() {
            return utazasIdo;
        }

        public LocalDateTime getIndulas() {
            return indulas;
        }


        @Override
        public String toString() {
            return String.format("%d, %d, %d, %f, %f, %f, %s", this.taxi,this.indulas,this.utazasIdo,this.tavolsag,this.vitelDij,this.borravalo,this.fizetesMod);
        }
    }


