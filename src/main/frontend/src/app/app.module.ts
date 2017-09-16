import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { AppComponent } from './app.component';
import 'hammerjs';
import {HelloService} from "./service/hello/hello.service";
import {HttpModule} from "@angular/http";

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpModule
  ],
  providers: [
    HelloService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
