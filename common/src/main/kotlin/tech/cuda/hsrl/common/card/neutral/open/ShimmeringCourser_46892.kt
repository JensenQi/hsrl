package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShimmeringCourser_46892 : Card() {
    override val id = 46892
    override val name = "闪光的骏马"
    override val description = "只有你可以将它作为法术和英雄技能的 目标。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "白马不是马，骏马更不一定是马了。她其实是一头独角兽。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34283e97469d6e4aacac62566ba83571cb76016da69a89b68bcd71cd4efcad77.png"
}
