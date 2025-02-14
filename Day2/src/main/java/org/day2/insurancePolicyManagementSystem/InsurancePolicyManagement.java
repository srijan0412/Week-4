package org.day2.insurancePolicyManagementSystem;

import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManagement {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Unique Policies:");
        for (Policy policy : hashSet) {
            System.out.println(policy);
        }
    }

    public void displayExpiringSoon() {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        Date thresholdDate = calendar.getTime();

        System.out.println("Policies expiring within 30 days:");
        for (Policy policy : treeSet) {
            if (policy.expiryDate.before(thresholdDate)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("Policies with coverage type: " + coverageType);
        for (Policy policy : hashSet) {
            if (policy.coverageType.equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        for (Policy policy : hashSet) {
            policyCount.put(policy.policyNumber, policyCount.getOrDefault(policy.policyNumber, 0) + 1);
        }

        System.out.println("Duplicate Policies:");
        for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " (Duplicates: " + entry.getValue() + ")");
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        Calendar calendar = Calendar.getInstance();

        calendar.set(2025, Calendar.MARCH, 15);
        system.addPolicy(new Policy("P123", "Alice", calendar.getTime(), "Health", 5000));

        calendar.set(2025, Calendar.FEBRUARY, 10);
        system.addPolicy(new Policy("P124", "Bob", calendar.getTime(), "Auto", 6000));

        calendar.set(2025, Calendar.JANUARY, 25);
        system.addPolicy(new Policy("P125", "Charlie", calendar.getTime(), "Home", 4000));

        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverageType("Auto");
        system.findDuplicatePolicies();
    }
}