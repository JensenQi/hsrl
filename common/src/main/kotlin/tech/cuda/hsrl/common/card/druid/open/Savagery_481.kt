package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Savagery_481 : Card() {
    override val id = 481
    override val name = "野蛮之击"
    override val description = "对一个随从造成等同于你的英雄攻击力的伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "确实有些德鲁伊野性十足，但仍有些喜欢在恬静的时刻品上一壶好茶。"
    override val artist = "Dave Rapoza"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/efa6292c53d99ba0dae10e27e8be388cfd27a0a90857495edc0ae1ae50784227.png"
}
