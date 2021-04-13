package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestorsCall_1998 : Card() {
    override val id = 1998
    override val name = "先祖召唤"
    override val description = "每个玩家从手牌中随机将一个随从置入战场。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "有时候你需要祖辈们的指引。你会想知道，如果他们身处你现在的境地，他们的选择会是什么。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50ca873f5a2d287c5e8d3d615cf97e498a37022f8afd2370653ab6812ac6c176.png"
}
