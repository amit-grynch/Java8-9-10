package Chapter4;
@SuppressWarnings("hiding")
@FunctionalInterface
public interface TetraFunction<String,Integer,TYPE,Boolean,Dishes> {
    Dishes apply(String name,int calories,TYPE type,boolean isVegetrain );
}
