public class ZombiePlant{
    private int potency;
    private int treatmentsNeeded;

public ZombiePlant(int potency, int treatmentsNeeded) {
        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency() {
        return potency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }

    public void treat(int treatmentPotency) {
        if (treatmentPotency <= 0) {
            return;
        }

        if (treatmentsNeeded > 0) {
            if (treatmentPotency <= potency) {
                treatmentsNeeded--;
            } else {
                treatmentsNeeded++;
            }
        } else {
            if (treatmentPotency > potency) {
                treatmentsNeeded++;
            }
        }
    }

}