package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadInfernal_69520 : Card() {
    override val id = 69520
    override val name = "恐惧地狱火"
    override val description = "<b>战吼：</b>对所有其他角色造成1点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "“地狱火！”——加拉克苏斯，燃烧军团的艾瑞达之王"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1bfbca49fdc39a7e65ed41fd55200456deaf47a65652b8172c4d5f8e100b00ac.png"
}
