import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ToilettesComponent } from './toilettes.component';

describe('ToilettesComponent', () => {
  let component: ToilettesComponent;
  let fixture: ComponentFixture<ToilettesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ToilettesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ToilettesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
