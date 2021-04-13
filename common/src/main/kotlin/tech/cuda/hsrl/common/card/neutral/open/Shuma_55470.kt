package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shuma_55470 : Card() {
    override val id = 55470
    override val name = "舒玛"
    override val description = "在你的回合结束时，召唤数条1/1的触手，直到你的随从数量达到上限。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "触手烧不尽，春风吹又生。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19031d6de6ded33412e9015eff4a6bb3d2a753946d697d637c9fe55ed01ce828.png"
}
