package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ALightInTheDarkness_38913 : Card() {
    override val id = 38913
    override val name = "黑暗曙光"
    override val description = "<b>发现</b>一张随从牌。使其获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "即便在最黑暗的岁月里，圣骑士也依然保持着他们的赤诚之心，誓要将光明与正义挥洒到世间的每一个角落。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0022bef0009d0a39e2b7f29e20106bf91431432b95ad2ef0786b4eb1f56e3d6f.png"
}
