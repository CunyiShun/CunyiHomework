package com.train;

public class Tick {

        int totaltickets;
        int roundtrip;

        public Tick(int totaltickets,int roundtrip){
            this.totaltickets=totaltickets;
            this.roundtrip=roundtrip;

        }
     public void print(){
            int total=(totaltickets*1000)+(int)(roundtrip*2000*0.9);
         System.out.println("Total tickets:"+totaltickets);
         System.out.println("Round-trip:"+roundtrip);
         System.out.println("Total:"+total);
     }


}
