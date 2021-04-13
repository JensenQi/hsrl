package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrygulchJailor_46007 : Card() {
    override val id = 46007
    override val name = "旱谷狱卒"
    override val description = "<b>亡语：</b> 将三张“白银之手新兵”置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "检查牢房的时候别忘了把墙上的海报揭起来看看。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32e3b26af1ed5c51d18beb15d2d274ad174af819500f13245a88ec5a2ddd8068.png"
}
