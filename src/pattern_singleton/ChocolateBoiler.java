package pattern_singleton;

public class ChocolateBoiler {

    private static ChocolateBoiler boiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){}

    public synchronized ChocolateBoiler getInstance(){
        if(boiler==null){
            boiler=new ChocolateBoiler();
        }
        return boiler;
    }

    public void fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
            // заполнение нагревателя молочно-шоколадной смесью
        }
    }

    public void drain(){
        if(!isEmpty()&&isBoiled()){
            // слить нагретое молоко и шоколад
        }
    }

    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            // довесьт содержимое до кипения
            boiled=true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
