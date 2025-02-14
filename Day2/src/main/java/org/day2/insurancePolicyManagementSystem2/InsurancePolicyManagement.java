package org.day2.insurancePolicyManagementSystem2;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Holder: " + policyHolder + ", Expiry: " + expiryDate;
    }
}

public class InsurancePolicyManagement {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private Map<String, InsurancePolicy> insertionOrderMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, InsurancePolicy> expirySortedMap = new TreeMap<>();

    public void addPolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        InsurancePolicy policy = new InsurancePolicy(policyNumber, policyHolder, expiryDate);
        policyMap.put(policyNumber, policy);
        insertionOrderMap.put(policyNumber, policy);
        expirySortedMap.put(expiryDate, policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon() {
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        for (Map.Entry<LocalDate, InsurancePolicy> entry : expirySortedMap.headMap(threshold, true).entrySet()) {
            if (!entry.getKey().isBefore(today)) {
                expiringSoon.add(entry.getValue());
            }
        }
        return expiringSoon;
    }

    public List<InsurancePolicy> getPoliciesByHolder(String policyHolder) {
        List<InsurancePolicy> holderPolicies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyHolder.equals(policyHolder)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, InsurancePolicy>> iterator = expirySortedMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, InsurancePolicy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                policyMap.remove(entry.getValue().policyNumber);
                insertionOrderMap.remove(entry.getValue().policyNumber);
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();
        manager.addPolicy("P123", "John Doe", LocalDate.now().plusDays(10));
        manager.addPolicy("P456", "Alice Smith", LocalDate.now().plusDays(40));
        manager.addPolicy("P789", "John Doe", LocalDate.now().plusDays(5));

        System.out.println("Policy by Number (P123): " + manager.getPolicyByNumber("P123"));
        System.out.println("Policies expiring soon: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies for John Doe: " + manager.getPoliciesByHolder("John Doe"));

        manager.removeExpiredPolicies();
        System.out.println("Remaining Policies: " + manager.policyMap.values());
    }
}
