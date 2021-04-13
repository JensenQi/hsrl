package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Batterhead_53251 : Card() {
    override val id = 53251
    override val name = "莽头食人魔"
    override val description = "<b>突袭</b> 在该随从攻击并消灭一个随从后，可再次攻击。"
    override var cost: Int? = 8
    override var health: Int? = 12
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他擅长用脑袋来解决问题。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/206e073ffd2605e6e3cc87fb90e9eff6d57bdbe03069d641cbd2d80a4a35a927.png"
}
