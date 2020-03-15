package Chapter6;

@SuppressWarnings("hiding")
@FunctionalInterface
public interface TetraFunction<String,Integer,Type,Boolean,Dishes> {
   Dishes apply(String name,int calories,TYPE type,boolean isVegetrain);
}
