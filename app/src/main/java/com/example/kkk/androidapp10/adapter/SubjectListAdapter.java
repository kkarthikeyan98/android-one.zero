package com.example.kkk.androidapp10.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kkk.androidapp10.R;
import com.example.kkk.androidapp10.model.subject;

import java.util.LinkedList;
import java.util.List;


public class SubjectListAdapter extends RecyclerView.Adapter<SubjectListAdapter.SubjectViewHolder> {




    class SubjectViewHolder extends RecyclerView.ViewHolder
    {
        private TextView subjectView;
        public TextView subjectDetailView;
        public SubjectListAdapter mListAdapter;

        public SubjectViewHolder(View itemView, SubjectListAdapter adapter ) {
            super(itemView);

            subjectView = (TextView) itemView.findViewById(R.id.subject);
            subjectDetailView = (TextView) itemView.findViewById(R.id.subject_detail);
            this.mListAdapter = adapter;
  //          itemView.setOnClickListener(this);
        }
    }

    private List<subject> mSubjectList;
    private LayoutInflater mInflater;

    public SubjectListAdapter(Context context, List<subject> subjectList)
    {
        mInflater = LayoutInflater.from(context);
        this.mSubjectList = subjectList;

    }

    @NonNull
    @Override
    public SubjectListAdapter.SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mInflater.inflate(R.layout.subject_list,parent, false);
        return new SubjectViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull final SubjectListAdapter.SubjectViewHolder holder, int position) {
        subject mCurrent = mSubjectList.get(position);
        holder.subjectView.setText(mCurrent.getmName());

        holder.subjectDetailView.setText(mCurrent.getmSubDetail());

        holder.subjectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( holder.subjectDetailView.getVisibility() == View.INVISIBLE)
                    holder.subjectDetailView.setVisibility(View.VISIBLE);

                else
                    holder.subjectDetailView.setVisibility(View.INVISIBLE);
            }
        });

   //     if( holder.subjectDetailView.getVisibility() == View.INVISIBLE)
   //         holder.subjectDetailView.setVisibility(View.VISIBLE);


    }

    @Override
    public int getItemCount() {
        return mSubjectList.size();
    }

}



