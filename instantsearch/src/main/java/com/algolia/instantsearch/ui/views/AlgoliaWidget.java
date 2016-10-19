package com.algolia.instantsearch.ui.views;

import android.support.annotation.NonNull;

import com.algolia.instantsearch.helpers.Searcher;
import com.algolia.instantsearch.model.AlgoliaResultsListener;

public interface AlgoliaWidget extends AlgoliaResultsListener {
    /**
     * Called at initialization to give this AlgoliaResultsListener a reference to its Searcher.
     *
     * @param searcher a {@link Searcher} instance.
     */
    void setSearcher(@NonNull final Searcher searcher);

    /**
     * Event listener to react to reinitialization of search interface.
     */
    void onReset();
}