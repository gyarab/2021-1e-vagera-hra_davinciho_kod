import java.util.Random;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {

    double karta [];
    karta = new double [4];

    double karta2 [];
    karta2 = new double [4];
    
    double kartare [];
    kartare = new double [18];

    double karta2re [];
    karta2re = new double [18];

    double cislare [];
    cislare = new double [50];

    double cislarandom [];
    cislarandom = new double [24];

    int pocet = 0;// how many cards have been taken

    System.out.println("Hello world!");

    Random generator = new Random();

    double cisla2[] = {0.3,0.5,1.3,1.5,2.3,2.5,3.3,3.5,4.3,4.5,5.3,5.5,6.3,6.5,7.3,7.5,8.3,8.5,9.3,9.5,10.3,10.5,11.3,11.5};
    

    System.out.println( " ");

    int coda = 0;
    int coda2 = -1;
    for (int o=0; o < 24; o++){

      int randomNumber2 = generator.nextInt(cisla2.length);//new random array
      coda2++;
      cislarandom[coda2] = cisla2[randomNumber2];
      cisla2[randomNumber2] = cisla2[randomNumber2] *-1;
     //System.out.print("Vylocene cislo, " + cisla2[randomNumber2]+ " ");
      
      for (int y=0; y < cisla2.length; y++){
         cislare[y]= cisla2[y];
      }

      cisla2 = new double [cisla2.length-1 ];  
      for (int y = 0; y < cisla2.length; y++){ 
 
         if(cislare[y]>=0 ){
           cisla2[y]= cislare[y + coda];
         }else{
           coda++;
           cisla2[y]= cislare[y + coda];
           
         }     
      }
      coda = 0;
      //for (int y = 0; y < cislarandom.length; y++){ //test
        //System.out.print(cislarandom[y] + ",   ");
      //}    
      //System.out.println("");
    }
    for (int b=0; b < 4; b++){// first 4 number karta
      
      karta[b] = cislarandom[pocet];
      cislarandom[pocet] = cislarandom[pocet]*-1;
      pocet++;
    }
    /*
    for (int b=0; b < 4; b++){//first 4 number katra printing 
      System.out.print(karta[b]+ ",   ");
    }*/
    /*for (int b=0; b < cislarandom.length; b++){//whole random printing
      System.out.print(cislarandom[b]+ ",   ");
    }*/

    for (int b=0; b < 4; b++){// first 4 number karta2
      
      karta2[b] = cislarandom[pocet];
      cislarandom[pocet] = cislarandom[pocet]*-1;
      pocet++;
    }
    /*for (int b=0; b < 4; b++){{//first 4 number katra2 printing 
      System.out.print(karta2[b]+ ",   ");
    }*/

    System.out.println("Pravidla:");// pravidla
    System.out.println("Hadate hodnotu cisla od 0 do 11");
    System.out.println("Vlevo se nachazi nejvetsi hodnota spoluhrace");
    System.out.println("(11...........<-5->..........0)");
    System.out.println("Vlevo se nachazi nejmensi pozice spoluhrace");
    System.out.println("(1...........->..........max pozice)");
    System.out.println("Hrac na tahu vidi sve karty nize a souperovy vyse ");
    System.out.println("Pokud ma hrac cerne a bile pole stejne hodnoty, cerne pole ma vetsi hodnotu");
    System.out.println("Nova karta po nepovedenem hadani se vam zaradi do kodu");
    System.out.println("Berou se cerne a bile karty (0 - bila, 1 - cerna)");
    System.out.println("Zaporne cislo predstavuje odkrytou kartu");
    System.out.println("Cisla s 0.3 predstavuji bila pole");
    System.out.println("Cisla s 0.5 predstavuji cerna pole");
    System.out.println("Press enter to start game");
    Scanner start = new Scanner(System.in);
    start.nextLine();
    for (int b=0; b < 45; b++){
      System.out.println( " ");
    }

    System.out.println( " ");

    double temp = 0;
    System.out.println( " ");//player 2 cards
    
    for (int i = 0; i < karta2.length ; i++) {

      for (int j = 1; j < karta2.length-i ; j++) {
        if (karta2[j - 1] < karta2[j]){
          temp = karta2[j - 1];
          karta2[j - 1] = karta2[j];
          karta2[j] = temp;
         
        }
      }
    }

    System.out.println( " ");

    for (int i = 0; i < karta.length ; i++) {//player 1 cards

      for (int j = 0; j < karta.length-1 ; j++) {
        if (karta[j] > karta[j + 1]){
          double x;
          x = karta[j];
          karta[j] = karta[j + 1];
          karta[j + 1] = x;
         
        }
      }
    }



    //start game






    System.out.println( " ");
    int count = 0; 
    int count2 = 0;
    int vy1=0;
    double vy2=0;
    int vy3=0;
    double vy4=0;
    int vy5=0;
    int vy6=0;
    int q = 0;
    int o = 0;
    double ran1 = 0;
    double ran2 = 0;
    int correct1 = 0;
    int correct2 = 0;
    int break1 = 16;
    int cerna = 0;
    int bila = 0;
    int konecna_cerna = 0;
    int konecna_bila = 0;

    for (int x = 0; x <200 ; x++) {//player 1 guesing
      do{
        do{
          cerna = 0;
          bila = 0;
          //System.out.println(konecna_bila  + " " + konecna_cerna  );
          //System.out.println(break1);
          if (break1 < 48 ){

            System.out.println("Vemte si kartu");
    
            Scanner myObj5 = new Scanner(System.in);//scanner 1
            vy5 = myObj5.nextInt();
          }else{
            System.out.println("No more cards");

          }
        }while(vy5 > 1 || vy5 <0);
        if(break1<48){
        //ran1=cislarandom[pocet];
        //pocet++;
        break1++;
      
          if (vy5 == 1){
            for (int e = 8; e <cislarandom.length ; e++) {
              if(Math.floor(cislarandom[e]) == cislarandom[e] - 0.5 && cislarandom[e] >0 ){
                ran1=cislarandom[e];
                cislarandom[e] = cislarandom[e]*-1;
              
                break;
              }else{
                cerna++;
              }
            }
          }else{
            for (int e = 8; e <cislarandom.length ; e++) {
              if(Math.floor(cislarandom[e]) != cislarandom[e] - 0.5 && cislarandom[e] >0 ){
                ran1=cislarandom[e];
                cislarandom[e] = cislarandom[e]*-1;
                break;
              }else{
                bila++;
              }
            }
          }
        }
        //System.out.println(cerna);
        if(cerna>=16){
          System.out.println("Cerne karty dosli. Zkuste znovu");
          break1--;
          konecna_cerna++;
        }else{
          cerna = 0;
        }
        if(bila>=16){
          System.out.println("Bile karty dosli. Zkuste znovu");
          break1--;
          konecna_bila++;
        }else{
          bila = 0;
        }

      
      }while (cerna >= 16 || bila >= 16 );
      //for (int i= 0; i < 1; i++){//making new number1

      //int randomNumber = generator.nextInt(cisla.length);

        //if (cisla[randomNumber] < 0){
        //i = i - 1;
      
        //}else{

      //ran1 = cisla[randomNumber];  
      //cisla[randomNumber] = cisla[randomNumber] *-1;
      //break1++;
        //}
      //}
      //}else{
      //}
    

      do{
        count = 0;  
     //test number1  
     //for (int e = 0; e <karta2.length ; e++) {//printing1

      //System.out.print(karta2[e]+ ",  ");
     //}  
     //System.out.print("Player 2");

        System.out.println("");
        for (int e = 0; e <karta2.length ; e++) {
          if (karta2[e] < 0){
            System.out.print(karta2[e]+ ",  ");
          }else if (Math.floor(karta2[e]) == karta2[e] - 0.5){

            if(karta2[e]== ran2){
              System.out.print("new ");
          
            }
      
            System.out.print("Cerna" + ", ");
          }else{
            if(karta2[e]== ran2){
              System.out.print("new ");
          
            }
      
            System.out.print("Bila" + ", ");
          }
        }  
        System.out.print("Player 2");

        System.out.println("");

        for (int e = 0; e <karta.length ; e++) {
 
          System.out.print(karta[e]+ ",  ");
        }

        if (break1<48){
          System.out.print("Player 1     " + ran1 + "  nova karta" );
        }else{
          System.out.print("Player 1     No more cards" );
        }
        System.out.println("");
        if(vy4==0){
        }else{
          System.out.println("Posledni hadani druheho hrace " + vy4);
        }
        System.out.println("");
        //do{
        do{
          System.out.println("Vlozte pozici karty");//scanner 1
          Scanner myObj = new Scanner(System.in);
          vy1 = myObj.nextInt()-1;

          if(vy1 >= karta2.length || vy1+1 <= 0){//incorrect number or position1
          System.out.println("Neplatna pozice. Try again.");
           
          }
          if(karta2[vy1] <0){
            System.out.println("Karta uy je vylustena. Try again.");
          }
        }while(vy1 >= karta2.length || vy1+1 <= 0 ||karta2[vy1] <0);
        do{
          System.out.println("Vlozte hodnotu karty");
          Scanner myObj2 = new Scanner(System.in);
          vy2 = myObj2.nextDouble();
    
          if(vy2 > 11|| vy2 < 0){
            System.out.println("Neplatna hodnota. Try again.");
            
          }
        }while(vy2 > 11|| vy2 < 0);
        if (Math.floor(karta2[vy1])== karta2[vy1]-0.5){
          vy2 = vy2 +0.5;
        }else{
          vy2 = vy2 + 0.3;
        }
  
  
        if(karta2[vy1]== vy2){//corecting 1
          karta2[vy1]= karta2[vy1]*-1;
          count++;
        }else{
        }

        for (int p = 0; p <karta2.length ; p++) {
          if(karta2[p]> 0){
            o++;
          }else{
  
          }
        }

        if(o >0){ //ending protocol
          o = 0;
        }else{
          System.out.println("-------------------Player 1 Win-------------------");
          System.exit(0);
        }
        if(count == 1){//repeat1
          System.out.println("");
          System.out.println("Correct");
          System.out.println("");
          System.out.println("Play again");
         //System.out.println("");
        }
      }while(count== 1); 

      System.out.println( " ");
      if(break1<48){

        for (int p = 0; p < karta.length ; p++) {//adding new number1
          kartare[p]= karta[p];
        }
        karta = new double [karta.length + 1];
        karta[karta.length - 1] = ran1;
        for (int p = 0; p < karta.length-1 ; p++) {
          karta[p]= kartare[p];
        }
        break1++;
      }else{
        ran1 = 0;
      }

      double temp2 = 0;
   
      for (int i = 0; i < karta.length ; i++) {

        for (int j = 1; j < karta.length-i ; j++) {
          if (Math.abs(karta[j - 1]) < Math.abs(karta[j])){
            temp2 = karta[j - 1];
            karta[j - 1] = karta[j];
            karta[j] = temp2;
         
          }
        }

      }
      for (int i = 0; i < karta2.length ; i++) {

        for (int j = 0; j < karta2.length-1 ; j++) {
          if (Math.abs(karta2[j]) > Math.abs(karta2[j + 1])){
            double v;
            v = karta2[j];
            karta2[j] = karta2[j + 1];
            karta2[j + 1] = v;
         
          }
        }
      }
   


      for (int j = 0; j <43 ; j++) {
        System.out.println( " ");
      }
      System.out.println("Incorrect");
      System.out.println("");
      System.out.println("Player2 on move");
      System.out.println( " ");
      System.out.println("Press enter to continue");
      Scanner continue1 = new Scanner(System.in);
      continue1.nextLine();
      System.out.println( " ");


      //player 2 guesing






      do{
        do{
          cerna = 0;
          bila = 0;
          //System.out.println(konecna_bila  + " " + konecna_cerna  );
          //System.out.println(break1);

          if (break1 < 48 ){
            System.out.println("Vemte si kartu");//scanner 1
            Scanner myObj6 = new Scanner(System.in);
            vy6 = myObj6.nextInt();
          }else{
            System.out.println("No more cards");
          }
        }while(vy6 > 1 || vy6 <0);

        if(break1<48){
         //ran2=cislarandom[pocet];
         //pocet++;
          break1++;
          if (vy6 == 1){
            for (int e = 8; e <cislarandom.length ; e++) {
              if(Math.floor(cislarandom[e]) == cislarandom[e] - 0.5 && cislarandom[e] >0 ){
                ran2=cislarandom[e];
                cislarandom[e] = cislarandom[e]*-1;
                break;
              }else{
                cerna++;
              }
            }
          }else{
            for (int e = 8; e <cislarandom.length ; e++) {
              if(Math.floor(cislarandom[e]) != cislarandom[e] - 0.5 && cislarandom[e] >0 ){
                ran2=cislarandom[e];
                cislarandom[e] = cislarandom[e]*-1;
                break;
              }else{
                bila++;
              }
            }
          }
        }
        //System.out.println(cerna);
        if(cerna>=16){
          System.out.println("Cerne karty dosli. Zkuste znovu");
          break1--;
          konecna_cerna++;
        }else{
          cerna = 0;
        }
        if(bila>=16){
          System.out.println("Bile karty dosli. Zkuste znovu");
          break1--;
          konecna_bila++;
        }else{
          bila = 0;
        }     
      
      }while (cerna >= 16 || bila >= 16 );
      //for (int i= 0; i < 1; i++){//making new number2
        
      //int randomNumber = generator.nextInt(cisla.length);

        //if (cisla[randomNumber] < 0){
        //i = i - 1;
      
        //}else{

      //ran2 = cisla[randomNumber];  
      //cisla[randomNumber] = cisla[randomNumber] *-1;
      //break1++;
        //}
      //}
     //}else{ 
     //}

      do{
        count2 = 0;  
       //test number2
     //for (int e = 0; e <karta.length ; e++) {//printing2
   
      //System.out.print(karta[e]+ ",  ");
     //}  
     //System.out.print("Player 1" );

        System.out.println("" );
        for (int e = 0; e <karta.length ; e++) {
          if (karta[e] < 0){
          System.out.print(karta[e]+ ",  ");
          }else if (Math.floor(karta[e]) == karta[e] - 0.5){
            if(karta[e]== ran1){
              System.out.print("new ");
          
            }
      
            System.out.print("Cerna" + ", ");
          }else{

            if(karta[e]== ran1){
            System.out.print("new ");
          
            }
            System.out.print("Bila" + ", ");
          }
        }  
        System.out.print("Player 1");


        System.out.println("");

        for (int e = 0; e <karta2.length ; e++) {
 
          System.out.print(karta2[e]+ ",  ");
        }  

        if (break1<48){
          System.out.print("Player 2     " + ran2 + "  nova karta" );
        }else{
          System.out.print("Player 2     No more cards" );
        }
        System.out.println("");

        if(vy2==0){
        }else{
          System.out.println("Posledni hadani druheho hrace " + vy2);
        }
        System.out.println("");
        do{    
          System.out.println("Vlozte pozici karty");//scanner2
          Scanner myObj3 = new Scanner(System.in);
          vy3 = myObj3.nextInt()-1;

          if(vy3 >= karta.length || vy3+1 <= 0){//incorrect number or position2
            System.out.println("Neplatna pozice. Try again.");
            
          }
          if(karta[vy3] <0){
            System.out.println("Karta uy je vylustena. Try again.");
          }
        }while(vy3 >= karta .length || vy3+1 <= 0 || karta[vy3] <0);
        do{
          System.out.println("Vlozte hodnotu karty");
          Scanner myObj4 = new Scanner(System.in);
          vy4 = myObj4.nextDouble();

          if(vy4 > 11|| vy4 < 0){
          System.out.println("Neplatne hodnota. Try again.");
          
          }
          
        }while(vy4 > 11|| vy4 < 0);

        if (Math.floor(karta[vy3])== karta[vy3]-0.5){
          vy4 = vy4 +0.5;
        }else{
          vy4 = vy4 + 0.3;
        }

        if(karta[vy3]== vy4){

          karta[vy3]= karta[vy3]*-1;//correcting2
          count2++;
        }else{

        }
        for (int p = 0; p <karta.length ; p++) {
          if(karta[p]> 0){
            q++;
          }else{
          }
        }
  
        if(q >0){ //ending protocol
          q = 0;
        }else{
          System.out.println("-------------------Player 2 Win-------------------");
          System.exit(0);
        }

        if(count2 == 1){//repeating
          System.out.println("");
          System.out.println("Correct");
          System.out.println("");
          System.out.println("Play again");
    
        }
      }while(count2== 1); 
      System.out.println( " ");
  
      if(break1<48){
        for (int p = 0; p < karta2.length ; p++) {//adding new number2
          karta2re[p]= karta2[p];
        }
        karta2 = new double [karta2.length + 1];
        karta2[karta2.length - 1] = ran2;
        for (int p = 0; p < karta2.length-1 ; p++) {
          karta2[p]= karta2re[p];
        }
        break1++;
      }else{
        ran2 = 0;
      }

      double temp3= 0;
      System.out.println( " ");
    
      for (int i = 0; i < karta2.length ; i++) {

        for (int j = 1; j < karta2.length-i ; j++) {
          if (Math.abs(karta2[j - 1]) < Math.abs(karta2[j])){
            temp3 = karta2[j - 1];
            karta2[j - 1] = karta2[j];
            karta2[j] = temp3;
         
          }
       }

      }
      for (int i = 0; i < karta.length ; i++) {

        for (int j = 0; j < karta.length-1 ; j++) {
          if (Math.abs(karta[j]) > Math.abs(karta[j + 1])){
            double v;
            v = karta[j];
            karta[j] = karta[j + 1];
            karta[j + 1] = v;

          }
        }
      }

      for (int j = 0; j <43 ; j++) {//odelovac2
        System.out.println( " ");
      }
      System.out.println("Incorrect");
      System.out.println("");
      System.out.println("Player 1 on move ");
      System.out.println( " ");
      System.out.println("Press enter to continue");
      Scanner continue2 = new Scanner(System.in);
      continue2.nextLine();
      System.out.println( " ");
    }
  System.out.println("Over 400 moves.Both player lose. ");
  }
}
