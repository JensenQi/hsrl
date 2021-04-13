package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlametongueTotem_68473 : Card() {
    override val id = 68473
    override val name = "火舌图腾"
    override val description = "相邻的随从获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "图腾制造师喜欢用最稀有的木材来打造图腾。甚至有传言说，这些图腾是由埃隆巴克保护者身上的树皮做的。"
    override val artist = "Jonathan Ryder"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ebf536a8109716bd87e460e522161872f42e44142a7363fd6549fbfc9a4221fe.png"
}
