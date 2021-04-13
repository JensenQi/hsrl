package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VitalityTotem_2007 : Card() {
    override val id = 2007
    override val name = "活力图腾"
    override val description = "在你的回合结束时，为你的英雄恢复 4点生命值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "在艾泽拉斯很多地区的古玩市场，你都能淘到一些很有收藏价值的老式图腾。"
    override val artist = "Guangjian Huang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dcba1c843398f1a6d9a837a3e305bf53ce644b03eaf3731d5ef440e08b28ea88.png"
}
