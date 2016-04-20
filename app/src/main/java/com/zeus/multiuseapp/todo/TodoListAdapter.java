package com.zeus.multiuseapp.todo;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.zeus.multiuseapp.R;
import com.zeus.multiuseapp.models.TodoItem;

import java.util.List;

/**
 * Created by dell on 19-04-2016.
 */
public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {
    private List<TodoItem> mTodoItems;
    private Context mContext;

    public TodoListAdapter(List<TodoItem> items, Context context) {
        mTodoItems = items;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_todo_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final TodoItem selectedTodo = mTodoItems.get(position);
        holder.mToCheckBox.setText(selectedTodo.getTitle());
        if (selectedTodo.isChecked()) {
            holder.mTodoDate.setVisibility(View.VISIBLE);
            holder.mTodoDate.setText(selectedTodo.getModifiedDate());
            holder.mToCheckBox.setChecked(true);
            holder.mToCheckBox.setPaintFlags(holder.mToCheckBox.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }

    }

    @Override
    public int getItemCount() {
        return mTodoItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTodoDate;
        public CheckBox mToCheckBox;
        private ImageView mHandleView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTodoDate = (TextView) itemView.findViewById(R.id.todoListCreated);
            mToCheckBox = (CheckBox) itemView.findViewById(R.id.todoListCheckbox);
            mHandleView = (ImageView) itemView.findViewById(R.id.tHandle);

        }
    }
}
