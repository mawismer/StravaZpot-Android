package com.sweetzpot.stravazpot.athlete.api;

import com.sweetzpot.stravazpot.athlete.request.GetMyFriendsRequest;
import com.sweetzpot.stravazpot.athlete.rest.FriendRest;
import com.sweetzpot.stravazpot.common.api.StravaAPI;
import com.sweetzpot.stravazpot.common.api.StravaConfig;

public class FriendAPI extends StravaAPI {

    public FriendAPI(StravaConfig config) {
        super(config);
    }

    public GetMyFriendsRequest getMyFriends() {
        return new GetMyFriendsRequest(getAPI(FriendRest.class), this);
    }
}
