package jwt.backend.service.user_management;

import jwt.backend.dto.ChangePasswordDto;
import jwt.backend.dto.request.auth.LoginRequest;
import jwt.backend.dto.request.auth.RegistrationRequest;
import jwt.backend.dto.request.auth.UserCreateRequest;
import jwt.backend.dto.request.auth.UserUpdateRequest;
import jwt.backend.dto.response.CommonResponse;
import jwt.backend.dto.response.LoginResponse;
import jwt.backend.exception.user_management.EmailNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

public interface UserService {
    public LoginResponse signIn(LoginRequest request, HttpServletRequest httpServletRequest);

    public CommonResponse addUser(UserCreateRequest request);
    public CommonResponse registration(RegistrationRequest request);

    public CommonResponse updateUserInfo(UserUpdateRequest request);

    public CommonResponse deleteUserProfile(Long id);

    public CommonResponse changeUserPassword(ChangePasswordDto changePasswordDto);

    public CommonResponse resetPassword(String email) throws EmailNotFoundException;

    Long count();

}
