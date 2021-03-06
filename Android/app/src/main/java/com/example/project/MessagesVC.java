package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.*;
import com.example.project.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.support.v7.widget.LinearLayoutManager;

/**
 *  Created by [Author].
 */
public class MessagesVC extends Fragment {

	private RecyclerView collectionView;
	private RecyclerView tableView;

	public static MessagesVC newInstance() {
		return new MessagesVC();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.messages_vc, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		init();
	}

	private void init() {
		collectionView = getView().findViewById(R.id.collection_view);
		tableView = getView().findViewById(R.id.table_view);
		collectionView.setLayoutManager(new GridLayoutManager(getContext(), 1, LinearLayoutManager.HORIZONTAL, false));
		collectionView.setAdapter(new MessagesVCCollectionViewAdapter());
		tableView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
		tableView.setAdapter(new MessagesVCTableViewAdapter());
	}
}