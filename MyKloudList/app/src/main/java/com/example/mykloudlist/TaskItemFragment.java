package com.example.mykloudlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TaskItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TaskItemFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "id";
    private static final String ARG_PARAM2 = "name";
    private static final String ARG_PARAM3 = "priority";
    private static final String ARG_PARAM4 = "status";



    // TODO: Rename and change types of parameters
    private int mId;
    private String mName;
    private int mPriority;
    private boolean mStatus;

    public TaskItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mId Parameter 1.
     * @param mName Parameter 2.
     * @param mPriority Parameter 3.
     * @param mStatus Parameter 4.
     * @return A new instance of fragment TaskItemFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TaskItemFragment newInstance(int mId, String mName , int mPriority , boolean mStatus ) {
        TaskItemFragment fragment = new TaskItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, mId);
        args.putString(ARG_PARAM2, mName);
        args.putInt(ARG_PARAM3, mPriority);
        args.putBoolean(ARG_PARAM4, mStatus);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mId = getArguments().getInt(ARG_PARAM1);
            mName = getArguments().getString(ARG_PARAM2);
            mPriority = getArguments().getInt(ARG_PARAM3);
            mStatus = getArguments().getBoolean(ARG_PARAM4);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task_item, container, false);
    }
}