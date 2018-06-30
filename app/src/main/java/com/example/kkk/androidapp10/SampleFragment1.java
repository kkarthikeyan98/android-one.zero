package com.example.kkk.androidapp10;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kkk.androidapp10.adapter.SubjectListAdapter;
import com.example.kkk.androidapp10.model.subject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class SampleFragment1 extends Fragment {

    public SampleFragment1() {
        // Required empty public constructor
    }


    private int mCount = 0;
    private List<subject> subjectList = new ArrayList<>();

    private SubjectListAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample_fragment1, container, false);

        final RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        mAdapter = new SubjectListAdapter(getActivity(),subjectList);

        prepareSubjectData();

        recyclerView.setAdapter(mAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FloatingActionButton fab =  view.findViewById(R.id.fab);
/*
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int subjectListSize = subjectList.size();

                mLinkedList.addLast("Word " + subjectListSize);

                recyclerView.getAdapter().notifyItemInserted(subjectListSize);

                recyclerView.smoothScrollToPosition(subjectListSize);
            }
        });
*/
        return view;
    }

    private void prepareSubjectData() {

        subject newSub = new subject(1,"Physics","First Subject");
        subjectList.add(newSub);

        newSub = new subject(2,"Chemistry","Second Subject");
        subjectList.add(newSub);

        newSub = new subject(3,"Maths","Third Subject");
        subjectList.add(newSub);

    }

}
