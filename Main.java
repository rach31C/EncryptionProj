import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

      int option = 0; 
      menuStart();
      option = Input.readInt();
      if(option == 1){
        menuPreEncrypt();       
       } else if(option ==2){
        menuDecrypt();
      } else{
        print("\nSee you next time!");
      }

      //I hate Bayside High School
      //j%M⠕ց⠙m%Xց⠘m⠔⠔ցq⠏⠕xց~fG%ցj⠒fmց%⠉
      //%cip2%cip3%strM%fill4ց%subsubBille

      //⠙f⠐ԛԛwfz
      //%strM%cip5%fill3ԛ%strM%subsubBille

  

  }

  void menuStart(){
    print("\n");
    print("ฅ^=>ヮ<=^₎");
    print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
    print("Welcome! Thanks for using our encryption/decryption service!");
    print("\n");
    print("Do you want to encrypt or decrypt your message?");
    print("-----------------------------------------------");   
    print("1 - Encrypt");
    print("2 - Decrypt");
    print("3 - Exit");
    print("\n");
    print("Please kindly choose one.");
  }

  void menuPreEncrypt(){
    print("\n");
    print("ฅ(＾=´ω｀=＾ฅ)");
    print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
    print("You chose to Encrypt!");
    
    print("\nPlease put your text here.");
    String userText = "";
    userText = Input.readString();
    
    print("\nThanks! \n\nHow many times do you want to encrypt this?");
    print("0 - Exit");
    int numOfTimes = 0; 
    numOfTimes = Input.readInt();
    
    if(numOfTimes == 1){
        menuEncrypt();
        int userEnChoice = 0;
        userEnChoice = Input.readInt();

        if(userEnChoice == 1){
            print("Your encoded word is: ");
            print(strMEncode(userText));
            print("The password to decode your word is: StrM");

        } else if(userEnChoice == 2){
            int keyShift = 0;
            print("How many times would you like to shift your letters?");
            keyShift = Input.readInt();

            print("Your encoded word is: ");
            print(cipEncode(userText, keyShift));
            print("The password to decode your word is : " + "cip" + keyShift);

        } else if(userEnChoice == 3){
            print("How many letters do you want skip? Ex: 3 skips = abc(X)def(X)ghi");
            int parts = 0;
            parts = Input.readInt();
            print("Gotcha!");
            print("Please choose a letter from a-z to fill inbetween.");
            String fill = "";
            fill = altLetter();  

            print("Your encoded word is: ");
            print(fillEncode(userText, parts, fill));
            print("The password to decode your word is : " + "fill" + parts + fill);

        } else if(userEnChoice == 4){

            char[] sub = new char[24];
            sub[0] = 'A';
            sub[1] = 'E';
            sub[2] = 'I';
            sub[3] = 'O';
            sub[4] = 'U';
            sub[5] = 'Y';
            sub[6] = 'R';
            sub[7] = 'T';
            sub[8] = 'N';
            sub[9] = 'S';
            sub[10] = 'H';
            sub[11] = 'L';
            sub[12] = 'a';
            sub[13] = 'e';
            sub[14] = 'i';
            sub[15] = 'o';
            sub[16] = 'u';
            sub[17] = 'y';
            sub[18] = 'r';
            sub[19] = 't';
            sub[20] = 'n';
            sub[21] = 's';
            sub[22] = 'h';
            sub[23] = 'l';

            char[] subMiSym = new char[24];
            subMiSym[0] = '☀';
            subMiSym[1] = '☁';
            subMiSym[2] = '☂';
            subMiSym[3] = '☃';
            subMiSym[4] = '☄';
            subMiSym[5] = '★';
            subMiSym[6] = '☆';
            subMiSym[7] = '☇';
            subMiSym[8] = '☈';
            subMiSym[9] = '☉';
            subMiSym[10] = '☊';
            subMiSym[11] = '☋';
            subMiSym[12] = '☌';
            subMiSym[13] = '☍';
            subMiSym[14] = '☎';
            subMiSym[15] = '☏';
            subMiSym[16] = '☐';
            subMiSym[17] = '☑';
            subMiSym[18] = '☒';
            subMiSym[19] = '☓';
            subMiSym[20] = '☙';
            subMiSym[21] = '☚';
            subMiSym[22] = '☛';
            subMiSym[23] = '☜';


            char[] subBille = new char[24];
            subBille[0] = '⠁';
            subBille[1] = '⠂';
            subBille[2] = '⠃';
            subBille[3] = '⠄';
            subBille[4] = '⠅';
            subBille[5] = '⠆';
            subBille[6] = '⠇';
            subBille[7] = '⠈';
            subBille[8] = '⠉';
            subBille[9] = '⠊';
            subBille[10] = '⠋';
            subBille[11] = '⠌';
            subBille[12] = '⠍';
            subBille[13] = '⠎';
            subBille[14] = '⠏';
            subBille[15] = '⠐';
            subBille[16] = '⠑';
            subBille[17] = '⠒';
            subBille[18] = '⠓';
            subBille[19] = '⠔';
            subBille[20] = '⠕';
            subBille[21] = '⠗';
            subBille[22] = '⠘';
            subBille[23] = '⠙';

            print("Please kindly choose 1 or 2");
            print("1 : Substitute for Miscellaneous Symbols.");
            print("2 : Substitute for Braille Symbols.");
            int subChoice = 0;
            subChoice = Input.readInt();
            char[] chosenSub = (subChoice == 1) ? subMiSym : subBille;
            String chosenSubText = (subChoice == 1) ? "subMiSym" : "subBille";

            print("Your encoded word is: ");
            print(subEncode(userText, sub, chosenSub));
            print("The password to decode your word is : " + chosenSubText);

        }else{
            print("\nSee you next time!");
        }

    } else if(numOfTimes > 1){
        String password ="";
        for (int x = 1; x<= numOfTimes; x++){
            menuEncryptLoop();
            int userEnChoice = 0;
            userEnChoice = Input.readInt();
            if(userEnChoice == 1){
                print("Gotcha!");
                userText = strMEncode(userText);
                password += "%" +"strM";
                

            } else if(userEnChoice == 2){
                int keyShift = 0;
                print("How many times would you like to shift your letters?");
                keyShift = Input.readInt();

                print("Gotcha!");
                userText = cipEncode(userText, keyShift);

                 password += "%" + "cip"+keyShift;

            } else if(userEnChoice == 3){
                print("How many letters do you want skip? Ex: 3 skips = abc(X)def(X)ghi");
                int parts = 0;
                parts = Input.readInt();
                print("Gotcha!");
                print("Please choose a letter from a-z to fill inbetween.");
                String fill = "";
                fill = altLetter();  

                print("Gotcha!");
                userText = fillEncode(userText,parts, fill);
                password += "%" + "fill" + parts + fill;

            } else if(userEnChoice == 4){

                char[] sub = new char[24];
                sub[0] = 'A';
                sub[1] = 'E';
                sub[2] = 'I';
                sub[3] = 'O';
                sub[4] = 'U';
                sub[5] = 'Y';
                sub[6] = 'R';
                sub[7] = 'T';
                sub[8] = 'N';
                sub[9] = 'S';
                sub[10] = 'H';
                sub[11] = 'L';
                sub[12] = 'a';
                sub[13] = 'e';
                sub[14] = 'i';
                sub[15] = 'o';
                sub[16] = 'u';
                sub[17] = 'y';
                sub[18] = 'r';
                sub[19] = 't';
                sub[20] = 'n';
                sub[21] = 's';
                sub[22] = 'h';
                sub[23] = 'l';

                char[] subMiSym = new char[24];
                subMiSym[0] = '☀';
                subMiSym[1] = '☁';
                subMiSym[2] = '☂';
                subMiSym[3] = '☃';
                subMiSym[4] = '☄';
                subMiSym[5] = '★';
                subMiSym[6] = '☆';
                subMiSym[7] = '☇';
                subMiSym[8] = '☈';
                subMiSym[9] = '☉';
                subMiSym[10] = '☊';
                subMiSym[11] = '☋';
                subMiSym[12] = '☌';
                subMiSym[13] = '☍';
                subMiSym[14] = '☎';
                subMiSym[15] = '☏';
                subMiSym[16] = '☐';
                subMiSym[17] = '☑';
                subMiSym[18] = '☒';
                subMiSym[19] = '☓';
                subMiSym[20] = '☙';
                subMiSym[21] = '☚';
                subMiSym[22] = '☛';
                subMiSym[23] = '☜';


                char[] subBille = new char[24];
                subBille[0] = '⠁';
                subBille[1] = '⠂';
                subBille[2] = '⠃';
                subBille[3] = '⠄';
                subBille[4] = '⠅';
                subBille[5] = '⠆';
                subBille[6] = '⠇';
                subBille[7] = '⠈';
                subBille[8] = '⠉';
                subBille[9] = '⠊';
                subBille[10] = '⠋';
                subBille[11] = '⠌';
                subBille[12] = '⠍';
                subBille[13] = '⠎';
                subBille[14] = '⠏';
                subBille[15] = '⠐';
                subBille[16] = '⠑';
                subBille[17] = '⠒';
                subBille[18] = '⠓';
                subBille[19] = '⠔';
                subBille[20] = '⠕';
                subBille[21] = '⠗';
                subBille[22] = '⠘';
                subBille[23] = '⠙';

                print("Please kindly choose 1 or 2");
                print("1 : Substitute for Miscellaneous Symbols.");
                print("2 : Substitute for Braille Symbols.");
                int subChoice = 0;
                subChoice = Input.readInt();
                char[] chosenSub = (subChoice == 1) ? subMiSym : subBille;
                String chosenSubText = (subChoice == 1) ? "subMiSym" : "subBille";

                print("Gotcha!");
                userText = subEncode(userText, sub, chosenSub);
                password += "%"+"sub"+chosenSubText;

            }else{
                print("\nTaking away one encryption step...");
            }
            userText = userText;
         }
         print("Your encoded message is: " + userText);
         print("\n");
         print("The password to decode your word is: " + password);
         print("Please copy and paste this somewhere safe so you can access your encoded message!\n");
         print("\nHsst... If you want to keep your password even more secure, you can encrypt it!");
    } else {
      print("See you next time!");
    }
     
  }
  
  void menuEncrypt(){
    print("\n");
    print("ฅ(＾=´ω｀=＾ฅ)");
    print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
    print("\n");
    print("Here are your encryption options!");
    print("-----------------------------------------------");    
    print("1 - String Manipulation");
    print("2 - Cipher");
    print("3 - Filler");
    print("4 - Substitution");
    print("5 - Exit");
    print("\n");
    print("Please kindly choose one.");
    
  }

   void menuEncryptLoop(){
    print("\n-----------------------------------------------"); 
    print("ฅ(＾=´ω｀=＾ฅ)");
    print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
    print("\n");
    print("Here are your encryption options!");
    print("-----------------------------------------------");    
    print("1 - String Manipulation");
    print("2 - Cipher");
    print("3 - Filler");
    print("4 - Substitution");
    print("5 - Take Away An Encryption Step");
    print("\n");
    print("Please kindly choose one.");
    
  }
  
  void menuDecrypt(){
    print("\n");
    print("ฅ(＾=Φ ω Φ=^)ฅ");
    print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
    print("\n");
    print("You chose to Decrypt!");
    
    print("\nPlease put in your password!");
    String userPassword = "";
    userPassword = Input.readString();
    if (userPassword.startsWith("%")) {
        userPassword = userPassword.substring(1).trim();
    }
    print("-----------------------------------------------");   
    print("\nPlease put your text in.");
    String userText = "";
    userText = Input.readString().trim();
    print("-----------------------------------------------");
    print("\nThanks!");

    if(userPassword.contains("%")){
        String[] spliter = userPassword.split("%");
        for (int x = spliter.length - 1; x >= 0; x--) {
        String bld = spliter[x];
        if(bld.startsWith("strM")){
            userText = strMDecode(userText);
        } else if(bld.startsWith("cip")){
            int keyShift = Integer.parseInt(bld.substring(3));
            userText = cipDecode(userText, keyShift);
        } else if(bld.startsWith("fill")){
            int parts = Integer.parseInt(bld.substring(4,5));
            String delete = bld.substring(5,6);
            userText = fillDecode(userText, parts, delete);
        } else if(bld.startsWith("subsub")){
            if(bld.contains("Bille")){
                char[] sub = new char[24];
                sub[0] = 'A';
                sub[1] = 'E';
                sub[2] = 'I';
                sub[3] = 'O';
                sub[4] = 'U';
                sub[5] = 'Y';
                sub[6] = 'R';
                sub[7] = 'T';
                sub[8] = 'N';
                sub[9] = 'S';
                sub[10] = 'H';
                sub[11] = 'L';
                sub[12] = 'a';
                sub[13] = 'e';
                sub[14] = 'i';
                sub[15] = 'o';
                sub[16] = 'u';
                sub[17] = 'y';
                sub[18] = 'r';
                sub[19] = 't';
                sub[20] = 'n';
                sub[21] = 's';
                sub[22] = 'h';
                sub[23] = 'l';

                char[] subBille = new char[24];
                subBille[0] = '⠁';
                subBille[1] = '⠂';
                subBille[2] = '⠃';
                subBille[3] = '⠄';
                subBille[4] = '⠅';
                subBille[5] = '⠆';
                subBille[6] = '⠇';
                subBille[7] = '⠈';
                subBille[8] = '⠉';
                subBille[9] = '⠊';
                subBille[10] = '⠋';
                subBille[11] = '⠌';
                subBille[12] = '⠍';
                subBille[13] = '⠎';
                subBille[14] = '⠏';
                subBille[15] = '⠐';
                subBille[16] = '⠑';
                subBille[17] = '⠒';
                subBille[18] = '⠓';
                subBille[19] = '⠔';
                subBille[20] = '⠕';
                subBille[21] = '⠗';
                subBille[22] = '⠘';
                subBille[23] = '⠙';

                userText = subDecode(userText,sub,subBille);
            } else if(bld.contains("MiSym")){
                char[] sub = new char[24];
                sub[0] = 'A';
                sub[1] = 'E';
                sub[2] = 'I';
                sub[3] = 'O';
                sub[4] = 'U';
                sub[5] = 'Y';
                sub[6] = 'R';
                sub[7] = 'T';
                sub[8] = 'N';
                sub[9] = 'S';
                sub[10] = 'H';
                sub[11] = 'L';
                sub[12] = 'a';
                sub[13] = 'e';
                sub[14] = 'i';
                sub[15] = 'o';
                sub[16] = 'u';
                sub[17] = 'y';
                sub[18] = 'r';
                sub[19] = 't';
                sub[20] = 'n';
                sub[21] = 's';
                sub[22] = 'h';
                sub[23] = 'l';

                char[] subMiSym = new char[24];
                subMiSym[0] = '☀';
                subMiSym[1] = '☁';
                subMiSym[2] = '☂';
                subMiSym[3] = '☃';
                subMiSym[4] = '☄';
                subMiSym[5] = '★';
                subMiSym[6] = '☆';
                subMiSym[7] = '☇';
                subMiSym[8] = '☈';
                subMiSym[9] = '☉';
                subMiSym[10] = '☊';
                subMiSym[11] = '☋';
                subMiSym[12] = '☌';
                subMiSym[13] = '☍';
                subMiSym[14] = '☎';
                subMiSym[15] = '☏';
                subMiSym[16] = '☐';
                subMiSym[17] = '☑';
                subMiSym[18] = '☒';
                subMiSym[19] = '☓';
                subMiSym[20] = '☙';
                subMiSym[21] = '☚';
                subMiSym[22] = '☛';
                subMiSym[23] = '☜';

                userText = subDecode(userText,sub,subMiSym);
            } else {
                print("Invalid");
            }
        } else {
            print("Invalid Password...");
        }}
        userText = userText;
    } else {
        if(userPassword.startsWith("strM")){
            userText = strMDecode(userText);
        } else if(userPassword.startsWith("cip")){
            int keyShift = Integer.parseInt(userPassword.substring(3));
            userText = cipDecode(userText, keyShift);
        } else if(userPassword.startsWith("fill")){
            int parts = Integer.parseInt(userPassword.substring(4,5));
            String delete = userPassword.substring(5,6);
            userText = fillDecode(userText, parts, delete);
        } else if(userPassword.startsWith("subsub")){
            if(userPassword.contains("Bille")){
                char[] sub = new char[24];
                sub[0] = 'A';
                sub[1] = 'E';
                sub[2] = 'I';
                sub[3] = 'O';
                sub[4] = 'U';
                sub[5] = 'Y';
                sub[6] = 'R';
                sub[7] = 'T';
                sub[8] = 'N';
                sub[9] = 'S';
                sub[10] = 'H';
                sub[11] = 'L';
                sub[12] = 'a';
                sub[13] = 'e';
                sub[14] = 'i';
                sub[15] = 'o';
                sub[16] = 'u';
                sub[17] = 'y';
                sub[18] = 'r';
                sub[19] = 't';
                sub[20] = 'n';
                sub[21] = 's';
                sub[22] = 'h';
                sub[23] = 'l';

                char[] subBille = new char[24];
                subBille[0] = '⠁';
                subBille[1] = '⠂';
                subBille[2] = '⠃';
                subBille[3] = '⠄';
                subBille[4] = '⠅';
                subBille[5] = '⠆';
                subBille[6] = '⠇';
                subBille[7] = '⠈';
                subBille[8] = '⠉';
                subBille[9] = '⠊';
                subBille[10] = '⠋';
                subBille[11] = '⠌';
                subBille[12] = '⠍';
                subBille[13] = '⠎';
                subBille[14] = '⠏';
                subBille[15] = '⠐';
                subBille[16] = '⠑';
                subBille[17] = '⠒';
                subBille[18] = '⠓';
                subBille[19] = '⠔';
                subBille[20] = '⠕';
                subBille[21] = '⠗';
                subBille[22] = '⠘';
                subBille[23] = '⠙';

                userText = subDecode(userText,sub,subBille);
            } else if(userPassword.contains("MiSym")){
                char[] sub = new char[24];
                sub[0] = 'A';
                sub[1] = 'E';
                sub[2] = 'I';
                sub[3] = 'O';
                sub[4] = 'U';
                sub[5] = 'Y';
                sub[6] = 'R';
                sub[7] = 'T';
                sub[8] = 'N';
                sub[9] = 'S';
                sub[10] = 'H';
                sub[11] = 'L';
                sub[12] = 'a';
                sub[13] = 'e';
                sub[14] = 'i';
                sub[15] = 'o';
                sub[16] = 'u';
                sub[17] = 'y';
                sub[18] = 'r';
                sub[19] = 't';
                sub[20] = 'n';
                sub[21] = 's';
                sub[22] = 'h';
                sub[23] = 'l';

                char[] subMiSym = new char[24];
                subMiSym[0] = '☀';
                subMiSym[1] = '☁';
                subMiSym[2] = '☂';
                subMiSym[3] = '☃';
                subMiSym[4] = '☄';
                subMiSym[5] = '★';
                subMiSym[6] = '☆';
                subMiSym[7] = '☇';
                subMiSym[8] = '☈';
                subMiSym[9] = '☉';
                subMiSym[10] = '☊';
                subMiSym[11] = '☋';
                subMiSym[12] = '☌';
                subMiSym[13] = '☍';
                subMiSym[14] = '☎';
                subMiSym[15] = '☏';
                subMiSym[16] = '☐';
                subMiSym[17] = '☑';
                subMiSym[18] = '☒';
                subMiSym[19] = '☓';
                subMiSym[20] = '☙';
                subMiSym[21] = '☚';
                subMiSym[22] = '☛';
                subMiSym[23] = '☜';

                userText = subDecode(userText,sub,subMiSym);
            } else {
                print("Invalid");
            }
        } else {
            print(" ");
        }
    }

    print("\n（ง=＾･ Д ･＾=）ง Solving...Ah hah!\n");
    print("Your decoded text is: " + userText);
    print("❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀~~~~~❀");
    print("\n(=^･ω･^=))ﾉ彡☆");
    print("Thanks for using our service!");
    //qⲣ#ⲣwⲣkⲣhⲣ#ⲣvⲣwⲣdⲣlⲣuⲣvⲣzⲣrⲣgⲣ#ⲣjⲣqⲣlⲣsⲣpⲣxⲣmⲣ
    //%strM%cip3%fill1ⲣ
  }

  String altLetter(){
    String userInput = Input.readString();

    HashMap<String , String > altLetter = new HashMap<String , String >();

    altLetter.put("a", "а");
    altLetter.put("b", "Ƅ");
    altLetter.put("c", "ᴄ");
    altLetter.put("d", "ԁ");
    altLetter.put("e", "ҽ");
    altLetter.put("f", "ｆ");
    altLetter.put("g", "ց");
    altLetter.put("h", "հ");
    altLetter.put("i", "і");
    altLetter.put("j", "ϳ");
    altLetter.put("k", "ｋ");
    altLetter.put("l", "ⅼ");
    altLetter.put("m", "ｍ");
    altLetter.put("n", "ո");
    altLetter.put("o", "ο");
    altLetter.put("p", "ⲣ");
    altLetter.put("q", "ԛ");
    altLetter.put("r", "ꭈ");
    altLetter.put("s", "ꮪ");
    altLetter.put("t", "ｔ");
    altLetter.put("u", "ս");
    altLetter.put("v", "ᴠ");
    altLetter.put("w", "ԝ");
    altLetter.put("x", "х");
    altLetter.put("y", "у");
    altLetter.put("z", "ᴢ");
    return altLetter.get(userInput); 
  }

 

  
  String strMEncode(String word){
    int half = word.length()/2;

    String firstHalf = word.substring(0,half);
    String secondHalf = word.substring(half);

    String firstHalfBld = "";
    for (int x = firstHalf.length()-1; x>=0; x--){
           firstHalfBld += firstHalf.substring(x, x+1);
    }
    
    return secondHalf + firstHalfBld;
  }
  
 
  String cipEncode(String word, int keyShift){
    String bld="";
    int ascii = 0;
    char ch='\0';
    for(int x=0; x<=word.length()-1;x++){
      ch=word.charAt(x);
      ascii=(int)ch;
      if(ascii == 90){
        ascii = 65;
      }
      else if( ascii == 122){
        ascii = 97;
      }
      else{
        ascii+=keyShift;
      }
      bld+= (char)ascii;
    }

    return bld;
  }
  
  String fillEncode(String word, int parts, String fill){ 
    String bld = "";
    
    for (int x = 0 ; x<word.length(); x++){
      bld += word.charAt(x);
      if((x+1)%parts == 0){
        bld += fill;
      }
    }
      
    return bld;
    
  }

  int preSubEncode(char ch, char[] arry){
    for(int x=0; x<=arry.length-1; x++){
      if(arry[x]==ch){
        return x;
      }
    }
    return -1;
  }
  
  String subEncode(String word, char[] sub, char[] sub2){
    String bld = "";
    char ch ='\0';
    int index = 0;
    for(int x=0; x<=word.length()-1; x++){
      ch = word.charAt(x);
      index = preSubEncode(ch,sub);
      if(index != -1){
        bld += sub2[index];
      }
      else{
        bld += ch;
      }
    }
    return bld;
  }

  ///////////////////////////////////////////////

  String strMDecode(String word){
    int half = word.length()/2;
    int oddOrEven = word.length()%2 == 0 ? half : half + 1;

    
    String firstHalf = word.substring(0,oddOrEven);
    String secondHalf = word.substring(oddOrEven);

    String secondHalfBld = "";
    for (int x = secondHalf.length()-1; x>=0; x--){
           secondHalfBld += secondHalf.substring(x, x+1);
    }

    return secondHalfBld + firstHalf;

  }

  String cipDecode(String word, int keyShift){
    String bld="";
      int ascii;
      char ch='\0';
      for(int x=0; x<=word.length()-1;x++){
        ch=word.charAt(x);
        ascii=(int)ch;

        if(ascii == 65){
          ascii = 90;
        }
        else if( ascii == 97){
          ascii = 122;
        }
        else{
          ascii-=keyShift;
        }
        bld += (char)ascii;
      }

      return bld;
  }

  String fillDecode(String word, int parts, String delete){
        String bld = "";

        for (int x = 0 ; x<word.length(); x++){
            if(((x+1)%parts == 0) && (word.substring(x,x+1).equals(delete))){
                bld += "";
            } else if(((x+1)%parts != 0) && (word.substring(x,x+1).equals(delete))){
                bld += "";
            } else {
                bld += word.charAt(x);
            }
        
        }

        return bld;
  }

  String subDecode(String word, char[] sub2, char[] sub){
    String bld = "";
    char ch ='\0';
    int index = 0;
    for(int x=0; x<=word.length()-1; x++){
      ch = word.charAt(x);
      index = preSubEncode(ch,sub);
      if(index != -1){
        bld += sub2[index];
      }
      else{
        bld += ch;
      }
    }
    return bld;
  }
  

}


// https://gist.github.com/StevenACoffman/a5f6f682d94e38ed804182dc2693ed4b

// https://github.com/codebox/homoglyph/blob/master/raw_data/chars.txt
