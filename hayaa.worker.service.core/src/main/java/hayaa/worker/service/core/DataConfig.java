package hayaa.worker.service.core;

import java.util.Map;

public class DataConfig {
   public static Map<String,Object> DbConfig=ConfigHelper.getInstance().getDataConfig(DefineTable.DatabaseName);

}
