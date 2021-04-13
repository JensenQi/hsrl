package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScarletCrusader_69817 : Card() {
    override val id = 69817
    override val name = "血色十字军战士"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他们的狂热使衣衫上的猩红色更加刺眼。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b11b2c7c7a040ae7eab9a383f2efa27b81e260268b2b39542fb8011506868a7c.png"
}
