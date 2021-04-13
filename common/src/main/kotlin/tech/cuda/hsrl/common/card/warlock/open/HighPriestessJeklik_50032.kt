package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighPriestessJeklik_50032 : Card() {
    override val id = 50032
    override val name = "高阶祭司耶克里克"
    override val description = "<b>嘲讽，吸血</b> 当你弃掉这张牌时，将这张牌的两张复制置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "如果你爱她，就给她自由。反正你也摆脱不了她。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfd1538320dd9f4b41d48a22122bc093605656968a8f0cd08be74257295edd59.png"
}
