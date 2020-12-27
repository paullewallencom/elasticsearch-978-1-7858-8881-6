package pl.solr.elasticsearch.examples.scripts;

import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

public class HashCodeSortNativeScriptFactory implements NativeScriptFactory {

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new HashCodeSortScript(params);
    }

	@Override
	public boolean needsScores() {
		return false;
	}

}
