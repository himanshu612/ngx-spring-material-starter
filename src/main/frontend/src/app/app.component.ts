import { Component } from '@angular/core';

import {Menu} from "./models/menu.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  menus:Menu[];

  constructor(){
    this.menus = [
      {
        name:'Login',
        icon:'login',
        routerLink : 'login'
      },
    ]
  }

}
