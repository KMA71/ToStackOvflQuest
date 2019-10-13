package construct;

import construct.pages.AdminPanel;
import construct.pages.LoginPage;
import construct.roles.BaseRole;
import construct.roles.SaleRole;
import construct.roles.UnderwriterRole;

public class TestCl {
    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        BaseRole someRole;
        someRole = new SaleRole();

        AdminPanel adminPanel = loginPage.createAdmPanel(someRole);
        System.out.println(adminPanel.getName());

        someRole = new UnderwriterRole();

        adminPanel = loginPage.createAdmPanel(someRole);
        System.out.println(adminPanel.getName());

    }
}
