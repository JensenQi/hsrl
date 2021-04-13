package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SteelRager_48890 : Card() {
    override val id = 48890
    override val name = "钢铁暴怒者"
    override val description = "<b>突袭</b>"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "感受机械的愤怒！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ec6727d735bf2009600b5a9a205f8c7a12a0ed772a0ae476a3d5ff18712ab4b.png"
}
