import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Exemplo2Component } from './exemplo2.component';

describe('Exemplo2Component', () => {
  let component: Exemplo2Component;
  let fixture: ComponentFixture<Exemplo2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Exemplo2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Exemplo2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
