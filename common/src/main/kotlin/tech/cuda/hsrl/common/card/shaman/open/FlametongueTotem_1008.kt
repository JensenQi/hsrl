package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlametongueTotem_1008 : Card() {
    override val id = 1008
    override val name = "火舌图腾"
    override val description = "相邻的随从获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "图腾制造师喜欢用最稀有的木材来打造图腾。甚至有传言说，这些图腾是由埃隆巴克保护者身上的树皮做的。"
    override val artist = "Jonathan Ryder"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c56befdeb18d009f1511fb6094adeabbb0fd4fc75ad542ae355a1002deeb02e.png"
}
