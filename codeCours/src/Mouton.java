public class Mouton extends Animal{

    public Mouton(CrierBehavior c, DeplacerBehavior dep){
        this.crierBehavior = c;
        this.deplaceBehavior = dep;
        afficher();
    }

    public void afficher(){
        affiche(crierBehavior, deplaceBehavior);
    }
}
