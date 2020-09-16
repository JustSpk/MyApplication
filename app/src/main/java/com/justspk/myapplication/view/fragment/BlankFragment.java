package com.justspk.myapplication.view.fragment;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.justspk.myapplication.R;
import com.justspk.myapplication.databinding.BlankFragmentBinding;
import com.justspk.myapplication.viewModel.BlankViewModel;

public class BlankFragment extends Fragment {

    private BlankViewModel mViewModel;

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        BlankFragmentBinding binding=BlankFragmentBinding.inflate(getLayoutInflater(),container,false);
        return inflater.inflate(R.layout.blank_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BlankViewModel.class);
        // TODO: Use the ViewModel
    }

}