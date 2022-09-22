public class Human {
    private String n;
    double h;
    double w;
    private double bmi;

    public Human(String name,double height,double weight){
        n = name;
        h = height;
        w = weight;
        bmi = w / ((h/100.0)*(h/100.0));
    }
    public String getName() {
        return n;
    }
    public void setName(String name) {
        n = name;
    }
    public void hello(){
        System.out.println("hello!!,My name is "+ n);
    }
    public double callBMI() {
        return bmi;
    }
    public String myHeath() {
        String msg ="";
        if(bmi<24.5){
            msg ="你太輕了!!多吃一點";
        } else if(bmi>25){
            msg ="你太重了!!少吃一點多運動";
        } else{
            msg ="剛剛好!!你很健康請多保持";
        }
        return msg;
    }
    
}
