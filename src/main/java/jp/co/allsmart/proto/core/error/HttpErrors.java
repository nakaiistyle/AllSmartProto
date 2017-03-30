package jp.co.allsmart.proto.core.error;

import org.springframework.http.HttpStatus;

public interface HttpErrors {

    HttpStatus getStatus();

    String getMessage();

    String name();

}
