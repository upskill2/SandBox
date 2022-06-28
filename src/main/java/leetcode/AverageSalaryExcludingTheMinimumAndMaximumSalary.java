package leetcode;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {

        Arrays.sort(salary);
        double sum = Arrays.stream(salary).sum() - salary[0] - salary[salary.length - 1];

        double av = sum / (salary.length - 2);

        return av;
    }

    public static void main(String[] args) {
        AverageSalaryExcludingTheMinimumAndMaximumSalary av = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};

        av.average(salary);
    }

}
