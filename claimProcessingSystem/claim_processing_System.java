package claimProcessingSystem;

import java.util.Date;

class FraudulentClaimException extends RuntimeException {
    public FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    public InvalidClaimAmountException(String message) {
        super(message);
    }
}

class Claim {
    private double claimAmount;
    private Date claimDate;
    private double policyCoverage;
    private Date policyEndDate;

    public Claim(double claimAmount, Date claimDate, double policyCoverage, Date policyEndDate) {
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.policyCoverage = policyCoverage;
        this.policyEndDate = policyEndDate;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public double getPolicyCoverage() {
        return policyCoverage;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }
}

public class claim_processing_System {

    public static void processClaim(Claim claim) {

        if (claim.getClaimAmount() <= 0 || claim.getClaimAmount() > claim.getPolicyCoverage()) {
            throw new InvalidClaimAmountException("Claim amount is invalid or exceeds policy coverage.");
        }


        if (claim.getClaimDate().after(claim.getPolicyEndDate())) {
            throw new FraudulentClaimException("Claim date is after policy end date.");
        }

        System.out.println("Claim processed successfully.");
    }

    public static void main(String[] args) {

        Claim claim = new Claim(5000, new Date(2024, 7, 1), 2000, new Date(2024, 11, 31));

        try {
            processClaim(claim);
        } catch (InvalidClaimAmountException | FraudulentClaimException e) {
            System.out.println("Exception: " + e.getMessage());

            sendNotificationToClaimsDepartment(e.getMessage());
        }
    }


    public static void sendNotificationToClaimsDepartment(String message) {
        System.out.println("Notification to claims department: " + message);
    }
}
