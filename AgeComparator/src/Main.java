public class Main {
    public static void main(String[] args) {
        int vasyaAge = 3;
        int katyaAge = 3;
        int mishaAge = 3;

        int min = -1;
        int middle = -1;
        int max = -1;

        boolean twoIdentity = false;
        boolean threeIdentity = false;

        twoIdentity = (vasyaAge == katyaAge || vasyaAge == mishaAge || katyaAge == mishaAge) ? true : false;
        threeIdentity = (vasyaAge == katyaAge && vasyaAge == mishaAge) ? true : false;

        if (twoIdentity) {
            if (vasyaAge == katyaAge) {
                min = middle = vasyaAge;
                max = mishaAge;
            } else if (katyaAge == mishaAge) {
                min = middle = katyaAge;
                max = vasyaAge;
            } else {
                min = middle = mishaAge;
                max = katyaAge;
            }
        } else if (threeIdentity) {
            min = max = middle = vasyaAge;
        } else {
            max = (vasyaAge > katyaAge) ? vasyaAge : katyaAge;
            if (max < mishaAge) max = mishaAge;
            min = (vasyaAge < katyaAge) ? vasyaAge : katyaAge;
            if (min > mishaAge) min = mishaAge;

            if (vasyaAge != max && vasyaAge != min) middle = vasyaAge;
            else if (katyaAge != max && katyaAge != min) middle = katyaAge;
            else middle = mishaAge;
        }
        System.out.printf("Minimal age: %d\n" + "Middle age: %d\n" + "Maximal age: %d", min, middle, max);
    }
}
