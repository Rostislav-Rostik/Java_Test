package org.example;

/*
@author   $Dzedzinskyi_Rostyslav
@project   $Company
@class  $444B
@since 19.10.2024 - 15.54
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyServiceTest {

    private ICompanyService companyService;
    private Company parentCompany;
    private Company childCompany1;
    private Company childCompany2;
    private Company grandChildCompany;

    @BeforeEach
    void setUp() {
        companyService = new CompanyService();

        parentCompany = new Company(null, 100); // Parent company with 100 employees
        childCompany1 = new Company(parentCompany, 50); // Child 1 with 50 employees
        childCompany2 = new Company(parentCompany, 75); // Child 2 with 75 employees
        grandChildCompany = new Company(childCompany1, 25); // Grandchild with 25 employees
    }

    @Test
    void testGetTopLevelParentWithGrandchild() {
        Company result = companyService.getTopLevelParent(grandChildCompany);
        assertEquals(parentCompany, result);
    }

    @Test
    void testGetTopLevelParentWithChild() {
        Company result = companyService.getTopLevelParent(childCompany1);
        assertEquals(parentCompany, result);
    }

    @Test
    void testGetTopLevelParentWithParent() {
        Company result = companyService.getTopLevelParent(parentCompany);
        assertEquals(parentCompany, result); // A parent should return itself
    }

    @Test
    void testGetEmployeeCountForCompanyAndChildren() {
        List<Company> companies = Arrays.asList(parentCompany, childCompany1, childCompany2, grandChildCompany);
        long count = companyService.getEmployeeCountForCompanyAndChildren(parentCompany, companies);
        assertEquals(100 + 50 + 75 + 25, count); // Parent + Children + Grandchildren
    }

    @Test
    void testGetEmployeeCountForSingleCompany() {
        List<Company> companies = Arrays.asList(childCompany1);
        long count = companyService.getEmployeeCountForCompanyAndChildren(childCompany1, companies);
        assertEquals(50, count); // Only child company employees
    }

    @Test
    void testGetEmployeeCountForNoChildren() {
        Company onlyChild = new Company(parentCompany, 30);
        List<Company> companies = Arrays.asList(onlyChild);
        long count = companyService.getEmployeeCountForCompanyAndChildren(onlyChild, companies);
        assertEquals(30, count); // Only itself
    }

    @Test
    void testGetEmployeeCountForEmptyList() {
        long count = companyService.getEmployeeCountForCompanyAndChildren(parentCompany, Arrays.asList());
        assertEquals(100, count); // Parent with no children should return its own count
    }

    @Test
    void testGetTopLevelParentWithNoParent() {
        Company noParent = new Company(null, 40);
        Company result = companyService.getTopLevelParent(noParent);
        assertEquals(noParent, result); // Should return itself
    }

    @Test
    void testGetEmployeeCountWithMultipleLevels() {
        Company childCompany3 = new Company(childCompany2, 40); // Another level down
        List<Company> companies = Arrays.asList(parentCompany, childCompany1, childCompany2, childCompany3, grandChildCompany);
        long count = companyService.getEmployeeCountForCompanyAndChildren(childCompany2, companies);
        assertEquals(75 + 40, count); // Child 2 + its own children
    }

    @Test
    void testGetEmployeeCountWithNestedCompanies() {
        Company deepChild = new Company(grandChildCompany, 10);
        List<Company> companies = Arrays.asList(parentCompany, childCompany1, childCompany2, grandChildCompany, deepChild);
        long count = companyService.getEmployeeCountForCompanyAndChildren(grandChildCompany, companies);
        assertEquals(25 + 10, count); // Grandchild + Deep Child
    }
}
