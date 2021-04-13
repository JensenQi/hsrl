package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CutthroatBuccaneer_48585 : Card() {
    override val id = 48585
    override val name = "刺喉海盗"
    override val description = "<b>连击：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "他生前表演吞剑刺破了喉咙。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33baa683cfd32d061591e2f8a99ebd0dc86765af1cb5fc6a0be49586f26735e0.png"
}
