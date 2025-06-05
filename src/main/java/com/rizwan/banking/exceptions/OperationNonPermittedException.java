package com.rizwan.banking.exceptions;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class OperationNonPermittedException {

    private final String errorMsg;

    private final String operatedId;

    private final String source;

    private final String dependency;
}
