package Clone;

import helloworld.Proaddress;

public class Apple implements Cloneable{

    Integer weight;
    String color;
    Proaddress proaddress;

    @Override
    protected Apple clone() throws CloneNotSupportedException {
        Apple a = null;
        try{
            a = (Apple) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return a;
    }

    public Apple(Integer weight, String color, String add) {
        this.weight = weight;
        this.color = color;
        this.proaddress = new Proaddress(add);
    }

    public String getColor(){
        return  color;
    }
    public Integer getWeight(){
        return  weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getProaddress(){
        return this.proaddress.getAdd();
    }
    public void setProaddress(String add){
        this.proaddress.setAdd(add);
    }



}
