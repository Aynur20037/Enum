package Test2;

public enum TrafficLight {
    RED( 30," Красный "),
    GREEN( 20 , " Зеленый "),
    YELLOW( 15 , " Желтый ");
    private int seconds;
    private String color;


    TrafficLight( int time , String color){
        this.seconds=time;
        this.color = color;

    }
    public int getSeconds(){
        return seconds;
    }
    public String getColor(){
        return color;
    }


}
