package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadInfernal_68346 : Card() {
    override val id = 68346
    override val name = "恐惧地狱火"
    override val description = "<b>战吼：</b>对所有其他角色造成1点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "“地狱火！”——加拉克苏斯，燃烧军团的艾瑞达之王"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a162432a33ed5e18218a08482baee7c0ae8696d8f1b77df7976b0bc086559ce7.png"
}
