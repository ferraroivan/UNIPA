public class Archimede_Pi_Algorithms{
    public static void main(String[] args) {
        double l = 2.0;
        double beta = 90.0;
        double sinBeta = Math.sin(beta);
        for(int i = 2;i<32;i++){
            double a = l * sinBeta;
            l=Math.pow(l,i);
            sinBeta=Math.sqrt((1-(Math.sqrt(1-Math.sin(beta)*Math.sin(beta))))*0.5);
            beta=beta/2;
            System.out.println("n="+i+" "+a);
        }

    }
}
