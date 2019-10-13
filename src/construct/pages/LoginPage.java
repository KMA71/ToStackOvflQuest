package construct.pages;

import construct.roles.BaseRole;
import construct.roles.SaleRole;
import construct.roles.UnderwriterRole;

public class LoginPage {

    public AdminPanel createAdmPanel(BaseRole someRole) {
        if (someRole instanceof SaleRole) {
            return new AdminPanel((SaleRole) someRole);
        } else {
            return new AdminPanel((UnderwriterRole) someRole);
        }
    }
}
