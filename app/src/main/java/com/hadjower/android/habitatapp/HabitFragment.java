package com.hadjower.android.habitatapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HabitFragment extends Fragment {
    @BindView(R.id.imageViewBackground)
    ImageView imageViewBackground;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.habit_layout, container, false);
        ButterKnife.bind(this, view);

        imageViewBackground.setImageResource(R.drawable.background);
        return view;
    }
}
