import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import 'rxjs/add/operator/toPromise';

@Injectable()
export class HelloService {

  constructor(private http:Http) {

  }
  get():Promise<any>{
    let url = `http://localhost:7777/ngxspring-starter/hello`;
    return this.http.get(url)
      .toPromise()
      .then(e=>this.handle(e));
  }

  handle(e){
    return e.text();
  }


}
