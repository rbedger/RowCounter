package com.robenheimer.rowcounter.ui.doproject;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robenheimer.rowcounter.DoProjectActivity;
import com.robenheimer.rowcounter.MainActivity.dummy.DummyContent;
import com.robenheimer.rowcounter.R;

public class DoProjectFragment extends Fragment {

    private DoProjectViewModel mViewModel;

    public static DoProjectFragment newInstance() {
        return new DoProjectFragment();
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.do_project_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String projectId = getActivity()
                .getIntent()
                .getStringExtra(DoProjectActivity.EXTRA_PROJECT_ID);

        DummyContent.DummyItem item = DummyContent.ITEM_MAP.get(projectId);

        mViewModel = new ViewModelProvider(this).get(DoProjectViewModel.class);
        mViewModel.setId(item.id);
        mViewModel.setContent(item.content);
        mViewModel.setDetails(item.details);
    }

}
