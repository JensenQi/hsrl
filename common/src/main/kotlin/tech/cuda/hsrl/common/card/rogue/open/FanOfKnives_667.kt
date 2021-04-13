package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FanOfKnives_667 : Card() {
    override val id = 667
    override val name = "刀扇"
    override val description = "对所有敌方随从造成 1点伤害，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "转瞬即逝的寒光闪过，漫天飞舞的血花绽放。"
    override val artist = "Andrew Robinson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/86cf69b472f28a732f078c6efcfa4922f333b6cc62872303e072443f33a9ab3f.png"
}
