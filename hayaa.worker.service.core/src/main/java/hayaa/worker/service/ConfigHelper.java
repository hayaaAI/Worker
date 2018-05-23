package hayaa.worker.service;

import Hayaa.ConfigSeed.ConfigTool;

class ConfigHelper extends ConfigTool<WorkConfig,WorkRootConfig> {
     public static ConfigHelper getInstance() {
         return _instance;
     }

     private static ConfigHelper _instance = new ConfigHelper();
     private ConfigHelper(){
         super(DefineTable.WorkServiceComponentID,WorkConfig.class,WorkRootConfig.class);
     }
}
