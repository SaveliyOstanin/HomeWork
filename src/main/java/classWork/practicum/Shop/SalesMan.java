package classWork.practicum.Shop;

public class SalesMan extends Employee{

    public double sell(Buyer buyer, Product product,int count){
        double revenue = 0;
        if ((product.getCount() >= count) && (buyer.money >= product.getCoast() * count)){
            product.setCount(product.getCount() - count);
            revenue = product.getCoast() * count;
        }
        return revenue;
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public void setJobTitle(String jobTitle) {
        super.setJobTitle(jobTitle);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
