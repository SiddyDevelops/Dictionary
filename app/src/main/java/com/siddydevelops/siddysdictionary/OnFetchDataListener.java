package com.siddydevelops.siddysdictionary;

import com.siddydevelops.siddysdictionary.Models.APIResponse;

public interface OnFetchDataListener {

    void onFetchData(APIResponse apiResponse, String message);

    void onError(String message);
}
