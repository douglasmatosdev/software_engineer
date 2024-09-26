import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TelaCidadeComponent } from './tela-cidade.component';

describe('TelaCidadeComponent', () => {
  let component: TelaCidadeComponent;
  let fixture: ComponentFixture<TelaCidadeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TelaCidadeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TelaCidadeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
