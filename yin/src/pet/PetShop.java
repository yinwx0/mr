package pet;

public class PetShop {
    Pet[] pets;
    int foot;

    public PetShop(int len){
       pets = new Pet[len];
    }

    public Pet[] search(String keyword){
        Pet[] pets1 = new Pet[pets.length];
        int c = 0;
        for (Pet pet : pets) {
            if (pet.getName().equals(keyword) || pet.getColor().equals(keyword)) {
                pets1[c++] = pet;
            }
        }
        return pets1;
    }
}
