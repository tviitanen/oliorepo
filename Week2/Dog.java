public class Dog {
    private String name = "";
    
    public Dog (String n) {
        name = n;
    }
    public String getName() {
        if(name.isEmpty() == true) {
            name = "Doge";
        }
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public void speak(String s) {
        s.trim();
        if(s.isEmpty() == true) {
            s = "Much wow!";
        }
        
        System.out.println(s);
    }
}