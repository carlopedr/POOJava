public class Arr2 {
    public static void main(String[] args) {
        int biarr[][];
        biarr=new int[4][];
        biarr[0]=new int[3];
        biarr[1]=new int[2];
        biarr[2]=new int[4];
        biarr[3]=new int[1];

        System.out.println(biarr.length);
        System.out.println(biarr[2].length);
        

        for(int f=0;f<biarr.length;f++){
            for(int c=0;c<biarr[f].length;c++){
                biarr[f][c]=(int)(Math.random()*10);
                System.out.println("biarr["+f+"]["+c+"]="+biarr[f][c]);

            }
        }
    }

}
