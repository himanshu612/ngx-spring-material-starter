import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import {HttpModule} from "@angular/http";
import {FlexLayoutModule} from "@angular/flex-layout";
import {RouterModule} from "@angular/router";

import {
  MdButtonModule,
  MdCardModule,
  MdIconModule,
  MdInputModule,
  MdListModule,
  MdMenuModule,
  MdSidenavModule,
  MdToolbarModule
} from "@angular/material";
import 'hammerjs';

import {routes} from './app.routes';
import {HelloService} from "./service/hello/hello.service";
import { AppComponent } from './app.component';
import { LoginContainerComponent } from './login-container/login-container.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginContainerComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpModule,
    FlexLayoutModule,
    MdToolbarModule,
    MdSidenavModule,
    MdListModule,
    MdMenuModule,
    MdIconModule,
    MdButtonModule,
    MdInputModule,
    MdCardModule,
    RouterModule.forRoot(routes)
  ],
  providers: [
    HelloService,
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
