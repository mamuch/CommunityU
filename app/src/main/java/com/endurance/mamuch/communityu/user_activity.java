package com.endurance.mamuch.communityu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mamuc on 4/2/2017.
 */

public class user_activity extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle SavedInstanceState){
        View v = inflater.inflate(R.layout.user_profile, container);
        return v;
    }
}