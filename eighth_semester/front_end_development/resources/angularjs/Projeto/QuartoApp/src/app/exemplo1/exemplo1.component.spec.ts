import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Exemplo1Component } from './exemplo1.component';

describe('Exemplo1Component', () => {
  let component: Exemplo1Component;
  let fixture: ComponentFixture<Exemplo1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Exemplo1Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Exemplo1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
