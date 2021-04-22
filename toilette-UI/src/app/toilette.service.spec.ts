import { TestBed } from '@angular/core/testing';

import { ToiletteService } from './toilette.service';

describe('ToiletteService', () => {
  let service: ToiletteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ToiletteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
