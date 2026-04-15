import js from '@eslint/js'
import pluginVue from 'eslint-plugin-vue'
import vuePrettierConfig from '@vue/eslint-config-prettier'
import globals from 'globals'

export default [
  {
    ignores: ['node_modules', 'dist', 'coverage', '*.local'],
  },
  js.configs.recommended,
  ...pluginVue.configs['flat/recommended'],
  vuePrettierConfig,
  {
    languageOptions: {
      ecmaVersion: 'latest',
      sourceType: 'module',
      globals: {
        ...globals.browser,
        ...globals.node,
        ...globals.es2021,
      },
    },
    rules: {
      'vue/multi-word-component-names': 'off',
      'vue/no-unused-vars': 'warn',
      'no-unused-vars': 'warn',
      'no-console': 'off',
      'no-debugger': 'off',
    },
  },
]
