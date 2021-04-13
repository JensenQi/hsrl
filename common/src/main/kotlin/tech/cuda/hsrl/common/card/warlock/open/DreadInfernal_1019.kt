package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadInfernal_1019 : Card() {
    override val id = 1019
    override val name = "恐惧地狱火"
    override val description = "<b>战吼：</b>对所有其他角色造成1点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "“地狱火！”——加拉克苏斯，燃烧军团的艾瑞达之王"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7d77a9cf93eb54596e9651312815bf1b7a5f0dea788d8301949d008f6740d4e.png"
}
