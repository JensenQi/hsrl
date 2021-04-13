package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunfuryProtector_69833 : Card() {
    override val id = 69833
    override val name = "日怒保卫者"
    override val description = "<b>战吼：</b>使相邻的随从获得<b>嘲讽</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她拿着一面盾牌，但也只有这样，她才能把它给别人，然后躲在后面。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69c56c5835c306dd573ef36886a0f9613d73e99f1de9313affcdb11b6868959c.png"
}
