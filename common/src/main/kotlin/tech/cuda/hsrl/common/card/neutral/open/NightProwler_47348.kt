package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NightProwler_47348 : Card() {
    override val id = 47348
    override val name = "暗夜徘徊者"
    override val description = "<b>战吼：</b>如果它是战场上唯一的一个随从，获得+3/+3。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "它喜欢在月黑风高的时候轧马路。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6484bc1b1a413bd7a1f43f1b2b3d4239a603ef09b761e12f49a9d32fd2d4d0ec.png"
}
