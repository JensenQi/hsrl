package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForestWardenOmu_59555 : Card() {
    override val id = 59555
    override val name = "林地守护者欧穆"
    override val description = "<b>法术迸发：</b>复原你的法力水晶。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "她许愿所有的生命都能在通灵学园破土而出，永葆生机。要是她知道后来……"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2aa951de7f0e98f4020d1a3385045222d0d3aec23134b41eb2aa824cf90d155c.png"
}
