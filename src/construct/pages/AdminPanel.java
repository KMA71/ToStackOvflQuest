package construct.pages;

import construct.roles.SaleRole;
import construct.roles.UnderwriterRole;

public class AdminPanel {

    private String name;

    public AdminPanel(SaleRole saleRole) {
        this.name = "Sale's constructor";
    }

    public AdminPanel(UnderwriterRole underwriterRole) {
        this.name = "Underwriter's constructor";
    }


    public String getName() {
        return name;
    }
}
