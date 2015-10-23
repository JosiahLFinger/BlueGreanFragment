package com.example.josiahwilliams.bluegreanfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Josiah Williams on 9/28/2015.
 */
public class GreenFragment extends Fragment{

@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.green_fragment, container, false);
}

}
