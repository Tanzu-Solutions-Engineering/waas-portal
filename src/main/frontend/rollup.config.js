import resolve from "rollup-plugin-node-resolve";
import styles from "rollup-plugin-styles";

export default {
	input: "../js/index.js",
	output: {
	  file: "../../../target/classes/static/index.js",
	  format: "esm"
	},
	plugins: [
		resolve({
			esm: true,
			main: true,
			browser: true
		  }),
			styles(),
      //scss(),
      //postcss(),
	]
};