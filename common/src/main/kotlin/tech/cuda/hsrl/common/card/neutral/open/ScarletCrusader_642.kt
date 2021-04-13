package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScarletCrusader_642 : Card() {
    override val id = 642
    override val name = "血色十字军战士"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他们的狂热使衣衫上的猩红色更加刺眼。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9faa4f23e8b37bf482777a052352736169114c4c79f04519d3bf8b643501b57.png"
}
