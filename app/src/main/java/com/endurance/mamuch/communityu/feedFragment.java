package com.endurance.mamuch.communityu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mamuc on 4/2/2017.
 */

public class feedFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle SavedInstanceState){
        View v = inflater.inflate(R.layout.feed_activity, container, false);
        return v;
    }
}
