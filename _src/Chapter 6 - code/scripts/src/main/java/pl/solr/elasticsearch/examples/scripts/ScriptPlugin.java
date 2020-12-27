package pl.solr.elasticsearch.examples.scripts;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.script.ScriptModule;

public class ScriptPlugin extends Plugin {

	@Override
	public String description() {
		return "The example of native sort script";
	}

	@Override
	public String name() {
		return "naive-sort-plugin";
	}

	public void onModule(final ScriptModule module) {
		module.registerScript("native_sort", HashCodeSortNativeScriptFactory.class);
		
	}

}
