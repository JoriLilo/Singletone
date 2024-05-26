package leksione;

public class OutClass {
    private String textToPrint;
    private Integer numberToPrint;

    public OutClass(String ujjfj, int i) {
    }

    public String getTextToPrint() {
        return textToPrint;
    }

    public Integer getNumberToPrint() {
        return numberToPrint;
    }
    
    public void setTextToPrint(Integer numberToPrint, String textToPrint){
        System.out.println(this.textToPrint +" "+ this.numberToPrint);
        
        class LocalClassA{
            String name="test name";
            String lastName="test last name";
            
            public void printFullName(){
                System.out.println(name+" "+lastName);
            }
        }
        LocalClassA localClassA=new LocalClassA();
        
    }
}
