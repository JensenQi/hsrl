package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Transmogrifier_55436 : Card() {
    override val id = 55436
    override val name = "幻化师"
    override val description = "每当你抽到一张牌时，随机将其变形成为一张<b>传说</b>随从牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "只要一点纸板再加上想象力，你也能完成传说级的幻化。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c08179ed972cab43d413996e934ffad67f555ea0f65720374d81b67648362a95.png"
}
