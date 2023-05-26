package com.example.practice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageSlider homeImageSlider = view.findViewById(R.id.imageSlider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.scene1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.scene2, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.scene3, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.scene4, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.scene5, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.scene6, ScaleTypes.FIT));


        homeImageSlider.setImageList(imageList, ScaleTypes.FIT);

        return view;
    }
}