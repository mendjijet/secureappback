package com.jet.com.secureappback.services;

import com.jet.com.secureappback.domain.Role;
import com.jet.com.secureappback.domain.User;
import com.jet.com.secureappback.dto.UserDTO;
import com.jet.com.secureappback.form.UpdateForm;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

/**
 * @project secureCapita
 * @version 1.0
 * @author MENDJIJET
 * @since 12/06/2024
 */public interface RoleService {
    Role getRoleByUserId(Long id);

    Collection<Role> getRoles();

    //UserDTO createUser(User user);
    UserDTO getUserByEmail(String email);
    void sendVerificationCode(UserDTO user);
    UserDTO verifyCode(String email, String code);
    void resetPassword(String email);
    UserDTO verifyPasswordKey(String key);
    void updatePassword(Long userId, String password, String confirmPassword);
    UserDTO verifyAccountKey(String key);
    UserDTO updateUserDetails(UpdateForm user);
    UserDTO getUserById(Long userId);
    void updatePassword(Long userId, String currentPassword, String newPassword, String confirmNewPassword);
    void updateUserRole(Long userId, String roleName);
    void updateAccountSettings(Long userId, Boolean enabled, Boolean notLocked);
    //UserDTO toggleMfa(String email);
   // void updateImage(UserDTO user, MultipartFile image);
}
