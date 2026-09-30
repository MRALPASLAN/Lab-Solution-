
package lab1;


import java.util.Scanner;

public class Lab1 {

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      int[] Point = new int[4];
       Point[0] = 0;
       Point[1] = 0;
       Point[2] = 0;
       Point[3] = 0;
       
      int[] Win = new int[4];
       Win[0] = 0;
       Win[1] = 0;
       Win[2] = 0;
       Win[3] = 0;
  
      int[] Draw = new int[4];
       Draw[0] = 0;
       Draw[1] = 0;
       Draw[2] = 0;
       Draw[3] = 0;

      int[] Lose = new int[4];
       Lose[0] = 0;
       Lose[1] = 0;
       Lose[2] = 0;
       Lose[3] = 0;
       
      int[] GoalDifference = new int[4];
       GoalDifference[0] = 0;
       GoalDifference[1] = 0;
       GoalDifference[2] = 0;
       GoalDifference[3] = 0;
         
       
      int A1;
      int B1;
      int A2;
      int C2;
      int A3;
      int D3;
      int B4;
      int C4;
      int B5;
      int D5;
      int C6;
      int D6;
      
      int matchCountA = 0;
      int matchCountB = 0;
      int matchCountC = 0;
      int matchCountD = 0;
      
        System.out.println("----------Football Tournement----------");
        System.out.println(
                "Match-1:Team A Vs Team B"+"\n"+
                "Match-2:Team A Vs Team C"+"\n"+
                "Match-3:Team A Vs Team D"+"\n"+
                "Match-4:Team B Vs Team C"+"\n"+
                "Match-5:Team B Vs Team D"+"\n"+
                "Match-6:Team C Vs Team D");


        System.out.println("----Match-1----"+"\n"+"Team A Vs Team B");
        System.out.println("Team A goals:");
        A1 = scanner.nextInt();
        System.out.println("Team B goals:");
        B1 = scanner.nextInt();

        System.out.println("----Match-2----"+"\n"+"Team A Vs Team C");
        System.out.println("Team A goals:");
        A2 = scanner.nextInt();
        System.out.println("Team C goals:");
        C2 = scanner.nextInt();

        System.out.println("----Match-3----"+"\n"+"Team A Vs Team D");
        System.out.println("Team A goals:");
        A3 = scanner.nextInt();
        System.out.println("Team D goals:");
        D3 = scanner.nextInt();

        System.out.println("----Match-4----"+"\n"+"Team B Vs Team C");
        System.out.println("Team B goals:");
        B4 = scanner.nextInt();
        System.out.println("Team C goals:");
        C4 = scanner.nextInt();

        System.out.println("----Match-5----"+"\n"+"Team B Vs Team D");
        System.out.println("Team B goals:");
        B5 = scanner.nextInt();
        System.out.println("Team D goals:");
        D5 = scanner.nextInt();

        System.out.println("----Match-6----"+"\n"+"Team C Vs Team D");
        System.out.println("Team C goals:");
        C6 = scanner.nextInt();
        System.out.println("Team D goals:");
        D6 = scanner.nextInt();
       
        System.out.println(
                "Match-1:Team A Vs Team B   "+A1+"-"+B1+"\n"+
                "Match-2:Team A Vs Team C   "+A2+"-"+C2+"\n"+
                "Match-3:Team A Vs Team D   "+A3+"-"+D3+"\n"+
                "Match-4:Team B Vs Team C   "+B4+"-"+C4+"\n"+
                "Match-5:Team B Vs Team D   "+B5+"-"+D5+"\n"+
                "Match-6:Team C Vs Team D   "+C6+"-"+D6+"\n"
        );
        
        //***************************
        if (A1>B1) {
            Win[0] += 1;
            Lose[1] += 1;
            matchCountA += 1;
            matchCountB += 1;
        }else if (B1>A1) {
            Win[1] += 1;
            Lose[0] += 1;
            matchCountA += 1;
            matchCountB += 1;
        }else{
            Draw[0] += 1;
            Draw[1] += 1;
            matchCountA += 1;
            matchCountB += 1;
        }

        //***************************
        if (A2>C2) {
            Win[0] += 1;
            Lose[2] += 1;
            matchCountA += 1;
            matchCountC += 1;
        }else if (C2>A2) {
            Win[2] += 1;
            Lose[0] += 1;
            matchCountA += 1;
            matchCountC += 1;
        }else{
            Draw[0] += 1;
            Draw[2] += 1;
            matchCountA += 1;
            matchCountC += 1;
        }

        //***************************
        if (A3>D3) {
            Win[0] += 1;
            Lose[3] += 1;
            matchCountA += 1;
            matchCountD += 1;
        }else if (D3>A3) {
            Win[3] += 1;
            Lose[0] += 1;
            matchCountA += 1;
            matchCountD += 1;
        }else{
            Draw[0] += 1;
            Draw[3] += 1;
            matchCountA += 1;
            matchCountD += 1;
        }

        //***************************
        if (B4>C4) {
            Win[1] += 1;
            Lose[2] += 1;
            matchCountB += 1;
            matchCountC += 1;
        }else if (C4>B4) {
            Win[2] += 1;
            Lose[1] += 1;
            matchCountB += 1;
            matchCountC += 1;
        }else{
            Draw[1] += 1;
            Draw[2] += 1;
            matchCountB += 1;
            matchCountC += 1;
        }

        //***************************
        if (B5>D5) {
            Win[1] += 1;
            Lose[3] += 1;
            matchCountB += 1;
            matchCountD += 1;
        }else if (D5>B5) {
            Win[3] += 1;
            Lose[1] += 1;
            matchCountB += 1;
            matchCountD += 1;
        }else{
            Draw[1] += 1;
            Draw[3] += 1;
            matchCountB += 1;
            matchCountD += 1;
        }

        //***************************
        if (C6>D6) {
            Win[2] += 1;
            Lose[3] += 1;
            matchCountC += 1;
            matchCountD += 1;
        }else if (D6>C6) {
            Win[3] += 1;
            Lose[2] += 1;
            matchCountC += 1;
            matchCountD += 1;
        }else{
            Draw[2] += 1;
            Draw[3] += 1;
            matchCountC += 1;
            matchCountD += 1;
        }

        Point[0] = Win[0]*3+Draw[0]*1;
        Point[1] = Win[1]*3+Draw[1]*1;
        Point[2] = Win[2]*3+Draw[2]*1;
        Point[3] = Win[3]*3+Draw[3]*1;

        GoalDifference[0] = A1+A2+A3-B1-C2-D3;
        GoalDifference[1] = B1+B4+B5-A1-C4-D5;
        GoalDifference[2] = C2+C4+C6-A2-B4-D6;
        GoalDifference[3] = D3+D5+D6-A3-B5-C6;

        System.out.println("-----------Team-A-----------");
        System.out.println("Matches played:"+matchCountA);
        System.out.println("Win:"+Win[0]);
        System.out.println("Draw:"+Draw[0]);
        System.out.println("Lose:"+Lose[0]);
        System.out.println("TotalPoint:"+Point[0]);
        System.out.println("Goal Difference:"+GoalDifference[0]);

        System.out.println("-----------Team-B-----------");
        System.out.println("Matches played:"+matchCountB);
        System.out.println("Win:"+Win[1]);
        System.out.println("Draw:"+Draw[1]);
        System.out.println("Lose:"+Lose[1]);
        System.out.println("TotalPoint:"+Point[1]);
        System.out.println("Goal Difference:"+GoalDifference[1]);

        System.out.println("-----------Team-C-----------");
        System.out.println("Matches played:"+matchCountC);
        System.out.println("Win:"+Win[2]);
        System.out.println("Draw:"+Draw[2]);
        System.out.println("Lose:"+Lose[2]);
        System.out.println("TotalPoint:"+Point[2]);
        System.out.println("Goal Difference:"+GoalDifference[2]);

        System.out.println("-----------Team-D-----------");
        System.out.println("Matches played:"+matchCountD);
        System.out.println("Win:"+Win[3]);
        System.out.println("Draw:"+Draw[3]);
        System.out.println("Lose:"+Lose[3]);
        System.out.println("TotalPoint:"+Point[3]);
        System.out.println("Goal Difference:"+GoalDifference[3]);
        
        
        System.out.println("\n-------Standings / Rankings-------");

        String[] teamNames = {"Team A", "Team B", "Team C", "Team D"};
        int[] order = {0, 1, 2, 3}; // Takımların indeksleri

        // Sıralama Algoritması: Puan büyük olan öne, eşitse Averaj büyük olan öne
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                int t1 = order[i];
                int t2 = order[j];

                // Eğer t2'nin puanı t1'den büyükse VEYA puanları eşit olup averajı büyükse yer değiştir
                if (Point[t2] > Point[t1] || (Point[t2] == Point[t1] && GoalDifference[t2] > GoalDifference[t1])) {
                    order[i] = t2;
                    order[j] = t1;
                }
            }
        }

        // 1'den 4'e kadar ekrana yazdırma
        for (int i = 0; i < 4; i++) {
            int t = order[i];
            System.out.println((i + 1) + ". " + teamNames[t] + " (Points: " + Point[t] + ", GD: " + GoalDifference[t] + ")");
        }

        scanner.close();

        
        
       
      
    }
    
}
