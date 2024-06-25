public class Animal {
    public DeplacerBehavior deplaceBehavior;
    public CrierBehavior crierBehavior;

    public void affiche(CrierBehavior c, DeplacerBehavior dep){
        crierBehavior = c;
        deplaceBehavior = dep;
        faireCri();
        faireDep();
    }
    public void faireCri(){
        crierBehavior.crier();
    }

    public void faireDep(){
        deplaceBehavior.seDeplacer();
    }
}
