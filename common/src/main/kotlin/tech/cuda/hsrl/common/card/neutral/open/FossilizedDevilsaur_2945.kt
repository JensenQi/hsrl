package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FossilizedDevilsaur_2945 : Card() {
    override val id = 2945
    override val name = "石化魔暴龙"
    override val description = "<b>战吼：</b> 如果你控制一个野兽，便获得<b>嘲讽</b>。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "由于众所周知的原因，侏罗纪公园关门大吉，魔暴龙也因此流落街头。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3c16429d6827c92612c93b56533bc6504d3dd72f06cb85ee2e015abf684fed8.png"
}
