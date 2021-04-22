import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ToiletteInfo } from './toiletteInfo';


@Injectable({
  providedIn: 'root'
})
export class ToiletteService {

  constructor(private HttpClient: HttpClient) { }

  getToilettes(): Observable<ToiletteInfo[]>{
    return this.HttpClient.get<ToiletteInfo[]>("http://localhost:8080/api/toilettes/");
  }
}
