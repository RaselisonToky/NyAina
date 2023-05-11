public class Main {
    public static void main(String[] args) {
        double [][] matrice = new double [5][8];


        int [][]test=new int[5][8];
        int[][]z=new int[5][0];
        z[0]= Matrice.setLigne(1, 3, 1, 1, 0, 0, 0, 3);
        z[1]= Matrice.setLigne(-1, 0, 3, 0, 1, 0, 0, 2);
        z[2]= Matrice.setLigne(2, 4, -1, 0, 0, 1, 0, 4);
        z[3]= Matrice.setLigne(1, 3, -1, 0, 0, 0, 1, 2);
        z[4]= Matrice.setLigne(1, 5, 1, 0, 0, 0, 0, 0);


        for (int i = 0; i <z.length ; i++) {
            for (int j = 0; j <z[i].length ; j++) {
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }


        getMaxAmbany(z);






    }

    public static void getMaxAmbany(int[][] matrice){
        int a=matrice.length-1;
        int y = 0;
        for (int j = 0; j <matrice[a].length ; j++) {
                y=max(matrice[a]);
            }
    }

    public static int max(int[]table){
        int i=table[0];
        int h=0;
        for (int j = 1; j <table.length ; j++) {
            if (table[j]>=i){
                i=table[j];
                h=j;
            }
        }
        return h;
    }

}