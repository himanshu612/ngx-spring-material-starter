import {Route} from "@angular/router";
import {LoginContainerComponent} from "./login-container/login-container.component";

export const routes:Route[] = [
  {
    path:'login',
    component: LoginContainerComponent
  }
];
