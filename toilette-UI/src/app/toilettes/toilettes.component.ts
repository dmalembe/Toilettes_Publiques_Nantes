import { Component, OnInit } from '@angular/core';
import { ToiletteService } from '../toilette.service';
import { ToiletteInfo } from '../toiletteInfo';

@Component({
  selector: 'app-toilettes',
  templateUrl: './toilettes.component.html',
  styleUrls: ['./toilettes.component.scss']
})
export class ToilettesComponent implements OnInit {

  toilettes: ToiletteInfo[];

  constructor(private ToiletteService: ToiletteService) { }

  ngOnInit(): void {
    this.ToiletteService.getToilettes().subscribe(
      Response => {
        this.toilettes=Response;
      }
    )
  }

}
