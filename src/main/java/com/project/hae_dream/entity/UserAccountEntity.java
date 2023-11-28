package com.project.hae_dream.entity;

import com.project.hae_dream.dto.UserAccountDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "user_account_table")
public class UserAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userId;

    @Column
    private String userPassword;

    @Column
    private String userName;

    @Column
    private String userAge;

    @Column
    private String userSex;

    public static UserAccountEntity toUserAccountEntity(UserAccountDTO userAccountDTO){
        UserAccountEntity userAccountEntity = new UserAccountEntity();
        userAccountEntity.setId(userAccountDTO.getId());
        userAccountEntity.setUserId(userAccountDTO.getUserId());
        userAccountEntity.setUserPassword(userAccountDTO.getUserPassword());
        userAccountEntity.setUserAge(userAccountDTO.getUserAge());
        userAccountEntity.setUserSex(userAccountDTO.getUserSex());
        userAccountEntity.setUserName(userAccountDTO.getUserName());
        return userAccountEntity;
    }

}