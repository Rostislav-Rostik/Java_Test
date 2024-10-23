package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Company
@class  $444B
@since 19.10.2024 - 15.54
*/

import java.util.List;

public class CompanyService implements ICompanyService {

    @Override
    public Company getTopLevelParent(Company child) {
        Company current = child;
        while (current.getParent() != null) {
            current = current.getParent();
        }
        return current; // This will be the top-level parent
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long count = company.getEmployeeCount();

        // Count employees for child companies
        for (Company child : companies) {
            if (child.getParent() != null && child.getParent().equals(company)) {
                count += getEmployeeCountForCompanyAndChildren(child, companies);
            }
        }

        return count;
    }
}

