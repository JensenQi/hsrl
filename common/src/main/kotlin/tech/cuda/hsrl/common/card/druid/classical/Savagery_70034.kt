package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Savagery_70034 : Card() {
    override val id = 70034
    override val name = "野蛮之击"
    override val description = "对一个随从造成等同于你的英雄攻击力的伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "确实有些德鲁伊野性十足，但仍有些喜欢在恬静的时刻品上一壶好茶。"
    override val artist = "Dave Rapoza"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a723ab9d475c1b451e40606a68ecfe760cfa4cedc70db25de6f161ffcf4b431.png"
}
