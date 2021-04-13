package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyWater_46694 : Card() {
    override val id = 46694
    override val name = "圣水"
    override val description = "对一个随从造成 4点伤害。如果“圣水”消灭该随从，将一张该随从的复制置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "担心热量？那就来罐零度圣水吧！"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29d1f2d4ec39c340861becc516ef85665f8386618c4dd7e820614ef970b24e7d.png"
}
