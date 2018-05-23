package hayaa.worker.service.model;

import hayaa.basemodel.model.GridPager.PagerTotal;
import hayaa.basemodel.model.SearchPamaterMariadbBase;

public class CompanySearchPamater extends SearchPamaterMariadbBase implements PagerTotal {
    @Override
    public int getTotal() {
        return 0;
    }
}
