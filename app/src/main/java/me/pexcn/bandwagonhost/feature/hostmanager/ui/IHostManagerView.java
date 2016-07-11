/*
 * BandwagonHost - A bandwagonhost.com client for Android
 * Copyright (C) 2016 Xingyu Chen (pexcn) <pexcn97@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package me.pexcn.bandwagonhost.feature.hostmanager.ui;

import android.view.View;

import java.util.List;

import me.pexcn.bandwagonhost.bean.Host;

/**
 * Created by pexcn on 2016-06-29.
 */
public interface IHostManagerView {
    void insertItem(Host host);

    void removeItem(int position);

    void showList(List<Host> hosts);

    void showInsertHostDialog();

    void showPopupMenu(View view);

    void showTips(String msg, int duration);
}
