package leksione;

public class OuterClass {
    int randomNumber;
    String randomString;

    public OuterClass(int randomNumber,String randomString) {
        this.randomString = randomString;
        this.randomNumber=randomNumber;
    }
    public void printRandomVariables(){
        System.out.println(randomNumber+randomString);
    }




    static class innerClass{
        int rnNr;
        String rnStr;
        public innerClass(int rnNr, String rnStr){
            this.rnNr=rnNr;
            this.rnStr=rnStr;
        }
        public void printRnVar(){
            System.out.println(rnNr+rnStr);
        }


       
    }
}
