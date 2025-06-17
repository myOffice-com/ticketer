package com.officesuite.ticketer.shared.responsebodies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CommonResponseBody {

    /* * Message of the response.
     */
    private String message;

    /**
     * `data` can hold any type of data that needs to be returned in the response.
     */
    private Object data;

}
