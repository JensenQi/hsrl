package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlowstoneTechnician_48989 : Card() {
    override val id = 48989
    override val name = "亮石技师"
    override val description = "<b>战吼：</b>使你手牌中的所有随从牌获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“温德，灯再亮一点！”“我已经开到最大啦，坎格尔！”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b23a1ab69ce31a53452a8be5f92684974aa47e6ce573670919bcb9e61fb81ef.png"
}
