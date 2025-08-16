package com.timess.codeagent.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.timess.codeagent.model.dto.user.UserQueryRequest;
import com.timess.codeagent.model.entity.User;
import com.timess.codeagent.model.vo.LoginUserVO;
import com.timess.codeagent.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;


/**
 * 用户 服务层。
 *
 * @author timess
 */
public interface UserService extends IService<User> {

//This method is used to register a new user
//It takes three parameters: userAccount, userPassword, and checkPassword
//It returns a long value
    long userRegister(String userAccount, String userPassword, String checkPassword);
//This method is used to log in a user with their account and password
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);


    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    LoginUserVO getLoginUserVO(User user);

    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);
}
