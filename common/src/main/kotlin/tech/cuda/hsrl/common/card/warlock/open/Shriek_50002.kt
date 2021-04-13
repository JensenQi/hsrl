package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shriek_50002 : Card() {
    override val id = 50002
    override val name = "尖啸"
    override val description = "弃掉你手牌中法力值消耗最低的牌。对所有随从造成 2点 伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "一哭二闹三尖啸。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad7dbcf80100a75030c1858542798af8448e1849533fb25a0740653cf84ef1c2.png"
}
