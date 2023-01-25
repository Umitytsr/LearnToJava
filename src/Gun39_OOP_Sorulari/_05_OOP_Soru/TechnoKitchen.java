package Gun39._05_OOP_Soru;

public class TechnoKitchen {
    public static void hazirla(IFood sp){

        if (sp instanceof AdanaKebab){

            ((AdanaKebab) sp).marinade();
            ((AdanaKebab) sp).grill();
        } else if (sp instanceof Lahmacun) {

            ((Lahmacun) sp).dough();
            ((Lahmacun) sp).addMeat();
            ((Lahmacun) sp).bake();
        }else if (sp instanceof Borsh) {

            ((Borsh) sp).boil();
            ((Borsh) sp).eatTomorrow();
        }else if (sp instanceof Palov) {
            ((Palov) sp).boil();
            ((Palov) sp).fry();
        }

        sp.taste();
        System.out.println();
    }
}
