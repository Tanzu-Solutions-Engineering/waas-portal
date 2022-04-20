import "./style.scss";

import "../frontend/node_modules/@cds/core/alert/register.js";
import "../frontend/node_modules/@cds/core/button/register.js";

import "../frontend/node_modules/@cds/core/icon/register.js";
import { ClarityIcons, nodeGroupIcon, gridViewIcon, plusCircleIcon } from "../frontend/node_modules/@cds/core/icon";

ClarityIcons.addIcons(nodeGroupIcon, gridViewIcon, plusCircleIcon);

import "../frontend/node_modules/@cds/core/card/register.js";
import "../frontend/node_modules/@cds/core/navigation/register.js";

import "../frontend/node_modules/@cds/core/input/register.js";
import "../frontend/node_modules/@cds/core/forms/register.js"
import "../frontend/node_modules/@cds/core/datalist/register.js";
import "../frontend/node_modules/@cds/core/select/register.js";
