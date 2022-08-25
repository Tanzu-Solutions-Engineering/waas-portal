import "./style.scss";

import "../frontend/node_modules/@cds/core/alert/register.js";
import "../frontend/node_modules/@cds/core/button/register.js";

import "../frontend/node_modules/@cds/core/icon/register.js";
import { ClarityIcons, nodeGroupIcon, gridViewIcon, plusCircleIcon, copyToClipboardIcon } from "../frontend/node_modules/@cds/core/icon";

ClarityIcons.addIcons(nodeGroupIcon, gridViewIcon, plusCircleIcon, copyToClipboardIcon);

import "../frontend/node_modules/@cds/core/card/register.js";
import "../frontend/node_modules/@cds/core/navigation/register.js";

import "../frontend/node_modules/@cds/core/input/register.js";
import "../frontend/node_modules/@cds/core/forms/register.js"
import "../frontend/node_modules/@cds/core/datalist/register.js";
import "../frontend/node_modules/@cds/core/select/register.js";
import '../frontend/node_modules/@cds/core/divider/register.js';

import {createApp} from "../frontend/node_modules/vue/dist/vue.esm-browser.js";

export { createApp }

export const DurationComponent = {
  props: {
    'label': "",
    'modelValue': ''
  },
  computed: {
    duration() {
      return this.modelValue.substring(0,this.modelValue.length-1);
    },
    unit() {
        return this.modelValue.substring(this.modelValue.length-1);
    },
  },
  methods: {
    updateDurationValue(event) {
      this.$emit('update:modelValue', event.target.value + this.modelValue.substring(this.modelValue.length-1));
    },
    updateUnitValue(event) {
      this.$emit('update:modelValue', this.modelValue.substring(0,this.modelValue.length-1) + event.target.value);
    }

  },
  template: `
  <cds-input-group layout="horizontal">
    <label>{{ label }}</label>
    <cds-input control-width="shrink">
      <label>{{ label }} Duration</label>
      <input type="number" :value="duration" @input="updateDurationValue" min="0"/>
      <cds-control-message error="rangeUnderflow" hidden="">Must be a positive integer value, or 0</cds-control-message>
    </cds-input>
    <cds-select>
      <label>{{ label }} Unit</label>
      <select :value="unit" @input="updateUnitValue">
        <option value="s">seconds</option>
        <option value="m" selected>minutes</option>
        <option value="h">hours</option>
      </select>
    </cds-select>
  </cds-input-group>
  `
}
