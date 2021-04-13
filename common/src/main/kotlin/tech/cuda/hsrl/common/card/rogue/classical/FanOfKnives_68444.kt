package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FanOfKnives_68444 : Card() {
    override val id = 68444
    override val name = "刀扇"
    override val description = "对所有敌方随从造成 1点伤害，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "转瞬即逝的寒光闪过，漫天飞舞的血花绽放。"
    override val artist = "Andrew Robinson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/da49d10c30f8c674170a9d8516bf97f24279403d4399b93d382343cec5e00c0f.png"
}
