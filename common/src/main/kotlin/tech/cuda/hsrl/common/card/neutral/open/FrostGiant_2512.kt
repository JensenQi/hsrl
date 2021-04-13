package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostGiant_2512 : Card() {
    override val id = 2512
    override val name = "冰霜巨人"
    override val description = "在本局对战中，每当你使用一次英雄技能，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 10
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "别问他胡须是怎么来的，不然有你好受的。"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/253cb527a53bda25c63905527fbd1a95ab053a8568bc2bc28cad839e300bd281.png"
}
