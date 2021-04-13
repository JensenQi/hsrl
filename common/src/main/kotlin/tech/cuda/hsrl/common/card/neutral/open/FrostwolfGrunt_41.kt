package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostwolfGrunt_41 : Card() {
    override val id = 41
    override val name = "霜狼步兵"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "他的祖祖辈辈都是步兵，这已经不仅仅是一份工作而已了。"
    override val artist = "Richie Marella"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e16b6a297195b87983a4dc8bfbee26e7aaa42c0724f8357745aa020a820961df.png"
}
