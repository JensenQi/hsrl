package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElectraStormsurge_48537 : Card() {
    override val id = 48537
    override val name = "伊莱克特拉·风潮"
    override val description = "<b>战吼：</b>在本回合中，你的下一个法术将施放两次。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“什么？你就用了个幸运币！？”"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca00f3bd5fc1d69a08aa7cfce5c1e136bda9cdb9be9ee9fa9c68cdafb558073a.png"
}
