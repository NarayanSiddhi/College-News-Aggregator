package com.example.smvitstudentapp.ui.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.smvitstudentapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=Sir MVIT Admin Block, SIR M VISVESVARAYA INSTITUTE, Sir M Visvesvaraya Institute Road, Bengaluru, Karnataka");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {
        for (int i = 0; i < 5; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(getContext());
            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeapp-c237d.appspot.com/o/gallery%2FSirmvit-About-Header-img.jpg?alt=media&token=8d7ac828-0b5c-4b61-8cf5-2282d1da68c7");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeapp-c237d.appspot.com/o/gallery%2Fsir-m-visvesvaraya-institute-of-technology-mvit-bengaluru.jpg?alt=media&token=d9201fc6-fbe4-4778-ba37-b51bcb607140");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeapp-c237d.appspot.com/o/gallery%2FPlacement-Overview-header.jpg?alt=media&token=3ae0704f-29e7-44e0-b29e-5a8a8851b290");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeapp-c237d.appspot.com/o/gallery%2Flib.webp?alt=media&token=b6b4f5a4-bad9-49c7-bbdc-db1d38efa1fb");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeapp-c237d.appspot.com/o/gallery%2FDepartment-Of-Civil-Engineering-Header.jpg?alt=media&token=36487703-f7e8-4f1e-93ba-3cb6e9a2ad79");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            sliderLayout.addSliderView(sliderView);
        }
    }
}