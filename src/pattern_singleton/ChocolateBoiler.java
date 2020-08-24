package pattern_singleton;

public class ChocolateBoiler {

    private static ChocolateBoiler boiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty=true;
        boiled=false;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if(boiler==null){
            boiler=new ChocolateBoiler();
        }
        return boiler;
    }

    public void fill(){
        if(isEmpty()){
            System.out.println("емкость заполняется");
            empty=false;
            boiled=false;
        }else
            System.out.println("нельзя заполнять, емкость уже заполнена");
    }

    public void drain(){
        if(!isEmpty()&&isBoiled()){
            System.out.println("содержимое емкости сливается");
            empty=true;
        }else
            System.out.println("нельзя сливать содержимое емкости");
    }

    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            System.out.println("содержимое емкости доводится до кипения");
            boiled=true;
        }else
            System.out.println("нельзя нагревать емкость");
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
