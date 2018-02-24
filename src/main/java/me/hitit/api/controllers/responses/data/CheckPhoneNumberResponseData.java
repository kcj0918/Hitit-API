package me.hitit.api.controllers.responses.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.hitit.api.controllers.responses.DefaultResponse;
import me.hitit.api.controllers.responses.DefaultResponse.Status;
import me.hitit.api.utils.res.Strings;
import org.apache.log4j.Logger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckPhoneNumberResponseData {
    private static final Logger LOG = Logger.getLogger(CheckPhoneNumberResponseData.class.getSimpleName());

    Boolean exist;
    private Status status;
    private String msg;

    @JsonIgnore
    public Status getStatus(){
        return this.status  ;
    }
    @JsonIgnore
    public String getMsg(){
        return this.msg;
    }

    public static CheckPhoneNumberResponseData ofCreat(Boolean exist){
        return builder()
                .exist(exist)
                .status(exist==true ? Status.CONFLICT : Status.SUCCESS)
                .msg(exist==true ? Strings.ALREADY_EXIST_PHONE_NUMBER : null)
                .build();
    }
}