package com.etiya.intern.converter;

import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.entity.datatransfer.UserDataTransfer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConverter {

    public List<UserDataTransfer> userEntityListConvertToUserDtoList(List<UserEntity> userEntityList){
        List<UserDataTransfer> userDataTransferList =new ArrayList<>();
        for (UserEntity userEntity : userEntityList){
            UserDataTransfer userDataTransfer = new UserDataTransfer(userEntity.getName());
            userDataTransferList.add(userDataTransfer);
        }
        return userDataTransferList;
    }

}
