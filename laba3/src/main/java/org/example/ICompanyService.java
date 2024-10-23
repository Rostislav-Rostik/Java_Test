package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Company
@class  $444B
@since 19.10.2024 - 15.54
*/

import java.util.List;

public interface ICompanyService {
    Company getTopLevelParent(Company child);
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
}
