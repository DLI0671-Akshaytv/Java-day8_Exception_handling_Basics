package Policy_Application_process;
class Policy{
    int age;
    boolean has_poor_driving_record;
    boolean has_healthIssues;

    public Policy(int age, boolean has_poor_driving_record, boolean has_healthIssues) {
        this.age = age;
        this.has_poor_driving_record = has_poor_driving_record;
        this.has_healthIssues = has_healthIssues;
    }

    public int getAge() {
        return age;
    }

    public boolean isHas_poor_driving_record() {
        return has_poor_driving_record;
    }

    public boolean isHas_healthIssues() {
        return has_healthIssues;
    }
}
class  InvalidAgeException extends  Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class  PoorDrivingRecordException extends  Exception{
    public PoorDrivingRecordException(String message){
        super(message);
    }
}


public class Policy_application_sym {
    public static void main(String[] args) throws InvalidAgeException,HealthIssueException,PoorDrivingRecordException {
        Policy policy=new Policy(20,false,true);
        try{
            if(policy.getAge()<18){
                throw new InvalidAgeException("Age is invalid");
            }
            if(policy.isHas_healthIssues()){
                throw new HealthIssueException("Validation failed:Health issues detected.");
            }
            if(policy.isHas_poor_driving_record()){
                throw new PoorDrivingRecordException("validation failed: Poor driving record.");
            }


        }catch(InvalidAgeException|PoorDrivingRecordException|HealthIssueException e){
            System.out.println(e.getMessage());

        }

    }
     static class  HealthIssueException extends  Exception{
        public HealthIssueException(String message){
            super(message);
        }
    }

}
