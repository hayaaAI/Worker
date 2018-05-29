const evn="dev";
const  baseUrl={
    worker:"http://"+evn+".worker.service.xieqj.net:30001/",
    security:"http://test.security.xieqj.net/"
}
const urls={
    authUrl:baseUrl.security+"api/login/IsLogin",
    loginUrl:baseUrl.security+"api/login/Login",
    company_pager_url:baseUrl.worker+"company/pager",
    company_get_url:baseUrl.worker+"company/get",
    company_add_url:baseUrl.worker+"company/add",
    company_edit_url:baseUrl.worker+"company/edit",
    company_del_url:baseUrl.worker+"company/del",
    department_pager_url:baseUrl.worker+"department/pager",
    department_get_url:baseUrl.worker+"department/get",
    department_list_url:baseUrl.worker+"department/list",
    department_add_url:baseUrl.worker+"department/add",
    department_edit_url:baseUrl.worker+"department/edit",
    department_del_url:baseUrl.worker+"department/del",
    job_pager_url:baseUrl.worker+"job/pager",
    job_get_url:baseUrl.worker+"job/get",
    job_add_url:baseUrl.worker+"job/add",
    job_edit_url:baseUrl.worker+"job/edit",
    job_del_url:baseUrl.worker+"job/del",
    person_pager_url:baseUrl.worker+"person/pager",
    person_get_url:baseUrl.worker+"person/get",
    person_list_url:baseUrl.worker+"person/list",
    person_add_url:baseUrl.worker+"person/add",
    person_edit_url:baseUrl.worker+"person/edit",
    person_del_url:baseUrl.worker+"person/del",
}
export default urls