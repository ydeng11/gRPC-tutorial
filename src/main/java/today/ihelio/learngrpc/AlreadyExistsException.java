package today.ihelio.learngrpc;

/**
 * @author helio
 * @date 2022/8/12
 * @package com.helio.grpc.service
 */
public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}
