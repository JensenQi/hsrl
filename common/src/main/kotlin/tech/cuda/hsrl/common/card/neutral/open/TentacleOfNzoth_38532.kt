package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TentacleOfNzoth_38532 : Card() {
    override val id = 38532
    override val name = "恩佐斯的触须"
    override val description = "<b>亡语：</b>对所有随从造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "恩佐斯很在意自己的触须，因此它对相关的洗护用品非常挑剔。"
    override val artist = "J. Meyers & T. Washington"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec207b5dda9ad20519d60ae22cc4f52ebfac072163befcf7dd8c8ad53e651279.png"
}
