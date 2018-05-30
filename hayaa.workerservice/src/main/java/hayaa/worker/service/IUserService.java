package hayaa.worker.service;

import hayaa.basemodel.model.GridPager.GridPager;
import hayaa.basemodel.service.IBaseService;
import hayaa.worker.service.model.User;
import hayaa.worker.service.model.UserSearchPamater;
import hayaa.worker.service.model.UserView;

public interface IUserService extends IBaseService<User, UserSearchPamater> {

    GridPager<UserView> GetPager(int page, int size, String nickName);
}
